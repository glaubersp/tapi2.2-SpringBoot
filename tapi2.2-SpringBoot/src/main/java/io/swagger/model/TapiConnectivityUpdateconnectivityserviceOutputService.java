package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonForwardingDirection;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiConnectivityConnectionRef;
import io.swagger.model.TapiConnectivityConnectivityConstraint;
import io.swagger.model.TapiConnectivityCreateconnectivityserviceInputEndPoint;
import io.swagger.model.TapiConnectivityResilienceConstraint;
import io.swagger.model.TapiEthEthConnectivityService;
import io.swagger.model.TapiPathComputationRoutingConstraint;
import io.swagger.model.TapiPathComputationTopologyConstraint;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityUpdateconnectivityserviceOutputService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiConnectivityUpdateconnectivityserviceOutputService extends TapiCommonGlobalClass  {
  @JsonProperty("administrative-state")
  private TapiCommonAdministrativeState administrativeState = null;

  @JsonProperty("connection")
  @Valid
  private List<TapiConnectivityConnectionRef> connection = null;

  @JsonProperty("connectivity-constraint")
  private TapiConnectivityConnectivityConstraint connectivityConstraint = null;

  @JsonProperty("direction")
  private TapiCommonForwardingDirection direction = null;

  @JsonProperty("end-point")
  @Valid
  private List<TapiConnectivityCreateconnectivityserviceInputEndPoint> endPoint = null;

  @JsonProperty("eth-connectivity-service")
  private TapiEthEthConnectivityService ethConnectivityService = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("resilience-constraint")
  private TapiConnectivityResilienceConstraint resilienceConstraint = null;

  @JsonProperty("routing-constraint")
  private TapiPathComputationRoutingConstraint routingConstraint = null;

  @JsonProperty("topology-constraint")
  @Valid
  private List<TapiPathComputationTopologyConstraint> topologyConstraint = null;

  public TapiConnectivityUpdateconnectivityserviceOutputService administrativeState(TapiCommonAdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
    return this;
  }

  /**
   * Get administrativeState
   * @return administrativeState
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonAdministrativeState getAdministrativeState() {
    return administrativeState;
  }

  public void setAdministrativeState(TapiCommonAdministrativeState administrativeState) {
    this.administrativeState = administrativeState;
  }

  public TapiConnectivityUpdateconnectivityserviceOutputService connection(List<TapiConnectivityConnectionRef> connection) {
    this.connection = connection;
    return this;
  }

  public TapiConnectivityUpdateconnectivityserviceOutputService addConnectionItem(TapiConnectivityConnectionRef connectionItem) {
    if (this.connection == null) {
      this.connection = new ArrayList<>();
    }
    this.connection.add(connectionItem);
    return this;
  }

  /**
   * none
   * @return connection
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivityConnectionRef> getConnection() {
    return connection;
  }

  public void setConnection(List<TapiConnectivityConnectionRef> connection) {
    this.connection = connection;
  }

  public TapiConnectivityUpdateconnectivityserviceOutputService connectivityConstraint(TapiConnectivityConnectivityConstraint connectivityConstraint) {
    this.connectivityConstraint = connectivityConstraint;
    return this;
  }

  /**
   * Get connectivityConstraint
   * @return connectivityConstraint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityConnectivityConstraint getConnectivityConstraint() {
    return connectivityConstraint;
  }

  public void setConnectivityConstraint(TapiConnectivityConnectivityConstraint connectivityConstraint) {
    this.connectivityConstraint = connectivityConstraint;
  }

  public TapiConnectivityUpdateconnectivityserviceOutputService direction(TapiCommonForwardingDirection direction) {
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

  public TapiConnectivityUpdateconnectivityserviceOutputService endPoint(List<TapiConnectivityCreateconnectivityserviceInputEndPoint> endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  public TapiConnectivityUpdateconnectivityserviceOutputService addEndPointItem(TapiConnectivityCreateconnectivityserviceInputEndPoint endPointItem) {
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
  public List<TapiConnectivityCreateconnectivityserviceInputEndPoint> getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(List<TapiConnectivityCreateconnectivityserviceInputEndPoint> endPoint) {
    this.endPoint = endPoint;
  }

  public TapiConnectivityUpdateconnectivityserviceOutputService ethConnectivityService(TapiEthEthConnectivityService ethConnectivityService) {
    this.ethConnectivityService = ethConnectivityService;
    return this;
  }

  /**
   * Get ethConnectivityService
   * @return ethConnectivityService
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthConnectivityService getEthConnectivityService() {
    return ethConnectivityService;
  }

  public void setEthConnectivityService(TapiEthEthConnectivityService ethConnectivityService) {
    this.ethConnectivityService = ethConnectivityService;
  }

  public TapiConnectivityUpdateconnectivityserviceOutputService layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
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

  public TapiConnectivityUpdateconnectivityserviceOutputService lifecycleState(TapiCommonLifecycleState lifecycleState) {
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

  public TapiConnectivityUpdateconnectivityserviceOutputService operationalState(TapiCommonOperationalState operationalState) {
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

  public TapiConnectivityUpdateconnectivityserviceOutputService resilienceConstraint(TapiConnectivityResilienceConstraint resilienceConstraint) {
    this.resilienceConstraint = resilienceConstraint;
    return this;
  }

  /**
   * Get resilienceConstraint
   * @return resilienceConstraint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityResilienceConstraint getResilienceConstraint() {
    return resilienceConstraint;
  }

  public void setResilienceConstraint(TapiConnectivityResilienceConstraint resilienceConstraint) {
    this.resilienceConstraint = resilienceConstraint;
  }

  public TapiConnectivityUpdateconnectivityserviceOutputService routingConstraint(TapiPathComputationRoutingConstraint routingConstraint) {
    this.routingConstraint = routingConstraint;
    return this;
  }

  /**
   * Get routingConstraint
   * @return routingConstraint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPathComputationRoutingConstraint getRoutingConstraint() {
    return routingConstraint;
  }

  public void setRoutingConstraint(TapiPathComputationRoutingConstraint routingConstraint) {
    this.routingConstraint = routingConstraint;
  }

  public TapiConnectivityUpdateconnectivityserviceOutputService topologyConstraint(List<TapiPathComputationTopologyConstraint> topologyConstraint) {
    this.topologyConstraint = topologyConstraint;
    return this;
  }

  public TapiConnectivityUpdateconnectivityserviceOutputService addTopologyConstraintItem(TapiPathComputationTopologyConstraint topologyConstraintItem) {
    if (this.topologyConstraint == null) {
      this.topologyConstraint = new ArrayList<>();
    }
    this.topologyConstraint.add(topologyConstraintItem);
    return this;
  }

  /**
   * none
   * @return topologyConstraint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiPathComputationTopologyConstraint> getTopologyConstraint() {
    return topologyConstraint;
  }

  public void setTopologyConstraint(List<TapiPathComputationTopologyConstraint> topologyConstraint) {
    this.topologyConstraint = topologyConstraint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityUpdateconnectivityserviceOutputService tapiConnectivityUpdateconnectivityserviceOutputService = (TapiConnectivityUpdateconnectivityserviceOutputService) o;
    return Objects.equals(this.administrativeState, tapiConnectivityUpdateconnectivityserviceOutputService.administrativeState) &&
        Objects.equals(this.connection, tapiConnectivityUpdateconnectivityserviceOutputService.connection) &&
        Objects.equals(this.connectivityConstraint, tapiConnectivityUpdateconnectivityserviceOutputService.connectivityConstraint) &&
        Objects.equals(this.direction, tapiConnectivityUpdateconnectivityserviceOutputService.direction) &&
        Objects.equals(this.endPoint, tapiConnectivityUpdateconnectivityserviceOutputService.endPoint) &&
        Objects.equals(this.ethConnectivityService, tapiConnectivityUpdateconnectivityserviceOutputService.ethConnectivityService) &&
        Objects.equals(this.layerProtocolName, tapiConnectivityUpdateconnectivityserviceOutputService.layerProtocolName) &&
        Objects.equals(this.lifecycleState, tapiConnectivityUpdateconnectivityserviceOutputService.lifecycleState) &&
        Objects.equals(this.operationalState, tapiConnectivityUpdateconnectivityserviceOutputService.operationalState) &&
        Objects.equals(this.resilienceConstraint, tapiConnectivityUpdateconnectivityserviceOutputService.resilienceConstraint) &&
        Objects.equals(this.routingConstraint, tapiConnectivityUpdateconnectivityserviceOutputService.routingConstraint) &&
        Objects.equals(this.topologyConstraint, tapiConnectivityUpdateconnectivityserviceOutputService.topologyConstraint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrativeState, connection, connectivityConstraint, direction, endPoint, ethConnectivityService, layerProtocolName, lifecycleState, operationalState, resilienceConstraint, routingConstraint, topologyConstraint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityUpdateconnectivityserviceOutputService {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    administrativeState: ").append(toIndentedString(administrativeState)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    connectivityConstraint: ").append(toIndentedString(connectivityConstraint)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
    sb.append("    ethConnectivityService: ").append(toIndentedString(ethConnectivityService)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    resilienceConstraint: ").append(toIndentedString(resilienceConstraint)).append("\n");
    sb.append("    routingConstraint: ").append(toIndentedString(routingConstraint)).append("\n");
    sb.append("    topologyConstraint: ").append(toIndentedString(topologyConstraint)).append("\n");
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
