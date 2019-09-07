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
import io.swagger.model.TapiTopologyInterRuleGroup;
import io.swagger.model.TapiTopologyLatencyCharacteristic;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import io.swagger.model.TapiTopologyNodeRuleGroupRef;
import io.swagger.model.TapiTopologyRiskCharacteristic;
import io.swagger.model.TapiTopologyRule;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyNodeRuleGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiTopologyNodeRuleGroup extends TapiCommonGlobalClass  {
  @JsonProperty("available-capacity")
  private TapiCommonCapacity availableCapacity = null;

  @JsonProperty("composed-rule-group")
  @Valid
  private List<TapiTopologyNodeRuleGroupRef> composedRuleGroup = null;

  @JsonProperty("cost-characteristic")
  @Valid
  private List<TapiTopologyCostCharacteristic> costCharacteristic = null;

  @JsonProperty("inter-rule-group")
  @Valid
  private List<TapiTopologyInterRuleGroup> interRuleGroup = null;

  @JsonProperty("latency-characteristic")
  @Valid
  private List<TapiTopologyLatencyCharacteristic> latencyCharacteristic = null;

  @JsonProperty("node-edge-point")
  @Valid
  private List<TapiTopologyNodeEdgePointRef> nodeEdgePoint = null;

  @JsonProperty("risk-characteristic")
  @Valid
  private List<TapiTopologyRiskCharacteristic> riskCharacteristic = null;

  @JsonProperty("rule")
  @Valid
  private List<TapiTopologyRule> rule = null;

  @JsonProperty("total-potential-capacity")
  private TapiCommonCapacity totalPotentialCapacity = null;

  public TapiTopologyNodeRuleGroup availableCapacity(TapiCommonCapacity availableCapacity) {
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

  public TapiTopologyNodeRuleGroup composedRuleGroup(List<TapiTopologyNodeRuleGroupRef> composedRuleGroup) {
    this.composedRuleGroup = composedRuleGroup;
    return this;
  }

  public TapiTopologyNodeRuleGroup addComposedRuleGroupItem(TapiTopologyNodeRuleGroupRef composedRuleGroupItem) {
    if (this.composedRuleGroup == null) {
      this.composedRuleGroup = new ArrayList<>();
    }
    this.composedRuleGroup.add(composedRuleGroupItem);
    return this;
  }

  /**
   * none
   * @return composedRuleGroup
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyNodeRuleGroupRef> getComposedRuleGroup() {
    return composedRuleGroup;
  }

  public void setComposedRuleGroup(List<TapiTopologyNodeRuleGroupRef> composedRuleGroup) {
    this.composedRuleGroup = composedRuleGroup;
  }

  public TapiTopologyNodeRuleGroup costCharacteristic(List<TapiTopologyCostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public TapiTopologyNodeRuleGroup addCostCharacteristicItem(TapiTopologyCostCharacteristic costCharacteristicItem) {
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

  public TapiTopologyNodeRuleGroup interRuleGroup(List<TapiTopologyInterRuleGroup> interRuleGroup) {
    this.interRuleGroup = interRuleGroup;
    return this;
  }

  public TapiTopologyNodeRuleGroup addInterRuleGroupItem(TapiTopologyInterRuleGroup interRuleGroupItem) {
    if (this.interRuleGroup == null) {
      this.interRuleGroup = new ArrayList<>();
    }
    this.interRuleGroup.add(interRuleGroupItem);
    return this;
  }

  /**
   * none
   * @return interRuleGroup
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyInterRuleGroup> getInterRuleGroup() {
    return interRuleGroup;
  }

  public void setInterRuleGroup(List<TapiTopologyInterRuleGroup> interRuleGroup) {
    this.interRuleGroup = interRuleGroup;
  }

  public TapiTopologyNodeRuleGroup latencyCharacteristic(List<TapiTopologyLatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
    return this;
  }

  public TapiTopologyNodeRuleGroup addLatencyCharacteristicItem(TapiTopologyLatencyCharacteristic latencyCharacteristicItem) {
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

  public TapiTopologyNodeRuleGroup nodeEdgePoint(List<TapiTopologyNodeEdgePointRef> nodeEdgePoint) {
    this.nodeEdgePoint = nodeEdgePoint;
    return this;
  }

  public TapiTopologyNodeRuleGroup addNodeEdgePointItem(TapiTopologyNodeEdgePointRef nodeEdgePointItem) {
    if (this.nodeEdgePoint == null) {
      this.nodeEdgePoint = new ArrayList<>();
    }
    this.nodeEdgePoint.add(nodeEdgePointItem);
    return this;
  }

  /**
   * none
   * @return nodeEdgePoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyNodeEdgePointRef> getNodeEdgePoint() {
    return nodeEdgePoint;
  }

  public void setNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> nodeEdgePoint) {
    this.nodeEdgePoint = nodeEdgePoint;
  }

  public TapiTopologyNodeRuleGroup riskCharacteristic(List<TapiTopologyRiskCharacteristic> riskCharacteristic) {
    this.riskCharacteristic = riskCharacteristic;
    return this;
  }

  public TapiTopologyNodeRuleGroup addRiskCharacteristicItem(TapiTopologyRiskCharacteristic riskCharacteristicItem) {
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

  public TapiTopologyNodeRuleGroup rule(List<TapiTopologyRule> rule) {
    this.rule = rule;
    return this;
  }

  public TapiTopologyNodeRuleGroup addRuleItem(TapiTopologyRule ruleItem) {
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

  public TapiTopologyNodeRuleGroup totalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
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
    TapiTopologyNodeRuleGroup tapiTopologyNodeRuleGroup = (TapiTopologyNodeRuleGroup) o;
    return Objects.equals(this.availableCapacity, tapiTopologyNodeRuleGroup.availableCapacity) &&
        Objects.equals(this.composedRuleGroup, tapiTopologyNodeRuleGroup.composedRuleGroup) &&
        Objects.equals(this.costCharacteristic, tapiTopologyNodeRuleGroup.costCharacteristic) &&
        Objects.equals(this.interRuleGroup, tapiTopologyNodeRuleGroup.interRuleGroup) &&
        Objects.equals(this.latencyCharacteristic, tapiTopologyNodeRuleGroup.latencyCharacteristic) &&
        Objects.equals(this.nodeEdgePoint, tapiTopologyNodeRuleGroup.nodeEdgePoint) &&
        Objects.equals(this.riskCharacteristic, tapiTopologyNodeRuleGroup.riskCharacteristic) &&
        Objects.equals(this.rule, tapiTopologyNodeRuleGroup.rule) &&
        Objects.equals(this.totalPotentialCapacity, tapiTopologyNodeRuleGroup.totalPotentialCapacity) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableCapacity, composedRuleGroup, costCharacteristic, interRuleGroup, latencyCharacteristic, nodeEdgePoint, riskCharacteristic, rule, totalPotentialCapacity, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyNodeRuleGroup {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    composedRuleGroup: ").append(toIndentedString(composedRuleGroup)).append("\n");
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
    sb.append("    interRuleGroup: ").append(toIndentedString(interRuleGroup)).append("\n");
    sb.append("    latencyCharacteristic: ").append(toIndentedString(latencyCharacteristic)).append("\n");
    sb.append("    nodeEdgePoint: ").append(toIndentedString(nodeEdgePoint)).append("\n");
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
