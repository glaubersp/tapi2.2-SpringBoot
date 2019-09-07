package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiCommonPortDirection;
import io.swagger.model.TapiCommonPortRole;
import io.swagger.model.TapiCommonServiceInterfacePointRef;
import io.swagger.model.TapiCommonTerminationDirection;
import io.swagger.model.TapiCommonTerminationState;
import io.swagger.model.TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList;
import io.swagger.model.TapiEquipmentSupportingAccessPort;
import io.swagger.model.TapiOduOduNodeEdgePointSpec;
import io.swagger.model.TapiPhotonicMediaMediaChannelNodeEdgePointSpec;
import io.swagger.model.TapiTopologyNepLayerProtocolCapability;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyNodeNodeEdgePoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiTopologyNodeNodeEdgePoint extends TapiCommonGlobalClass  {
  @JsonProperty("administrative-state")
  private TapiCommonAdministrativeState administrativeState = null;

  @JsonProperty("aggregated-node-edge-point")
  @Valid
  private List<TapiTopologyNodeEdgePointRef> aggregatedNodeEdgePoint = null;

  @JsonProperty("available-capacity")
  private TapiCommonCapacity availableCapacity = null;

  @JsonProperty("available-cep-layer-protocol")
  @Valid
  private List<TapiTopologyNepLayerProtocolCapability> availableCepLayerProtocol = null;

  @JsonProperty("cep-list")
  private TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList cepList = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("link-port-direction")
  private TapiCommonPortDirection linkPortDirection = null;

  @JsonProperty("link-port-role")
  private TapiCommonPortRole linkPortRole = null;

  @JsonProperty("mapped-service-interface-point")
  @Valid
  private List<TapiCommonServiceInterfacePointRef> mappedServiceInterfacePoint = null;

  @JsonProperty("media-channel-node-edge-point-spec")
  private TapiPhotonicMediaMediaChannelNodeEdgePointSpec mediaChannelNodeEdgePointSpec = null;

  @JsonProperty("odu-node-edge-point-spec")
  private TapiOduOduNodeEdgePointSpec oduNodeEdgePointSpec = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("supporting-access-port")
  private TapiEquipmentSupportingAccessPort supportingAccessPort = null;

  @JsonProperty("termination-direction")
  private TapiCommonTerminationDirection terminationDirection = null;

  @JsonProperty("termination-state")
  private TapiCommonTerminationState terminationState = null;

  @JsonProperty("total-potential-capacity")
  private TapiCommonCapacity totalPotentialCapacity = null;

  public TapiTopologyNodeNodeEdgePoint administrativeState(TapiCommonAdministrativeState administrativeState) {
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

  public TapiTopologyNodeNodeEdgePoint aggregatedNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> aggregatedNodeEdgePoint) {
    this.aggregatedNodeEdgePoint = aggregatedNodeEdgePoint;
    return this;
  }

  public TapiTopologyNodeNodeEdgePoint addAggregatedNodeEdgePointItem(TapiTopologyNodeEdgePointRef aggregatedNodeEdgePointItem) {
    if (this.aggregatedNodeEdgePoint == null) {
      this.aggregatedNodeEdgePoint = new ArrayList<>();
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

  public TapiTopologyNodeNodeEdgePoint availableCapacity(TapiCommonCapacity availableCapacity) {
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

  public TapiTopologyNodeNodeEdgePoint availableCepLayerProtocol(List<TapiTopologyNepLayerProtocolCapability> availableCepLayerProtocol) {
    this.availableCepLayerProtocol = availableCepLayerProtocol;
    return this;
  }

  public TapiTopologyNodeNodeEdgePoint addAvailableCepLayerProtocolItem(TapiTopologyNepLayerProtocolCapability availableCepLayerProtocolItem) {
    if (this.availableCepLayerProtocol == null) {
      this.availableCepLayerProtocol = new ArrayList<>();
    }
    this.availableCepLayerProtocol.add(availableCepLayerProtocolItem);
    return this;
  }

  /**
   * none
   * @return availableCepLayerProtocol
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyNepLayerProtocolCapability> getAvailableCepLayerProtocol() {
    return availableCepLayerProtocol;
  }

  public void setAvailableCepLayerProtocol(List<TapiTopologyNepLayerProtocolCapability> availableCepLayerProtocol) {
    this.availableCepLayerProtocol = availableCepLayerProtocol;
  }

  public TapiTopologyNodeNodeEdgePoint cepList(TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList cepList) {
    this.cepList = cepList;
    return this;
  }

  /**
   * Get cepList
   * @return cepList
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList getCepList() {
    return cepList;
  }

  public void setCepList(TapiConnectivityContextTopologycontextTopologyNodeNodeedgepointCepList cepList) {
    this.cepList = cepList;
  }

  public TapiTopologyNodeNodeEdgePoint layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  /**
   * Get layerProtocolName
   * @return layerProtocolName
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonLayerProtocolName getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public TapiTopologyNodeNodeEdgePoint lifecycleState(TapiCommonLifecycleState lifecycleState) {
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

  public TapiTopologyNodeNodeEdgePoint linkPortDirection(TapiCommonPortDirection linkPortDirection) {
    this.linkPortDirection = linkPortDirection;
    return this;
  }

  /**
   * Get linkPortDirection
   * @return linkPortDirection
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonPortDirection getLinkPortDirection() {
    return linkPortDirection;
  }

  public void setLinkPortDirection(TapiCommonPortDirection linkPortDirection) {
    this.linkPortDirection = linkPortDirection;
  }

  public TapiTopologyNodeNodeEdgePoint linkPortRole(TapiCommonPortRole linkPortRole) {
    this.linkPortRole = linkPortRole;
    return this;
  }

  /**
   * Get linkPortRole
   * @return linkPortRole
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonPortRole getLinkPortRole() {
    return linkPortRole;
  }

  public void setLinkPortRole(TapiCommonPortRole linkPortRole) {
    this.linkPortRole = linkPortRole;
  }

  public TapiTopologyNodeNodeEdgePoint mappedServiceInterfacePoint(List<TapiCommonServiceInterfacePointRef> mappedServiceInterfacePoint) {
    this.mappedServiceInterfacePoint = mappedServiceInterfacePoint;
    return this;
  }

  public TapiTopologyNodeNodeEdgePoint addMappedServiceInterfacePointItem(TapiCommonServiceInterfacePointRef mappedServiceInterfacePointItem) {
    if (this.mappedServiceInterfacePoint == null) {
      this.mappedServiceInterfacePoint = new ArrayList<>();
    }
    this.mappedServiceInterfacePoint.add(mappedServiceInterfacePointItem);
    return this;
  }

  /**
   * NodeEdgePoint mapped to more than ServiceInterfacePoint (slicing/virtualizing) or a ServiceInterfacePoint mapped to more than one NodeEdgePoint (load balancing/Resilience) should be considered experimental
   * @return mappedServiceInterfacePoint
  **/
  @ApiModelProperty(value = "NodeEdgePoint mapped to more than ServiceInterfacePoint (slicing/virtualizing) or a ServiceInterfacePoint mapped to more than one NodeEdgePoint (load balancing/Resilience) should be considered experimental")
  @Valid
  public List<TapiCommonServiceInterfacePointRef> getMappedServiceInterfacePoint() {
    return mappedServiceInterfacePoint;
  }

  public void setMappedServiceInterfacePoint(List<TapiCommonServiceInterfacePointRef> mappedServiceInterfacePoint) {
    this.mappedServiceInterfacePoint = mappedServiceInterfacePoint;
  }

  public TapiTopologyNodeNodeEdgePoint mediaChannelNodeEdgePointSpec(TapiPhotonicMediaMediaChannelNodeEdgePointSpec mediaChannelNodeEdgePointSpec) {
    this.mediaChannelNodeEdgePointSpec = mediaChannelNodeEdgePointSpec;
    return this;
  }

  /**
   * Get mediaChannelNodeEdgePointSpec
   * @return mediaChannelNodeEdgePointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaMediaChannelNodeEdgePointSpec getMediaChannelNodeEdgePointSpec() {
    return mediaChannelNodeEdgePointSpec;
  }

  public void setMediaChannelNodeEdgePointSpec(TapiPhotonicMediaMediaChannelNodeEdgePointSpec mediaChannelNodeEdgePointSpec) {
    this.mediaChannelNodeEdgePointSpec = mediaChannelNodeEdgePointSpec;
  }

  public TapiTopologyNodeNodeEdgePoint oduNodeEdgePointSpec(TapiOduOduNodeEdgePointSpec oduNodeEdgePointSpec) {
    this.oduNodeEdgePointSpec = oduNodeEdgePointSpec;
    return this;
  }

  /**
   * Get oduNodeEdgePointSpec
   * @return oduNodeEdgePointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduNodeEdgePointSpec getOduNodeEdgePointSpec() {
    return oduNodeEdgePointSpec;
  }

  public void setOduNodeEdgePointSpec(TapiOduOduNodeEdgePointSpec oduNodeEdgePointSpec) {
    this.oduNodeEdgePointSpec = oduNodeEdgePointSpec;
  }

  public TapiTopologyNodeNodeEdgePoint operationalState(TapiCommonOperationalState operationalState) {
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

  public TapiTopologyNodeNodeEdgePoint supportingAccessPort(TapiEquipmentSupportingAccessPort supportingAccessPort) {
    this.supportingAccessPort = supportingAccessPort;
    return this;
  }

  /**
   * Get supportingAccessPort
   * @return supportingAccessPort
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentSupportingAccessPort getSupportingAccessPort() {
    return supportingAccessPort;
  }

  public void setSupportingAccessPort(TapiEquipmentSupportingAccessPort supportingAccessPort) {
    this.supportingAccessPort = supportingAccessPort;
  }

  public TapiTopologyNodeNodeEdgePoint terminationDirection(TapiCommonTerminationDirection terminationDirection) {
    this.terminationDirection = terminationDirection;
    return this;
  }

  /**
   * Get terminationDirection
   * @return terminationDirection
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonTerminationDirection getTerminationDirection() {
    return terminationDirection;
  }

  public void setTerminationDirection(TapiCommonTerminationDirection terminationDirection) {
    this.terminationDirection = terminationDirection;
  }

  public TapiTopologyNodeNodeEdgePoint terminationState(TapiCommonTerminationState terminationState) {
    this.terminationState = terminationState;
    return this;
  }

  /**
   * Get terminationState
   * @return terminationState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonTerminationState getTerminationState() {
    return terminationState;
  }

  public void setTerminationState(TapiCommonTerminationState terminationState) {
    this.terminationState = terminationState;
  }

  public TapiTopologyNodeNodeEdgePoint totalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
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
    TapiTopologyNodeNodeEdgePoint tapiTopologyNodeNodeEdgePoint = (TapiTopologyNodeNodeEdgePoint) o;
    return Objects.equals(this.administrativeState, tapiTopologyNodeNodeEdgePoint.administrativeState) &&
        Objects.equals(this.aggregatedNodeEdgePoint, tapiTopologyNodeNodeEdgePoint.aggregatedNodeEdgePoint) &&
        Objects.equals(this.availableCapacity, tapiTopologyNodeNodeEdgePoint.availableCapacity) &&
        Objects.equals(this.availableCepLayerProtocol, tapiTopologyNodeNodeEdgePoint.availableCepLayerProtocol) &&
        Objects.equals(this.cepList, tapiTopologyNodeNodeEdgePoint.cepList) &&
        Objects.equals(this.layerProtocolName, tapiTopologyNodeNodeEdgePoint.layerProtocolName) &&
        Objects.equals(this.lifecycleState, tapiTopologyNodeNodeEdgePoint.lifecycleState) &&
        Objects.equals(this.linkPortDirection, tapiTopologyNodeNodeEdgePoint.linkPortDirection) &&
        Objects.equals(this.linkPortRole, tapiTopologyNodeNodeEdgePoint.linkPortRole) &&
        Objects.equals(this.mappedServiceInterfacePoint, tapiTopologyNodeNodeEdgePoint.mappedServiceInterfacePoint) &&
        Objects.equals(this.mediaChannelNodeEdgePointSpec, tapiTopologyNodeNodeEdgePoint.mediaChannelNodeEdgePointSpec) &&
        Objects.equals(this.oduNodeEdgePointSpec, tapiTopologyNodeNodeEdgePoint.oduNodeEdgePointSpec) &&
        Objects.equals(this.operationalState, tapiTopologyNodeNodeEdgePoint.operationalState) &&
        Objects.equals(this.supportingAccessPort, tapiTopologyNodeNodeEdgePoint.supportingAccessPort) &&
        Objects.equals(this.terminationDirection, tapiTopologyNodeNodeEdgePoint.terminationDirection) &&
        Objects.equals(this.terminationState, tapiTopologyNodeNodeEdgePoint.terminationState) &&
        Objects.equals(this.totalPotentialCapacity, tapiTopologyNodeNodeEdgePoint.totalPotentialCapacity) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativeState, aggregatedNodeEdgePoint, availableCapacity, availableCepLayerProtocol, cepList, layerProtocolName, lifecycleState, linkPortDirection, linkPortRole, mappedServiceInterfacePoint, mediaChannelNodeEdgePointSpec, oduNodeEdgePointSpec, operationalState, supportingAccessPort, terminationDirection, terminationState, totalPotentialCapacity, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyNodeNodeEdgePoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    aggregatedNodeEdgePoint: ").append(toIndentedString(aggregatedNodeEdgePoint)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    availableCepLayerProtocol: ").append(toIndentedString(availableCepLayerProtocol)).append("\n");
    sb.append("    cepList: ").append(toIndentedString(cepList)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    linkPortDirection: ").append(toIndentedString(linkPortDirection)).append("\n");
    sb.append("    linkPortRole: ").append(toIndentedString(linkPortRole)).append("\n");
    sb.append("    mappedServiceInterfacePoint: ").append(toIndentedString(mappedServiceInterfacePoint)).append("\n");
    sb.append("    mediaChannelNodeEdgePointSpec: ").append(toIndentedString(mediaChannelNodeEdgePointSpec)).append("\n");
    sb.append("    oduNodeEdgePointSpec: ").append(toIndentedString(oduNodeEdgePointSpec)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    supportingAccessPort: ").append(toIndentedString(supportingAccessPort)).append("\n");
    sb.append("    terminationDirection: ").append(toIndentedString(terminationDirection)).append("\n");
    sb.append("    terminationState: ").append(toIndentedString(terminationState)).append("\n");
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
