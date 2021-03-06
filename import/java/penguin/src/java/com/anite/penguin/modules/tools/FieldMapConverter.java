/*
 * Copyright 2004 Anite - Central Government Division
 *    http://www.anite.com/publicsector
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.anite.penguin.modules.tools;

import com.thoughtworks.xstream.alias.ClassMapper;
import com.thoughtworks.xstream.converters.collections.MapConverter;

/**
 * Added to force XStream to realise the FieldMap is a HashMap really...
 * @author Ben.Gidley
 */
public class FieldMapConverter extends MapConverter {

    /**
     * @param arg0
     * @param arg1
     */
    public FieldMapConverter(ClassMapper arg0, String arg1) {
        super(arg0, arg1);
     
    }

    public boolean canConvert(Class type) {
        if (type.equals(FieldMap.class)){
            return true;
        }        
        return super.canConvert(type);
    }
}
