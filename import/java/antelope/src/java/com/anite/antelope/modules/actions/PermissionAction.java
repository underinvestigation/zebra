/*
 * Copyright 2004 Anite - Central Government Division
 * http://www.anite.com/publicsector
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.anite.antelope.modules.actions;

import org.apache.fulcrum.security.entity.Permission;
import org.apache.turbine.modules.actions.VelocitySecureAction;
import org.apache.turbine.services.velocity.TurbineVelocity;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;

import com.anite.antelope.modules.tools.SecurityTool;


/**
 *
 * @author <a href="mailTo:michael.jones@anite.com">Michael.Jones</a>
 *
 */
public abstract class PermissionAction extends VelocitySecureAction  {

    /* (non-Javadoc)
     * @see org.apache.turbine.modules.screens.VelocitySecureScreen#isAuthorized(org.apache.turbine.util.RunData)
     */
    protected boolean isAuthorized(RunData data) throws Exception {
        Context context = TurbineVelocity.getContext(data);
        SecurityTool security = (SecurityTool) context.get(SecurityTool.DEFAULT_TOOL_NAME);
        
        if (security.hasPermission(data, pagePermission())) {
            data.setScreenTemplate("Login.vm");
            return false;
        } 
            return true;        
    }
    
    /**
     * You must implment this method to define a permission that
     * a user complete the action
     * @return
     */
    public abstract Permission pagePermission();

}
