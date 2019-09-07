package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonForwardingDirection;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiConnectivityConnectionEndPointRef;
import io.swagger.model.TapiConnectivityConnectionRef;
import io.swagger.model.TapiConnectivityRoute;
import io.swagger.model.TapiConnectivitySwitchControl;
import io.swagger.model.TapiTopologyLinkRef;
import io.swagger.model.TapiTopologyNodeRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityConnection
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiConnectivityConnection extends TapiCommonGlobalClass  {
  @JsonProperty("bounding-node")
  private TapiTopologyNodeRef boundingNode = null;

  @JsonProperty("connection-end-point")
  @Valid
  private List<TapiConnectivityConnectionEndPointRef> connectionEndPoint = null;

  @JsonProperty("direction")
  private TapiCommonForwardingDirection direction = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("lower-connection")
  @Valid
  private List<TapiConnectivityConnectionRef> lowerConnection = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("route")
  @Valid
  private List<TapiConnectivityRoute> route = null;

  @JsonProperty("supported-client-link")
  @Valid
  private List<TapiTopologyLinkRef> supportedClientLink = null;

  @JsonProperty("switch-control")
  @Valid
  private List<TapiConnectivitySwitchControl> switchControl = null;

  public TapiConnectivityConnection boundingNode(TapiTopologyNodeRef boundingNode) {
    this.boundingNode = boundingNode;
    return this;
  }

  /**
   * Get boundingNode
   * @return boundingNode
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyNodeRef getBoundingNode() {
    return boundingNode;
  }

  public void setBoundingNode(TapiTopologyNodeRef boundingNode) {
    this.boundingNode = boundingNode;
  }

  public TapiConnectivityConnection connectionEndPoint(List<TapiConnectivityConnectionEndPointRef> connectionEndPoint) {
    this.connectionEndPoint = connectionEndPoint;
    return this;
  }

  public TapiConnectivityConnection addConnectionEndPointItem(TapiConnectivityConnectionEndPointRef connectionEndPointItem) {
    if (this.connectionEndPoint == null) {
      this.connectionEndPoint = new ArrayList<>();
    }
    this.connectionEndPoint.add(connectionEndPointItem);
    return this;
  }

  /**
   * none
   * @return connectionEndPoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivityConnectionEndPointRef> getConnectionEndPoint() {
    return connectionEndPoint;
  }

  public void setConnectionEndPoint(List<TapiConnectivityConnectionEndPointRef> connectionEndPoint) {
    this.connectionEndPoint = connectionEndPoint;
  }

  public TapiConnectivityConnection direction(TapiCommonForwardingDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonForwardingDirection getDirection() {
    return direction;
  }

  public void setDirection(TapiCommonForwardingDirection direction) {
    this.direction = direction;
  }

  public TapiConnectivityConnection layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  /**
   * Get layerProtocolName
   * @return layerProtocolName
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonLayerProtocolName getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public TapiConnectivityConnection lifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * Get lifecycleState
   * @return lifecycleState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonLifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public void setLifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
  }

  public TapiConnectivityConnection lowerConnection(List<TapiConnectivityConnectionRef> lowerConnection) {
    this.lowerConnection = lowerConnection;
    return this;
  }

  public TapiConnectivityConnection addLowerConnectionItem(TapiConnectivityConnectionRef lowerConnectionItem) {
    if (this.lowerConnection == null) {
      this.lowerConnection = new ArrayList<>();
    }
    this.lowerConnection.add(lowerConnectionItem);
    return this;
  }

  /**
   * An Connection object supports a recursive aggregation relationship such that the internal construction of an Connection can be exposed as multiple lower level Connection objects (partitioning).                  Aggregation is used as for the Node/Topology  to allow changes in hierarchy.                   Connection aggregation reflects Node/Topology aggregation.                   The FC represents a Cross-Connection in an NE. The Cross-Connection in an NE is not necessarily the lowest level of FC partitioning.
   * @return lowerConnection
  **/
  @ApiModelProperty(value = "An Connection object supports a recursive aggregation relationship such that the internal construction of an Connection can be exposed as multiple lower level Connection objects (partitioning).                  Aggregation is used as for the Node/Topology  to allow changes in hierarchy.                   Connection aggregation reflects Node/Topology aggregation.                   The FC represents a Cross-Connection in an NE. The Cross-Connection in an NE is not necessarily the lowest level of FC partitioning.")
  @Valid
  public List<TapiConnectivityConnectionRef> getLowerConnection() {
    return lowerConnection;
  }

  public void setLowerConnection(List<TapiConnectivityConnectionRef> lowerConnection) {
    this.lowerConnection = lowerConnection;
  }

  public TapiConnectivityConnection operationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
    return this;
  }

  /**
   * Get operationalState
   * @return operationalState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonOperationalState getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
  }

  public TapiConnectivityConnection route(List<TapiConnectivityRoute> route) {
    this.route = route;
    return this;
  }

  public TapiConnectivityConnection addRouteItem(TapiConnectivityRoute routeItem) {
    if (this.route == null) {
      this.route = new ArrayList<>();
    }
    this.route.add(routeItem);
    return this;
  }

  /**
   * none
   * @return route
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivityRoute> getRoute() {
    return route;
  }

  public void setRoute(List<TapiConnectivityRoute> route) {
    this.route = route;
  }

  public TapiConnectivityConnection supportedClientLink(List<TapiTopologyLinkRef> supportedClientLink) {
    this.supportedClientLink = supportedClientLink;
    return this;
  }

  public TapiConnectivityConnection addSupportedClientLinkItem(TapiTopologyLinkRef supportedClientLinkItem) {
    if (this.supportedClientLink == null) {
      this.supportedClientLink = new ArrayList<>();
    }
    this.supportedClientLink.add(supportedClientLinkItem);
    return this;
  }

  /**
   * none
   * @return supportedClientLink
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiTopologyLinkRef> getSupportedClientLink() {
    return supportedClientLink;
  }

  public void setSupportedClientLink(List<TapiTopologyLinkRef> supportedClientLink) {
    this.supportedClientLink = supportedClientLink;
  }

  public TapiConnectivityConnection switchControl(List<TapiConnectivitySwitchControl> switchControl) {
    this.switchControl = switchControl;
    return this;
  }

  public TapiConnectivityConnection addSwitchControlItem(TapiConnectivitySwitchControl switchControlItem) {
    if (this.switchControl == null) {
      this.switchControl = new ArrayList<>();
    }
    this.switchControl.add(switchControlItem);
    return this;
  }

  /**
   * none
   * @return switchControl
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivitySwitchControl> getSwitchControl() {
    return switchControl;
  }

  public void setSwitchControl(List<TapiConnectivitySwitchControl> switchControl) {
    this.switchControl = switchControl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityConnection tapiConnectivityConnection = (TapiConnectivityConnection) o;
    return Objects.equals(this.boundingNode, tapiConnectivityConnection.boundingNode) &&
        Objects.equals(this.connectionEndPoint, tapiConnectivityConnection.connectionEndPoint) &&
        Objects.equals(this.direction, tapiConnectivityConnection.direction) &&
        Objects.equals(this.layerProtocolName, tapiConnectivityConnection.layerProtocolName) &&
        Objects.equals(this.lifecycleState, tapiConnectivityConnection.lifecycleState) &&
        Objects.equals(this.lowerConnection, tapiConnectivityConnection.lowerConnection) &&
        Objects.equals(this.operationalState, tapiConnectivityConnection.operationalState) &&
        Objects.equals(this.route, tapiConnectivityConnection.route) &&
        Objects.equals(this.supportedClientLink, tapiConnectivityConnection.supportedClientLink) &&
        Objects.equals(this.switchControl, tapiConnectivityConnection.switchControl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundingNode, connectionEndPoint, direction, layerProtocolName, lifecycleState, lowerConnection, operationalState, route, supportedClientLink, switchControl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityConnection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    boundingNode: ").append(toIndentedString(boundingNode)).append("\n");
    sb.append("    connectionEndPoint: ").append(toIndentedString(connectionEndPoint)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    lowerConnection: ").append(toIndentedString(lowerConnection)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    supportedClientLink: ").append(toIndentedString(supportedClientLink)).append("\n");
    sb.append("    switchControl: ").append(toIndentedString(switchControl)).append("\n");
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
