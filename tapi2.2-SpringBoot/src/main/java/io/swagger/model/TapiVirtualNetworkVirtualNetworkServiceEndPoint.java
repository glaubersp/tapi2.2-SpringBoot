package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * TapiVirtualNetworkVirtualNetworkServiceEndPoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiVirtualNetworkVirtualNetworkServiceEndPoint extends TapiCommonLocalClass  {
  @JsonProperty("direction")
  private TapiCommonPortDirection direction = null;

  @JsonProperty("role")
  private TapiCommonPortRole role = null;

  @JsonProperty("service-interface-point")
  private TapiCommonServiceInterfacePointRef serviceInterfacePoint = null;

  @JsonProperty("service-layer")
  private TapiCommonLayerProtocolName serviceLayer = null;

  public TapiVirtualNetworkVirtualNetworkServiceEndPoint direction(TapiCommonPortDirection direction) {
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

  public TapiVirtualNetworkVirtualNetworkServiceEndPoint role(TapiCommonPortRole role) {
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

  public TapiVirtualNetworkVirtualNetworkServiceEndPoint serviceInterfacePoint(TapiCommonServiceInterfacePointRef serviceInterfacePoint) {
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

  public TapiVirtualNetworkVirtualNetworkServiceEndPoint serviceLayer(TapiCommonLayerProtocolName serviceLayer) {
    this.serviceLayer = serviceLayer;
    return this;
  }

  /**
   * Get serviceLayer
   * @return serviceLayer
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonLayerProtocolName getServiceLayer() {
    return serviceLayer;
  }

  public void setServiceLayer(TapiCommonLayerProtocolName serviceLayer) {
    this.serviceLayer = serviceLayer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiVirtualNetworkVirtualNetworkServiceEndPoint tapiVirtualNetworkVirtualNetworkServiceEndPoint = (TapiVirtualNetworkVirtualNetworkServiceEndPoint) o;
    return Objects.equals(this.direction, tapiVirtualNetworkVirtualNetworkServiceEndPoint.direction) &&
        Objects.equals(this.role, tapiVirtualNetworkVirtualNetworkServiceEndPoint.role) &&
        Objects.equals(this.serviceInterfacePoint, tapiVirtualNetworkVirtualNetworkServiceEndPoint.serviceInterfacePoint) &&
        Objects.equals(this.serviceLayer, tapiVirtualNetworkVirtualNetworkServiceEndPoint.serviceLayer) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, role, serviceInterfacePoint, serviceLayer, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkVirtualNetworkServiceEndPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    serviceInterfacePoint: ").append(toIndentedString(serviceInterfacePoint)).append("\n");
    sb.append("    serviceLayer: ").append(toIndentedString(serviceLayer)).append("\n");
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
