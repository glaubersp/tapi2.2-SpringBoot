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
 * TapiPhotonicMediaTotalPowerThresholdPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaTotalPowerThresholdPac   {
  @JsonProperty("total-power-lower-warn-threshold-default")
  private String totalPowerLowerWarnThresholdDefault = null;

  @JsonProperty("total-power-lower-warn-threshold-max")
  private String totalPowerLowerWarnThresholdMax = null;

  @JsonProperty("total-power-lower-warn-threshold-min")
  private String totalPowerLowerWarnThresholdMin = null;

  @JsonProperty("total-power-upper-warn-threshold-default")
  private String totalPowerUpperWarnThresholdDefault = null;

  @JsonProperty("total-power-upper-warn-threshold-max")
  private String totalPowerUpperWarnThresholdMax = null;

  @JsonProperty("total-power-upper-warn-threshold-min")
  private String totalPowerUpperWarnThresholdMin = null;

  public TapiPhotonicMediaTotalPowerThresholdPac totalPowerLowerWarnThresholdDefault(String totalPowerLowerWarnThresholdDefault) {
    this.totalPowerLowerWarnThresholdDefault = totalPowerLowerWarnThresholdDefault;
    return this;
  }

  /**
   * Can read the value of the default  threshold that was set
   * @return totalPowerLowerWarnThresholdDefault
  **/
  @ApiModelProperty(value = "Can read the value of the default  threshold that was set")

  public String getTotalPowerLowerWarnThresholdDefault() {
    return totalPowerLowerWarnThresholdDefault;
  }

  public void setTotalPowerLowerWarnThresholdDefault(String totalPowerLowerWarnThresholdDefault) {
    this.totalPowerLowerWarnThresholdDefault = totalPowerLowerWarnThresholdDefault;
  }

  public TapiPhotonicMediaTotalPowerThresholdPac totalPowerLowerWarnThresholdMax(String totalPowerLowerWarnThresholdMax) {
    this.totalPowerLowerWarnThresholdMax = totalPowerLowerWarnThresholdMax;
    return this;
  }

  /**
   * Can  read the value of the upper threshold that was set
   * @return totalPowerLowerWarnThresholdMax
  **/
  @ApiModelProperty(value = "Can  read the value of the upper threshold that was set")

  public String getTotalPowerLowerWarnThresholdMax() {
    return totalPowerLowerWarnThresholdMax;
  }

  public void setTotalPowerLowerWarnThresholdMax(String totalPowerLowerWarnThresholdMax) {
    this.totalPowerLowerWarnThresholdMax = totalPowerLowerWarnThresholdMax;
  }

  public TapiPhotonicMediaTotalPowerThresholdPac totalPowerLowerWarnThresholdMin(String totalPowerLowerWarnThresholdMin) {
    this.totalPowerLowerWarnThresholdMin = totalPowerLowerWarnThresholdMin;
    return this;
  }

  /**
   * Can read the value of the lower threshold that was set
   * @return totalPowerLowerWarnThresholdMin
  **/
  @ApiModelProperty(value = "Can read the value of the lower threshold that was set")

  public String getTotalPowerLowerWarnThresholdMin() {
    return totalPowerLowerWarnThresholdMin;
  }

  public void setTotalPowerLowerWarnThresholdMin(String totalPowerLowerWarnThresholdMin) {
    this.totalPowerLowerWarnThresholdMin = totalPowerLowerWarnThresholdMin;
  }

  public TapiPhotonicMediaTotalPowerThresholdPac totalPowerUpperWarnThresholdDefault(String totalPowerUpperWarnThresholdDefault) {
    this.totalPowerUpperWarnThresholdDefault = totalPowerUpperWarnThresholdDefault;
    return this;
  }

  /**
   * Can read the value of the default  threshold that was set
   * @return totalPowerUpperWarnThresholdDefault
  **/
  @ApiModelProperty(value = "Can read the value of the default  threshold that was set")

  public String getTotalPowerUpperWarnThresholdDefault() {
    return totalPowerUpperWarnThresholdDefault;
  }

  public void setTotalPowerUpperWarnThresholdDefault(String totalPowerUpperWarnThresholdDefault) {
    this.totalPowerUpperWarnThresholdDefault = totalPowerUpperWarnThresholdDefault;
  }

  public TapiPhotonicMediaTotalPowerThresholdPac totalPowerUpperWarnThresholdMax(String totalPowerUpperWarnThresholdMax) {
    this.totalPowerUpperWarnThresholdMax = totalPowerUpperWarnThresholdMax;
    return this;
  }

  /**
   * Can  read the value of the upper threshold that was set
   * @return totalPowerUpperWarnThresholdMax
  **/
  @ApiModelProperty(value = "Can  read the value of the upper threshold that was set")

  public String getTotalPowerUpperWarnThresholdMax() {
    return totalPowerUpperWarnThresholdMax;
  }

  public void setTotalPowerUpperWarnThresholdMax(String totalPowerUpperWarnThresholdMax) {
    this.totalPowerUpperWarnThresholdMax = totalPowerUpperWarnThresholdMax;
  }

  public TapiPhotonicMediaTotalPowerThresholdPac totalPowerUpperWarnThresholdMin(String totalPowerUpperWarnThresholdMin) {
    this.totalPowerUpperWarnThresholdMin = totalPowerUpperWarnThresholdMin;
    return this;
  }

  /**
   * Can read the value of the lower threshold that was set
   * @return totalPowerUpperWarnThresholdMin
  **/
  @ApiModelProperty(value = "Can read the value of the lower threshold that was set")

  public String getTotalPowerUpperWarnThresholdMin() {
    return totalPowerUpperWarnThresholdMin;
  }

  public void setTotalPowerUpperWarnThresholdMin(String totalPowerUpperWarnThresholdMin) {
    this.totalPowerUpperWarnThresholdMin = totalPowerUpperWarnThresholdMin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaTotalPowerThresholdPac tapiPhotonicMediaTotalPowerThresholdPac = (TapiPhotonicMediaTotalPowerThresholdPac) o;
    return Objects.equals(this.totalPowerLowerWarnThresholdDefault, tapiPhotonicMediaTotalPowerThresholdPac.totalPowerLowerWarnThresholdDefault) &&
        Objects.equals(this.totalPowerLowerWarnThresholdMax, tapiPhotonicMediaTotalPowerThresholdPac.totalPowerLowerWarnThresholdMax) &&
        Objects.equals(this.totalPowerLowerWarnThresholdMin, tapiPhotonicMediaTotalPowerThresholdPac.totalPowerLowerWarnThresholdMin) &&
        Objects.equals(this.totalPowerUpperWarnThresholdDefault, tapiPhotonicMediaTotalPowerThresholdPac.totalPowerUpperWarnThresholdDefault) &&
        Objects.equals(this.totalPowerUpperWarnThresholdMax, tapiPhotonicMediaTotalPowerThresholdPac.totalPowerUpperWarnThresholdMax) &&
        Objects.equals(this.totalPowerUpperWarnThresholdMin, tapiPhotonicMediaTotalPowerThresholdPac.totalPowerUpperWarnThresholdMin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPowerLowerWarnThresholdDefault, totalPowerLowerWarnThresholdMax, totalPowerLowerWarnThresholdMin, totalPowerUpperWarnThresholdDefault, totalPowerUpperWarnThresholdMax, totalPowerUpperWarnThresholdMin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaTotalPowerThresholdPac {\n");
    
    sb.append("    totalPowerLowerWarnThresholdDefault: ").append(toIndentedString(totalPowerLowerWarnThresholdDefault)).append("\n");
    sb.append("    totalPowerLowerWarnThresholdMax: ").append(toIndentedString(totalPowerLowerWarnThresholdMax)).append("\n");
    sb.append("    totalPowerLowerWarnThresholdMin: ").append(toIndentedString(totalPowerLowerWarnThresholdMin)).append("\n");
    sb.append("    totalPowerUpperWarnThresholdDefault: ").append(toIndentedString(totalPowerUpperWarnThresholdDefault)).append("\n");
    sb.append("    totalPowerUpperWarnThresholdMax: ").append(toIndentedString(totalPowerUpperWarnThresholdMax)).append("\n");
    sb.append("    totalPowerUpperWarnThresholdMin: ").append(toIndentedString(totalPowerUpperWarnThresholdMin)).append("\n");
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
