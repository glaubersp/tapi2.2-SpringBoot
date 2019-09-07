package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaPowerProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaPowerProperties   {
  @JsonProperty("power-spectral-density")
  private String powerSpectralDensity = null;

  @JsonProperty("total-power")
  private String totalPower = null;

  public TapiPhotonicMediaPowerProperties powerSpectralDensity(String powerSpectralDensity) {
    this.powerSpectralDensity = powerSpectralDensity;
    return this;
  }

  /**
   * This describes how power of a signal  is distributed over frequency specified in nW/MHz
   * @return powerSpectralDensity
  **/
  @ApiModelProperty(value = "This describes how power of a signal  is distributed over frequency specified in nW/MHz")

  public String getPowerSpectralDensity() {
    return powerSpectralDensity;
  }

  public void setPowerSpectralDensity(String powerSpectralDensity) {
    this.powerSpectralDensity = powerSpectralDensity;
  }

  public TapiPhotonicMediaPowerProperties totalPower(String totalPower) {
    this.totalPower = totalPower;
    return this;
  }

  /**
   * The total power at any point in a channel specified in dBm.
   * @return totalPower
  **/
  @ApiModelProperty(value = "The total power at any point in a channel specified in dBm.")

  public String getTotalPower() {
    return totalPower;
  }

  public void setTotalPower(String totalPower) {
    this.totalPower = totalPower;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaPowerProperties tapiPhotonicMediaPowerProperties = (TapiPhotonicMediaPowerProperties) o;
    return Objects.equals(this.powerSpectralDensity, tapiPhotonicMediaPowerProperties.powerSpectralDensity) &&
        Objects.equals(this.totalPower, tapiPhotonicMediaPowerProperties.totalPower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(powerSpectralDensity, totalPower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaPowerProperties {\n");
    
    sb.append("    powerSpectralDensity: ").append(toIndentedString(powerSpectralDensity)).append("\n");
    sb.append("    totalPower: ").append(toIndentedString(totalPower)).append("\n");
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
