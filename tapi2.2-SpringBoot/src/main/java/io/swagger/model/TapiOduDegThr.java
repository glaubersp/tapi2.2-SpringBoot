package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduDegThrType;
import io.swagger.model.TapiOduPercentageGranularity;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduDegThr
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduDegThr   {
  @JsonProperty("deg-thr-value")
  private Integer degThrValue = null;

  @JsonProperty("percentage-granularity")
  private TapiOduPercentageGranularity percentageGranularity = null;

  @JsonProperty("deg-thr-type")
  private TapiOduDegThrType degThrType = null;

  public TapiOduDegThr degThrValue(Integer degThrValue) {
    this.degThrValue = degThrValue;
    return this;
  }

  /**
   * Percentage of detected errored blocks
   * @return degThrValue
  **/
  @ApiModelProperty(value = "Percentage of detected errored blocks")

  public Integer getDegThrValue() {
    return degThrValue;
  }

  public void setDegThrValue(Integer degThrValue) {
    this.degThrValue = degThrValue;
  }

  public TapiOduDegThr percentageGranularity(TapiOduPercentageGranularity percentageGranularity) {
    this.percentageGranularity = percentageGranularity;
    return this;
  }

  /**
   * Get percentageGranularity
   * @return percentageGranularity
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduPercentageGranularity getPercentageGranularity() {
    return percentageGranularity;
  }

  public void setPercentageGranularity(TapiOduPercentageGranularity percentageGranularity) {
    this.percentageGranularity = percentageGranularity;
  }

  public TapiOduDegThr degThrType(TapiOduDegThrType degThrType) {
    this.degThrType = degThrType;
    return this;
  }

  /**
   * Get degThrType
   * @return degThrType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduDegThrType getDegThrType() {
    return degThrType;
  }

  public void setDegThrType(TapiOduDegThrType degThrType) {
    this.degThrType = degThrType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduDegThr tapiOduDegThr = (TapiOduDegThr) o;
    return Objects.equals(this.degThrValue, tapiOduDegThr.degThrValue) &&
        Objects.equals(this.percentageGranularity, tapiOduDegThr.percentageGranularity) &&
        Objects.equals(this.degThrType, tapiOduDegThr.degThrType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(degThrValue, percentageGranularity, degThrType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduDegThr {\n");
    
    sb.append("    degThrValue: ").append(toIndentedString(degThrValue)).append("\n");
    sb.append("    percentageGranularity: ").append(toIndentedString(percentageGranularity)).append("\n");
    sb.append("    degThrType: ").append(toIndentedString(degThrType)).append("\n");
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
