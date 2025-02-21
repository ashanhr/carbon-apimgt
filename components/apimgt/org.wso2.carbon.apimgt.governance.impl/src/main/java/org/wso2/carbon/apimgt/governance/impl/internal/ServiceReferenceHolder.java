/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.apimgt.governance.impl.internal;

import org.wso2.carbon.apimgt.governance.impl.validator.ValidationEngineService;
import org.wso2.carbon.apimgt.impl.APIManagerConfigurationService;

/**
 * This class represents the Governance Service Reference Holder
 */
public class ServiceReferenceHolder {

    private static final ServiceReferenceHolder instance = new ServiceReferenceHolder();
    private APIManagerConfigurationService apiMgtConfigService;
    private ValidationEngineService validationEngineService;

    public static ServiceReferenceHolder getInstance() {

        return instance;
    }

    public APIManagerConfigurationService getAPIMConfigurationService() {

        return apiMgtConfigService;
    }

    public void setAPIMConfigurationService(APIManagerConfigurationService apiMgtConfigService) {

        this.apiMgtConfigService = apiMgtConfigService;
    }

    public ValidationEngineService getValidationEngineService() {
        return validationEngineService;
    }

    public void setValidationEngineService(ValidationEngineService validationEngineService) {
        this.validationEngineService = validationEngineService;
    }
}
