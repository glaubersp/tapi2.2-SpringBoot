package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthMipCommon;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthOamMipServicePoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthOamMipServicePoint   {
  @JsonProperty("eth-mip-common")
  private TapiEthEthMipCommon ethMipCommon = null;

  public TapiEthEthOamMipServicePoint ethMipCommon(TapiEthEthMipCommon ethMipCommon) {
    this.ethMipCommon = ethMipCommon;
    return this;
  }

  /**
   * Get ethMipCommon
   * @return ethMipCommon
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthMipCommon getEthMipCommon() {
    return ethMipCommon;
  }

  public void setEthMipCommon(TapiEthEthMipCommon ethMipCommon) {
    this.ethMipCommon = ethMipCommon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthOamMipServicePoint tapiEthEthOamMipServicePoint = (TapiEthEthOamMipServicePoint) o;
    return Objects.equals(this.ethMipCommon, tapiEthEthOamMipServicePoint.ethMipCommon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethMipCommon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOamMipServicePoint {\n");
    
    sb.append("    ethMipCommon: ").append(toIndentedString(ethMipCommon)).append("\n");
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
