package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaLaserControlStatusType;
import io.swagger.model.TapiPhotonicMediaLaserType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaLaserProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaLaserProperties   {
  @JsonProperty("laser-application-type")
  private TapiPhotonicMediaLaserType laserApplicationType = null;

  @JsonProperty("laser-bias-current")
  private String laserBiasCurrent = null;

  @JsonProperty("laser-temperature")
  private String laserTemperature = null;

  @JsonProperty("laser-status")
  private TapiPhotonicMediaLaserControlStatusType laserStatus = null;

  public TapiPhotonicMediaLaserProperties laserApplicationType(TapiPhotonicMediaLaserType laserApplicationType) {
    this.laserApplicationType = laserApplicationType;
    return this;
  }

  /**
   * Get laserApplicationType
   * @return laserApplicationType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaLaserType getLaserApplicationType() {
    return laserApplicationType;
  }

  public void setLaserApplicationType(TapiPhotonicMediaLaserType laserApplicationType) {
    this.laserApplicationType = laserApplicationType;
  }

  public TapiPhotonicMediaLaserProperties laserBiasCurrent(String laserBiasCurrent) {
    this.laserBiasCurrent = laserBiasCurrent;
    return this;
  }

  /**
   * The Bias current of the laser that is the medium polarization current of the laser.
   * @return laserBiasCurrent
  **/
  @ApiModelProperty(value = "The Bias current of the laser that is the medium polarization current of the laser.")

  public String getLaserBiasCurrent() {
    return laserBiasCurrent;
  }

  public void setLaserBiasCurrent(String laserBiasCurrent) {
    this.laserBiasCurrent = laserBiasCurrent;
  }

  public TapiPhotonicMediaLaserProperties laserTemperature(String laserTemperature) {
    this.laserTemperature = laserTemperature;
    return this;
  }

  /**
   * The temperature of the laser
   * @return laserTemperature
  **/
  @ApiModelProperty(value = "The temperature of the laser")

  public String getLaserTemperature() {
    return laserTemperature;
  }

  public void setLaserTemperature(String laserTemperature) {
    this.laserTemperature = laserTemperature;
  }

  public TapiPhotonicMediaLaserProperties laserStatus(TapiPhotonicMediaLaserControlStatusType laserStatus) {
    this.laserStatus = laserStatus;
    return this;
  }

  /**
   * Get laserStatus
   * @return laserStatus
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaLaserControlStatusType getLaserStatus() {
    return laserStatus;
  }

  public void setLaserStatus(TapiPhotonicMediaLaserControlStatusType laserStatus) {
    this.laserStatus = laserStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaLaserProperties tapiPhotonicMediaLaserProperties = (TapiPhotonicMediaLaserProperties) o;
    return Objects.equals(this.laserApplicationType, tapiPhotonicMediaLaserProperties.laserApplicationType) &&
        Objects.equals(this.laserBiasCurrent, tapiPhotonicMediaLaserProperties.laserBiasCurrent) &&
        Objects.equals(this.laserTemperature, tapiPhotonicMediaLaserProperties.laserTemperature) &&
        Objects.equals(this.laserStatus, tapiPhotonicMediaLaserProperties.laserStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(laserApplicationType, laserBiasCurrent, laserTemperature, laserStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaLaserProperties {\n");
    
    sb.append("    laserApplicationType: ").append(toIndentedString(laserApplicationType)).append("\n");
    sb.append("    laserBiasCurrent: ").append(toIndentedString(laserBiasCurrent)).append("\n");
    sb.append("    laserTemperature: ").append(toIndentedString(laserTemperature)).append("\n");
    sb.append("    laserStatus: ").append(toIndentedString(laserStatus)).append("\n");
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
