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
package org.apache.camel.component.as2.api.entity;

import java.io.IOException;

import org.apache.camel.component.as2.api.AS2MediaType;
import org.apache.hc.core5.http.ContentType;

public class ApplicationEDIConsentEntity extends ApplicationEntity {

    public ApplicationEDIConsentEntity(byte[] content, String charset, String contentTransferEncoding,
                                       boolean isMainBody, String fileName) {
        super(content, ContentType.create(AS2MediaType.APPLICATION_EDI_CONSENT, charset), contentTransferEncoding, isMainBody,
              fileName);
    }

    @Override
    public void close() throws IOException {
        // do nothing
    }
}
