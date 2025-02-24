/*
 * Copyright (c) 2025 WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.apimgt.impl.deployer;

import org.wso2.carbon.apimgt.api.APIManagementException;
import org.wso2.carbon.apimgt.api.model.Environment;
import org.wso2.carbon.apimgt.impl.factory.GatewayHolder;

public class GatewayConfigurationServiceImpl implements GatewayConfigurationService {
    @Override
    public void addGatewayConfiguration(String organization, String name, String type,
                                        Environment environment) throws APIManagementException {
        String internKey = this.getClass().getName().concat(organization).concat(name);
        synchronized (internKey.intern()) {
            GatewayHolder.addGatewayConfiguration(organization, name, type, environment);
        }
    }

    @Override
    public void updateGatewayConfiguration(String organization, String name, String type,
                                           Environment environment) throws APIManagementException {
        String internKey = this.getClass().getName().concat(organization).concat(name);
        synchronized (internKey.intern()) {
            GatewayHolder.updateGatewayConfiguration(organization, name, type, environment);
        }
    }

    @Override
    public void removeGatewayConfiguration(String organization, String name) throws APIManagementException {
        String internKey = this.getClass().getName().concat(organization).concat(name);
        synchronized (internKey.intern()) {
            GatewayHolder.removeGatewayConfiguration(organization, name);
        }
    }
}
