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
import io.swagger.model.TapiPhotonicMediaMediaChannelNodeEdgePointSpec;
import io.swagger.model.TapiTopologyNepLayerProtocolCapability;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint extends TapiCommonGlobalClass  {
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

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("termination-direction")
  private TapiCommonTerminationDirection terminationDirection = null;

  @JsonProperty("termination-state")
  private TapiCommonTerminationState terminationState = null;

  @JsonProperty("total-potential-capacity")
  private TapiCommonCapacity totalPotentialCapacity = null;

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint administrativeState(TapiCommonAdministrativeState administrativeState) {
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

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint aggregatedNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> aggregatedNodeEdgePoint) {
    this.aggregatedNodeEdgePoint = aggregatedNodeEdgePoint;
    return this;
  }

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint addAggregatedNodeEdgePointItem(TapiTopologyNodeEdgePointRef aggregatedNodeEdgePointItem) {
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

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint availableCapacity(TapiCommonCapacity availableCapacity) {
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

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint availableCepLayerProtocol(List<TapiTopologyNepLayerProtocolCapability> availableCepLayerProtocol) {
    this.availableCepLayerProtocol = availableCepLayerProtocol;
    return this;
  }

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint addAvailableCepLayerProtocolItem(TapiTopologyNepLayerProtocolCapability availableCepLayerProtocolItem) {
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

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
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

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint lifecycleState(TapiCommonLifecycleState lifecycleState) {
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

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint linkPortDirection(TapiCommonPortDirection linkPortDirection) {
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

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint linkPortRole(TapiCommonPortRole linkPortRole) {
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

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint mappedServiceInterfacePoint(List<TapiCommonServiceInterfacePointRef> mappedServiceInterfacePoint) {
    this.mappedServiceInterfacePoint = mappedServiceInterfacePoint;
    return this;
  }

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint addMappedServiceInterfacePointItem(TapiCommonServiceInterfacePointRef mappedServiceInterfacePointItem) {
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

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint mediaChannelNodeEdgePointSpec(TapiPhotonicMediaMediaChannelNodeEdgePointSpec mediaChannelNodeEdgePointSpec) {
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

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint operationalState(TapiCommonOperationalState operationalState) {
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

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint terminationDirection(TapiCommonTerminationDirection terminationDirection) {
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

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint terminationState(TapiCommonTerminationState terminationState) {
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

  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint totalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
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
    TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint = (TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint) o;
    return Objects.equals(this.administrativeState, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.administrativeState) &&
        Objects.equals(this.aggregatedNodeEdgePoint, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.aggregatedNodeEdgePoint) &&
        Objects.equals(this.availableCapacity, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.availableCapacity) &&
        Objects.equals(this.availableCepLayerProtocol, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.availableCepLayerProtocol) &&
        Objects.equals(this.layerProtocolName, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.layerProtocolName) &&
        Objects.equals(this.lifecycleState, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.lifecycleState) &&
        Objects.equals(this.linkPortDirection, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.linkPortDirection) &&
        Objects.equals(this.linkPortRole, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.linkPortRole) &&
        Objects.equals(this.mappedServiceInterfacePoint, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.mappedServiceInterfacePoint) &&
        Objects.equals(this.mediaChannelNodeEdgePointSpec, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.mediaChannelNodeEdgePointSpec) &&
        Objects.equals(this.operationalState, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.operationalState) &&
        Objects.equals(this.terminationDirection, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.terminationDirection) &&
        Objects.equals(this.terminationState, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.terminationState) &&
        Objects.equals(this.totalPotentialCapacity, tapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint.totalPotentialCapacity) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativeState, aggregatedNodeEdgePoint, availableCapacity, availableCepLayerProtocol, layerProtocolName, lifecycleState, linkPortDirection, linkPortRole, mappedServiceInterfacePoint, mediaChannelNodeEdgePointSpec, operationalState, terminationDirection, terminationState, totalPotentialCapacity, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    aggregatedNodeEdgePoint: ").append(toIndentedString(aggregatedNodeEdgePoint)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    availableCepLayerProtocol: ").append(toIndentedString(availableCepLayerProtocol)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    linkPortDirection: ").append(toIndentedString(linkPortDirection)).append("\n");
    sb.append("    linkPortRole: ").append(toIndentedString(linkPortRole)).append("\n");
    sb.append("    mappedServiceInterfacePoint: ").append(toIndentedString(mappedServiceInterfacePoint)).append("\n");
    sb.append("    mediaChannelNodeEdgePointSpec: ").append(toIndentedString(mediaChannelNodeEdgePointSpec)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
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
