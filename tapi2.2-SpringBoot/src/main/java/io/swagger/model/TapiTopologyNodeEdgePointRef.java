package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiTopologyNodeRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyNodeEdgePointRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiTopologyNodeEdgePointRef extends TapiTopologyNodeRef  {
  @JsonProperty("node-edge-point-uuid")
  private String nodeEdgePointUuid = null;

  public TapiTopologyNodeEdgePointRef nodeEdgePointUuid(String nodeEdgePointUuid) {
    this.nodeEdgePointUuid = nodeEdgePointUuid;
    return this;
  }

  /**
   * none
   * @return nodeEdgePointUuid
  **/
  @ApiModelProperty(value = "none")

  public String getNodeEdgePointUuid() {
    return nodeEdgePointUuid;
  }

  public void setNodeEdgePointUuid(String nodeEdgePointUuid) {
    this.nodeEdgePointUuid = nodeEdgePointUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyNodeEdgePointRef tapiTopologyNodeEdgePointRef = (TapiTopologyNodeEdgePointRef) o;
    return Objects.equals(this.nodeEdgePointUuid, tapiTopologyNodeEdgePointRef.nodeEdgePointUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeEdgePointUuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyNodeEdgePointRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    nodeEdgePointUuid: ").append(toIndentedString(nodeEdgePointUuid)).append("\n");
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
