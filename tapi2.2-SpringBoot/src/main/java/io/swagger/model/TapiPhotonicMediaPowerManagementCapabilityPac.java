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
 * TapiPhotonicMediaPowerManagementCapabilityPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaPowerManagementCapabilityPac   {
  @JsonProperty("tolerable-maximum-input-power")
  private TapiPhotonicMediaPowerProperties tolerableMaximumInputPower = null;

  @JsonProperty("supportable-minimum-output-power")
  private TapiPhotonicMediaPowerProperties supportableMinimumOutputPower = null;

  @JsonProperty("tolerable-minimum-input-power")
  private TapiPhotonicMediaPowerProperties tolerableMinimumInputPower = null;

  @JsonProperty("supportable-maximum-output-power")
  private TapiPhotonicMediaPowerProperties supportableMaximumOutputPower = null;

  public TapiPhotonicMediaPowerManagementCapabilityPac tolerableMaximumInputPower(TapiPhotonicMediaPowerProperties tolerableMaximumInputPower) {
    this.tolerableMaximumInputPower = tolerableMaximumInputPower;
    return this;
  }

  /**
   * Get tolerableMaximumInputPower
   * @return tolerableMaximumInputPower
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerProperties getTolerableMaximumInputPower() {
    return tolerableMaximumInputPower;
  }

  public void setTolerableMaximumInputPower(TapiPhotonicMediaPowerProperties tolerableMaximumInputPower) {
    this.tolerableMaximumInputPower = tolerableMaximumInputPower;
  }

  public TapiPhotonicMediaPowerManagementCapabilityPac supportableMinimumOutputPower(TapiPhotonicMediaPowerProperties supportableMinimumOutputPower) {
    this.supportableMinimumOutputPower = supportableMinimumOutputPower;
    return this;
  }

  /**
   * Get supportableMinimumOutputPower
   * @return supportableMinimumOutputPower
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerProperties getSupportableMinimumOutputPower() {
    return supportableMinimumOutputPower;
  }

  public void setSupportableMinimumOutputPower(TapiPhotonicMediaPowerProperties supportableMinimumOutputPower) {
    this.supportableMinimumOutputPower = supportableMinimumOutputPower;
  }

  public TapiPhotonicMediaPowerManagementCapabilityPac tolerableMinimumInputPower(TapiPhotonicMediaPowerProperties tolerableMinimumInputPower) {
    this.tolerableMinimumInputPower = tolerableMinimumInputPower;
    return this;
  }

  /**
   * Get tolerableMinimumInputPower
   * @return tolerableMinimumInputPower
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerProperties getTolerableMinimumInputPower() {
    return tolerableMinimumInputPower;
  }

  public void setTolerableMinimumInputPower(TapiPhotonicMediaPowerProperties tolerableMinimumInputPower) {
    this.tolerableMinimumInputPower = tolerableMinimumInputPower;
  }

  public TapiPhotonicMediaPowerManagementCapabilityPac supportableMaximumOutputPower(TapiPhotonicMediaPowerProperties supportableMaximumOutputPower) {
    this.supportableMaximumOutputPower = supportableMaximumOutputPower;
    return this;
  }

  /**
   * Get supportableMaximumOutputPower
   * @return supportableMaximumOutputPower
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerProperties getSupportableMaximumOutputPower() {
    return supportableMaximumOutputPower;
  }

  public void setSupportableMaximumOutputPower(TapiPhotonicMediaPowerProperties supportableMaximumOutputPower) {
    this.supportableMaximumOutputPower = supportableMaximumOutputPower;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaPowerManagementCapabilityPac tapiPhotonicMediaPowerManagementCapabilityPac = (TapiPhotonicMediaPowerManagementCapabilityPac) o;
    return Objects.equals(this.tolerableMaximumInputPower, tapiPhotonicMediaPowerManagementCapabilityPac.tolerableMaximumInputPower) &&
        Objects.equals(this.supportableMinimumOutputPower, tapiPhotonicMediaPowerManagementCapabilityPac.supportableMinimumOutputPower) &&
        Objects.equals(this.tolerableMinimumInputPower, tapiPhotonicMediaPowerManagementCapabilityPac.tolerableMinimumInputPower) &&
        Objects.equals(this.supportableMaximumOutputPower, tapiPhotonicMediaPowerManagementCapabilityPac.supportableMaximumOutputPower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tolerableMaximumInputPower, supportableMinimumOutputPower, tolerableMinimumInputPower, supportableMaximumOutputPower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaPowerManagementCapabilityPac {\n");
    
    sb.append("    tolerableMaximumInputPower: ").append(toIndentedString(tolerableMaximumInputPower)).append("\n");
    sb.append("    supportableMinimumOutputPower: ").append(toIndentedString(supportableMinimumOutputPower)).append("\n");
    sb.append("    tolerableMinimumInputPower: ").append(toIndentedString(tolerableMinimumInputPower)).append("\n");
    sb.append("    supportableMaximumOutputPower: ").append(toIndentedString(supportableMaximumOutputPower)).append("\n");
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
