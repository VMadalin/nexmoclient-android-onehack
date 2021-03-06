/*
 * Copyright (C) 2020 Nexmo, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.gradle.api.Project
import org.gradle.api.plugins.PluginAware

/**
 * Applies the given local gradle script.
 *
 * @param scriptName a script to apply
 * @see [PluginAware.apply]
 */
fun Project.apply(scriptName: String) {
    apply {
        this.from("$rootDir/gradle/scripts/$scriptName.gradle.kts")
    }
}
