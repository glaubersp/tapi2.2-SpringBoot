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
import io.swagger.model.TapiEthEthServiceIntefacePointSpec;
import io.swagger.model.TapiPhotonicMediaMediaChannelServiceInterfacePointSpec;
import io.swagger.model.TapiPhotonicMediaOtsiServiceInterfacePointSpec;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiCommonGetserviceinterfacepointlistOutputSip
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiCommonGetserviceinterfacepointlistOutputSip extends TapiCommonGlobalClass  {
  @JsonProperty("administrative-state")
  private TapiCommonAdministrativeState administrativeState = null;

  @JsonProperty("available-capacity")
  private TapiCommonCapacity availableCapacity = null;

  @JsonProperty("eth-service-inteface-point-spec")
  private TapiEthEthServiceIntefacePointSpec ethServiceIntefacePointSpec = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("media-channel-service-interface-point-spec")
  private TapiPhotonicMediaMediaChannelServiceInterfacePointSpec mediaChannelServiceInterfacePointSpec = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("otsi-service-interface-point-spec")
  private TapiPhotonicMediaOtsiServiceInterfacePointSpec otsiServiceInterfacePointSpec = null;

  @JsonProperty("supported-layer-protocol-qualifier")
  @Valid
  private List<String> supportedLayerProtocolQualifier = null;

  @JsonProperty("total-potential-capacity")
  private TapiCommonCapacity totalPotentialCapacity = null;

  public TapiCommonGetserviceinterfacepointlistOutputSip administrativeState(TapiCommonAdministrativeState administrativeState) {
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

  public TapiCommonGetserviceinterfacepointlistOutputSip availableCapacity(TapiCommonCapacity availableCapacity) {
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

  public TapiCommonGetserviceinterfacepointlistOutputSip ethServiceIntefacePointSpec(TapiEthEthServiceIntefacePointSpec ethServiceIntefacePointSpec) {
    this.ethServiceIntefacePointSpec = ethServiceIntefacePointSpec;
    return this;
  }

  /**
   * Get ethServiceIntefacePointSpec
   * @return ethServiceIntefacePointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthServiceIntefacePointSpec getEthServiceIntefacePointSpec() {
    return ethServiceIntefacePointSpec;
  }

  public void setEthServiceIntefacePointSpec(TapiEthEthServiceIntefacePointSpec ethServiceIntefacePointSpec) {
    this.ethServiceIntefacePointSpec = ethServiceIntefacePointSpec;
  }

  public TapiCommonGetserviceinterfacepointlistOutputSip layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
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

  public TapiCommonGetserviceinterfacepointlistOutputSip lifecycleState(TapiCommonLifecycleState lifecycleState) {
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

  public TapiCommonGetserviceinterfacepointlistOutputSip mediaChannelServiceInterfacePointSpec(TapiPhotonicMediaMediaChannelServiceInterfacePointSpec mediaChannelServiceInterfacePointSpec) {
    this.mediaChannelServiceInterfacePointSpec = mediaChannelServiceInterfacePointSpec;
    return this;
  }

  /**
   * Get mediaChannelServiceInterfacePointSpec
   * @return mediaChannelServiceInterfacePointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaMediaChannelServiceInterfacePointSpec getMediaChannelServiceInterfacePointSpec() {
    return mediaChannelServiceInterfacePointSpec;
  }

  public void setMediaChannelServiceInterfacePointSpec(TapiPhotonicMediaMediaChannelServiceInterfacePointSpec mediaChannelServiceInterfacePointSpec) {
    this.mediaChannelServiceInterfacePointSpec = mediaChannelServiceInterfacePointSpec;
  }

  public TapiCommonGetserviceinterfacepointlistOutputSip operationalState(TapiCommonOperationalState operationalState) {
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

  public TapiCommonGetserviceinterfacepointlistOutputSip otsiServiceInterfacePointSpec(TapiPhotonicMediaOtsiServiceInterfacePointSpec otsiServiceInterfacePointSpec) {
    this.otsiServiceInterfacePointSpec = otsiServiceInterfacePointSpec;
    return this;
  }

  /**
   * Get otsiServiceInterfacePointSpec
   * @return otsiServiceInterfacePointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaOtsiServiceInterfacePointSpec getOtsiServiceInterfacePointSpec() {
    return otsiServiceInterfacePointSpec;
  }

  public void setOtsiServiceInterfacePointSpec(TapiPhotonicMediaOtsiServiceInterfacePointSpec otsiServiceInterfacePointSpec) {
    this.otsiServiceInterfacePointSpec = otsiServiceInterfacePointSpec;
  }

  public TapiCommonGetserviceinterfacepointlistOutputSip supportedLayerProtocolQualifier(List<String> supportedLayerProtocolQualifier) {
    this.supportedLayerProtocolQualifier = supportedLayerProtocolQualifier;
    return this;
  }

  public TapiCommonGetserviceinterfacepointlistOutputSip addSupportedLayerProtocolQualifierItem(String supportedLayerProtocolQualifierItem) {
    if (this.supportedLayerProtocolQualifier == null) {
      this.supportedLayerProtocolQualifier = new ArrayList<>();
    }
    this.supportedLayerProtocolQualifier.add(supportedLayerProtocolQualifierItem);
    return this;
  }

  /**
   * none
   * @return supportedLayerProtocolQualifier
  **/
  @ApiModelProperty(value = "none")

  public List<String> getSupportedLayerProtocolQualifier() {
    return supportedLayerProtocolQualifier;
  }

  public void setSupportedLayerProtocolQualifier(List<String> supportedLayerProtocolQualifier) {
    this.supportedLayerProtocolQualifier = supportedLayerProtocolQualifier;
  }

  public TapiCommonGetserviceinterfacepointlistOutputSip totalPotentialCapacity(TapiCommonCapacity totalPotentialCapacity) {
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
    TapiCommonGetserviceinterfacepointlistOutputSip tapiCommonGetserviceinterfacepointlistOutputSip = (TapiCommonGetserviceinterfacepointlistOutputSip) o;
    return Objects.equals(this.administrativeState, tapiCommonGetserviceinterfacepointlistOutputSip.administrativeState) &&
        Objects.equals(this.availableCapacity, tapiCommonGetserviceinterfacepointlistOutputSip.availableCapacity) &&
        Objects.equals(this.ethServiceIntefacePointSpec, tapiCommonGetserviceinterfacepointlistOutputSip.ethServiceIntefacePointSpec) &&
        Objects.equals(this.layerProtocolName, tapiCommonGetserviceinterfacepointlistOutputSip.layerProtocolName) &&
        Objects.equals(this.lifecycleState, tapiCommonGetserviceinterfacepointlistOutputSip.lifecycleState) &&
        Objects.equals(this.mediaChannelServiceInterfacePointSpec, tapiCommonGetserviceinterfacepointlistOutputSip.mediaChannelServiceInterfacePointSpec) &&
        Objects.equals(this.operationalState, tapiCommonGetserviceinterfacepointlistOutputSip.operationalState) &&
        Objects.equals(this.otsiServiceInterfacePointSpec, tapiCommonGetserviceinterfacepointlistOutputSip.otsiServiceInterfacePointSpec) &&
        Objects.equals(this.supportedLayerProtocolQualifier, tapiCommonGetserviceinterfacepointlistOutputSip.supportedLayerProtocolQualifier) &&
        Objects.equals(this.totalPotentialCapacity, tapiCommonGetserviceinterfacepointlistOutputSip.totalPotentialCapacity) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativeState, availableCapacity, ethServiceIntefacePointSpec, layerProtocolName, lifecycleState, mediaChannelServiceInterfacePointSpec, operationalState, otsiServiceInterfacePointSpec, supportedLayerProtocolQualifier, totalPotentialCapacity, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonGetserviceinterfacepointlistOutputSip {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
    sb.append("    ethServiceIntefacePointSpec: ").append(toIndentedString(ethServiceIntefacePointSpec)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    mediaChannelServiceInterfacePointSpec: ").append(toIndentedString(mediaChannelServiceInterfacePointSpec)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    otsiServiceInterfacePointSpec: ").append(toIndentedString(otsiServiceInterfacePointSpec)).append("\n");
    sb.append("    supportedLayerProtocolQualifier: ").append(toIndentedString(supportedLayerProtocolQualifier)).append("\n");
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
