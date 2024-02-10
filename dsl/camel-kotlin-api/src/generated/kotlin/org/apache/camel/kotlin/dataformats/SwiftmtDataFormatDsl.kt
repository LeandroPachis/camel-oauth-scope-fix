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
package org.apache.camel.kotlin.dataformats

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import org.apache.camel.kotlin.CamelDslMarker
import org.apache.camel.kotlin.DataFormatDsl
import org.apache.camel.model.dataformat.SwiftMtDataFormat

public fun DataFormatDsl.swiftMt(i: SwiftmtDataFormatDsl.() -> Unit) {
  def = SwiftmtDataFormatDsl().apply(i).def
}

@CamelDslMarker
public class SwiftmtDataFormatDsl {
  public val def: SwiftMtDataFormat

  init {
    def = SwiftMtDataFormat()}

  public fun id(id: String) {
    def.id = id
  }

  public fun writeInJson(writeInJson: Boolean) {
    def.writeInJson = writeInJson.toString()
  }

  public fun writeInJson(writeInJson: String) {
    def.writeInJson = writeInJson
  }
}
