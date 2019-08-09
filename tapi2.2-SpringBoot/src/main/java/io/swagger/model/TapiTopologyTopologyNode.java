package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdminStatePac;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonCapacityPac;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiEquipmentNodeAugmentation1;
import io.swagger.model.TapiEquipmentSupportingPhysicalSpan;
import io.swagger.model.TapiTopologyCostCharacteristic;
import io.swagger.model.TapiTopologyLatencyCharacteristic;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import io.swagger.model.TapiTopologyNodeNodeEdgePoint;
import io.swagger.model.TapiTopologyNodeRuleGroup;
import io.swagger.model.TapiTopologyTopologyRef;
import io.swagger.model.TapiTopologyTransferCostPac;
import io.swagger.model.TapiTopologyTransferIntegrityPac;
import io.swagger.model.TapiTopologyTransferTimingPac;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyTopologyNode
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiTopologyTopologyNode extends TapiCommonAdminStatePac  {
  @JsonProperty("available-capacity")
  private TapiCommonCapacity availableCapacity = null;

  @JsonProperty("total-potential-capacity")
  private TapiCommonCapacity totalPotentialCapacity = null;

  @JsonProperty("name")
  @Valid
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("supporting-physical-span")
  private TapiEquipmentSupportingPhysicalSpan supportingPhysicalSpan = null;

  @JsonProperty("cost-characteristic")
  @Valid
  private List<TapiTopologyCostCharacteristic> costCharacteristic = null;

  @JsonProperty("error-characteristic")
  private String errorCharacteristic = null;

  @JsonProperty("unavailable-time-characteristic")
  private String unavailableTimeCharacteristic = null;

  @JsonProperty("server-integrity-process-characteristic")
  private String serverIntegrityProcessCharacteristic = null;

  @JsonProperty("delivery-order-characteristic")
  private String deliveryOrderCharacteristic = null;

  @JsonProperty("repeat-delivery-characteristic")
  private String repeatDeliveryCharacteristic = null;

  @JsonProperty("loss-characteristic")
  private String lossCharacteristic = null;

  @JsonProperty("latency-characteristic")
  @Valid
  private List<TapiTopologyLatencyCharacteristic> latencyCharacteristic = null;

  @JsonProperty("layer-protocol-name")
  @Valid
  private List<TapiCommonLayerProtocolName> layerProtocolName = null;

  @JsonProperty("encap-topology")
  private TapiTopologyTopologyRef encapTopology = null;

  @JsonProperty("node-rule-group")
  @Valid
  private List<TapiTopologyNodeRuleGroup> nodeRuleGroup = null;

  @JsonProperty("node-edge-point")
  @Valid
  private List<TapiTopologyNodeNodeEdgePoint> nodeEdgePoint = null;

  @JsonProperty("aggregated-node-edge-point")
  @Valid
  private List<TapiTopologyNodeEdgePointRef> aggregatedNodeEdgePoint = null;

  public TapiTopologyTopologyNode availableCapacity(TapiCommonCapacity availableCapacity) {
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

  public TapiTopologyTopologyNode totalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
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

  public TapiTopologyTopologyNode name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiTopologyTopologyNode addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<TapiCommonNameAndValue>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. This value is unique in some namespace but may change during the life of the entity.                  A name carries no semantics with respect to the purpose of the entity.
   * @return name
  **/
  @ApiModelProperty(value = "List of names. This value is unique in some namespace but may change during the life of the entity.                  A name carries no semantics with respect to the purpose of the entity.")
  @Valid
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiTopologyTopologyNode uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                  An UUID carries no semantics with respect to the purpose or state of the entity.                  UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                  Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                   Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                  An UUID carries no semantics with respect to the purpose or state of the entity.                  UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                  Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                   Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TapiTopologyTopologyNode supportingPhysicalSpan(TapiEquipmentSupportingPhysicalSpan supportingPhysicalSpan) {
    this.supportingPhysicalSpan = supportingPhysicalSpan;
    return this;
  }

  /**
   * Get supportingPhysicalSpan
   * @return supportingPhysicalSpan
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentSupportingPhysicalSpan getSupportingPhysicalSpan() {
    return supportingPhysicalSpan;
  }

  public void setSupportingPhysicalSpan(TapiEquipmentSupportingPhysicalSpan supportingPhysicalSpan) {
    this.supportingPhysicalSpan = supportingPhysicalSpan;
  }

  public TapiTopologyTopologyNode costCharacteristic(List<TapiTopologyCostCharacteristic> costCharacteristic) {
    this.costCharacteristic = costCharacteristic;
    return this;
  }

  public TapiTopologyTopologyNode addCostCharacteristicItem(TapiTopologyCostCharacteristic costCharacteristicItem) {
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

  public TapiTopologyTopologyNode errorCharacteristic(String errorCharacteristic) {
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

  public TapiTopologyTopologyNode unavailableTimeCharacteristic(String unavailableTimeCharacteristic) {
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

  public TapiTopologyTopologyNode serverIntegrityProcessCharacteristic(String serverIntegrityProcessCharacteristic) {
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

  public TapiTopologyTopologyNode deliveryOrderCharacteristic(String deliveryOrderCharacteristic) {
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

  public TapiTopologyTopologyNode repeatDeliveryCharacteristic(String repeatDeliveryCharacteristic) {
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

  public TapiTopologyTopologyNode lossCharacteristic(String lossCharacteristic) {
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

  public TapiTopologyTopologyNode latencyCharacteristic(List<TapiTopologyLatencyCharacteristic> latencyCharacteristic) {
    this.latencyCharacteristic = latencyCharacteristic;
    return this;
  }

  public TapiTopologyTopologyNode addLatencyCharacteristicItem(TapiTopologyLatencyCharacteristic latencyCharacteristicItem) {
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

  public TapiTopologyTopologyNode layerProtocolName(List<TapiCommonLayerProtocolName> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  public TapiTopologyTopologyNode addLayerProtocolNameItem(TapiCommonLayerProtocolName layerProtocolNameItem) {
    if (this.layerProtocolName == null) {
      this.layerProtocolName = new ArrayList<TapiCommonLayerProtocolName>();
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

  public TapiTopologyTopologyNode encapTopology(TapiTopologyTopologyRef encapTopology) {
    this.encapTopology = encapTopology;
    return this;
  }

  /**
   * Get encapTopology
   * @return encapTopology
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyTopologyRef getEncapTopology() {
    return encapTopology;
  }

  public void setEncapTopology(TapiTopologyTopologyRef encapTopology) {
    this.encapTopology = encapTopology;
  }

  public TapiTopologyTopologyNode nodeRuleGroup(List<TapiTopologyNodeRuleGroup> nodeRuleGroup) {
    this.nodeRuleGroup = nodeRuleGroup;
    return this;
  }

  public TapiTopologyTopologyNode addNodeRuleGroupItem(TapiTopologyNodeRuleGroup nodeRuleGroupItem) {
    if (this.nodeRuleGroup == null) {
      this.nodeRuleGroup = new ArrayList<TapiTopologyNodeRuleGroup>();
    }
    this.nodeRuleGroup.add(nodeRuleGroupItem);
    return this;
  }

  /**
   * none
   * @return nodeRuleGroup
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyNodeRuleGroup> getNodeRuleGroup() {
    return nodeRuleGroup;
  }

  public void setNodeRuleGroup(List<TapiTopologyNodeRuleGroup> nodeRuleGroup) {
    this.nodeRuleGroup = nodeRuleGroup;
  }

  public TapiTopologyTopologyNode nodeEdgePoint(List<TapiTopologyNodeNodeEdgePoint> nodeEdgePoint) {
    this.nodeEdgePoint = nodeEdgePoint;
    return this;
  }

  public TapiTopologyTopologyNode addNodeEdgePointItem(TapiTopologyNodeNodeEdgePoint nodeEdgePointItem) {
    if (this.nodeEdgePoint == null) {
      this.nodeEdgePoint = new ArrayList<TapiTopologyNodeNodeEdgePoint>();
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
  public List<TapiTopologyNodeNodeEdgePoint> getNodeEdgePoint() {
    return nodeEdgePoint;
  }

  public void setNodeEdgePoint(List<TapiTopologyNodeNodeEdgePoint> nodeEdgePoint) {
    this.nodeEdgePoint = nodeEdgePoint;
  }

  public TapiTopologyTopologyNode aggregatedNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> aggregatedNodeEdgePoint) {
    this.aggregatedNodeEdgePoint = aggregatedNodeEdgePoint;
    return this;
  }

  public TapiTopologyTopologyNode addAggregatedNodeEdgePointItem(TapiTopologyNodeEdgePointRef aggregatedNodeEdgePointItem) {
    if (this.aggregatedNodeEdgePoint == null) {
      this.aggregatedNodeEdgePoint = new ArrayList<TapiTopologyNodeEdgePointRef>();
    }
    this.aggregatedNodeEdgePoint.add(aggregatedNodeEdgePointItem);
    return this;
  }

  /**
   * none
   * @return aggregatedNodeEdgePoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyNodeEdgePointRef> getAggregatedNodeEdgePoint() {
    return aggregatedNodeEdgePoint;
  }

  public void setAggregatedNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> aggregatedNodeEdgePoint) {
    this.aggregatedNodeEdgePoint = aggregatedNodeEdgePoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyTopologyNode tapiTopologyTopologyNode = (TapiTopologyTopologyNode) o;
    return Objects.equals(this.availableCapacity, tapiTopologyTopologyNode.availableCapacity) &&
        Objects.equals(this.totalPotentialCapacity, tapiTopologyTopologyNode.totalPotentialCapacity) &&
        Objects.equals(this.name, tapiTopologyTopologyNode.name) &&
        Objects.equals(this.uuid, tapiTopologyTopologyNode.uuid) &&
        Objects.equals(this.supportingPhysicalSpan, tapiTopologyTopologyNode.supportingPhysicalSpan) &&
        Objects.equals(this.costCharacteristic, tapiTopologyTopologyNode.costCharacteristic) &&
        Objects.equals(this.errorCharacteristic, tapiTopologyTopologyNode.errorCharacteristic) &&
        Objects.equals(this.unavailableTimeCharacteristic, tapiTopologyTopologyNode.unavailableTimeCharacteristic) &&
        Objects.equals(this.serverIntegrityProcessCharacteristic, tapiTopologyTopologyNode.serverIntegrityProcessCharacteristic) &&
        Objects.equals(this.deliveryOrderCharacteristic, tapiTopologyTopologyNode.deliveryOrderCharacteristic) &&
        Objects.equals(this.repeatDeliveryCharacteristic, tapiTopologyTopologyNode.repeatDeliveryCharacteristic) &&
        Objects.equals(this.lossCharacteristic, tapiTopologyTopologyNode.lossCharacteristic) &&
        Objects.equals(this.latencyCharacteristic, tapiTopologyTopologyNode.latencyCharacteristic) &&
        Objects.equals(this.layerProtocolName, tapiTopologyTopologyNode.layerProtocolName) &&
        Objects.equals(this.encapTopology, tapiTopologyTopologyNode.encapTopology) &&
        Objects.equals(this.nodeRuleGroup, tapiTopologyTopologyNode.nodeRuleGroup) &&
        Objects.equals(this.nodeEdgePoint, tapiTopologyTopologyNode.nodeEdgePoint) &&
        Objects.equals(this.aggregatedNodeEdgePoint, tapiTopologyTopologyNode.aggregatedNodeEdgePoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableCapacity, totalPotentialCapacity, name, uuid, supportingPhysicalSpan, costCharacteristic, errorCharacteristic, unavailableTimeCharacteristic, serverIntegrityProcessCharacteristic, deliveryOrderCharacteristic, repeatDeliveryCharacteristic, lossCharacteristic, latencyCharacteristic, layerProtocolName, encapTopology, nodeRuleGroup, nodeEdgePoint, aggregatedNodeEdgePoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyTopologyNode {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    totalPotentialCapacity: ").append(toIndentedString(totalPotentialCapacity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    supportingPhysicalSpan: ").append(toIndentedString(supportingPhysicalSpan)).append("\n");
    sb.append("    costCharacteristic: ").append(toIndentedString(costCharacteristic)).append("\n");
    sb.append("    errorCharacteristic: ").append(toIndentedString(errorCharacteristic)).append("\n");
    sb.append("    unavailableTimeCharacteristic: ").append(toIndentedString(unavailableTimeCharacteristic)).append("\n");
    sb.append("    serverIntegrityProcessCharacteristic: ").append(toIndentedString(serverIntegrityProcessCharacteristic)).append("\n");
    sb.append("    deliveryOrderCharacteristic: ").append(toIndentedString(deliveryOrderCharacteristic)).append("\n");
    sb.append("    repeatDeliveryCharacteristic: ").append(toIndentedString(repeatDeliveryCharacteristic)).append("\n");
    sb.append("    lossCharacteristic: ").append(toIndentedString(lossCharacteristic)).append("\n");
    sb.append("    latencyCharacteristic: ").append(toIndentedString(latencyCharacteristic)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    encapTopology: ").append(toIndentedString(encapTopology)).append("\n");
    sb.append("    nodeRuleGroup: ").append(toIndentedString(nodeRuleGroup)).append("\n");
    sb.append("    nodeEdgePoint: ").append(toIndentedString(nodeEdgePoint)).append("\n");
    sb.append("    aggregatedNodeEdgePoint: ").append(toIndentedString(aggregatedNodeEdgePoint)).append("\n");
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