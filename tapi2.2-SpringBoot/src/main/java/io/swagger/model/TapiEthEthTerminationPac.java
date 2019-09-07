package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthTerminationCommonPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthTerminationPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthTerminationPac   {
  @JsonProperty("eth-termination-common-pac")
  private TapiEthEthTerminationCommonPac ethTerminationCommonPac = null;

  public TapiEthEthTerminationPac ethTerminationCommonPac(TapiEthEthTerminationCommonPac ethTerminationCommonPac) {
    this.ethTerminationCommonPac = ethTerminationCommonPac;
    return this;
  }

  /**
   * Get ethTerminationCommonPac
   * @return ethTerminationCommonPac
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthTerminationCommonPac getEthTerminationCommonPac() {
    return ethTerminationCommonPac;
  }

  public void setEthTerminationCommonPac(TapiEthEthTerminationCommonPac ethTerminationCommonPac) {
    this.ethTerminationCommonPac = ethTerminationCommonPac;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthTerminationPac tapiEthEthTerminationPac = (TapiEthEthTerminationPac) o;
    return Objects.equals(this.ethTerminationCommonPac, tapiEthEthTerminationPac.ethTerminationCommonPac);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethTerminationCommonPac);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthTerminationPac {\n");
    
    sb.append("    ethTerminationCommonPac: ").append(toIndentedString(ethTerminationCommonPac)).append("\n");
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
