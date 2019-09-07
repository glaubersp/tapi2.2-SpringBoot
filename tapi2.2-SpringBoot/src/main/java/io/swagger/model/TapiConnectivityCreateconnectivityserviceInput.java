package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiConnectivityConnectivityConstraint;
import io.swagger.model.TapiConnectivityCreateconnectivityserviceInputEndPoint;
import io.swagger.model.TapiConnectivityResilienceConstraint;
import io.swagger.model.TapiPathComputationRoutingConstraint;
import io.swagger.model.TapiPathComputationTopologyConstraint;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityCreateconnectivityserviceInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiConnectivityCreateconnectivityserviceInput   {
  @JsonProperty("connectivity-constraint")
  private TapiConnectivityConnectivityConstraint connectivityConstraint = null;

  @JsonProperty("end-point")
  @Valid
  private List<TapiConnectivityCreateconnectivityserviceInputEndPoint> endPoint = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("name")
  @Valid
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("resilience-constraint")
  private TapiConnectivityResilienceConstraint resilienceConstraint = null;

  @JsonProperty("routing-constraint")
  private TapiPathComputationRoutingConstraint routingConstraint = null;

  @JsonProperty("state")
  private TapiCommonAdministrativeState state = null;

  @JsonProperty("topology-constraint")
  @Valid
  private List<TapiPathComputationTopologyConstraint> topologyConstraint = null;

  @JsonProperty("uuid")
  private String uuid = null;

  public TapiConnectivityCreateconnectivityserviceInput connectivityConstraint(TapiConnectivityConnectivityConstraint connectivityConstraint) {
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

  public TapiConnectivityCreateconnectivityserviceInput endPoint(List<TapiConnectivityCreateconnectivityserviceInputEndPoint> endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  public TapiConnectivityCreateconnectivityserviceInput addEndPointItem(TapiConnectivityCreateconnectivityserviceInputEndPoint endPointItem) {
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

  public TapiConnectivityCreateconnectivityserviceInput layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
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

  public TapiConnectivityCreateconnectivityserviceInput name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiConnectivityCreateconnectivityserviceInput addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. This value is unique in some namespace but may change during the life of the entity.                      A name carries no semantics with respect to the purpose of the entity.
   * @return name
  **/
  @ApiModelProperty(value = "List of names. This value is unique in some namespace but may change during the life of the entity.                      A name carries no semantics with respect to the purpose of the entity.")
  @Valid
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiConnectivityCreateconnectivityserviceInput resilienceConstraint(TapiConnectivityResilienceConstraint resilienceConstraint) {
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

  public TapiConnectivityCreateconnectivityserviceInput routingConstraint(TapiPathComputationRoutingConstraint routingConstraint) {
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

  public TapiConnectivityCreateconnectivityserviceInput state(TapiCommonAdministrativeState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonAdministrativeState getState() {
    return state;
  }

  public void setState(TapiCommonAdministrativeState state) {
    this.state = state;
  }

  public TapiConnectivityCreateconnectivityserviceInput topologyConstraint(List<TapiPathComputationTopologyConstraint> topologyConstraint) {
    this.topologyConstraint = topologyConstraint;
    return this;
  }

  public TapiConnectivityCreateconnectivityserviceInput addTopologyConstraintItem(TapiPathComputationTopologyConstraint topologyConstraintItem) {
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

  public TapiConnectivityCreateconnectivityserviceInput uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable.                      An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityCreateconnectivityserviceInput tapiConnectivityCreateconnectivityserviceInput = (TapiConnectivityCreateconnectivityserviceInput) o;
    return Objects.equals(this.connectivityConstraint, tapiConnectivityCreateconnectivityserviceInput.connectivityConstraint) &&
        Objects.equals(this.endPoint, tapiConnectivityCreateconnectivityserviceInput.endPoint) &&
        Objects.equals(this.layerProtocolName, tapiConnectivityCreateconnectivityserviceInput.layerProtocolName) &&
        Objects.equals(this.name, tapiConnectivityCreateconnectivityserviceInput.name) &&
        Objects.equals(this.resilienceConstraint, tapiConnectivityCreateconnectivityserviceInput.resilienceConstraint) &&
        Objects.equals(this.routingConstraint, tapiConnectivityCreateconnectivityserviceInput.routingConstraint) &&
        Objects.equals(this.state, tapiConnectivityCreateconnectivityserviceInput.state) &&
        Objects.equals(this.topologyConstraint, tapiConnectivityCreateconnectivityserviceInput.topologyConstraint) &&
        Objects.equals(this.uuid, tapiConnectivityCreateconnectivityserviceInput.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityConstraint, endPoint, layerProtocolName, name, resilienceConstraint, routingConstraint, state, topologyConstraint, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityCreateconnectivityserviceInput {\n");
    
    sb.append("    connectivityConstraint: ").append(toIndentedString(connectivityConstraint)).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resilienceConstraint: ").append(toIndentedString(resilienceConstraint)).append("\n");
    sb.append("    routingConstraint: ").append(toIndentedString(routingConstraint)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    topologyConstraint: ").append(toIndentedString(topologyConstraint)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
