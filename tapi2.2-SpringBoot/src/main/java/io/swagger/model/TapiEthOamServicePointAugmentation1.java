package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthOamMipServicePoint;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthOamServicePointAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthOamServicePointAugmentation1   {
  @JsonProperty("eth-oam-mip-service-point")
  private TapiEthEthOamMipServicePoint ethOamMipServicePoint = null;

  public TapiEthOamServicePointAugmentation1 ethOamMipServicePoint(TapiEthEthOamMipServicePoint ethOamMipServicePoint) {
    this.ethOamMipServicePoint = ethOamMipServicePoint;
    return this;
  }

  /**
   * Get ethOamMipServicePoint
   * @return ethOamMipServicePoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthOamMipServicePoint getEthOamMipServicePoint() {
    return ethOamMipServicePoint;
  }

  public void setEthOamMipServicePoint(TapiEthEthOamMipServicePoint ethOamMipServicePoint) {
    this.ethOamMipServicePoint = ethOamMipServicePoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthOamServicePointAugmentation1 tapiEthOamServicePointAugmentation1 = (TapiEthOamServicePointAugmentation1) o;
    return Objects.equals(this.ethOamMipServicePoint, tapiEthOamServicePointAugmentation1.ethOamMipServicePoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethOamMipServicePoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthOamServicePointAugmentation1 {\n");
    
    sb.append("    ethOamMipServicePoint: ").append(toIndentedString(ethOamMipServicePoint)).append("\n");
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
