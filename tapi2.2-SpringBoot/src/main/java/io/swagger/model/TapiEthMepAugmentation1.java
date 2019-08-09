package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthMepSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthMepAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthMepAugmentation1   {
  @JsonProperty("eth-mep-spec")
  private TapiEthEthMepSpec ethMepSpec = null;

  public TapiEthMepAugmentation1 ethMepSpec(TapiEthEthMepSpec ethMepSpec) {
    this.ethMepSpec = ethMepSpec;
    return this;
  }

  /**
   * Get ethMepSpec
   * @return ethMepSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthMepSpec getEthMepSpec() {
    return ethMepSpec;
  }

  public void setEthMepSpec(TapiEthEthMepSpec ethMepSpec) {
    this.ethMepSpec = ethMepSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthMepAugmentation1 tapiEthMepAugmentation1 = (TapiEthMepAugmentation1) o;
    return Objects.equals(this.ethMepSpec, tapiEthMepAugmentation1.ethMepSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethMepSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthMepAugmentation1 {\n");
    
    sb.append("    ethMepSpec: ").append(toIndentedString(ethMepSpec)).append("\n");
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
