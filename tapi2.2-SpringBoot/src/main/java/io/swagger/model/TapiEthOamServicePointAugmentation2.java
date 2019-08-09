package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthOamMepServicePoint;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthOamServicePointAugmentation2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthOamServicePointAugmentation2   {
  @JsonProperty("eth-oam-mep-service-point")
  private TapiEthEthOamMepServicePoint ethOamMepServicePoint = null;

  public TapiEthOamServicePointAugmentation2 ethOamMepServicePoint(TapiEthEthOamMepServicePoint ethOamMepServicePoint) {
    this.ethOamMepServicePoint = ethOamMepServicePoint;
    return this;
  }

  /**
   * Get ethOamMepServicePoint
   * @return ethOamMepServicePoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOamMepServicePoint getEthOamMepServicePoint() {
    return ethOamMepServicePoint;
  }

  public void setEthOamMepServicePoint(TapiEthEthOamMepServicePoint ethOamMepServicePoint) {
    this.ethOamMepServicePoint = ethOamMepServicePoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthOamServicePointAugmentation2 tapiEthOamServicePointAugmentation2 = (TapiEthOamServicePointAugmentation2) o;
    return Objects.equals(this.ethOamMepServicePoint, tapiEthOamServicePointAugmentation2.ethOamMepServicePoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOamMepServicePoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthOamServicePointAugmentation2 {\n");
    
    sb.append("    ethOamMepServicePoint: ").append(toIndentedString(ethOamMepServicePoint)).append("\n");
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
