package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonServiceInterfacePointRef;
import io.swagger.model.TapiConnectivityConnectivityServiceEndPointRef;
import io.swagger.model.TapiEthEthOamMepServicePoint;
import io.swagger.model.TapiEthEthOamMipServicePoint;
import io.swagger.model.TapiEthEthOamService;
import io.swagger.model.TapiEthOamServicePointAugmentation1;
import io.swagger.model.TapiEthOamServicePointAugmentation2;
import io.swagger.model.TapiEthOamServicePointAugmentation3;
import io.swagger.model.TapiOamMepRef;
import io.swagger.model.TapiOamMipRef;
import io.swagger.model.TapiOamOamServicePoint;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamCreateoamserviceInputOamServicePoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamCreateoamserviceInputOamServicePoint extends TapiEthOamServicePointAugmentation1  {
  @JsonProperty("eth-oam-mep-service-point")
  private TapiEthEthOamMepServicePoint ethOamMepServicePoint = null;

  @JsonProperty("eth-oam-service")
  private TapiEthEthOamService ethOamService = null;

  @JsonProperty("name")
  @Valid
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("local-id")
  private String localId = null;

  @JsonProperty("connectivity-service-end-point")
  private TapiConnectivityConnectivityServiceEndPointRef connectivityServiceEndPoint = null;

  @JsonProperty("mip")
  private TapiOamMipRef mip = null;

  @JsonProperty("service-interface-point")
  private TapiCommonServiceInterfacePointRef serviceInterfacePoint = null;

  @JsonProperty("is-mip")
  private Boolean isMip = false;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("mep")
  private TapiOamMepRef mep = null;

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

  public TapiOamCreateoamserviceInputOamServicePoint ethOamService(TapiEthEthOamService ethOamService) {
    this.ethOamService = ethOamService;
    return this;
  }

  /**
   * Get ethOamService
   * @return ethOamService
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOamService getEthOamService() {
    return ethOamService;
  }

  public void setEthOamService(TapiEthEthOamService ethOamService) {
    this.ethOamService = ethOamService;
  }

  public TapiOamCreateoamserviceInputOamServicePoint name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiOamCreateoamserviceInputOamServicePoint addNameItem(TapiCommonNameAndValue nameItem) {
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

  public TapiOamCreateoamserviceInputOamServicePoint localId(String localId) {
    this.localId = localId;
    return this;
  }

  /**
   * none
   * @return localId
  **/
  @ApiModelProperty(value = "none")

  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamCreateoamserviceInputOamServicePoint tapiOamCreateoamserviceInputOamServicePoint = (TapiOamCreateoamserviceInputOamServicePoint) o;
    return Objects.equals(this.ethOamMepServicePoint, tapiOamCreateoamserviceInputOamServicePoint.ethOamMepServicePoint) &&
        Objects.equals(this.ethOamService, tapiOamCreateoamserviceInputOamServicePoint.ethOamService) &&
        Objects.equals(this.name, tapiOamCreateoamserviceInputOamServicePoint.name) &&
        Objects.equals(this.localId, tapiOamCreateoamserviceInputOamServicePoint.localId) &&
        Objects.equals(this.connectivityServiceEndPoint, tapiOamCreateoamserviceInputOamServicePoint.connectivityServiceEndPoint) &&
        Objects.equals(this.mip, tapiOamCreateoamserviceInputOamServicePoint.mip) &&
        Objects.equals(this.serviceInterfacePoint, tapiOamCreateoamserviceInputOamServicePoint.serviceInterfacePoint) &&
        Objects.equals(this.isMip, tapiOamCreateoamserviceInputOamServicePoint.isMip) &&
        Objects.equals(this.layerProtocolName, tapiOamCreateoamserviceInputOamServicePoint.layerProtocolName) &&
        Objects.equals(this.mep, tapiOamCreateoamserviceInputOamServicePoint.mep) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOamMepServicePoint, ethOamService, name, localId, connectivityServiceEndPoint, mip, serviceInterfacePoint, isMip, layerProtocolName, mep, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamCreateoamserviceInputOamServicePoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ethOamMepServicePoint: ").append(toIndentedString(ethOamMepServicePoint)).append("\n");
    sb.append("    ethOamService: ").append(toIndentedString(ethOamService)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    connectivityServiceEndPoint: ").append(toIndentedString(connectivityServiceEndPoint)).append("\n");
    sb.append("    mip: ").append(toIndentedString(mip)).append("\n");
    sb.append("    serviceInterfacePoint: ").append(toIndentedString(serviceInterfacePoint)).append("\n");
    sb.append("    isMip: ").append(toIndentedString(isMip)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    mep: ").append(toIndentedString(mep)).append("\n");
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
