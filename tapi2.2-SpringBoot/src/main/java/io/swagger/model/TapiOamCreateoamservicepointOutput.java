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
 * TapiOamCreateoamservicepointOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamCreateoamservicepointOutput   {
  @JsonProperty("oam-service-point")
  private TapiOamOamserviceOamServicePoint oamServicePoint = null;

  public TapiOamCreateoamservicepointOutput oamServicePoint(TapiOamOamserviceOamServicePoint oamServicePoint) {
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
    TapiOamCreateoamservicepointOutput tapiOamCreateoamservicepointOutput = (TapiOamCreateoamservicepointOutput) o;
    return Objects.equals(this.oamServicePoint, tapiOamCreateoamservicepointOutput.oamServicePoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamServicePoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamCreateoamservicepointOutput {\n");
    
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
