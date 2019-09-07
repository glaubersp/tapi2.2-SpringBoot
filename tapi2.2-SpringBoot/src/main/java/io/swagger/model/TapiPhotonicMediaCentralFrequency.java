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
 * TapiPhotonicMediaCentralFrequency
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaCentralFrequency   {
  @JsonProperty("central-frequency")
  private Integer centralFrequency = null;

  @JsonProperty("frequency-constraint")
  private TapiPhotonicMediaFrequencyConstraint frequencyConstraint = null;

  public TapiPhotonicMediaCentralFrequency centralFrequency(Integer centralFrequency) {
    this.centralFrequency = centralFrequency;
    return this;
  }

  /**
   * The central frequency of the laser specified in MHz. It is the oscillation frequency of the corresponding electromagnetic wave. 
   * @return centralFrequency
  **/
  @ApiModelProperty(value = "The central frequency of the laser specified in MHz. It is the oscillation frequency of the corresponding electromagnetic wave. ")

  public Integer getCentralFrequency() {
    return centralFrequency;
  }

  public void setCentralFrequency(Integer centralFrequency) {
    this.centralFrequency = centralFrequency;
  }

  public TapiPhotonicMediaCentralFrequency frequencyConstraint(TapiPhotonicMediaFrequencyConstraint frequencyConstraint) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaCentralFrequency tapiPhotonicMediaCentralFrequency = (TapiPhotonicMediaCentralFrequency) o;
    return Objects.equals(this.centralFrequency, tapiPhotonicMediaCentralFrequency.centralFrequency) &&
        Objects.equals(this.frequencyConstraint, tapiPhotonicMediaCentralFrequency.frequencyConstraint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centralFrequency, frequencyConstraint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaCentralFrequency {\n");
    
    sb.append("    centralFrequency: ").append(toIndentedString(centralFrequency)).append("\n");
    sb.append("    frequencyConstraint: ").append(toIndentedString(frequencyConstraint)).append("\n");
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
