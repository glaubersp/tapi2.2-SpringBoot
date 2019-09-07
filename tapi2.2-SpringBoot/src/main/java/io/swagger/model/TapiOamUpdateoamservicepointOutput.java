package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamOamserviceOamServicePoint;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamUpdateoamservicepointOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamUpdateoamservicepointOutput   {
  @JsonProperty("oam-service-point")
  private TapiOamOamserviceOamServicePoint oamServicePoint = null;

  public TapiOamUpdateoamservicepointOutput oamServicePoint(TapiOamOamserviceOamServicePoint oamServicePoint) {
    this.oamServicePoint = oamServicePoint;
    return this;
  }

  /**
   * Get oamServicePoint
   * @return oamServicePoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamOamserviceOamServicePoint getOamServicePoint() {
    return oamServicePoint;
  }

  public void setOamServicePoint(TapiOamOamserviceOamServicePoint oamServicePoint) {
    this.oamServicePoint = oamServicePoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamUpdateoamservicepointOutput tapiOamUpdateoamservicepointOutput = (TapiOamUpdateoamservicepointOutput) o;
    return Objects.equals(this.oamServicePoint, tapiOamUpdateoamservicepointOutput.oamServicePoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamServicePoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamUpdateoamservicepointOutput {\n");
    
    sb.append("    oamServicePoint: ").append(toIndentedString(oamServicePoint)).append("\n");
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
