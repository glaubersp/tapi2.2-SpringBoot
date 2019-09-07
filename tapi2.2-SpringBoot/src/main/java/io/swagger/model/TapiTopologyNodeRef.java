package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiTopologyTopologyRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyNodeRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiTopologyNodeRef extends TapiTopologyTopologyRef  {
  @JsonProperty("node-uuid")
  private String nodeUuid = null;

  public TapiTopologyNodeRef nodeUuid(String nodeUuid) {
    this.nodeUuid = nodeUuid;
    return this;
  }

  /**
   * none
   * @return nodeUuid
  **/
  @ApiModelProperty(value = "none")

  public String getNodeUuid() {
    return nodeUuid;
  }

  public void setNodeUuid(String nodeUuid) {
    this.nodeUuid = nodeUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyNodeRef tapiTopologyNodeRef = (TapiTopologyNodeRef) o;
    return Objects.equals(this.nodeUuid, tapiTopologyNodeRef.nodeUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeUuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyNodeRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    nodeUuid: ").append(toIndentedString(nodeUuid)).append("\n");
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
