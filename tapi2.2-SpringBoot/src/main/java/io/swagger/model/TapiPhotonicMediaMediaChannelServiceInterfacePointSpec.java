package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaMediaChannelPoolCapabilityPac;
import io.swagger.model.TapiPhotonicMediaPowerManagementCapabilityPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaMediaChannelServiceInterfacePointSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaMediaChannelServiceInterfacePointSpec   {
  @JsonProperty("mc-pool")
  private TapiPhotonicMediaMediaChannelPoolCapabilityPac mcPool = null;

  @JsonProperty("power-management-capability")
  private TapiPhotonicMediaPowerManagementCapabilityPac powerManagementCapability = null;

  public TapiPhotonicMediaMediaChannelServiceInterfacePointSpec mcPool(TapiPhotonicMediaMediaChannelPoolCapabilityPac mcPool) {
    this.mcPool = mcPool;
    return this;
  }

  /**
   * Get mcPool
   * @return mcPool
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaMediaChannelPoolCapabilityPac getMcPool() {
    return mcPool;
  }

  public void setMcPool(TapiPhotonicMediaMediaChannelPoolCapabilityPac mcPool) {
    this.mcPool = mcPool;
  }

  public TapiPhotonicMediaMediaChannelServiceInterfacePointSpec powerManagementCapability(TapiPhotonicMediaPowerManagementCapabilityPac powerManagementCapability) {
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
    TapiPhotonicMediaMediaChannelServiceInterfacePointSpec tapiPhotonicMediaMediaChannelServiceInterfacePointSpec = (TapiPhotonicMediaMediaChannelServiceInterfacePointSpec) o;
    return Objects.equals(this.mcPool, tapiPhotonicMediaMediaChannelServiceInterfacePointSpec.mcPool) &&
        Objects.equals(this.powerManagementCapability, tapiPhotonicMediaMediaChannelServiceInterfacePointSpec.powerManagementCapability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcPool, powerManagementCapability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaMediaChannelServiceInterfacePointSpec {\n");
    
    sb.append("    mcPool: ").append(toIndentedString(mcPool)).append("\n");
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
