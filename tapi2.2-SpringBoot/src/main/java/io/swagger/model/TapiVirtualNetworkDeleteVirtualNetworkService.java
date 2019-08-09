package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiVirtualNetworkDeletevirtualnetworkserviceOutput;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiVirtualNetworkDeleteVirtualNetworkService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiVirtualNetworkDeleteVirtualNetworkService   {
  @JsonProperty("output")
  private TapiVirtualNetworkDeletevirtualnetworkserviceOutput output = null;

  public TapiVirtualNetworkDeleteVirtualNetworkService output(TapiVirtualNetworkDeletevirtualnetworkserviceOutput output) {
    this.output = output;
    return this;
  }

  /**
   * Get output
   * @return output
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiVirtualNetworkDeletevirtualnetworkserviceOutput getOutput() {
    return output;
  }

  public void setOutput(TapiVirtualNetworkDeletevirtualnetworkserviceOutput output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiVirtualNetworkDeleteVirtualNetworkService tapiVirtualNetworkDeleteVirtualNetworkService = (TapiVirtualNetworkDeleteVirtualNetworkService) o;
    return Objects.equals(this.output, tapiVirtualNetworkDeleteVirtualNetworkService.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkDeleteVirtualNetworkService {\n");
    
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
