package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaFecProperties;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaOtsiServerAdaptationPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaOtsiServerAdaptationPac   {
  @JsonProperty("fec-parameters")
  private TapiPhotonicMediaFecProperties fecParameters = null;

  @JsonProperty("number-of-otsi")
  private Integer numberOfOtsi = null;

  public TapiPhotonicMediaOtsiServerAdaptationPac fecParameters(TapiPhotonicMediaFecProperties fecParameters) {
    this.fecParameters = fecParameters;
    return this;
  }

  /**
   * Get fecParameters
   * @return fecParameters
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaFecProperties getFecParameters() {
    return fecParameters;
  }

  public void setFecParameters(TapiPhotonicMediaFecProperties fecParameters) {
    this.fecParameters = fecParameters;
  }

  public TapiPhotonicMediaOtsiServerAdaptationPac numberOfOtsi(Integer numberOfOtsi) {
    this.numberOfOtsi = numberOfOtsi;
    return this;
  }

  /**
   * none
   * @return numberOfOtsi
  **/
  @ApiModelProperty(value = "none")

  public Integer getNumberOfOtsi() {
    return numberOfOtsi;
  }

  public void setNumberOfOtsi(Integer numberOfOtsi) {
    this.numberOfOtsi = numberOfOtsi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaOtsiServerAdaptationPac tapiPhotonicMediaOtsiServerAdaptationPac = (TapiPhotonicMediaOtsiServerAdaptationPac) o;
    return Objects.equals(this.fecParameters, tapiPhotonicMediaOtsiServerAdaptationPac.fecParameters) &&
        Objects.equals(this.numberOfOtsi, tapiPhotonicMediaOtsiServerAdaptationPac.numberOfOtsi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fecParameters, numberOfOtsi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaOtsiServerAdaptationPac {\n");
    
    sb.append("    fecParameters: ").append(toIndentedString(fecParameters)).append("\n");
    sb.append("    numberOfOtsi: ").append(toIndentedString(numberOfOtsi)).append("\n");
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
