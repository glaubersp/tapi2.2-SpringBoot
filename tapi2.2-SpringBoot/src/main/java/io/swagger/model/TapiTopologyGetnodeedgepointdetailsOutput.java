package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyGetnodeedgepointdetailsOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiTopologyGetnodeedgepointdetailsOutput   {
  @JsonProperty("node-edge-point")
  private TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint nodeEdgePoint = null;

  public TapiTopologyGetnodeedgepointdetailsOutput nodeEdgePoint(TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint nodeEdgePoint) {
    this.nodeEdgePoint = nodeEdgePoint;
    return this;
  }

  /**
   * Get nodeEdgePoint
   * @return nodeEdgePoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint getNodeEdgePoint() {
    return nodeEdgePoint;
  }

  public void setNodeEdgePoint(TapiTopologyGetnodeedgepointdetailsOutputNodeEdgePoint nodeEdgePoint) {
    this.nodeEdgePoint = nodeEdgePoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyGetnodeedgepointdetailsOutput tapiTopologyGetnodeedgepointdetailsOutput = (TapiTopologyGetnodeedgepointdetailsOutput) o;
    return Objects.equals(this.nodeEdgePoint, tapiTopologyGetnodeedgepointdetailsOutput.nodeEdgePoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeEdgePoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyGetnodeedgepointdetailsOutput {\n");
    
    sb.append("    nodeEdgePoint: ").append(toIndentedString(nodeEdgePoint)).append("\n");
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
