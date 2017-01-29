/*
 * Copyright 2017 Artur.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jaxygen.beaninspector.model;

import java.util.Objects;

/**
 *
 * @author Artur
 */
@lombok.Getter
@lombok.Setter
public class ArrayField extends FieldBase {

    public static String TYPE = "ARRAY";
    private FieldDescriptor contentType = new InvalidFieldDescriptor();

    public ArrayField() {
        super(TYPE);
    }

    public ArrayField(final String name) {
        super(TYPE, name);
    }

    public ArrayField(final String name, final FieldDescriptor contentType) {
        super(TYPE, name);
        this.contentType = contentType;
    }

    public ArrayField(FieldDescriptor contentDescriptor) {
        super(TYPE);
        this.contentType = contentDescriptor;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * contentType.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ArrayField other = (ArrayField) obj;
        if (!super.equals(obj)
                || !Objects.equals(this.contentType, other.contentType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ArrayField(" + contentType.toString() + ")";
    }
    
}
