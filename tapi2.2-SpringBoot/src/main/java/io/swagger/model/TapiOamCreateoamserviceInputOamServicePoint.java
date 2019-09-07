package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiCommonServiceInterfacePointRef;
import io.swagger.model.TapiConnectivityConnectivityServiceEndPointRef;
import io.swagger.model.TapiEthEthOamMepServicePoint;
import io.swagger.model.TapiEthEthOamMipServicePoint;
import io.swagger.model.TapiOamMepRef;
import io.swagger.model.TapiOamMipRef;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamCreateoamserviceInputOamServicePoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamCreateoamserviceInputOamServicePoint extends TapiCommonLocalClass  {
  @JsonProperty("administrative-state")
  private TapiCommonAdministrativeState administrativeState = null;

  @JsonProperty("connectivity-service-end-point")
  private TapiConnectivityConnectivityServiceEndPointRef connectivityServiceEndPoint = null;

  @JsonProperty("eth-oam-mep-service-point")
  private TapiEthEthOamMepServicePoint ethOamMepServicePoint = null;

  @JsonProperty("eth-oam-mip-service-point")
  private TapiEthEthOamMipServicePoint ethOamMipServicePoint = null;

  @JsonProperty("is-mip")
  private Boolean isMip = false;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("mep")
  private TapiOamMepRef mep = null;

  @JsonProperty("mip")
  private TapiOamMipRef mip = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("service-interface-point")
  private TapiCommonServiceInterfacePointRef serviceInterfacePoint = null;

  public TapiOamCreateoamserviceInputOamServicePoint administrativeState(TapiCommonAdministrativeState administrativeState) {
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

  public TapiOamCreateoamserviceInputOamServicePoint connectivityServiceEndPoint(TapiConnectivityConnectivityServiceEndPointRef connectivityServiceEndPoint) {
    this.connectivityServiceEndPoint = connectivityServiceEndPoint;
    return this;
  }

  /**
   * Get connectivityServiceEndPoint
   * @return connectivityServiceEndPoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityConnectivityServiceEndPointRef getConnectivityServiceEndPoint() {
    return connectivityServiceEndPoint;
  }

  public void setConnectivityServiceEndPoint(TapiConnectivityConnectivityServiceEndPointRef connectivityServiceEndPoint) {
    this.connectivityServiceEndPoint = connectivityServiceEndPoint;
  }

  public TapiOamCreateoamserviceInputOamServicePoint ethOamMepServicePoint(TapiEthEthOamMepServicePoint ethOamMepServicePoint) {
    this.ethOamMepServicePoint = ethOamMepServicePoint;
    return this;
  }

  /**
   * Get ethOamMepServicePoint
   * @return ethOamMepServicePoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOamMepServicePoint getEthOamMepServicePoint() {
    return ethOamMepServicePoint;
  }

  public void setEthOamMepServicePoint(TapiEthEthOamMepServicePoint ethOamMepServicePoint) {
    this.ethOamMepServicePoint = ethOamMepServicePoint;
  }

  public TapiOamCreateoamserviceInputOamServicePoint ethOamMipServicePoint(TapiEthEthOamMipServicePoint ethOamMipServicePoint) {
    this.ethOamMipServicePoint = ethOamMipServicePoint;
    return this;
  }

  /**
   * Get ethOamMipServicePoint
   * @return ethOamMipServicePoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOamMipServicePoint getEthOamMipServicePoint() {
    return ethOamMipServicePoint;
  }

  public void setEthOamMipServicePoint(TapiEthEthOamMipServicePoint ethOamMipServicePoint) {
    this.ethOamMipServicePoint = ethOamMipServicePoint;
  }

  public TapiOamCreateoamserviceInputOamServicePoint isMip(Boolean isMip) {
    this.isMip = isMip;
    return this;
  }

  /**
   * If true, the object is related to a MIP.                  If false, the object is related to a MEP.
   * @return isMip
  **/
  @ApiModelProperty(value = "If true, the object is related to a MIP.                  If false, the object is related to a MEP.")

  public Boolean isIsMip() {
    return isMip;
  }

  public void setIsMip(Boolean isMip) {
    this.isMip = isMip;
  }

  public TapiOamCreateoamserviceInputOamServicePoint layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
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

  public TapiOamCreateoamserviceInputOamServicePoint lifecycleState(TapiCommonLifecycleState lifecycleState) {
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

  public TapiOamCreateoamserviceInputOamServicePoint mep(TapiOamMepRef mep) {
    this.mep = mep;
    return this;
  }

  /**
   * Get mep
   * @return mep
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamMepRef getMep() {
    return mep;
  }

  public void setMep(TapiOamMepRef mep) {
    this.mep = mep;
  }

  public TapiOamCreateoamserviceInputOamServicePoint mip(TapiOamMipRef mip) {
    this.mip = mip;
    return this;
  }

  /**
   * Get mip
   * @return mip
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamMipRef getMip() {
    return mip;
  }

  public void setMip(TapiOamMipRef mip) {
    this.mip = mip;
  }

  public TapiOamCreateoamserviceInputOamServicePoint operationalState(TapiCommonOperationalState operationalState) {
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

  public TapiOamCreateoamserviceInputOamServicePoint serviceInterfacePoint(TapiCommonServiceInterfacePointRef serviceInterfacePoint) {
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
    TapiOamCreateoamserviceInputOamServicePoint tapiOamCreateoamserviceInputOamServicePoint = (TapiOamCreateoamserviceInputOamServicePoint) o;
    return Objects.equals(this.administrativeState, tapiOamCreateoamserviceInputOamServicePoint.administrativeState) &&
        Objects.equals(this.connectivityServiceEndPoint, tapiOamCreateoamserviceInputOamServicePoint.connectivityServiceEndPoint) &&
        Objects.equals(this.ethOamMepServicePoint, tapiOamCreateoamserviceInputOamServicePoint.ethOamMepServicePoint) &&
        Objects.equals(this.ethOamMipServicePoint, tapiOamCreateoamserviceInputOamServicePoint.ethOamMipServicePoint) &&
        Objects.equals(this.isMip, tapiOamCreateoamserviceInputOamServicePoint.isMip) &&
        Objects.equals(this.layerProtocolName, tapiOamCreateoamserviceInputOamServicePoint.layerProtocolName) &&
        Objects.equals(this.lifecycleState, tapiOamCreateoamserviceInputOamServicePoint.lifecycleState) &&
        Objects.equals(this.mep, tapiOamCreateoamserviceInputOamServicePoint.mep) &&
        Objects.equals(this.mip, tapiOamCreateoamserviceInputOamServicePoint.mip) &&
        Objects.equals(this.operationalState, tapiOamCreateoamserviceInputOamServicePoint.operationalState) &&
        Objects.equals(this.serviceInterfacePoint, tapiOamCreateoamserviceInputOamServicePoint.serviceInterfacePoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativeState, connectivityServiceEndPoint, ethOamMepServicePoint, ethOamMipServicePoint, isMip, layerProtocolName, lifecycleState, mep, mip, operationalState, serviceInterfacePoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamCreateoamserviceInputOamServicePoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    connectivityServiceEndPoint: ").append(toIndentedString(connectivityServiceEndPoint)).append("\n");
    sb.append("    ethOamMepServicePoint: ").append(toIndentedString(ethOamMepServicePoint)).append("\n");
    sb.append("    ethOamMipServicePoint: ").append(toIndentedString(ethOamMipServicePoint)).append("\n");
    sb.append("    isMip: ").append(toIndentedString(isMip)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    mep: ").append(toIndentedString(mep)).append("\n");
    sb.append("    mip: ").append(toIndentedString(mip)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
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
