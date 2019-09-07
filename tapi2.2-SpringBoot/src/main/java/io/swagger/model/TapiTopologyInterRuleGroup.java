package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiTopologyCostCharacteristic;
import io.swagger.model.TapiTopologyLatencyCharacteristic;
import io.swagger.model.TapiTopologyNodeRuleGroupRef;
import io.swagger.model.TapiTopologyRiskCharacteristic;
import io.swagger.model.TapiTopologyRule;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyInterRuleGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiTopologyInterRuleGroup extends TapiCommonGlobalClass  {
  @JsonProperty("associated-node-rule-group")
  @Valid
  private List<TapiTopologyNodeRuleGroupRef> associatedNodeRuleGroup = null;

  @JsonProperty("available-capacity")
  private TapiCommonCapacity availableCapacity = null;

  @JsonProperty("cost-characteristic")
  @Valid
  private List<TapiTopologyCostCharacteristic> costCharacteristic = null;

  @JsonProperty("latency-characteristic")
  @Valid
  private List<TapiTopologyLatencyCharacteristic> latencyCharacteristic = null;

  @JsonProperty("risk-characteristic")
  @Valid
  private List<TapiTopologyRiskCharacteristic> riskCharacteristic = null;

  @JsonProperty("rule")
  @Valid
  private List<TapiTopologyRule> rule = null;

  @JsonProperty("total-potential-capacity")
  private TapiCommonCapacity totalPotentialCapacity = null;

  public TapiTopologyInterRuleGroup associatedNodeRuleGroup(List<TapiTopologyNodeRuleGroupRef> associatedNodeRuleGroup) {
    this.associatedNodeRuleGroup = associatedNodeRuleGroup;
    return this;
  }

  public TapiTopologyInterRuleGroup addAssociatedNodeRuleGroupItem(TapiTopologyNodeRuleGroupRef associatedNodeRuleGroupItem) {
    if (this.associatedNodeRuleGroup == null) {
      this.associatedNodeRuleGroup = new ArrayList<>();
    }
    this.associatedNodeRuleGroup.add(associatedNodeRuleGroupItem);
    return this;
  }

  /**
   * none
   * @return associatedNodeRuleGroup
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyNodeRuleGroupRef> getAssociatedNodeRuleGroup() {
    return associatedNodeRuleGroup;
  }

  public void setAssociatedNodeRuleGroup(List<TapiTopologyNodeRuleGroupRef> associatedNodeRuleGroup) {
    this.associatedNodeRuleGroup = associatedNodeRuleGroup;
  }

  public TapiTopologyInterRuleGroup availableCapacity(TapiCommonCapacity availableCapacity) {
    this.availableCapacity = availableCapacity;
    return this;
  }

  /**
   * Get availableCapacity
   * @return availableCapacity
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonCapacity getAvailableCapacity() {
    return availableCapacity;
  }

  public void setAvailableCapacity(TapiCommonCapacity availableCapacity) {
    this.availableCapacity = availableCapacity;
  }

  public TapiTopologyInterRuleGroup costCharacteristic(List<TapiTopologyCostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public TapiTopologyInterRuleGroup addCostCharacteristicItem(TapiTopologyCostCharacteristic costCharacteristicItem) {
    if (this.costCharacteristic == null) {
      this.costCharacteristic = new ArrayList<>();
    }
    this.costCharacteristic.add(costCharacteristicItem);
    return this;
  }

  /**
   * The list of costs where each cost relates to some aspect of the TopologicalEntity.
   * @return costCharacteristic
  **/
  @ApiModelProperty(value = "The list of costs where each cost relates to some aspect of the TopologicalEntity.")
  @Valid
  public List<TapiTopologyCostCharacteristic> getCostCharacteristic() {
    return costCharacteristic;
  }

  public void setCostCharacteristic(List<TapiTopologyCostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
  }

  public TapiTopologyInterRuleGroup latencyCharacteristic(List<TapiTopologyLatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
    return this;
  }

  public TapiTopologyInterRuleGroup addLatencyCharacteristicItem(TapiTopologyLatencyCharacteristic latencyCharacteristicItem) {
    if (this.latencyCharacteristic == null) {
      this.latencyCharacteristic = new ArrayList<>();
    }
    this.latencyCharacteristic.add(latencyCharacteristicItem);
    return this;
  }

  /**
   * The effect on the latency of a queuing process. This only has significant effect for packet based systems and has a complex characteristic.
   * @return latencyCharacteristic
  **/
  @ApiModelProperty(value = "The effect on the latency of a queuing process. This only has significant effect for packet based systems and has a complex characteristic.")
  @Valid
  public List<TapiTopologyLatencyCharacteristic> getLatencyCharacteristic() {
    return latencyCharacteristic;
  }

  public void setLatencyCharacteristic(List<TapiTopologyLatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
  }

  public TapiTopologyInterRuleGroup riskCharacteristic(List<TapiTopologyRiskCharacteristic> riskCharacteristic) {
    this.riskCharacteristic = riskCharacteristic;
    return this;
  }

  public TapiTopologyInterRuleGroup addRiskCharacteristicItem(TapiTopologyRiskCharacteristic riskCharacteristicItem) {
    if (this.riskCharacteristic == null) {
      this.riskCharacteristic = new ArrayList<>();
    }
    this.riskCharacteristic.add(riskCharacteristicItem);
    return this;
  }

  /**
   * A list of risk characteristics for consideration in an analysis of shared risk. Each element of the list represents a specific risk consideration.
   * @return riskCharacteristic
  **/
  @ApiModelProperty(value = "A list of risk characteristics for consideration in an analysis of shared risk. Each element of the list represents a specific risk consideration.")
  @Valid
  public List<TapiTopologyRiskCharacteristic> getRiskCharacteristic() {
    return riskCharacteristic;
  }

  public void setRiskCharacteristic(List<TapiTopologyRiskCharacteristic> riskCharacteristic) {
    this.riskCharacteristic = riskCharacteristic;
  }

  public TapiTopologyInterRuleGroup rule(List<TapiTopologyRule> rule) {
    this.rule = rule;
    return this;
  }

  public TapiTopologyInterRuleGroup addRuleItem(TapiTopologyRule ruleItem) {
    if (this.rule == null) {
      this.rule = new ArrayList<>();
    }
    this.rule.add(ruleItem);
    return this;
  }

  /**
   * none
   * @return rule
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyRule> getRule() {
    return rule;
  }

  public void setRule(List<TapiTopologyRule> rule) {
    this.rule = rule;
  }

  public TapiTopologyInterRuleGroup totalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
    this.totalPotentialCapacity = totalPotentialCapacity;
    return this;
  }

  /**
   * Get totalPotentialCapacity
   * @return totalPotentialCapacity
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonCapacity getTotalPotentialCapacity() {
    return totalPotentialCapacity;
  }

  public void setTotalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
    this.totalPotentialCapacity = totalPotentialCapacity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyInterRuleGroup tapiTopologyInterRuleGroup = (TapiTopologyInterRuleGroup) o;
    return Objects.equals(this.associatedNodeRuleGroup, tapiTopologyInterRuleGroup.associatedNodeRuleGroup) &&
        Objects.equals(this.availableCapacity, tapiTopologyInterRuleGroup.availableCapacity) &&
        Objects.equals(this.costCharacteristic, tapiTopologyInterRuleGroup.costCharacteristic) &&
        Objects.equals(this.latencyCharacteristic, tapiTopologyInterRuleGroup.latencyCharacteristic) &&
        Objects.equals(this.riskCharacteristic, tapiTopologyInterRuleGroup.riskCharacteristic) &&
        Objects.equals(this.rule, tapiTopologyInterRuleGroup.rule) &&
        Objects.equals(this.totalPotentialCapacity, tapiTopologyInterRuleGroup.totalPotentialCapacity) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedNodeRuleGroup, availableCapacity, costCharacteristic, latencyCharacteristic, riskCharacteristic, rule, totalPotentialCapacity, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyInterRuleGroup {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    associatedNodeRuleGroup: ").append(toIndentedString(associatedNodeRuleGroup)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
    sb.append("    latencyCharacteristic: ").append(toIndentedString(latencyCharacteristic)).append("\n");
    sb.append("    riskCharacteristic: ").append(toIndentedString(riskCharacteristic)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    totalPotentialCapacity: ").append(toIndentedString(totalPotentialCapacity)).append("\n");
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
