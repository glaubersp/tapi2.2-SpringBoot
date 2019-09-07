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
import io.swagger.model.TapiEthEthConnectionEndPointSpec;
import io.swagger.model.TapiOamMepMipList;
import io.swagger.model.TapiOduOduConnectionEndPointSpec;
import io.swagger.model.TapiPhotonicMediaMediaChannelConnectionEndPointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiConnectionEndPointSpec;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityCeplistConnectionEndPoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiConnectivityCeplistConnectionEndPoint extends TapiCommonGlobalClass  {
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

  @JsonProperty("eth-connection-end-point-spec")
  private TapiEthEthConnectionEndPointSpec ethConnectionEndPointSpec = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("layer-protocol-qualifier")
  private String layerProtocolQualifier = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("media-channel-connection-end-point-spec")
  private TapiPhotonicMediaMediaChannelConnectionEndPointSpec mediaChannelConnectionEndPointSpec = null;

  @JsonProperty("mep-mip-list")
  private TapiOamMepMipList mepMipList = null;

  @JsonProperty("odu-connection-end-point-spec")
  private TapiOduOduConnectionEndPointSpec oduConnectionEndPointSpec = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("otsi-assembly-connection-end-point-spec")
  private TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec otsiAssemblyConnectionEndPointSpec = null;

  @JsonProperty("otsi-connection-end-point-spec")
  private TapiPhotonicMediaOtsiConnectionEndPointSpec otsiConnectionEndPointSpec = null;

  @JsonProperty("parent-node-edge-point")
  private TapiTopologyNodeEdgePointRef parentNodeEdgePoint = null;

  @JsonProperty("protection-role")
  private TapiConnectivityProtectionRole protectionRole = null;

  @JsonProperty("termination-direction")
  private TapiCommonTerminationDirection terminationDirection = null;

  @JsonProperty("termination-state")
  private TapiCommonTerminationState terminationState = null;

  public TapiConnectivityCeplistConnectionEndPoint aggregatedConnectionEndPoint(List<TapiConnectivityConnectionEndPointRef> aggregatedConnectionEndPoint) {
    this.aggregatedConnectionEndPoint = aggregatedConnectionEndPoint;
    return this;
  }

  public TapiConnectivityCeplistConnectionEndPoint addAggregatedConnectionEndPointItem(TapiConnectivityConnectionEndPointRef aggregatedConnectionEndPointItem) {
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

  public TapiConnectivityCeplistConnectionEndPoint clientNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> clientNodeEdgePoint) {
    this.clientNodeEdgePoint = clientNodeEdgePoint;
    return this;
  }

  public TapiConnectivityCeplistConnectionEndPoint addClientNodeEdgePointItem(TapiTopologyNodeEdgePointRef clientNodeEdgePointItem) {
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

  public TapiConnectivityCeplistConnectionEndPoint connectionPortDirection(TapiCommonPortDirection connectionPortDirection) {
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

  public TapiConnectivityCeplistConnectionEndPoint connectionPortRole(TapiCommonPortRole connectionPortRole) {
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

  public TapiConnectivityCeplistConnectionEndPoint ethConnectionEndPointSpec(TapiEthEthConnectionEndPointSpec ethConnectionEndPointSpec) {
    this.ethConnectionEndPointSpec = ethConnectionEndPointSpec;
    return this;
  }

  /**
   * Get ethConnectionEndPointSpec
   * @return ethConnectionEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthConnectionEndPointSpec getEthConnectionEndPointSpec() {
    return ethConnectionEndPointSpec;
  }

  public void setEthConnectionEndPointSpec(TapiEthEthConnectionEndPointSpec ethConnectionEndPointSpec) {
    this.ethConnectionEndPointSpec = ethConnectionEndPointSpec;
  }

  public TapiConnectivityCeplistConnectionEndPoint layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
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

  public TapiConnectivityCeplistConnectionEndPoint layerProtocolQualifier(String layerProtocolQualifier) {
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

  public TapiConnectivityCeplistConnectionEndPoint lifecycleState(TapiCommonLifecycleState lifecycleState) {
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

  public TapiConnectivityCeplistConnectionEndPoint mediaChannelConnectionEndPointSpec(TapiPhotonicMediaMediaChannelConnectionEndPointSpec mediaChannelConnectionEndPointSpec) {
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

  public TapiConnectivityCeplistConnectionEndPoint mepMipList(TapiOamMepMipList mepMipList) {
    this.mepMipList = mepMipList;
    return this;
  }

  /**
   * Get mepMipList
   * @return mepMipList
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamMepMipList getMepMipList() {
    return mepMipList;
  }

  public void setMepMipList(TapiOamMepMipList mepMipList) {
    this.mepMipList = mepMipList;
  }

  public TapiConnectivityCeplistConnectionEndPoint oduConnectionEndPointSpec(TapiOduOduConnectionEndPointSpec oduConnectionEndPointSpec) {
    this.oduConnectionEndPointSpec = oduConnectionEndPointSpec;
    return this;
  }

  /**
   * Get oduConnectionEndPointSpec
   * @return oduConnectionEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduConnectionEndPointSpec getOduConnectionEndPointSpec() {
    return oduConnectionEndPointSpec;
  }

  public void setOduConnectionEndPointSpec(TapiOduOduConnectionEndPointSpec oduConnectionEndPointSpec) {
    this.oduConnectionEndPointSpec = oduConnectionEndPointSpec;
  }

  public TapiConnectivityCeplistConnectionEndPoint operationalState(TapiCommonOperationalState operationalState) {
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

  public TapiConnectivityCeplistConnectionEndPoint otsiAssemblyConnectionEndPointSpec(TapiPhotonicMediaOtsiAssemblyConnectionEndPointSpec otsiAssemblyConnectionEndPointSpec) {
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

  public TapiConnectivityCeplistConnectionEndPoint otsiConnectionEndPointSpec(TapiPhotonicMediaOtsiConnectionEndPointSpec otsiConnectionEndPointSpec) {
    this.otsiConnectionEndPointSpec = otsiConnectionEndPointSpec;
    return this;
  }

  /**
   * Get otsiConnectionEndPointSpec
   * @return otsiConnectionEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaOtsiConnectionEndPointSpec getOtsiConnectionEndPointSpec() {
    return otsiConnectionEndPointSpec;
  }

  public void setOtsiConnectionEndPointSpec(TapiPhotonicMediaOtsiConnectionEndPointSpec otsiConnectionEndPointSpec) {
    this.otsiConnectionEndPointSpec = otsiConnectionEndPointSpec;
  }

  public TapiConnectivityCeplistConnectionEndPoint parentNodeEdgePoint(TapiTopologyNodeEdgePointRef parentNodeEdgePoint) {
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

  public TapiConnectivityCeplistConnectionEndPoint protectionRole(TapiConnectivityProtectionRole protectionRole) {
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

  public TapiConnectivityCeplistConnectionEndPoint terminationDirection(TapiCommonTerminationDirection terminationDirection) {
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

  public TapiConnectivityCeplistConnectionEndPoint terminationState(TapiCommonTerminationState terminationState) {
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
    TapiConnectivityCeplistConnectionEndPoint tapiConnectivityCeplistConnectionEndPoint = (TapiConnectivityCeplistConnectionEndPoint) o;
    return Objects.equals(this.aggregatedConnectionEndPoint, tapiConnectivityCeplistConnectionEndPoint.aggregatedConnectionEndPoint) &&
        Objects.equals(this.clientNodeEdgePoint, tapiConnectivityCeplistConnectionEndPoint.clientNodeEdgePoint) &&
        Objects.equals(this.connectionPortDirection, tapiConnectivityCeplistConnectionEndPoint.connectionPortDirection) &&
        Objects.equals(this.connectionPortRole, tapiConnectivityCeplistConnectionEndPoint.connectionPortRole) &&
        Objects.equals(this.ethConnectionEndPointSpec, tapiConnectivityCeplistConnectionEndPoint.ethConnectionEndPointSpec) &&
        Objects.equals(this.layerProtocolName, tapiConnectivityCeplistConnectionEndPoint.layerProtocolName) &&
        Objects.equals(this.layerProtocolQualifier, tapiConnectivityCeplistConnectionEndPoint.layerProtocolQualifier) &&
        Objects.equals(this.lifecycleState, tapiConnectivityCeplistConnectionEndPoint.lifecycleState) &&
        Objects.equals(this.mediaChannelConnectionEndPointSpec, tapiConnectivityCeplistConnectionEndPoint.mediaChannelConnectionEndPointSpec) &&
        Objects.equals(this.mepMipList, tapiConnectivityCeplistConnectionEndPoint.mepMipList) &&
        Objects.equals(this.oduConnectionEndPointSpec, tapiConnectivityCeplistConnectionEndPoint.oduConnectionEndPointSpec) &&
        Objects.equals(this.operationalState, tapiConnectivityCeplistConnectionEndPoint.operationalState) &&
        Objects.equals(this.otsiAssemblyConnectionEndPointSpec, tapiConnectivityCeplistConnectionEndPoint.otsiAssemblyConnectionEndPointSpec) &&
        Objects.equals(this.otsiConnectionEndPointSpec, tapiConnectivityCeplistConnectionEndPoint.otsiConnectionEndPointSpec) &&
        Objects.equals(this.parentNodeEdgePoint, tapiConnectivityCeplistConnectionEndPoint.parentNodeEdgePoint) &&
        Objects.equals(this.protectionRole, tapiConnectivityCeplistConnectionEndPoint.protectionRole) &&
        Objects.equals(this.terminationDirection, tapiConnectivityCeplistConnectionEndPoint.terminationDirection) &&
        Objects.equals(this.terminationState, tapiConnectivityCeplistConnectionEndPoint.terminationState) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedConnectionEndPoint, clientNodeEdgePoint, connectionPortDirection, connectionPortRole, ethConnectionEndPointSpec, layerProtocolName, layerProtocolQualifier, lifecycleState, mediaChannelConnectionEndPointSpec, mepMipList, oduConnectionEndPointSpec, operationalState, otsiAssemblyConnectionEndPointSpec, otsiConnectionEndPointSpec, parentNodeEdgePoint, protectionRole, terminationDirection, terminationState, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityCeplistConnectionEndPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    aggregatedConnectionEndPoint: ").append(toIndentedString(aggregatedConnectionEndPoint)).append("\n");
    sb.append("    clientNodeEdgePoint: ").append(toIndentedString(clientNodeEdgePoint)).append("\n");
    sb.append("    connectionPortDirection: ").append(toIndentedString(connectionPortDirection)).append("\n");
    sb.append("    connectionPortRole: ").append(toIndentedString(connectionPortRole)).append("\n");
    sb.append("    ethConnectionEndPointSpec: ").append(toIndentedString(ethConnectionEndPointSpec)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    layerProtocolQualifier: ").append(toIndentedString(layerProtocolQualifier)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    mediaChannelConnectionEndPointSpec: ").append(toIndentedString(mediaChannelConnectionEndPointSpec)).append("\n");
    sb.append("    mepMipList: ").append(toIndentedString(mepMipList)).append("\n");
    sb.append("    oduConnectionEndPointSpec: ").append(toIndentedString(oduConnectionEndPointSpec)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    otsiAssemblyConnectionEndPointSpec: ").append(toIndentedString(otsiAssemblyConnectionEndPointSpec)).append("\n");
    sb.append("    otsiConnectionEndPointSpec: ").append(toIndentedString(otsiConnectionEndPointSpec)).append("\n");
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
