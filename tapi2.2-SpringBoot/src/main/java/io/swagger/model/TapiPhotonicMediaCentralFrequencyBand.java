package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaFrequencyConstraint;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaCentralFrequencyBand
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaCentralFrequencyBand   {
  @JsonProperty("frequency-constraint")
  private TapiPhotonicMediaFrequencyConstraint frequencyConstraint = null;

  @JsonProperty("lower-central-frequency")
  private Integer lowerCentralFrequency = null;

  @JsonProperty("upper-central-frequency")
  private Integer upperCentralFrequency = null;

  public TapiPhotonicMediaCentralFrequencyBand frequencyConstraint(TapiPhotonicMediaFrequencyConstraint frequencyConstraint) {
    this.frequencyConstraint = frequencyConstraint;
    return this;
  }

  /**
   * Get frequencyConstraint
   * @return frequencyConstraint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaFrequencyConstraint getFrequencyConstraint() {
    return frequencyConstraint;
  }

  public void setFrequencyConstraint(TapiPhotonicMediaFrequencyConstraint frequencyConstraint) {
    this.frequencyConstraint = frequencyConstraint;
  }

  public TapiPhotonicMediaCentralFrequencyBand lowerCentralFrequency(Integer lowerCentralFrequency) {
    this.lowerCentralFrequency = lowerCentralFrequency;
    return this;
  }

  /**
   * The lower central frequency that can be tuned in the laser specified in MHz.                  It is the oscillation frequency of the corresponding electromagnetic wave. 
   * @return lowerCentralFrequency
  **/
  @ApiModelProperty(value = "The lower central frequency that can be tuned in the laser specified in MHz.                  It is the oscillation frequency of the corresponding electromagnetic wave. ")

  public Integer getLowerCentralFrequency() {
    return lowerCentralFrequency;
  }

  public void setLowerCentralFrequency(Integer lowerCentralFrequency) {
    this.lowerCentralFrequency = lowerCentralFrequency;
  }

  public TapiPhotonicMediaCentralFrequencyBand upperCentralFrequency(Integer upperCentralFrequency) {
    this.upperCentralFrequency = upperCentralFrequency;
    return this;
  }

  /**
   * The upper central frequency that can be tuned in the laser specified in MHz.                  It is the oscillation frequency of the corresponding electromagnetic wave. 
   * @return upperCentralFrequency
  **/
  @ApiModelProperty(value = "The upper central frequency that can be tuned in the laser specified in MHz.                  It is the oscillation frequency of the corresponding electromagnetic wave. ")

  public Integer getUpperCentralFrequency() {
    return upperCentralFrequency;
  }

  public void setUpperCentralFrequency(Integer upperCentralFrequency) {
    this.upperCentralFrequency = upperCentralFrequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaCentralFrequencyBand tapiPhotonicMediaCentralFrequencyBand = (TapiPhotonicMediaCentralFrequencyBand) o;
    return Objects.equals(this.frequencyConstraint, tapiPhotonicMediaCentralFrequencyBand.frequencyConstraint) &&
        Objects.equals(this.lowerCentralFrequency, tapiPhotonicMediaCentralFrequencyBand.lowerCentralFrequency) &&
        Objects.equals(this.upperCentralFrequency, tapiPhotonicMediaCentralFrequencyBand.upperCentralFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequencyConstraint, lowerCentralFrequency, upperCentralFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaCentralFrequencyBand {\n");
    
    sb.append("    frequencyConstraint: ").append(toIndentedString(frequencyConstraint)).append("\n");
    sb.append("    lowerCentralFrequency: ").append(toIndentedString(lowerCentralFrequency)).append("\n");
    sb.append("    upperCentralFrequency: ").append(toIndentedString(upperCentralFrequency)).append("\n");
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
