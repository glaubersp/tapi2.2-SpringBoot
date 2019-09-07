package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiEthEthMepSpec;
import io.swagger.model.TapiOduOduMepSpec;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamMegMep
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamMegMep extends TapiCommonLocalClass  {
  @JsonProperty("eth-mep-spec")
  private TapiEthEthMepSpec ethMepSpec = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("odu-mep-spec")
  private TapiOduOduMepSpec oduMepSpec = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  public TapiOamMegMep ethMepSpec(TapiEthEthMepSpec ethMepSpec) {
    this.ethMepSpec = ethMepSpec;
    return this;
  }

  /**
   * Get ethMepSpec
   * @return ethMepSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthMepSpec getEthMepSpec() {
    return ethMepSpec;
  }

  public void setEthMepSpec(TapiEthEthMepSpec ethMepSpec) {
    this.ethMepSpec = ethMepSpec;
  }

  public TapiOamMegMep layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
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

  public TapiOamMegMep lifecycleState(TapiCommonLifecycleState lifecycleState) {
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

  public TapiOamMegMep oduMepSpec(TapiOduOduMepSpec oduMepSpec) {
    this.oduMepSpec = oduMepSpec;
    return this;
  }

  /**
   * Get oduMepSpec
   * @return oduMepSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduMepSpec getOduMepSpec() {
    return oduMepSpec;
  }

  public void setOduMepSpec(TapiOduOduMepSpec oduMepSpec) {
    this.oduMepSpec = oduMepSpec;
  }

  public TapiOamMegMep operationalState(TapiCommonOperationalState operationalState) {
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
    TapiOamMegMep tapiOamMegMep = (TapiOamMegMep) o;
    return Objects.equals(this.ethMepSpec, tapiOamMegMep.ethMepSpec) &&
        Objects.equals(this.layerProtocolName, tapiOamMegMep.layerProtocolName) &&
        Objects.equals(this.lifecycleState, tapiOamMegMep.lifecycleState) &&
        Objects.equals(this.oduMepSpec, tapiOamMegMep.oduMepSpec) &&
        Objects.equals(this.operationalState, tapiOamMegMep.operationalState) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethMepSpec, layerProtocolName, lifecycleState, oduMepSpec, operationalState, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamMegMep {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ethMepSpec: ").append(toIndentedString(ethMepSpec)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    oduMepSpec: ").append(toIndentedString(oduMepSpec)).append("\n");
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
