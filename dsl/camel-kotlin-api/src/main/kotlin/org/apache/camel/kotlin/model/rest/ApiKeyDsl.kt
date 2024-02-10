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
package org.apache.camel.kotlin.model.rest

import org.apache.camel.kotlin.CamelDslMarker
import org.apache.camel.model.rest.ApiKeyDefinition

@CamelDslMarker
class ApiKeyDsl(
    override val def: ApiKeyDefinition
) : RestSecurityDsl(def) {

    fun name(name: String) {
        def.name = name
    }

    fun inHeader(inHeader: Boolean) {
        def.inHeader = inHeader.toString()
    }

    fun inHeader(inHeader: String) {
        def.inHeader = inHeader
    }

    fun inQuery(inQuery: Boolean) {
        def.inHeader = inQuery.toString()
    }

    fun inQuery(inQuery: String) {
        def.inQuery = inQuery
    }

    fun inCookie(inCookie: Boolean) {
        def.inCookie = inCookie.toString()
    }

    fun inCookie(inCookie: String) {
        def.inCookie = inCookie
    }
}