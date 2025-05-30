/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.bean;

import org.apache.camel.CamelExecutionException;
import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.spi.Registry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BeanWithMethodHeaderTest extends ContextTestSupport {

    private MyBean bean;

    @Test
    public void testEcho() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("echo Hello World");

        template.sendBody("direct:echo", "Hello World");

        assertMockEndpointsSatisfied();
    }

    @Test
    public void testHi() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("hi Hello World");

        template.sendBody("direct:hi", "Hello World");

        assertMockEndpointsSatisfied();
    }

    @Test
    public void testFail() {

        CamelExecutionException e = assertThrows(CamelExecutionException.class,
                () -> template.sendBody("direct:fail", "Hello World"),
                "Should throw an exception");

        assertIsInstanceOf(AmbiguousMethodCallException.class, e.getCause());
        AmbiguousMethodCallException ace = (AmbiguousMethodCallException) e.getCause();
        assertEquals(2, ace.getMethods().size());
    }

    @Test
    public void testMethodNotExists() {

        Exception e = assertThrows(Exception.class,
                () -> {
                    context.addRoutes(new RouteBuilder() {
                        @Override
                        public void configure() {
                            from("direct:typo").bean("myBean", "ups").to("mock:result");
                        }
                    });
                }, "Should throw an exception");

        MethodNotFoundException mnfe = assertIsInstanceOf(MethodNotFoundException.class, e.getCause());
        assertEquals("ups", mnfe.getMethodName());
        assertSame(bean, mnfe.getBean());
    }

    @Test
    public void testMethodNotExistsOnInstance() {
        final MyBean myBean = new MyBean();

        Exception e = assertThrows(Exception.class,
                () -> {
                    context.addRoutes(new RouteBuilder() {
                        @Override
                        public void configure() {
                            from("direct:typo").bean(myBean, "ups").to("mock:result");
                        }
                    });
                }, "Should throw an exception");

        MethodNotFoundException mnfe = assertIsInstanceOf(MethodNotFoundException.class, e.getCause());
        assertEquals("ups", mnfe.getMethodName());
        assertSame(myBean, mnfe.getBean());
    }

    @Override
    protected Registry createCamelRegistry() throws Exception {
        Registry answer = super.createCamelRegistry();
        bean = new MyBean();
        answer.bind("myBean", bean);
        return answer;
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:echo").bean("myBean", "echo").to("mock:result");

                from("direct:hi").bean("myBean", "hi").to("mock:result");

                from("direct:fail").bean("myBean").to("mock:result");
            }
        };
    }

    public static class MyBean {

        public String hi(String s) {
            return "hi " + s;
        }

        public String echo(String s) {
            return "echo " + s;
        }
    }

}
