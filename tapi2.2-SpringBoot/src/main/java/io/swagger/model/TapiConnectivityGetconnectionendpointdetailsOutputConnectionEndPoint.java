package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiCommonPortDirection;
import io.swagger.model.TapiCommonPortRole;
import io.swagger.model.TapiCommonTerminationDirection;
import io.swagger.model.TapiCommonTerminationState;
import io.swagger.model.TapiConnectivityConnectionEndPointRef;
import io.swagger.model.TapiConnectivityProtectionRole;
import io.swagger.model.TapiPhotonicMediaMediaChannelConnectionEndPointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint extends TapiCommonGlobalClass  {
  @JsonProperty("aggregated-connection-end-point")
  @Valid
  private List<TapiConnectivityConnectionEndPointRef> aggregatedConnectionEndPoint = null;

  @JsonProperty("client-node-edge-point")
  @Valid
  private List<TapiTopologyNodeEdgePointRef> clientNodeEdgePoint = null;

  @JsonProperty("connection-port-direction")
  private TapiCommonPortDirection connectionPortDirection = null;

  @JsonProperty("connection-port-role")
  private TapiCommonPortRole connectionPortRole = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("layer-protocol-qualifier")
  private String layerProtocolQualifier = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("media-channel-connection-end-point-spec")
  private TapiPhotonicMediaMediaChannelConnectionEndPointSpec mediaChannelConnectionEndPointSpec = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("otsi-assembly-connection-end-point-spec")
  private TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec otsiAssemblyConnectionEndPointSpec = null;

  @JsonProperty("parent-node-edge-point")
  private TapiTopologyNodeEdgePointRef parentNodeEdgePoint = null;

  @JsonProperty("protection-role")
  private TapiConnectivityProtectionRole protectionRole = null;

  @JsonProperty("termination-direction")
  private TapiCommonTerminationDirection terminationDirection = null;

  @JsonProperty("termination-state")
  private TapiCommonTerminationState terminationState = null;

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint aggregatedConnectionEndPoint(List<TapiConnectivityConnectionEndPointRef> aggregatedConnectionEndPoint) {
    this.aggregatedConnectionEndPoint = aggregatedConnectionEndPoint;
    return this;
  }

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint addAggregatedConnectionEndPointItem(TapiConnectivityConnectionEndPointRef aggregatedConnectionEndPointItem) {
    if (this.aggregatedConnectionEndPoint == null) {
      this.aggregatedConnectionEndPoint = new ArrayList<>();
    }
    this.aggregatedConnectionEndPoint.add(aggregatedConnectionEndPointItem);
    return this;
  }

  /**
   * none
   * @return aggregatedConnectionEndPoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivityConnectionEndPointRef> getAggregatedConnectionEndPoint() {
    return aggregatedConnectionEndPoint;
  }

  public void setAggregatedConnectionEndPoint(List<TapiConnectivityConnectionEndPointRef> aggregatedConnectionEndPoint) {
    this.aggregatedConnectionEndPoint = aggregatedConnectionEndPoint;
  }

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint clientNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> clientNodeEdgePoint) {
    this.clientNodeEdgePoint = clientNodeEdgePoint;
    return this;
  }

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint addClientNodeEdgePointItem(TapiTopologyNodeEdgePointRef clientNodeEdgePointItem) {
    if (this.clientNodeEdgePoint == null) {
      this.clientNodeEdgePoint = new ArrayList<>();
    }
    this.clientNodeEdgePoint.add(clientNodeEdgePointItem);
    return this;
  }

  /**
   * none
   * @return clientNodeEdgePoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyNodeEdgePointRef> getClientNodeEdgePoint() {
    return clientNodeEdgePoint;
  }

  public void setClientNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> clientNodeEdgePoint) {
    this.clientNodeEdgePoint = clientNodeEdgePoint;
  }

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint connectionPortDirection(TapiCommonPortDirection connectionPortDirection) {
    this.connectionPortDirection = connectionPortDirection;
    return this;
  }

  /**
   * Get connectionPortDirection
   * @return connectionPortDirection
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonPortDirection getConnectionPortDirection() {
    return connectionPortDirection;
  }

  public void setConnectionPortDirection(TapiCommonPortDirection connectionPortDirection) {
    this.connectionPortDirection = connectionPortDirection;
  }

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint connectionPortRole(TapiCommonPortRole connectionPortRole) {
    this.connectionPortRole = connectionPortRole;
    return this;
  }

  /**
   * Get connectionPortRole
   * @return connectionPortRole
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonPortRole getConnectionPortRole() {
    return connectionPortRole;
  }

  public void setConnectionPortRole(TapiCommonPortRole connectionPortRole) {
    this.connectionPortRole = connectionPortRole;
  }

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
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

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint layerProtocolQualifier(String layerProtocolQualifier) {
    this.layerProtocolQualifier = layerProtocolQualifier;
    return this;
  }

  /**
   * none
   * @return layerProtocolQualifier
  **/
  @ApiModelProperty(value = "none")

  public String getLayerProtocolQualifier() {
    return layerProtocolQualifier;
  }

  public void setLayerProtocolQualifier(String layerProtocolQualifier) {
    this.layerProtocolQualifier = layerProtocolQualifier;
  }

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint lifecycleState(TapiCommonLifecycleState lifecycleState) {
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

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint mediaChannelConnectionEndPointSpec(TapiPhotonicMediaMediaChannelConnectionEndPointSpec mediaChannelConnectionEndPointSpec) {
    this.mediaChannelConnectionEndPointSpec = mediaChannelConnectionEndPointSpec;
    return this;
  }

  /**
   * Get mediaChannelConnectionEndPointSpec
   * @return mediaChannelConnectionEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaMediaChannelConnectionEndPointSpec getMediaChannelConnectionEndPointSpec() {
    return mediaChannelConnectionEndPointSpec;
  }

  public void setMediaChannelConnectionEndPointSpec(TapiPhotonicMediaMediaChannelConnectionEndPointSpec mediaChannelConnectionEndPointSpec) {
    this.mediaChannelConnectionEndPointSpec = mediaChannelConnectionEndPointSpec;
  }

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint operationalState(TapiCommonOperationalState operationalState) {
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

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint otsiAssemblyConnectionEndPointSpec(TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec otsiAssemblyConnectionEndPointSpec) {
    this.otsiAssemblyConnectionEndPointSpec = otsiAssemblyConnectionEndPointSpec;
    return this;
  }

  /**
   * Get otsiAssemblyConnectionEndPointSpec
   * @return otsiAssemblyConnectionEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec getOtsiAssemblyConnectionEndPointSpec() {
    return otsiAssemblyConnectionEndPointSpec;
  }

  public void setOtsiAssemblyConnectionEndPointSpec(TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec otsiAssemblyConnectionEndPointSpec) {
    this.otsiAssemblyConnectionEndPointSpec = otsiAssemblyConnectionEndPointSpec;
  }

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint parentNodeEdgePoint(TapiTopologyNodeEdgePointRef parentNodeEdgePoint) {
    this.parentNodeEdgePoint = parentNodeEdgePoint;
    return this;
  }

  /**
   * Get parentNodeEdgePoint
   * @return parentNodeEdgePoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyNodeEdgePointRef getParentNodeEdgePoint() {
    return parentNodeEdgePoint;
  }

  public void setParentNodeEdgePoint(TapiTopologyNodeEdgePointRef parentNodeEdgePoint) {
    this.parentNodeEdgePoint = parentNodeEdgePoint;
  }

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint protectionRole(TapiConnectivityProtectionRole protectionRole) {
    this.protectionRole = protectionRole;
    return this;
  }

  /**
   * Get protectionRole
   * @return protectionRole
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityProtectionRole getProtectionRole() {
    return protectionRole;
  }

  public void setProtectionRole(TapiConnectivityProtectionRole protectionRole) {
    this.protectionRole = protectionRole;
  }

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint terminationDirection(TapiCommonTerminationDirection terminationDirection) {
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

  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint terminationState(TapiCommonTerminationState terminationState) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint = (TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint) o;
    return Objects.equals(this.aggregatedConnectionEndPoint, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.aggregatedConnectionEndPoint) &&
        Objects.equals(this.clientNodeEdgePoint, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.clientNodeEdgePoint) &&
        Objects.equals(this.connectionPortDirection, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.connectionPortDirection) &&
        Objects.equals(this.connectionPortRole, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.connectionPortRole) &&
        Objects.equals(this.layerProtocolName, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.layerProtocolName) &&
        Objects.equals(this.layerProtocolQualifier, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.layerProtocolQualifier) &&
        Objects.equals(this.lifecycleState, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.lifecycleState) &&
        Objects.equals(this.mediaChannelConnectionEndPointSpec, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.mediaChannelConnectionEndPointSpec) &&
        Objects.equals(this.operationalState, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.operationalState) &&
        Objects.equals(this.otsiAssemblyConnectionEndPointSpec, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.otsiAssemblyConnectionEndPointSpec) &&
        Objects.equals(this.parentNodeEdgePoint, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.parentNodeEdgePoint) &&
        Objects.equals(this.protectionRole, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.protectionRole) &&
        Objects.equals(this.terminationDirection, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.terminationDirection) &&
        Objects.equals(this.terminationState, tapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint.terminationState) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedConnectionEndPoint, clientNodeEdgePoint, connectionPortDirection, connectionPortRole, layerProtocolName, layerProtocolQualifier, lifecycleState, mediaChannelConnectionEndPointSpec, operationalState, otsiAssemblyConnectionEndPointSpec, parentNodeEdgePoint, protectionRole, terminationDirection, terminationState, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    aggregatedConnectionEndPoint: ").append(toIndentedString(aggregatedConnectionEndPoint)).append("\n");
    sb.append("    clientNodeEdgePoint: ").append(toIndentedString(clientNodeEdgePoint)).append("\n");
    sb.append("    connectionPortDirection: ").append(toIndentedString(connectionPortDirection)).append("\n");
    sb.append("    connectionPortRole: ").append(toIndentedString(connectionPortRole)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    layerProtocolQualifier: ").append(toIndentedString(layerProtocolQualifier)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    mediaChannelConnectionEndPointSpec: ").append(toIndentedString(mediaChannelConnectionEndPointSpec)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    otsiAssemblyConnectionEndPointSpec: ").append(toIndentedString(otsiAssemblyConnectionEndPointSpec)).append("\n");
    sb.append("    parentNodeEdgePoint: ").append(toIndentedString(parentNodeEdgePoint)).append("\n");
    sb.append("    protectionRole: ").append(toIndentedString(protectionRole)).append("\n");
    sb.append("    terminationDirection: ").append(toIndentedString(terminationDirection)).append("\n");
    sb.append("    terminationState: ").append(toIndentedString(terminationState)).append("\n");
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
