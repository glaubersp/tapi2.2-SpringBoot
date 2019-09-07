package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaOtsiCapabilityPac;
import io.swagger.model.TapiPhotonicMediaPowerManagementCapabilityPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaOtsiServiceInterfacePointSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaOtsiServiceInterfacePointSpec   {
  @JsonProperty("otsi-capability")
  private TapiPhotonicMediaOtsiCapabilityPac otsiCapability = null;

  @JsonProperty("power-management-capability")
  private TapiPhotonicMediaPowerManagementCapabilityPac powerManagementCapability = null;

  public TapiPhotonicMediaOtsiServiceInterfacePointSpec otsiCapability(TapiPhotonicMediaOtsiCapabilityPac otsiCapability) {
    this.otsiCapability = otsiCapability;
    return this;
  }

  /**
   * Get otsiCapability
   * @return otsiCapability
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaOtsiCapabilityPac getOtsiCapability() {
    return otsiCapability;
  }

  public void setOtsiCapability(TapiPhotonicMediaOtsiCapabilityPac otsiCapability) {
    this.otsiCapability = otsiCapability;
  }

  public TapiPhotonicMediaOtsiServiceInterfacePointSpec powerManagementCapability(TapiPhotonicMediaPowerManagementCapabilityPac powerManagementCapability) {
    this.powerManagementCapability = powerManagementCapability;
    return this;
  }

  /**
   * Get powerManagementCapability
   * @return powerManagementCapability
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerManagementCapabilityPac getPowerManagementCapability() {
    return powerManagementCapability;
  }

  public void setPowerManagementCapability(TapiPhotonicMediaPowerManagementCapabilityPac powerManagementCapability) {
    this.powerManagementCapability = powerManagementCapability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaOtsiServiceInterfacePointSpec tapiPhotonicMediaOtsiServiceInterfacePointSpec = (TapiPhotonicMediaOtsiServiceInterfacePointSpec) o;
    return Objects.equals(this.otsiCapability, tapiPhotonicMediaOtsiServiceInterfacePointSpec.otsiCapability) &&
        Objects.equals(this.powerManagementCapability, tapiPhotonicMediaOtsiServiceInterfacePointSpec.powerManagementCapability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otsiCapability, powerManagementCapability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaOtsiServiceInterfacePointSpec {\n");
    
    sb.append("    otsiCapability: ").append(toIndentedString(otsiCapability)).append("\n");
    sb.append("    powerManagementCapability: ").append(toIndentedString(powerManagementCapability)).append("\n");
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
