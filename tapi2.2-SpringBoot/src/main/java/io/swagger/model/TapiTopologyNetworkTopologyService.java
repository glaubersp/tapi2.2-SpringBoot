package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiTopologyTopologyRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiTopologyNetworkTopologyService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiTopologyNetworkTopologyService extends TapiCommonGlobalClass  {
  @JsonProperty("topology")
  @Valid
  private List<TapiTopologyTopologyRef> topology = null;

  public TapiTopologyNetworkTopologyService topology(List<TapiTopologyTopologyRef> topology) {
    this.topology = topology;
    return this;
  }

  public TapiTopologyNetworkTopologyService addTopologyItem(TapiTopologyTopologyRef topologyItem) {
    if (this.topology == null) {
      this.topology = new ArrayList<TapiTopologyTopologyRef>();
    }
    this.topology.add(topologyItem);
    return this;
  }

  /**
   * none
   * @return topology
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyTopologyRef> getTopology() {
    return topology;
  }

  public void setTopology(List<TapiTopologyTopologyRef> topology) {
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
    TapiTopologyNetworkTopologyService tapiTopologyNetworkTopologyService = (TapiTopologyNetworkTopologyService) o;
    return Objects.equals(this.topology, tapiTopologyNetworkTopologyService.topology) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topology, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyNetworkTopologyService {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
