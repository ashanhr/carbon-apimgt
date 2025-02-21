package org.wso2.carbon.apimgt.governance.rest.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.governance.rest.api.dto.RuleValidationResultDTO;
import javax.validation.constraints.*;

/**
 * Result of the ruleset validation.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;
import org.wso2.carbon.apimgt.rest.api.common.annotations.Scope;
import com.fasterxml.jackson.annotation.JsonCreator;

import javax.validation.Valid;

@ApiModel(description = "Result of the ruleset validation.")

public class RulesetValidationResultDTO   {
  
    private String id = null;
    private String name = null;

          @XmlType(name="StatusEnum")
    @XmlEnum(String.class)
    public enum StatusEnum {
        PASSED("PASSED"),
        FAILED("FAILED"),
        UNAPPLIED("UNAPPLIED");
        private String value;

        StatusEnum (String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String v) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(v)) {
                    return b;
                }
            }
return null;
        }
    } 
    private StatusEnum status = null;
    private List<RuleValidationResultDTO> violatedRules = new ArrayList<RuleValidationResultDTO>();
    private List<RuleValidationResultDTO> followedRules = new ArrayList<RuleValidationResultDTO>();

  /**
   * UUID of the ruleset.
   **/
  public RulesetValidationResultDTO id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "UUID of the ruleset.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Name of the ruleset.
   **/
  public RulesetValidationResultDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "API Security Ruleset", value = "Name of the ruleset.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Status of the ruleset validation.
   **/
  public RulesetValidationResultDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "PASSED", value = "Status of the ruleset validation.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * List of violated rules.
   **/
  public RulesetValidationResultDTO violatedRules(List<RuleValidationResultDTO> violatedRules) {
    this.violatedRules = violatedRules;
    return this;
  }

  
  @ApiModelProperty(value = "List of violated rules.")
      @Valid
  @JsonProperty("violatedRules")
  public List<RuleValidationResultDTO> getViolatedRules() {
    return violatedRules;
  }
  public void setViolatedRules(List<RuleValidationResultDTO> violatedRules) {
    this.violatedRules = violatedRules;
  }

  /**
   * List of followed rules.
   **/
  public RulesetValidationResultDTO followedRules(List<RuleValidationResultDTO> followedRules) {
    this.followedRules = followedRules;
    return this;
  }

  
  @ApiModelProperty(value = "List of followed rules.")
      @Valid
  @JsonProperty("followedRules")
  public List<RuleValidationResultDTO> getFollowedRules() {
    return followedRules;
  }
  public void setFollowedRules(List<RuleValidationResultDTO> followedRules) {
    this.followedRules = followedRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulesetValidationResultDTO rulesetValidationResult = (RulesetValidationResultDTO) o;
    return Objects.equals(id, rulesetValidationResult.id) &&
        Objects.equals(name, rulesetValidationResult.name) &&
        Objects.equals(status, rulesetValidationResult.status) &&
        Objects.equals(violatedRules, rulesetValidationResult.violatedRules) &&
        Objects.equals(followedRules, rulesetValidationResult.followedRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, violatedRules, followedRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulesetValidationResultDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    violatedRules: ").append(toIndentedString(violatedRules)).append("\n");
    sb.append("    followedRules: ").append(toIndentedString(followedRules)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

