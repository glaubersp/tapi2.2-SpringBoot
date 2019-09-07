package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonForwardingDirection;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiTopologyCostCharacteristic;
import io.swagger.model.TapiTopologyLatencyCharacteristic;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import io.swagger.model.TapiTopologyProtectionType;
import io.swagger.model.TapiTopologyRestorationPolicy;
import io.swagger.model.TapiTopologyRiskCharacteristic;
import io.swagger.model.TapiTopologyValidationMechanism;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyLink
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiTopologyLink extends TapiCommonGlobalClass  {
  @JsonProperty("administrative-state")
  private TapiCommonAdministrativeState administrativeState = null;

  @JsonProperty("available-capacity")
  private TapiCommonCapacity availableCapacity = null;

  @JsonProperty("cost-characteristic")
  @Valid
  private List<TapiTopologyCostCharacteristic> costCharacteristic = null;

  @JsonProperty("delivery-order-characteristic")
  private String deliveryOrderCharacteristic = null;

  @JsonProperty("direction")
  private TapiCommonForwardingDirection direction = null;

  @JsonProperty("error-characteristic")
  private String errorCharacteristic = null;

  @JsonProperty("latency-characteristic")
  @Valid
  private List<TapiTopologyLatencyCharacteristic> latencyCharacteristic = null;

  @JsonProperty("layer-protocol-name")
  @Valid
  private List<TapiCommonLayerProtocolName> layerProtocolName = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("loss-characteristic")
  private String lossCharacteristic = null;

  @JsonProperty("node-edge-point")
  @Valid
  private List<TapiTopologyNodeEdgePointRef> nodeEdgePoint = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("protection-type")
  private TapiTopologyProtectionType protectionType = null;

  @JsonProperty("repeat-delivery-characteristic")
  private String repeatDeliveryCharacteristic = null;

  @JsonProperty("restoration-policy")
  private TapiTopologyRestorationPolicy restorationPolicy = null;

  @JsonProperty("risk-characteristic")
  @Valid
  private List<TapiTopologyRiskCharacteristic> riskCharacteristic = null;

  @JsonProperty("server-integrity-process-characteristic")
  private String serverIntegrityProcessCharacteristic = null;

  @JsonProperty("total-potential-capacity")
  private TapiCommonCapacity totalPotentialCapacity = null;

  @JsonProperty("transitioned-layer-protocol-name")
  @Valid
  private List<String> transitionedLayerProtocolName = null;

  @JsonProperty("unavailable-time-characteristic")
  private String unavailableTimeCharacteristic = null;

  @JsonProperty("validation-mechanism")
  @Valid
  private List<TapiTopologyValidationMechanism> validationMechanism = null;

  public TapiTopologyLink administrativeState(TapiCommonAdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
    return this;
  }

  /**
   * Get administrativeState
   * @return administrativeState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonAdministrativeState getAdministrativeState() {
    return administrativeState;
  }

  public void setAdministrativeState(TapiCommonAdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
  }

  public TapiTopologyLink availableCapacity(TapiCommonCapacity availableCapacity) {
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

  public TapiTopologyLink costCharacteristic(List<TapiTopologyCostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public TapiTopologyLink addCostCharacteristicItem(TapiTopologyCostCharacteristic costCharacteristicItem) {
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

  public TapiTopologyLink deliveryOrderCharacteristic(String deliveryOrderCharacteristic) {
    this.deliveryOrderCharacteristic = deliveryOrderCharacteristic;
    return this;
  }

  /**
   * Describes the degree to which packets will be delivered out of sequence.                  Does not apply to TDM as the TDM protocols maintain strict order.
   * @return deliveryOrderCharacteristic
  **/
  @ApiModelProperty(value = "Describes the degree to which packets will be delivered out of sequence.                  Does not apply to TDM as the TDM protocols maintain strict order.")

  public String getDeliveryOrderCharacteristic() {
    return deliveryOrderCharacteristic;
  }

  public void setDeliveryOrderCharacteristic(String deliveryOrderCharacteristic) {
    this.deliveryOrderCharacteristic = deliveryOrderCharacteristic;
  }

  public TapiTopologyLink direction(TapiCommonForwardingDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonForwardingDirection getDirection() {
    return direction;
  }

  public void setDirection(TapiCommonForwardingDirection direction) {
    this.direction = direction;
  }

  public TapiTopologyLink errorCharacteristic(String errorCharacteristic) {
    this.errorCharacteristic = errorCharacteristic;
    return this;
  }

  /**
   * Describes the degree to which the signal propagated can be errored.                   Applies to TDM systems as the errored signal will be propagated and not packet as errored packets will be discarded.
   * @return errorCharacteristic
  **/
  @ApiModelProperty(value = "Describes the degree to which the signal propagated can be errored.                   Applies to TDM systems as the errored signal will be propagated and not packet as errored packets will be discarded.")

  public String getErrorCharacteristic() {
    return errorCharacteristic;
  }

  public void setErrorCharacteristic(String errorCharacteristic) {
    this.errorCharacteristic = errorCharacteristic;
  }

  public TapiTopologyLink latencyCharacteristic(List<TapiTopologyLatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
    return this;
  }

  public TapiTopologyLink addLatencyCharacteristicItem(TapiTopologyLatencyCharacteristic latencyCharacteristicItem) {
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

  public TapiTopologyLink layerProtocolName(List<TapiCommonLayerProtocolName> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  public TapiTopologyLink addLayerProtocolNameItem(TapiCommonLayerProtocolName layerProtocolNameItem) {
    if (this.layerProtocolName == null) {
      this.layerProtocolName = new ArrayList<>();
    }
    this.layerProtocolName.add(layerProtocolNameItem);
    return this;
  }

  /**
   * none
   * @return layerProtocolName
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiCommonLayerProtocolName> getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(List<TapiCommonLayerProtocolName> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public TapiTopologyLink lifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * Get lifecycleState
   * @return lifecycleState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonLifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public void setLifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
  }

  public TapiTopologyLink lossCharacteristic(String lossCharacteristic) {
    this.lossCharacteristic = lossCharacteristic;
    return this;
  }

  /**
   * Describes the acceptable characteristic of lost packets where loss may result from discard due to errors or overflow.                  Applies to packet systems and not TDM (as for TDM errored signals are propagated unless grossly errored and overflow/underflow turns into timing slips).
   * @return lossCharacteristic
  **/
  @ApiModelProperty(value = "Describes the acceptable characteristic of lost packets where loss may result from discard due to errors or overflow.                  Applies to packet systems and not TDM (as for TDM errored signals are propagated unless grossly errored and overflow/underflow turns into timing slips).")

  public String getLossCharacteristic() {
    return lossCharacteristic;
  }

  public void setLossCharacteristic(String lossCharacteristic) {
    this.lossCharacteristic = lossCharacteristic;
  }

  public TapiTopologyLink nodeEdgePoint(List<TapiTopologyNodeEdgePointRef> nodeEdgePoint) {
    this.nodeEdgePoint = nodeEdgePoint;
    return this;
  }

  public TapiTopologyLink addNodeEdgePointItem(TapiTopologyNodeEdgePointRef nodeEdgePointItem) {
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

  public TapiTopologyLink operationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
    return this;
  }

  /**
   * Get operationalState
   * @return operationalState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonOperationalState getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
  }

  public TapiTopologyLink protectionType(TapiTopologyProtectionType protectionType) {
    this.protectionType = protectionType;
    return this;
  }

  /**
   * Get protectionType
   * @return protectionType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyProtectionType getProtectionType() {
    return protectionType;
  }

  public void setProtectionType(TapiTopologyProtectionType protectionType) {
    this.protectionType = protectionType;
  }

  public TapiTopologyLink repeatDeliveryCharacteristic(String repeatDeliveryCharacteristic) {
    this.repeatDeliveryCharacteristic = repeatDeliveryCharacteristic;
    return this;
  }

  /**
   * Primarily applies to packet systems where a packet may be delivered more than once (in fault recovery for example).                   It can also apply to TDM where several frames may be received twice due to switching in a system with a large differential propagation delay.
   * @return repeatDeliveryCharacteristic
  **/
  @ApiModelProperty(value = "Primarily applies to packet systems where a packet may be delivered more than once (in fault recovery for example).                   It can also apply to TDM where several frames may be received twice due to switching in a system with a large differential propagation delay.")

  public String getRepeatDeliveryCharacteristic() {
    return repeatDeliveryCharacteristic;
  }

  public void setRepeatDeliveryCharacteristic(String repeatDeliveryCharacteristic) {
    this.repeatDeliveryCharacteristic = repeatDeliveryCharacteristic;
  }

  public TapiTopologyLink restorationPolicy(TapiTopologyRestorationPolicy restorationPolicy) {
    this.restorationPolicy = restorationPolicy;
    return this;
  }

  /**
   * Get restorationPolicy
   * @return restorationPolicy
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyRestorationPolicy getRestorationPolicy() {
    return restorationPolicy;
  }

  public void setRestorationPolicy(TapiTopologyRestorationPolicy restorationPolicy) {
    this.restorationPolicy = restorationPolicy;
  }

  public TapiTopologyLink riskCharacteristic(List<TapiTopologyRiskCharacteristic> riskCharacteristic) {
    this.riskCharacteristic = riskCharacteristic;
    return this;
  }

  public TapiTopologyLink addRiskCharacteristicItem(TapiTopologyRiskCharacteristic riskCharacteristicItem) {
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

  public TapiTopologyLink serverIntegrityProcessCharacteristic(String serverIntegrityProcessCharacteristic) {
    this.serverIntegrityProcessCharacteristic = serverIntegrityProcessCharacteristic;
    return this;
  }

  /**
   * Describes the effect of any server integrity enhancement process on the characteristics of the TopologicalEntity.
   * @return serverIntegrityProcessCharacteristic
  **/
  @ApiModelProperty(value = "Describes the effect of any server integrity enhancement process on the characteristics of the TopologicalEntity.")

  public String getServerIntegrityProcessCharacteristic() {
    return serverIntegrityProcessCharacteristic;
  }

  public void setServerIntegrityProcessCharacteristic(String serverIntegrityProcessCharacteristic) {
    this.serverIntegrityProcessCharacteristic = serverIntegrityProcessCharacteristic;
  }

  public TapiTopologyLink totalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
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

  public TapiTopologyLink transitionedLayerProtocolName(List<String> transitionedLayerProtocolName) {
    this.transitionedLayerProtocolName = transitionedLayerProtocolName;
    return this;
  }

  public TapiTopologyLink addTransitionedLayerProtocolNameItem(String transitionedLayerProtocolNameItem) {
    if (this.transitionedLayerProtocolName == null) {
      this.transitionedLayerProtocolName = new ArrayList<>();
    }
    this.transitionedLayerProtocolName.add(transitionedLayerProtocolNameItem);
    return this;
  }

  /**
   * Provides the ordered structure of layer protocol transitions encapsulated in the TopologicalEntity. The ordering relates to the LinkPort role.
   * @return transitionedLayerProtocolName
  **/
  @ApiModelProperty(value = "Provides the ordered structure of layer protocol transitions encapsulated in the TopologicalEntity. The ordering relates to the LinkPort role.")

  public List<String> getTransitionedLayerProtocolName() {
    return transitionedLayerProtocolName;
  }

  public void setTransitionedLayerProtocolName(List<String> transitionedLayerProtocolName) {
    this.transitionedLayerProtocolName = transitionedLayerProtocolName;
  }

  public TapiTopologyLink unavailableTimeCharacteristic(String unavailableTimeCharacteristic) {
    this.unavailableTimeCharacteristic = unavailableTimeCharacteristic;
    return this;
  }

  /**
   * Describes the duration for which there may be no valid signal propagated.
   * @return unavailableTimeCharacteristic
  **/
  @ApiModelProperty(value = "Describes the duration for which there may be no valid signal propagated.")

  public String getUnavailableTimeCharacteristic() {
    return unavailableTimeCharacteristic;
  }

  public void setUnavailableTimeCharacteristic(String unavailableTimeCharacteristic) {
    this.unavailableTimeCharacteristic = unavailableTimeCharacteristic;
  }

  public TapiTopologyLink validationMechanism(List<TapiTopologyValidationMechanism> validationMechanism) {
    this.validationMechanism = validationMechanism;
    return this;
  }

  public TapiTopologyLink addValidationMechanismItem(TapiTopologyValidationMechanism validationMechanismItem) {
    if (this.validationMechanism == null) {
      this.validationMechanism = new ArrayList<>();
    }
    this.validationMechanism.add(validationMechanismItem);
    return this;
  }

  /**
   * Provides details of the specific validation mechanism(s) used to confirm the presence of an intended topologicalEntity.
   * @return validationMechanism
  **/
  @ApiModelProperty(value = "Provides details of the specific validation mechanism(s) used to confirm the presence of an intended topologicalEntity.")
  @Valid
  public List<TapiTopologyValidationMechanism> getValidationMechanism() {
    return validationMechanism;
  }

  public void setValidationMechanism(List<TapiTopologyValidationMechanism> validationMechanism) {
    this.validationMechanism = validationMechanism;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyLink tapiTopologyLink = (TapiTopologyLink) o;
    return Objects.equals(this.administrativeState, tapiTopologyLink.administrativeState) &&
        Objects.equals(this.availableCapacity, tapiTopologyLink.availableCapacity) &&
        Objects.equals(this.costCharacteristic, tapiTopologyLink.costCharacteristic) &&
        Objects.equals(this.deliveryOrderCharacteristic, tapiTopologyLink.deliveryOrderCharacteristic) &&
        Objects.equals(this.direction, tapiTopologyLink.direction) &&
        Objects.equals(this.errorCharacteristic, tapiTopologyLink.errorCharacteristic) &&
        Objects.equals(this.latencyCharacteristic, tapiTopologyLink.latencyCharacteristic) &&
        Objects.equals(this.layerProtocolName, tapiTopologyLink.layerProtocolName) &&
        Objects.equals(this.lifecycleState, tapiTopologyLink.lifecycleState) &&
        Objects.equals(this.lossCharacteristic, tapiTopologyLink.lossCharacteristic) &&
        Objects.equals(this.nodeEdgePoint, tapiTopologyLink.nodeEdgePoint) &&
        Objects.equals(this.operationalState, tapiTopologyLink.operationalState) &&
        Objects.equals(this.protectionType, tapiTopologyLink.protectionType) &&
        Objects.equals(this.repeatDeliveryCharacteristic, tapiTopologyLink.repeatDeliveryCharacteristic) &&
        Objects.equals(this.restorationPolicy, tapiTopologyLink.restorationPolicy) &&
        Objects.equals(this.riskCharacteristic, tapiTopologyLink.riskCharacteristic) &&
        Objects.equals(this.serverIntegrityProcessCharacteristic, tapiTopologyLink.serverIntegrityProcessCharacteristic) &&
        Objects.equals(this.totalPotentialCapacity, tapiTopologyLink.totalPotentialCapacity) &&
        Objects.equals(this.transitionedLayerProtocolName, tapiTopologyLink.transitionedLayerProtocolName) &&
        Objects.equals(this.unavailableTimeCharacteristic, tapiTopologyLink.unavailableTimeCharacteristic) &&
        Objects.equals(this.validationMechanism, tapiTopologyLink.validationMechanism) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativeState, availableCapacity, costCharacteristic, deliveryOrderCharacteristic, direction, errorCharacteristic, latencyCharacteristic, layerProtocolName, lifecycleState, lossCharacteristic, nodeEdgePoint, operationalState, protectionType, repeatDeliveryCharacteristic, restorationPolicy, riskCharacteristic, serverIntegrityProcessCharacteristic, totalPotentialCapacity, transitionedLayerProtocolName, unavailableTimeCharacteristic, validationMechanism, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyLink {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
    sb.append("    deliveryOrderCharacteristic: ").append(toIndentedString(deliveryOrderCharacteristic)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    errorCharacteristic: ").append(toIndentedString(errorCharacteristic)).append("\n");
    sb.append("    latencyCharacteristic: ").append(toIndentedString(latencyCharacteristic)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    lossCharacteristic: ").append(toIndentedString(lossCharacteristic)).append("\n");
    sb.append("    nodeEdgePoint: ").append(toIndentedString(nodeEdgePoint)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
    sb.append("    repeatDeliveryCharacteristic: ").append(toIndentedString(repeatDeliveryCharacteristic)).append("\n");
    sb.append("    restorationPolicy: ").append(toIndentedString(restorationPolicy)).append("\n");
    sb.append("    riskCharacteristic: ").append(toIndentedString(riskCharacteristic)).append("\n");
    sb.append("    serverIntegrityProcessCharacteristic: ").append(toIndentedString(serverIntegrityProcessCharacteristic)).append("\n");
    sb.append("    totalPotentialCapacity: ").append(toIndentedString(totalPotentialCapacity)).append("\n");
    sb.append("    transitionedLayerProtocolName: ").append(toIndentedString(transitionedLayerProtocolName)).append("\n");
    sb.append("    unavailableTimeCharacteristic: ").append(toIndentedString(unavailableTimeCharacteristic)).append("\n");
    sb.append("    validationMechanism: ").append(toIndentedString(validationMechanism)).append("\n");
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
