package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPathComputationDiversityPolicy;
import io.swagger.model.TapiPathComputationRouteObjectiveFunction;
import io.swagger.model.TapiTopologyCostCharacteristic;
import io.swagger.model.TapiTopologyLatencyCharacteristic;
import io.swagger.model.TapiTopologyRiskCharacteristic;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPathComputationRoutingConstraint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPathComputationRoutingConstraint   {
  @JsonProperty("cost-characteristic")
  @Valid
  private List<TapiTopologyCostCharacteristic> costCharacteristic = null;

  @JsonProperty("diversity-policy")
  private TapiPathComputationDiversityPolicy diversityPolicy = null;

  @JsonProperty("is-exclusive")
  private Boolean isExclusive = true;

  @JsonProperty("latency-characteristic")
  @Valid
  private List<TapiTopologyLatencyCharacteristic> latencyCharacteristic = null;

  @JsonProperty("risk-diversity-characteristic")
  @Valid
  private List<TapiTopologyRiskCharacteristic> riskDiversityCharacteristic = null;

  @JsonProperty("route-objective-function")
  private TapiPathComputationRouteObjectiveFunction routeObjectiveFunction = null;

  @JsonProperty("tolerable-impact")
  private String tolerableImpact = null;

  public TapiPathComputationRoutingConstraint costCharacteristic(List<TapiTopologyCostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public TapiPathComputationRoutingConstraint addCostCharacteristicItem(TapiTopologyCostCharacteristic costCharacteristicItem) {
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

  public TapiPathComputationRoutingConstraint diversityPolicy(TapiPathComputationDiversityPolicy diversityPolicy) {
    this.diversityPolicy = diversityPolicy;
    return this;
  }

  /**
   * Get diversityPolicy
   * @return diversityPolicy
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPathComputationDiversityPolicy getDiversityPolicy() {
    return diversityPolicy;
  }

  public void setDiversityPolicy(TapiPathComputationDiversityPolicy diversityPolicy) {
    this.diversityPolicy = diversityPolicy;
  }

  public TapiPathComputationRoutingConstraint isExclusive(Boolean isExclusive) {
    this.isExclusive = isExclusive;
    return this;
  }

  /**
   * To distinguish if the resources are to be exclusive to the service
   * @return isExclusive
  **/
  @ApiModelProperty(value = "To distinguish if the resources are to be exclusive to the service")

  public Boolean isIsExclusive() {
    return isExclusive;
  }

  public void setIsExclusive(Boolean isExclusive) {
    this.isExclusive = isExclusive;
  }

  public TapiPathComputationRoutingConstraint latencyCharacteristic(List<TapiTopologyLatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
    return this;
  }

  public TapiPathComputationRoutingConstraint addLatencyCharacteristicItem(TapiTopologyLatencyCharacteristic latencyCharacteristicItem) {
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

  public TapiPathComputationRoutingConstraint riskDiversityCharacteristic(List<TapiTopologyRiskCharacteristic> riskDiversityCharacteristic) {
    this.riskDiversityCharacteristic = riskDiversityCharacteristic;
    return this;
  }

  public TapiPathComputationRoutingConstraint addRiskDiversityCharacteristicItem(TapiTopologyRiskCharacteristic riskDiversityCharacteristicItem) {
    if (this.riskDiversityCharacteristic == null) {
      this.riskDiversityCharacteristic = new ArrayList<>();
    }
    this.riskDiversityCharacteristic.add(riskDiversityCharacteristicItem);
    return this;
  }

  /**
   * none
   * @return riskDiversityCharacteristic
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyRiskCharacteristic> getRiskDiversityCharacteristic() {
    return riskDiversityCharacteristic;
  }

  public void setRiskDiversityCharacteristic(List<TapiTopologyRiskCharacteristic> riskDiversityCharacteristic) {
    this.riskDiversityCharacteristic = riskDiversityCharacteristic;
  }

  public TapiPathComputationRoutingConstraint routeObjectiveFunction(TapiPathComputationRouteObjectiveFunction routeObjectiveFunction) {
    this.routeObjectiveFunction = routeObjectiveFunction;
    return this;
  }

  /**
   * Get routeObjectiveFunction
   * @return routeObjectiveFunction
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPathComputationRouteObjectiveFunction getRouteObjectiveFunction() {
    return routeObjectiveFunction;
  }

  public void setRouteObjectiveFunction(TapiPathComputationRouteObjectiveFunction routeObjectiveFunction) {
    this.routeObjectiveFunction = routeObjectiveFunction;
  }

  public TapiPathComputationRoutingConstraint tolerableImpact(String tolerableImpact) {
    this.tolerableImpact = tolerableImpact;
    return this;
  }

  /**
   * Grades of maximum tolerable disruption to traffic.
   * @return tolerableImpact
  **/
  @ApiModelProperty(value = "Grades of maximum tolerable disruption to traffic.")

  public String getTolerableImpact() {
    return tolerableImpact;
  }

  public void setTolerableImpact(String tolerableImpact) {
    this.tolerableImpact = tolerableImpact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPathComputationRoutingConstraint tapiPathComputationRoutingConstraint = (TapiPathComputationRoutingConstraint) o;
    return Objects.equals(this.costCharacteristic, tapiPathComputationRoutingConstraint.costCharacteristic) &&
        Objects.equals(this.diversityPolicy, tapiPathComputationRoutingConstraint.diversityPolicy) &&
        Objects.equals(this.isExclusive, tapiPathComputationRoutingConstraint.isExclusive) &&
        Objects.equals(this.latencyCharacteristic, tapiPathComputationRoutingConstraint.latencyCharacteristic) &&
        Objects.equals(this.riskDiversityCharacteristic, tapiPathComputationRoutingConstraint.riskDiversityCharacteristic) &&
        Objects.equals(this.routeObjectiveFunction, tapiPathComputationRoutingConstraint.routeObjectiveFunction) &&
        Objects.equals(this.tolerableImpact, tapiPathComputationRoutingConstraint.tolerableImpact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costCharacteristic, diversityPolicy, isExclusive, latencyCharacteristic, riskDiversityCharacteristic, routeObjectiveFunction, tolerableImpact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPathComputationRoutingConstraint {\n");
    
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
    sb.append("    diversityPolicy: ").append(toIndentedString(diversityPolicy)).append("\n");
    sb.append("    isExclusive: ").append(toIndentedString(isExclusive)).append("\n");
    sb.append("    latencyCharacteristic: ").append(toIndentedString(latencyCharacteristic)).append("\n");
    sb.append("    riskDiversityCharacteristic: ").append(toIndentedString(riskDiversityCharacteristic)).append("\n");
    sb.append("    routeObjectiveFunction: ").append(toIndentedString(routeObjectiveFunction)).append("\n");
    sb.append("    tolerableImpact: ").append(toIndentedString(tolerableImpact)).append("\n");
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
