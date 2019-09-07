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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec   {
  @JsonProperty("mc-config")
  private TapiPhotonicMediaMediaChannelConfigPac mcConfig = null;

  @JsonProperty("power-management-config")
  private TapiPhotonicMediaPowerManagementConfigPac powerManagementConfig = null;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec tapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec = (TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec) o;
    return Objects.equals(this.mcConfig, tapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec.mcConfig) &&
        Objects.equals(this.powerManagementConfig, tapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec.powerManagementConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcConfig, powerManagementConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaMediaChannelConnectivityServiceEndPointSpec {\n");
    
    sb.append("    mcConfig: ").append(toIndentedString(mcConfig)).append("\n");
    sb.append("    powerManagementConfig: ").append(toIndentedString(powerManagementConfig)).append("\n");
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
