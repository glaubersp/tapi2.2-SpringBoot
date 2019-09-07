package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiTopologyTopology;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyGettopologydetailsOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiTopologyGettopologydetailsOutput   {
  @JsonProperty("topology")
  private TapiTopologyTopology topology = null;

  public TapiTopologyGettopologydetailsOutput topology(TapiTopologyTopology topology) {
    this.topology = topology;
    return this;
  }

  /**
   * Get topology
   * @return topology
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyTopology getTopology() {
    return topology;
  }

  public void setTopology(TapiTopologyTopology topology) {
    this.topology = topology;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyGettopologydetailsOutput tapiTopologyGettopologydetailsOutput = (TapiTopologyGettopologydetailsOutput) o;
    return Objects.equals(this.topology, tapiTopologyGettopologydetailsOutput.topology);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topology);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyGettopologydetailsOutput {\n");
    
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
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
