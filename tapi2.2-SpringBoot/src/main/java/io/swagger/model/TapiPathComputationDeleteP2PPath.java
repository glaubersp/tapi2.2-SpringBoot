package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPathComputationDeletep2ppathOutput;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPathComputationDeleteP2PPath
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPathComputationDeleteP2PPath   {
  @JsonProperty("output")
  private TapiPathComputationDeletep2ppathOutput output = null;

  public TapiPathComputationDeleteP2PPath output(TapiPathComputationDeletep2ppathOutput output) {
    this.output = output;
    return this;
  }

  /**
   * Get output
   * @return output
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPathComputationDeletep2ppathOutput getOutput() {
    return output;
  }

  public void setOutput(TapiPathComputationDeletep2ppathOutput output) {
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
    TapiPathComputationDeleteP2PPath tapiPathComputationDeleteP2PPath = (TapiPathComputationDeleteP2PPath) o;
    return Objects.equals(this.output, tapiPathComputationDeleteP2PPath.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPathComputationDeleteP2PPath {\n");
    
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
