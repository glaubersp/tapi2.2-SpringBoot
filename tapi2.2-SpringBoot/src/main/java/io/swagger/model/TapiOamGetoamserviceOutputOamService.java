package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiEthEthOamService;
import io.swagger.model.TapiOamMegRef;
import io.swagger.model.TapiOamOamserviceOamServicePoint;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamGetoamserviceOutputOamService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamGetoamserviceOutputOamService extends TapiCommonGlobalClass  {
  @JsonProperty("administrative-state")
  private TapiCommonAdministrativeState administrativeState = null;

  @JsonProperty("eth-oam-service")
  private TapiEthEthOamService ethOamService = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("meg")
  private TapiOamMegRef meg = null;

  @JsonProperty("oam-service-point")
  @Valid
  private List<TapiOamOamserviceOamServicePoint> oamServicePoint = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  public TapiOamGetoamserviceOutputOamService administrativeState(TapiCommonAdministrativeState administrativeState) {
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

  public TapiOamGetoamserviceOutputOamService ethOamService(TapiEthEthOamService ethOamService) {
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

  public TapiOamGetoamserviceOutputOamService layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
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

  public TapiOamGetoamserviceOutputOamService lifecycleState(TapiCommonLifecycleState lifecycleState) {
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

  public TapiOamGetoamserviceOutputOamService meg(TapiOamMegRef meg) {
    this.meg = meg;
    return this;
  }

  /**
   * Get meg
   * @return meg
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamMegRef getMeg() {
    return meg;
  }

  public void setMeg(TapiOamMegRef meg) {
    this.meg = meg;
  }

  public TapiOamGetoamserviceOutputOamService oamServicePoint(List<TapiOamOamserviceOamServicePoint> oamServicePoint) {
    this.oamServicePoint = oamServicePoint;
    return this;
  }

  public TapiOamGetoamserviceOutputOamService addOamServicePointItem(TapiOamOamserviceOamServicePoint oamServicePointItem) {
    if (this.oamServicePoint == null) {
      this.oamServicePoint = new ArrayList<>();
    }
    this.oamServicePoint.add(oamServicePointItem);
    return this;
  }

  /**
   * none
   * @return oamServicePoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiOamOamserviceOamServicePoint> getOamServicePoint() {
    return oamServicePoint;
  }

  public void setOamServicePoint(List<TapiOamOamserviceOamServicePoint> oamServicePoint) {
    this.oamServicePoint = oamServicePoint;
  }

  public TapiOamGetoamserviceOutputOamService operationalState(TapiCommonOperationalState operationalState) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamGetoamserviceOutputOamService tapiOamGetoamserviceOutputOamService = (TapiOamGetoamserviceOutputOamService) o;
    return Objects.equals(this.administrativeState, tapiOamGetoamserviceOutputOamService.administrativeState) &&
        Objects.equals(this.ethOamService, tapiOamGetoamserviceOutputOamService.ethOamService) &&
        Objects.equals(this.layerProtocolName, tapiOamGetoamserviceOutputOamService.layerProtocolName) &&
        Objects.equals(this.lifecycleState, tapiOamGetoamserviceOutputOamService.lifecycleState) &&
        Objects.equals(this.meg, tapiOamGetoamserviceOutputOamService.meg) &&
        Objects.equals(this.oamServicePoint, tapiOamGetoamserviceOutputOamService.oamServicePoint) &&
        Objects.equals(this.operationalState, tapiOamGetoamserviceOutputOamService.operationalState) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativeState, ethOamService, layerProtocolName, lifecycleState, meg, oamServicePoint, operationalState, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamGetoamserviceOutputOamService {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    ethOamService: ").append(toIndentedString(ethOamService)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    meg: ").append(toIndentedString(meg)).append("\n");
    sb.append("    oamServicePoint: ").append(toIndentedString(oamServicePoint)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
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
