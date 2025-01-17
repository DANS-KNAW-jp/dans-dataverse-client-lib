/*
 * Copyright (C) 2021 DANS - Data Archiving and Networked Services (info@dans.knaw.nl)
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
package nl.knaw.dans.lib.dataverse.model.dataset;

import java.util.List;
import java.util.Map;

public class CompoundField extends MetadataField {

    private List<Map<String, SingleValueField>> value;

    public CompoundField() {
    }

    public CompoundField(String typeClass, String typeName, boolean multiple, List<Map<String, SingleValueField>> value) {
        super(typeClass, typeName, multiple);
        this.value = value;
    }

    public List<Map<String, SingleValueField>> getValue() {
        return value;
    }

    public void setValue(List<Map<String, SingleValueField>> value) {
        this.value = value;
    }
}
