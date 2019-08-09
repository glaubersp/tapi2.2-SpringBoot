package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaPowerProperties;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaPowerManagementConfigPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaPowerManagementConfigPac   {
  @JsonProperty("expected-maximum-input-power")
  private TapiPhotonicMediaPowerProperties expectedMaximumInputPower = null;

  @JsonProperty("expected-minimum-input-power")
  private TapiPhotonicMediaPowerProperties expectedMinimumInputPower = null;

  @JsonProperty("intended-minimum-output-power")
  private TapiPhotonicMediaPowerProperties intendedMinimumOutputPower = null;

  @JsonProperty("intended-maximum-output-power")
  private TapiPhotonicMediaPowerProperties intendedMaximumOutputPower = null;

  public TapiPhotonicMediaPowerManagementConfigPac expectedMaximumInputPower(TapiPhotonicMediaPowerProperties expectedMaximumInputPower) {
    this.expectedMaximumInputPower = expectedMaximumInputPower;
    return this;
  }

  /**
   * Get expectedMaximumInputPower
   * @return expectedMaximumInputPower
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerProperties getExpectedMaximumInputPower() {
    return expectedMaximumInputPower;
  }

  public void setExpectedMaximumInputPower(TapiPhotonicMediaPowerProperties expectedMaximumInputPower) {
    this.expectedMaximumInputPower = expectedMaximumInputPower;
  }

  public TapiPhotonicMediaPowerManagementConfigPac expectedMinimumInputPower(TapiPhotonicMediaPowerProperties expectedMinimumInputPower) {
    this.expectedMinimumInputPower = expectedMinimumInputPower;
    return this;
  }

  /**
   * Get expectedMinimumInputPower
   * @return expectedMinimumInputPower
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerProperties getExpectedMinimumInputPower() {
    return expectedMinimumInputPower;
  }

  public void setExpectedMinimumInputPower(TapiPhotonicMediaPowerProperties expectedMinimumInputPower) {
    this.expectedMinimumInputPower = expectedMinimumInputPower;
  }

  public TapiPhotonicMediaPowerManagementConfigPac intendedMinimumOutputPower(TapiPhotonicMediaPowerProperties intendedMinimumOutputPower) {
    this.intendedMinimumOutputPower = intendedMinimumOutputPower;
    return this;
  }

  /**
   * Get intendedMinimumOutputPower
   * @return intendedMinimumOutputPower
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerProperties getIntendedMinimumOutputPower() {
    return intendedMinimumOutputPower;
  }

  public void setIntendedMinimumOutputPower(TapiPhotonicMediaPowerProperties intendedMinimumOutputPower) {
    this.intendedMinimumOutputPower = intendedMinimumOutputPower;
  }

  public TapiPhotonicMediaPowerManagementConfigPac intendedMaximumOutputPower(TapiPhotonicMediaPowerProperties intendedMaximumOutputPower) {
    this.intendedMaximumOutputPower = intendedMaximumOutputPower;
    return this;
  }

  /**
   * Get intendedMaximumOutputPower
   * @return intendedMaximumOutputPower
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerProperties getIntendedMaximumOutputPower() {
    return intendedMaximumOutputPower;
  }

  public void setIntendedMaximumOutputPower(TapiPhotonicMediaPowerProperties intendedMaximumOutputPower) {
    this.intendedMaximumOutputPower = intendedMaximumOutputPower;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaPowerManagementConfigPac tapiPhotonicMediaPowerManagementConfigPac = (TapiPhotonicMediaPowerManagementConfigPac) o;
    return Objects.equals(this.expectedMaximumInputPower, tapiPhotonicMediaPowerManagementConfigPac.expectedMaximumInputPower) &&
        Objects.equals(this.expectedMinimumInputPower, tapiPhotonicMediaPowerManagementConfigPac.expectedMinimumInputPower) &&
        Objects.equals(this.intendedMinimumOutputPower, tapiPhotonicMediaPowerManagementConfigPac.intendedMinimumOutputPower) &&
        Objects.equals(this.intendedMaximumOutputPower, tapiPhotonicMediaPowerManagementConfigPac.intendedMaximumOutputPower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedMaximumInputPower, expectedMinimumInputPower, intendedMinimumOutputPower, intendedMaximumOutputPower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaPowerManagementConfigPac {\n");
    
    sb.append("    expectedMaximumInputPower: ").append(toIndentedString(expectedMaximumInputPower)).append("\n");
    sb.append("    expectedMinimumInputPower: ").append(toIndentedString(expectedMinimumInputPower)).append("\n");
    sb.append("    intendedMinimumOutputPower: ").append(toIndentedString(intendedMinimumOutputPower)).append("\n");
    sb.append("    intendedMaximumOutputPower: ").append(toIndentedString(intendedMaximumOutputPower)).append("\n");
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
