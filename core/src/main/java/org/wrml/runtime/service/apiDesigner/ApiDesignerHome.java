/**
 * WRML - Web Resource Modeling Language
 *  __     __   ______   __    __   __        
 * /\ \  _ \ \ /\  == \ /\ "-./  \ /\ \       
 * \ \ \/ ".\ \\ \  __< \ \ \-./\ \\ \ \____  
 *  \ \__/".~\_\\ \_\ \_\\ \_\ \ \_\\ \_____\ 
 *   \/_/   \/_/ \/_/ /_/ \/_/  \/_/ \/_____/ 
 *
 * http://www.wrml.org                                                   
 *
 * Copyright (C) 2013 Mark Masse <mark@wrml.org> (OSS project WRML.org) 
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

package org.wrml.runtime.service.apiDesigner;

import org.wrml.model.Virtual;
import org.wrml.model.rest.Document;
import org.wrml.model.rest.Method;
import org.wrml.runtime.schema.LinkSlot;
import org.wrml.runtime.schema.WRML;

/**
 * // TODO: Move this schema to a resource file.
 * The docroot for the REST API Designer (tool/app) REST API.
 */
@WRML(uniqueName = "org/wrml/runtime/service/apiDesigner/ApiDesignerHome")
public interface ApiDesignerHome extends Virtual, Document
{

    // TODO: Move this link relation to a file and change the link relation URI to be based on the API designer REST API's root URI
    @LinkSlot(linkRelationUri = "http://relation.api.wrml.org/org/wrml/relation/autoLink", method = Method.Get)
    AutoLinkFunction getAutoLinkFunction();

}