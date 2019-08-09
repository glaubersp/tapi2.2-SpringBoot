package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonServiceInterfacePointRef;
import io.swagger.model.TapiTopologyCostCharacteristic;
import io.swagger.model.TapiTopologyLatencyCharacteristic;
import io.swagger.model.TapiVirtualNetworkVirtualNwServiceRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiVirtualNetworkVirtualNetworkConstraint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiVirtualNetworkVirtualNetworkConstraint extends TapiCommonLocalClass  {
  @JsonProperty("service-layer")
  @Valid
  private List<TapiCommonLayerProtocolName> serviceLayer = null;

  @JsonProperty("requested-capacity")
  private TapiCommonCapacity requestedCapacity = null;

  @JsonProperty("sink-service-end-point")
  private TapiCommonServiceInterfacePointRef sinkServiceEndPoint = null;

  @JsonProperty("diversity-exclusion")
  @Valid
  private List<TapiVirtualNetworkVirtualNwServiceRef> diversityExclusion = null;

  @JsonProperty("src-service-end-point")
  private TapiCommonServiceInterfacePointRef srcServiceEndPoint = null;

  @JsonProperty("service-level")
  private String serviceLevel = null;

  @JsonProperty("cost-characteristic")
  @Valid
  private List<TapiTopologyCostCharacteristic> costCharacteristic = null;

  @JsonProperty("latency-characteristic")
  @Valid
  private List<TapiTopologyLatencyCharacteristic> latencyCharacteristic = null;

  public TapiVirtualNetworkVirtualNetworkConstraint serviceLayer(List<TapiCommonLayerProtocolName> serviceLayer) {
    this.serviceLayer = serviceLayer;
    return this;
  }

  public TapiVirtualNetworkVirtualNetworkConstraint addServiceLayerItem(TapiCommonLayerProtocolName serviceLayerItem) {
    if (this.serviceLayer == null) {
      this.serviceLayer = new ArrayList<TapiCommonLayerProtocolName>();
    }
    this.serviceLayer.add(serviceLayerItem);
    return this;
  }

  /**
   * none
   * @return serviceLayer
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiCommonLayerProtocolName> getServiceLayer() {
    return serviceLayer;
  }

  public void setServiceLayer(List<TapiCommonLayerProtocolName> serviceLayer) {
    this.serviceLayer = serviceLayer;
  }

  public TapiVirtualNetworkVirtualNetworkConstraint requestedCapacity(TapiCommonCapacity requestedCapacity) {
    this.requestedCapacity = requestedCapacity;
    return this;
  }

  /**
   * Get requestedCapacity
   * @return requestedCapacity
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonCapacity getRequestedCapacity() {
    return requestedCapacity;
  }

  public void setRequestedCapacity(TapiCommonCapacity requestedCapacity) {
    this.requestedCapacity = requestedCapacity;
  }

  public TapiVirtualNetworkVirtualNetworkConstraint sinkServiceEndPoint(TapiCommonServiceInterfacePointRef sinkServiceEndPoint) {
    this.sinkServiceEndPoint = sinkServiceEndPoint;
    return this;
  }

  /**
   * Get sinkServiceEndPoint
   * @return sinkServiceEndPoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonServiceInterfacePointRef getSinkServiceEndPoint() {
    return sinkServiceEndPoint;
  }

  public void setSinkServiceEndPoint(TapiCommonServiceInterfacePointRef sinkServiceEndPoint) {
    this.sinkServiceEndPoint = sinkServiceEndPoint;
  }

  public TapiVirtualNetworkVirtualNetworkConstraint diversityExclusion(List<TapiVirtualNetworkVirtualNwServiceRef> diversityExclusion) {
    this.diversityExclusion = diversityExclusion;
    return this;
  }

  public TapiVirtualNetworkVirtualNetworkConstraint addDiversityExclusionItem(TapiVirtualNetworkVirtualNwServiceRef diversityExclusionItem) {
    if (this.diversityExclusion == null) {
      this.diversityExclusion = new ArrayList<TapiVirtualNetworkVirtualNwServiceRef>();
    }
    this.diversityExclusion.add(diversityExclusionItem);
    return this;
  }

  /**
   * none
   * @return diversityExclusion
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiVirtualNetworkVirtualNwServiceRef> getDiversityExclusion() {
    return diversityExclusion;
  }

  public void setDiversityExclusion(List<TapiVirtualNetworkVirtualNwServiceRef> diversityExclusion) {
    this.diversityExclusion = diversityExclusion;
  }

  public TapiVirtualNetworkVirtualNetworkConstraint srcServiceEndPoint(TapiCommonServiceInterfacePointRef srcServiceEndPoint) {
    this.srcServiceEndPoint = srcServiceEndPoint;
    return this;
  }

  /**
   * Get srcServiceEndPoint
   * @return srcServiceEndPoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonServiceInterfacePointRef getSrcServiceEndPoint() {
    return srcServiceEndPoint;
  }

  public void setSrcServiceEndPoint(TapiCommonServiceInterfacePointRef srcServiceEndPoint) {
    this.srcServiceEndPoint = srcServiceEndPoint;
  }

  public TapiVirtualNetworkVirtualNetworkConstraint serviceLevel(String serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }

  /**
   * An abstract value the meaning of which is mutually agreed – typically represents metrics such as - Class of service, priority, resiliency, availability
   * @return serviceLevel
  **/
  @ApiModelProperty(value = "An abstract value the meaning of which is mutually agreed – typically represents metrics such as - Class of service, priority, resiliency, availability")

  public String getServiceLevel() {
    return serviceLevel;
  }

  public void setServiceLevel(String serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  public TapiVirtualNetworkVirtualNetworkConstraint costCharacteristic(List<TapiTopologyCostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public TapiVirtualNetworkVirtualNetworkConstraint addCostCharacteristicItem(TapiTopologyCostCharacteristic costCharacteristicItem) {
    if (this.costCharacteristic == null) {
      this.costCharacteristic = new ArrayList<TapiTopologyCostCharacteristic>();
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

  public TapiVirtualNetworkVirtualNetworkConstraint latencyCharacteristic(List<TapiTopologyLatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
    return this;
  }

  public TapiVirtualNetworkVirtualNetworkConstraint addLatencyCharacteristicItem(TapiTopologyLatencyCharacteristic latencyCharacteristicItem) {
    if (this.latencyCharacteristic == null) {
      this.latencyCharacteristic = new ArrayList<TapiTopologyLatencyCharacteristic>();
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiVirtualNetworkVirtualNetworkConstraint tapiVirtualNetworkVirtualNetworkConstraint = (TapiVirtualNetworkVirtualNetworkConstraint) o;
    return Objects.equals(this.serviceLayer, tapiVirtualNetworkVirtualNetworkConstraint.serviceLayer) &&
        Objects.equals(this.requestedCapacity, tapiVirtualNetworkVirtualNetworkConstraint.requestedCapacity) &&
        Objects.equals(this.sinkServiceEndPoint, tapiVirtualNetworkVirtualNetworkConstraint.sinkServiceEndPoint) &&
        Objects.equals(this.diversityExclusion, tapiVirtualNetworkVirtualNetworkConstraint.diversityExclusion) &&
        Objects.equals(this.srcServiceEndPoint, tapiVirtualNetworkVirtualNetworkConstraint.srcServiceEndPoint) &&
        Objects.equals(this.serviceLevel, tapiVirtualNetworkVirtualNetworkConstraint.serviceLevel) &&
        Objects.equals(this.costCharacteristic, tapiVirtualNetworkVirtualNetworkConstraint.costCharacteristic) &&
        Objects.equals(this.latencyCharacteristic, tapiVirtualNetworkVirtualNetworkConstraint.latencyCharacteristic) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLayer, requestedCapacity, sinkServiceEndPoint, diversityExclusion, srcServiceEndPoint, serviceLevel, costCharacteristic, latencyCharacteristic, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkVirtualNetworkConstraint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    serviceLayer: ").append(toIndentedString(serviceLayer)).append("\n");
    sb.append("    requestedCapacity: ").append(toIndentedString(requestedCapacity)).append("\n");
    sb.append("    sinkServiceEndPoint: ").append(toIndentedString(sinkServiceEndPoint)).append("\n");
    sb.append("    diversityExclusion: ").append(toIndentedString(diversityExclusion)).append("\n");
    sb.append("    srcServiceEndPoint: ").append(toIndentedString(srcServiceEndPoint)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
    sb.append("    latencyCharacteristic: ").append(toIndentedString(latencyCharacteristic)).append("\n");
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
