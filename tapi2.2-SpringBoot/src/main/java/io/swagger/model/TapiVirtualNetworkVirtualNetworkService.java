package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdminStatePac;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonTimeRange;
import io.swagger.model.TapiTopologyTopologyRef;
import io.swagger.model.TapiVirtualNetworkVirtualNetworkConstraint;
import io.swagger.model.TapiVirtualNetworkVirtualNetworkServiceEndPoint;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiVirtualNetworkVirtualNetworkService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiVirtualNetworkVirtualNetworkService extends TapiCommonGlobalClass  {
  @JsonProperty("end-point")
  @Valid
  private List<TapiVirtualNetworkVirtualNetworkServiceEndPoint> endPoint = null;

  @JsonProperty("layer-protocol-name")
  @Valid
  private List<TapiCommonLayerProtocolName> layerProtocolName = null;

  @JsonProperty("schedule")
  private TapiCommonTimeRange schedule = null;

  @JsonProperty("state")
  private TapiCommonAdminStatePac state = null;

  @JsonProperty("topology")
  private TapiTopologyTopologyRef topology = null;

  @JsonProperty("vnw-constraint")
  @Valid
  private List<TapiVirtualNetworkVirtualNetworkConstraint> vnwConstraint = null;

  public TapiVirtualNetworkVirtualNetworkService endPoint(List<TapiVirtualNetworkVirtualNetworkServiceEndPoint> endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  public TapiVirtualNetworkVirtualNetworkService addEndPointItem(TapiVirtualNetworkVirtualNetworkServiceEndPoint endPointItem) {
    if (this.endPoint == null) {
      this.endPoint = new ArrayList<>();
    }
    this.endPoint.add(endPointItem);
    return this;
  }

  /**
   * none
   * @return endPoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiVirtualNetworkVirtualNetworkServiceEndPoint> getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(List<TapiVirtualNetworkVirtualNetworkServiceEndPoint> endPoint) {
    this.endPoint = endPoint;
  }

  public TapiVirtualNetworkVirtualNetworkService layerProtocolName(List<TapiCommonLayerProtocolName> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  public TapiVirtualNetworkVirtualNetworkService addLayerProtocolNameItem(TapiCommonLayerProtocolName layerProtocolNameItem) {
    if (this.layerProtocolName == null) {
      this.layerProtocolName = new ArrayList<>();
    }
    this.layerProtocolName.add(layerProtocolNameItem);
    return this;
  }

  /**
   * none
   * @return layerProtocolName
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiCommonLayerProtocolName> getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(List<TapiCommonLayerProtocolName> layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public TapiVirtualNetworkVirtualNetworkService schedule(TapiCommonTimeRange schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonTimeRange getSchedule() {
    return schedule;
  }

  public void setSchedule(TapiCommonTimeRange schedule) {
    this.schedule = schedule;
  }

  public TapiVirtualNetworkVirtualNetworkService state(TapiCommonAdminStatePac state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonAdminStatePac getState() {
    return state;
  }

  public void setState(TapiCommonAdminStatePac state) {
    this.state = state;
  }

  public TapiVirtualNetworkVirtualNetworkService topology(TapiTopologyTopologyRef topology) {
    this.topology = topology;
    return this;
  }

  /**
   * Get topology
   * @return topology
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyTopologyRef getTopology() {
    return topology;
  }

  public void setTopology(TapiTopologyTopologyRef topology) {
    this.topology = topology;
  }

  public TapiVirtualNetworkVirtualNetworkService vnwConstraint(List<TapiVirtualNetworkVirtualNetworkConstraint> vnwConstraint) {
    this.vnwConstraint = vnwConstraint;
    return this;
  }

  public TapiVirtualNetworkVirtualNetworkService addVnwConstraintItem(TapiVirtualNetworkVirtualNetworkConstraint vnwConstraintItem) {
    if (this.vnwConstraint == null) {
      this.vnwConstraint = new ArrayList<>();
    }
    this.vnwConstraint.add(vnwConstraintItem);
    return this;
  }

  /**
   * none
   * @return vnwConstraint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiVirtualNetworkVirtualNetworkConstraint> getVnwConstraint() {
    return vnwConstraint;
  }

  public void setVnwConstraint(List<TapiVirtualNetworkVirtualNetworkConstraint> vnwConstraint) {
    this.vnwConstraint = vnwConstraint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiVirtualNetworkVirtualNetworkService tapiVirtualNetworkVirtualNetworkService = (TapiVirtualNetworkVirtualNetworkService) o;
    return Objects.equals(this.endPoint, tapiVirtualNetworkVirtualNetworkService.endPoint) &&
        Objects.equals(this.layerProtocolName, tapiVirtualNetworkVirtualNetworkService.layerProtocolName) &&
        Objects.equals(this.schedule, tapiVirtualNetworkVirtualNetworkService.schedule) &&
        Objects.equals(this.state, tapiVirtualNetworkVirtualNetworkService.state) &&
        Objects.equals(this.topology, tapiVirtualNetworkVirtualNetworkService.topology) &&
        Objects.equals(this.vnwConstraint, tapiVirtualNetworkVirtualNetworkService.vnwConstraint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endPoint, layerProtocolName, schedule, state, topology, vnwConstraint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkVirtualNetworkService {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    vnwConstraint: ").append(toIndentedString(vnwConstraint)).append("\n");
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
