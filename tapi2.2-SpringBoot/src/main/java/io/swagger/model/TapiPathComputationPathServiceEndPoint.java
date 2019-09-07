package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonCapacity;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonPortDirection;
import io.swagger.model.TapiCommonPortRole;
import io.swagger.model.TapiCommonServiceInterfacePointRef;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPathComputationPathServiceEndPoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPathComputationPathServiceEndPoint extends TapiCommonLocalClass  {
  @JsonProperty("capacity")
  private TapiCommonCapacity capacity = null;

  @JsonProperty("direction")
  private TapiCommonPortDirection direction = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("layer-protocol-qualifier")
  private String layerProtocolQualifier = null;

  @JsonProperty("role")
  private TapiCommonPortRole role = null;

  @JsonProperty("service-interface-point")
  private TapiCommonServiceInterfacePointRef serviceInterfacePoint = null;

  public TapiPathComputationPathServiceEndPoint capacity(TapiCommonCapacity capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * Get capacity
   * @return capacity
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonCapacity getCapacity() {
    return capacity;
  }

  public void setCapacity(TapiCommonCapacity capacity) {
    this.capacity = capacity;
  }

  public TapiPathComputationPathServiceEndPoint direction(TapiCommonPortDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonPortDirection getDirection() {
    return direction;
  }

  public void setDirection(TapiCommonPortDirection direction) {
    this.direction = direction;
  }

  public TapiPathComputationPathServiceEndPoint layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
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

  public TapiPathComputationPathServiceEndPoint layerProtocolQualifier(String layerProtocolQualifier) {
    this.layerProtocolQualifier = layerProtocolQualifier;
    return this;
  }

  /**
   * none
   * @return layerProtocolQualifier
  **/
  @ApiModelProperty(value = "none")

  public String getLayerProtocolQualifier() {
    return layerProtocolQualifier;
  }

  public void setLayerProtocolQualifier(String layerProtocolQualifier) {
    this.layerProtocolQualifier = layerProtocolQualifier;
  }

  public TapiPathComputationPathServiceEndPoint role(TapiCommonPortRole role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonPortRole getRole() {
    return role;
  }

  public void setRole(TapiCommonPortRole role) {
    this.role = role;
  }

  public TapiPathComputationPathServiceEndPoint serviceInterfacePoint(TapiCommonServiceInterfacePointRef serviceInterfacePoint) {
    this.serviceInterfacePoint = serviceInterfacePoint;
    return this;
  }

  /**
   * Get serviceInterfacePoint
   * @return serviceInterfacePoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonServiceInterfacePointRef getServiceInterfacePoint() {
    return serviceInterfacePoint;
  }

  public void setServiceInterfacePoint(TapiCommonServiceInterfacePointRef serviceInterfacePoint) {
    this.serviceInterfacePoint = serviceInterfacePoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPathComputationPathServiceEndPoint tapiPathComputationPathServiceEndPoint = (TapiPathComputationPathServiceEndPoint) o;
    return Objects.equals(this.capacity, tapiPathComputationPathServiceEndPoint.capacity) &&
        Objects.equals(this.direction, tapiPathComputationPathServiceEndPoint.direction) &&
        Objects.equals(this.layerProtocolName, tapiPathComputationPathServiceEndPoint.layerProtocolName) &&
        Objects.equals(this.layerProtocolQualifier, tapiPathComputationPathServiceEndPoint.layerProtocolQualifier) &&
        Objects.equals(this.role, tapiPathComputationPathServiceEndPoint.role) &&
        Objects.equals(this.serviceInterfacePoint, tapiPathComputationPathServiceEndPoint.serviceInterfacePoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, direction, layerProtocolName, layerProtocolQualifier, role, serviceInterfacePoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPathComputationPathServiceEndPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    layerProtocolQualifier: ").append(toIndentedString(layerProtocolQualifier)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    serviceInterfacePoint: ").append(toIndentedString(serviceInterfacePoint)).append("\n");
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
