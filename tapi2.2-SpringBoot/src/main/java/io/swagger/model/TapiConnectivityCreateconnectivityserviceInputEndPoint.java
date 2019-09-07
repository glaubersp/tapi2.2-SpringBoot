package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiCommonPortDirection;
import io.swagger.model.TapiCommonPortRole;
import io.swagger.model.TapiCommonServiceInterfacePointRef;
import io.swagger.model.TapiConnectivityConnectionEndPointRef;
import io.swagger.model.TapiConnectivityConnectivityServiceEndPointRef;
import io.swagger.model.TapiConnectivityProtectionRole;
import io.swagger.model.TapiEthEthConnectivityServiceEndPointSpec;
import io.swagger.model.TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityCreateconnectivityserviceInputEndPoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiConnectivityCreateconnectivityserviceInputEndPoint extends TapiCommonLocalClass  {
  @JsonProperty("administrative-state")
  private TapiCommonAdministrativeState administrativeState = null;

  @JsonProperty("capacity")
  private TapiCommonCapacity capacity = null;

  @JsonProperty("connection-end-point")
  @Valid
  private List<TapiConnectivityConnectionEndPointRef> connectionEndPoint = null;

  @JsonProperty("direction")
  private TapiCommonPortDirection direction = null;

  @JsonProperty("eth-connectivity-service-end-point-spec")
  private TapiEthEthConnectivityServiceEndPointSpec ethConnectivityServiceEndPointSpec = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("layer-protocol-qualifier")
  private String layerProtocolQualifier = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("media-channel-connectivity-service-end-point-spec")
  private TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec mediaChannelConnectivityServiceEndPointSpec = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("otsi-connectivity-service-end-point-spec")
  private TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec otsiConnectivityServiceEndPointSpec = null;

  @JsonProperty("peer-fwd-connectivity-service-end-point")
  private TapiConnectivityConnectivityServiceEndPointRef peerFwdConnectivityServiceEndPoint = null;

  @JsonProperty("protecting-connectivity-service-end-point")
  private TapiConnectivityConnectivityServiceEndPointRef protectingConnectivityServiceEndPoint = null;

  @JsonProperty("protection-role")
  private TapiConnectivityProtectionRole protectionRole = null;

  @JsonProperty("role")
  private TapiCommonPortRole role = null;

  @JsonProperty("server-connectivity-service-end-point")
  private TapiConnectivityConnectivityServiceEndPointRef serverConnectivityServiceEndPoint = null;

  @JsonProperty("service-interface-point")
  private TapiCommonServiceInterfacePointRef serviceInterfacePoint = null;

  public TapiConnectivityCreateconnectivityserviceInputEndPoint administrativeState(TapiCommonAdministrativeState administrativeState) {
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

  public TapiConnectivityCreateconnectivityserviceInputEndPoint capacity(TapiCommonCapacity capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonCapacity getCapacity() {
    return capacity;
  }

  public void setCapacity(TapiCommonCapacity capacity) {
    this.capacity = capacity;
  }

  public TapiConnectivityCreateconnectivityserviceInputEndPoint connectionEndPoint(List<TapiConnectivityConnectionEndPointRef> connectionEndPoint) {
    this.connectionEndPoint = connectionEndPoint;
    return this;
  }

  public TapiConnectivityCreateconnectivityserviceInputEndPoint addConnectionEndPointItem(TapiConnectivityConnectionEndPointRef connectionEndPointItem) {
    if (this.connectionEndPoint == null) {
      this.connectionEndPoint = new ArrayList<>();
    }
    this.connectionEndPoint.add(connectionEndPointItem);
    return this;
  }

  /**
   * none
   * @return connectionEndPoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivityConnectionEndPointRef> getConnectionEndPoint() {
    return connectionEndPoint;
  }

  public void setConnectionEndPoint(List<TapiConnectivityConnectionEndPointRef> connectionEndPoint) {
    this.connectionEndPoint = connectionEndPoint;
  }

  public TapiConnectivityCreateconnectivityserviceInputEndPoint direction(TapiCommonPortDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonPortDirection getDirection() {
    return direction;
  }

  public void setDirection(TapiCommonPortDirection direction) {
    this.direction = direction;
  }

  public TapiConnectivityCreateconnectivityserviceInputEndPoint ethConnectivityServiceEndPointSpec(TapiEthEthConnectivityServiceEndPointSpec ethConnectivityServiceEndPointSpec) {
    this.ethConnectivityServiceEndPointSpec = ethConnectivityServiceEndPointSpec;
    return this;
  }

  /**
   * Get ethConnectivityServiceEndPointSpec
   * @return ethConnectivityServiceEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthConnectivityServiceEndPointSpec getEthConnectivityServiceEndPointSpec() {
    return ethConnectivityServiceEndPointSpec;
  }

  public void setEthConnectivityServiceEndPointSpec(TapiEthEthConnectivityServiceEndPointSpec ethConnectivityServiceEndPointSpec) {
    this.ethConnectivityServiceEndPointSpec = ethConnectivityServiceEndPointSpec;
  }

  public TapiConnectivityCreateconnectivityserviceInputEndPoint layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
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

  public TapiConnectivityCreateconnectivityserviceInputEndPoint layerProtocolQualifier(String layerProtocolQualifier) {
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

  public TapiConnectivityCreateconnectivityserviceInputEndPoint lifecycleState(TapiCommonLifecycleState lifecycleState) {
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

  public TapiConnectivityCreateconnectivityserviceInputEndPoint mediaChannelConnectivityServiceEndPointSpec(TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec mediaChannelConnectivityServiceEndPointSpec) {
    this.mediaChannelConnectivityServiceEndPointSpec = mediaChannelConnectivityServiceEndPointSpec;
    return this;
  }

  /**
   * Get mediaChannelConnectivityServiceEndPointSpec
   * @return mediaChannelConnectivityServiceEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec getMediaChannelConnectivityServiceEndPointSpec() {
    return mediaChannelConnectivityServiceEndPointSpec;
  }

  public void setMediaChannelConnectivityServiceEndPointSpec(TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec mediaChannelConnectivityServiceEndPointSpec) {
    this.mediaChannelConnectivityServiceEndPointSpec = mediaChannelConnectivityServiceEndPointSpec;
  }

  public TapiConnectivityCreateconnectivityserviceInputEndPoint operationalState(TapiCommonOperationalState operationalState) {
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

  public TapiConnectivityCreateconnectivityserviceInputEndPoint otsiConnectivityServiceEndPointSpec(TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec otsiConnectivityServiceEndPointSpec) {
    this.otsiConnectivityServiceEndPointSpec = otsiConnectivityServiceEndPointSpec;
    return this;
  }

  /**
   * Get otsiConnectivityServiceEndPointSpec
   * @return otsiConnectivityServiceEndPointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec getOtsiConnectivityServiceEndPointSpec() {
    return otsiConnectivityServiceEndPointSpec;
  }

  public void setOtsiConnectivityServiceEndPointSpec(TapiPhotonicMediaOtsiConnectivityServiceEndPointSpec otsiConnectivityServiceEndPointSpec) {
    this.otsiConnectivityServiceEndPointSpec = otsiConnectivityServiceEndPointSpec;
  }

  public TapiConnectivityCreateconnectivityserviceInputEndPoint peerFwdConnectivityServiceEndPoint(TapiConnectivityConnectivityServiceEndPointRef peerFwdConnectivityServiceEndPoint) {
    this.peerFwdConnectivityServiceEndPoint = peerFwdConnectivityServiceEndPoint;
    return this;
  }

  /**
   * Get peerFwdConnectivityServiceEndPoint
   * @return peerFwdConnectivityServiceEndPoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityConnectivityServiceEndPointRef getPeerFwdConnectivityServiceEndPoint() {
    return peerFwdConnectivityServiceEndPoint;
  }

  public void setPeerFwdConnectivityServiceEndPoint(TapiConnectivityConnectivityServiceEndPointRef peerFwdConnectivityServiceEndPoint) {
    this.peerFwdConnectivityServiceEndPoint = peerFwdConnectivityServiceEndPoint;
  }

  public TapiConnectivityCreateconnectivityserviceInputEndPoint protectingConnectivityServiceEndPoint(TapiConnectivityConnectivityServiceEndPointRef protectingConnectivityServiceEndPoint) {
    this.protectingConnectivityServiceEndPoint = protectingConnectivityServiceEndPoint;
    return this;
  }

  /**
   * Get protectingConnectivityServiceEndPoint
   * @return protectingConnectivityServiceEndPoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityConnectivityServiceEndPointRef getProtectingConnectivityServiceEndPoint() {
    return protectingConnectivityServiceEndPoint;
  }

  public void setProtectingConnectivityServiceEndPoint(TapiConnectivityConnectivityServiceEndPointRef protectingConnectivityServiceEndPoint) {
    this.protectingConnectivityServiceEndPoint = protectingConnectivityServiceEndPoint;
  }

  public TapiConnectivityCreateconnectivityserviceInputEndPoint protectionRole(TapiConnectivityProtectionRole protectionRole) {
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

  public TapiConnectivityCreateconnectivityserviceInputEndPoint role(TapiCommonPortRole role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonPortRole getRole() {
    return role;
  }

  public void setRole(TapiCommonPortRole role) {
    this.role = role;
  }

  public TapiConnectivityCreateconnectivityserviceInputEndPoint serverConnectivityServiceEndPoint(TapiConnectivityConnectivityServiceEndPointRef serverConnectivityServiceEndPoint) {
    this.serverConnectivityServiceEndPoint = serverConnectivityServiceEndPoint;
    return this;
  }

  /**
   * Get serverConnectivityServiceEndPoint
   * @return serverConnectivityServiceEndPoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityConnectivityServiceEndPointRef getServerConnectivityServiceEndPoint() {
    return serverConnectivityServiceEndPoint;
  }

  public void setServerConnectivityServiceEndPoint(TapiConnectivityConnectivityServiceEndPointRef serverConnectivityServiceEndPoint) {
    this.serverConnectivityServiceEndPoint = serverConnectivityServiceEndPoint;
  }

  public TapiConnectivityCreateconnectivityserviceInputEndPoint serviceInterfacePoint(TapiCommonServiceInterfacePointRef serviceInterfacePoint) {
    this.serviceInterfacePoint = serviceInterfacePoint;
    return this;
  }

  /**
   * Get serviceInterfacePoint
   * @return serviceInterfacePoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonServiceInterfacePointRef getServiceInterfacePoint() {
    return serviceInterfacePoint;
  }

  public void setServiceInterfacePoint(TapiCommonServiceInterfacePointRef serviceInterfacePoint) {
    this.serviceInterfacePoint = serviceInterfacePoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityCreateconnectivityserviceInputEndPoint tapiConnectivityCreateconnectivityserviceInputEndPoint = (TapiConnectivityCreateconnectivityserviceInputEndPoint) o;
    return Objects.equals(this.administrativeState, tapiConnectivityCreateconnectivityserviceInputEndPoint.administrativeState) &&
        Objects.equals(this.capacity, tapiConnectivityCreateconnectivityserviceInputEndPoint.capacity) &&
        Objects.equals(this.connectionEndPoint, tapiConnectivityCreateconnectivityserviceInputEndPoint.connectionEndPoint) &&
        Objects.equals(this.direction, tapiConnectivityCreateconnectivityserviceInputEndPoint.direction) &&
        Objects.equals(this.ethConnectivityServiceEndPointSpec, tapiConnectivityCreateconnectivityserviceInputEndPoint.ethConnectivityServiceEndPointSpec) &&
        Objects.equals(this.layerProtocolName, tapiConnectivityCreateconnectivityserviceInputEndPoint.layerProtocolName) &&
        Objects.equals(this.layerProtocolQualifier, tapiConnectivityCreateconnectivityserviceInputEndPoint.layerProtocolQualifier) &&
        Objects.equals(this.lifecycleState, tapiConnectivityCreateconnectivityserviceInputEndPoint.lifecycleState) &&
        Objects.equals(this.mediaChannelConnectivityServiceEndPointSpec, tapiConnectivityCreateconnectivityserviceInputEndPoint.mediaChannelConnectivityServiceEndPointSpec) &&
        Objects.equals(this.operationalState, tapiConnectivityCreateconnectivityserviceInputEndPoint.operationalState) &&
        Objects.equals(this.otsiConnectivityServiceEndPointSpec, tapiConnectivityCreateconnectivityserviceInputEndPoint.otsiConnectivityServiceEndPointSpec) &&
        Objects.equals(this.peerFwdConnectivityServiceEndPoint, tapiConnectivityCreateconnectivityserviceInputEndPoint.peerFwdConnectivityServiceEndPoint) &&
        Objects.equals(this.protectingConnectivityServiceEndPoint, tapiConnectivityCreateconnectivityserviceInputEndPoint.protectingConnectivityServiceEndPoint) &&
        Objects.equals(this.protectionRole, tapiConnectivityCreateconnectivityserviceInputEndPoint.protectionRole) &&
        Objects.equals(this.role, tapiConnectivityCreateconnectivityserviceInputEndPoint.role) &&
        Objects.equals(this.serverConnectivityServiceEndPoint, tapiConnectivityCreateconnectivityserviceInputEndPoint.serverConnectivityServiceEndPoint) &&
        Objects.equals(this.serviceInterfacePoint, tapiConnectivityCreateconnectivityserviceInputEndPoint.serviceInterfacePoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativeState, capacity, connectionEndPoint, direction, ethConnectivityServiceEndPointSpec, layerProtocolName, layerProtocolQualifier, lifecycleState, mediaChannelConnectivityServiceEndPointSpec, operationalState, otsiConnectivityServiceEndPointSpec, peerFwdConnectivityServiceEndPoint, protectingConnectivityServiceEndPoint, protectionRole, role, serverConnectivityServiceEndPoint, serviceInterfacePoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityCreateconnectivityserviceInputEndPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    connectionEndPoint: ").append(toIndentedString(connectionEndPoint)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    ethConnectivityServiceEndPointSpec: ").append(toIndentedString(ethConnectivityServiceEndPointSpec)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    layerProtocolQualifier: ").append(toIndentedString(layerProtocolQualifier)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    mediaChannelConnectivityServiceEndPointSpec: ").append(toIndentedString(mediaChannelConnectivityServiceEndPointSpec)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    otsiConnectivityServiceEndPointSpec: ").append(toIndentedString(otsiConnectivityServiceEndPointSpec)).append("\n");
    sb.append("    peerFwdConnectivityServiceEndPoint: ").append(toIndentedString(peerFwdConnectivityServiceEndPoint)).append("\n");
    sb.append("    protectingConnectivityServiceEndPoint: ").append(toIndentedString(protectingConnectivityServiceEndPoint)).append("\n");
    sb.append("    protectionRole: ").append(toIndentedString(protectionRole)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    serverConnectivityServiceEndPoint: ").append(toIndentedString(serverConnectivityServiceEndPoint)).append("\n");
    sb.append("    serviceInterfacePoint: ").append(toIndentedString(serviceInterfacePoint)).append("\n");
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
