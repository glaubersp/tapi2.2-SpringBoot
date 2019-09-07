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
 * TapiPhotonicMediaSpectrumBand
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaSpectrumBand   {
  @JsonProperty("frequency-constraint")
  private TapiPhotonicMediaFrequencyConstraint frequencyConstraint = null;

  @JsonProperty("lower-frequency")
  private Integer lowerFrequency = null;

  @JsonProperty("upper-frequency")
  private Integer upperFrequency = null;

  public TapiPhotonicMediaSpectrumBand frequencyConstraint(TapiPhotonicMediaFrequencyConstraint frequencyConstraint) {
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

  public TapiPhotonicMediaSpectrumBand lowerFrequency(Integer lowerFrequency) {
    this.lowerFrequency = lowerFrequency;
    return this;
  }

  /**
   * The lower frequency bound of the media channel spectrum specified in MHz
   * @return lowerFrequency
  **/
  @ApiModelProperty(value = "The lower frequency bound of the media channel spectrum specified in MHz")

  public Integer getLowerFrequency() {
    return lowerFrequency;
  }

  public void setLowerFrequency(Integer lowerFrequency) {
    this.lowerFrequency = lowerFrequency;
  }

  public TapiPhotonicMediaSpectrumBand upperFrequency(Integer upperFrequency) {
    this.upperFrequency = upperFrequency;
    return this;
  }

  /**
   * The upper frequency bound of the media channel spectrum specified in MHz
   * @return upperFrequency
  **/
  @ApiModelProperty(value = "The upper frequency bound of the media channel spectrum specified in MHz")

  public Integer getUpperFrequency() {
    return upperFrequency;
  }

  public void setUpperFrequency(Integer upperFrequency) {
    this.upperFrequency = upperFrequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaSpectrumBand tapiPhotonicMediaSpectrumBand = (TapiPhotonicMediaSpectrumBand) o;
    return Objects.equals(this.frequencyConstraint, tapiPhotonicMediaSpectrumBand.frequencyConstraint) &&
        Objects.equals(this.lowerFrequency, tapiPhotonicMediaSpectrumBand.lowerFrequency) &&
        Objects.equals(this.upperFrequency, tapiPhotonicMediaSpectrumBand.upperFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequencyConstraint, lowerFrequency, upperFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaSpectrumBand {\n");
    
    sb.append("    frequencyConstraint: ").append(toIndentedString(frequencyConstraint)).append("\n");
    sb.append("    lowerFrequency: ").append(toIndentedString(lowerFrequency)).append("\n");
    sb.append("    upperFrequency: ").append(toIndentedString(upperFrequency)).append("\n");
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
