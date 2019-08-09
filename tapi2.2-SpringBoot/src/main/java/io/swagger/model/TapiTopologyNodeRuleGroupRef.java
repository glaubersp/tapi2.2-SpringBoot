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
 * TapiTopologyNodeRuleGroupRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiTopologyNodeRuleGroupRef extends TapiTopologyNodeRef  {
  @JsonProperty("node-rule-group-uuid")
  private String nodeRuleGroupUuid = null;

  public TapiTopologyNodeRuleGroupRef nodeRuleGroupUuid(String nodeRuleGroupUuid) {
    this.nodeRuleGroupUuid = nodeRuleGroupUuid;
    return this;
  }

  /**
   * none
   * @return nodeRuleGroupUuid
  **/
  @ApiModelProperty(value = "none")

  public String getNodeRuleGroupUuid() {
    return nodeRuleGroupUuid;
  }

  public void setNodeRuleGroupUuid(String nodeRuleGroupUuid) {
    this.nodeRuleGroupUuid = nodeRuleGroupUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyNodeRuleGroupRef tapiTopologyNodeRuleGroupRef = (TapiTopologyNodeRuleGroupRef) o;
    return Objects.equals(this.nodeRuleGroupUuid, tapiTopologyNodeRuleGroupRef.nodeRuleGroupUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeRuleGroupUuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyNodeRuleGroupRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    nodeRuleGroupUuid: ").append(toIndentedString(nodeRuleGroupUuid)).append("\n");
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
