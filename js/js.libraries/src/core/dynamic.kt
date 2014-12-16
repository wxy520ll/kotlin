/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kotlin.js

// TODO add the support ES6 iterators
public fun dynamic.iterator(): Iterator<dynamic> {
    val r = this

    return when {
        this["iterator"] != null ->
            this["iterator"]()
        js("Array.isArray(r)") ->
            (this: Array<*>).iterator()

        else ->
            (r: Iterable<*>).iterator()
    }
}
