/*
 * Copyright 2004/2005 Anite - Enforcement & Security
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
package com.anite.zebra.avalon.mocks;

import com.anite.zebra.core.definitions.api.IProcessDefinition;
import com.anite.zebra.core.definitions.api.IRoutingDefinitions;
import com.anite.zebra.core.definitions.api.ITaskDefinition;
import com.anite.zebra.core.definitions.api.ITaskDefinitions;

/**
 * @author Eric Pugh
 *
 */
public class MockProcessDefinition implements IProcessDefinition {

    /**
     * 
     */
    public MockProcessDefinition() {
        super();
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see com.anite.zebra.core.definitions.api.IProcessDefinition#getTaskDefs()
     */
    public ITaskDefinitions getTaskDefs() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.anite.zebra.core.definitions.api.IProcessDefinition#getRoutingDefs()
     */
    public IRoutingDefinitions getRoutingDefs() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.anite.zebra.core.definitions.api.IProcessDefinition#getFirstTask()
     */
    public ITaskDefinition getFirstTask() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.anite.zebra.core.definitions.api.IProcessDefinition#getClassConstruct()
     */
    public String getClassConstruct() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.anite.zebra.core.definitions.api.IProcessDefinition#getClassDestruct()
     */
    public String getClassDestruct() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.anite.zebra.core.definitions.api.IProcessDefinition#getVersion()
     */
    public Long getVersion() {
        // TODO Auto-generated method stub
        return null;
    }

}