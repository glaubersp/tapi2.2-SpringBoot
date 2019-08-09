package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthServiceIntefacePointSpec;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthServiceInterfacePointAugmentation3
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthServiceInterfacePointAugmentation3   {
  @JsonProperty("eth-service-inteface-point-spec")
  private TapiEthEthServiceIntefacePointSpec ethServiceIntefacePointSpec = null;

  public TapiEthServiceInterfacePointAugmentation3 ethServiceIntefacePointSpec(TapiEthEthServiceIntefacePointSpec ethServiceIntefacePointSpec) {
    this.ethServiceIntefacePointSpec = ethServiceIntefacePointSpec;
    return this;
  }

  /**
   * Get ethServiceIntefacePointSpec
   * @return ethServiceIntefacePointSpec
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthServiceIntefacePointSpec getEthServiceIntefacePointSpec() {
    return ethServiceIntefacePointSpec;
  }

  public void setEthServiceIntefacePointSpec(TapiEthEthServiceIntefacePointSpec ethServiceIntefacePointSpec) {
    this.ethServiceIntefacePointSpec = ethServiceIntefacePointSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthServiceInterfacePointAugmentation3 tapiEthServiceInterfacePointAugmentation3 = (TapiEthServiceInterfacePointAugmentation3) o;
    return Objects.equals(this.ethServiceIntefacePointSpec, tapiEthServiceInterfacePointAugmentation3.ethServiceIntefacePointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethServiceIntefacePointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthServiceInterfacePointAugmentation3 {\n");
    
    sb.append("    ethServiceIntefacePointSpec: ").append(toIndentedString(ethServiceIntefacePointSpec)).append("\n");
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
