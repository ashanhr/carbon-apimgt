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

package org.wso2.carbon.apimgt.governance.api.model;

/**
 * This class represents a governance action
 */
public class APIMGovernanceAction {
    private APIMGovernableState apimGovernableState;
    private RuleSeverity ruleSeverity;
    private APIMGovernanceActionType type;

    public APIMGovernableState getGovernableState() {
        return apimGovernableState;
    }

    public void setGovernableState(APIMGovernableState apimGovernableState) {
        this.apimGovernableState = apimGovernableState;
    }

    public RuleSeverity getRuleSeverity() {
        return ruleSeverity;
    }

    public void setRuleSeverity(RuleSeverity ruleSeverity) {
        this.ruleSeverity = ruleSeverity;
    }

    public APIMGovernanceActionType getType() {
        return type;
    }

    public void setType(APIMGovernanceActionType type) {
        this.type = type;
    }
}
