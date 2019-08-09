package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiTopologyForwardingRule;
import io.swagger.model.TapiTopologyRuleType;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyRule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiTopologyRule extends TapiCommonLocalClass  {
  @JsonProperty("override-priority")
  private Integer overridePriority = null;

  @JsonProperty("forwarding-rule")
  private TapiTopologyForwardingRule forwardingRule = null;

  @JsonProperty("rule-type")
  private TapiTopologyRuleType ruleType = null;

  public TapiTopologyRule overridePriority(Integer overridePriority) {
    this.overridePriority = overridePriority;
    return this;
  }

  /**
   * none
   * @return overridePriority
  **/
  @ApiModelProperty(value = "none")

  public Integer getOverridePriority() {
    return overridePriority;
  }

  public void setOverridePriority(Integer overridePriority) {
    this.overridePriority = overridePriority;
  }

  public TapiTopologyRule forwardingRule(TapiTopologyForwardingRule forwardingRule) {
    this.forwardingRule = forwardingRule;
    return this;
  }

  /**
   * Get forwardingRule
   * @return forwardingRule
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyForwardingRule getForwardingRule() {
    return forwardingRule;
  }

  public void setForwardingRule(TapiTopologyForwardingRule forwardingRule) {
    this.forwardingRule = forwardingRule;
  }

  public TapiTopologyRule ruleType(TapiTopologyRuleType ruleType) {
    this.ruleType = ruleType;
    return this;
  }

  /**
   * Get ruleType
   * @return ruleType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyRuleType getRuleType() {
    return ruleType;
  }

  public void setRuleType(TapiTopologyRuleType ruleType) {
    this.ruleType = ruleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyRule tapiTopologyRule = (TapiTopologyRule) o;
    return Objects.equals(this.overridePriority, tapiTopologyRule.overridePriority) &&
        Objects.equals(this.forwardingRule, tapiTopologyRule.forwardingRule) &&
        Objects.equals(this.ruleType, tapiTopologyRule.ruleType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overridePriority, forwardingRule, ruleType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyRule {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    overridePriority: ").append(toIndentedString(overridePriority)).append("\n");
    sb.append("    forwardingRule: ").append(toIndentedString(forwardingRule)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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
