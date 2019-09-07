package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiTopologyNode;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyGetnodedetailsOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiTopologyGetnodedetailsOutput   {
  @JsonProperty("node")
  private TapiTopologyNode node = null;

  public TapiTopologyGetnodedetailsOutput node(TapiTopologyNode node) {
    this.node = node;
    return this;
  }

  /**
   * Get node
   * @return node
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyNode getNode() {
    return node;
  }

  public void setNode(TapiTopologyNode node) {
    this.node = node;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyGetnodedetailsOutput tapiTopologyGetnodedetailsOutput = (TapiTopologyGetnodedetailsOutput) o;
    return Objects.equals(this.node, tapiTopologyGetnodedetailsOutput.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(node);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyGetnodedetailsOutput {\n");
    
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
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
