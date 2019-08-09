package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaMediaChannelConfigPac;
import io.swagger.model.TapiPhotonicMediaPowerManagementConfigPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec   {
  @JsonProperty("power-management-config")
  private TapiPhotonicMediaPowerManagementConfigPac powerManagementConfig = null;

  @JsonProperty("mc-config")
  private TapiPhotonicMediaMediaChannelConfigPac mcConfig = null;

  public TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec powerManagementConfig(TapiPhotonicMediaPowerManagementConfigPac powerManagementConfig) {
    this.powerManagementConfig = powerManagementConfig;
    return this;
  }

  /**
   * Get powerManagementConfig
   * @return powerManagementConfig
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerManagementConfigPac getPowerManagementConfig() {
    return powerManagementConfig;
  }

  public void setPowerManagementConfig(TapiPhotonicMediaPowerManagementConfigPac powerManagementConfig) {
    this.powerManagementConfig = powerManagementConfig;
  }

  public TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec mcConfig(TapiPhotonicMediaMediaChannelConfigPac mcConfig) {
    this.mcConfig = mcConfig;
    return this;
  }

  /**
   * Get mcConfig
   * @return mcConfig
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaMediaChannelConfigPac getMcConfig() {
    return mcConfig;
  }

  public void setMcConfig(TapiPhotonicMediaMediaChannelConfigPac mcConfig) {
    this.mcConfig = mcConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec tapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec = (TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec) o;
    return Objects.equals(this.powerManagementConfig, tapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec.powerManagementConfig) &&
        Objects.equals(this.mcConfig, tapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec.mcConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerManagementConfig, mcConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec {\n");
    
    sb.append("    powerManagementConfig: ").append(toIndentedString(powerManagementConfig)).append("\n");
    sb.append("    mcConfig: ").append(toIndentedString(mcConfig)).append("\n");
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
