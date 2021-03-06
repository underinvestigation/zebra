package org.apache.fulcrum.security.authenticator;
/*
 *  Copyright 2001-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import org.apache.fulcrum.security.entity.User;
import org.apache.fulcrum.security.util.DataBackendException;
/**
 * Interface for an Authenticator.  Authenticator's are pluggable
 * objects that allow different SPI's to have different authentication.
 *
 * @author <a href="mailto:epugh@upstate.com">Eric Pugh</a>
 * @version $Id: Authenticator.java,v 1.2 2006/01/17 09:17:24 biggus_richus Exp $
 */
public interface Authenticator
{

    public boolean authenticate(User user, String password)
        throws  DataBackendException;
    
    public String getCryptoPassword(String password)
    	throws DataBackendException;
}
