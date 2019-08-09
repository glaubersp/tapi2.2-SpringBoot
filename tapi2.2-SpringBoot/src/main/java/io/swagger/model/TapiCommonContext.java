package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonContextServiceInterfacePoint;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiConnectivityContextAugmentation5;
import io.swagger.model.TapiConnectivityContextConnectivityContext;
import io.swagger.model.TapiEquipmentContextAugmentation6;
import io.swagger.model.TapiEquipmentPhysicalContext;
import io.swagger.model.TapiNotificationContextAugmentation2;
import io.swagger.model.TapiNotificationContextNotificationContext;
import io.swagger.model.TapiOamContextAugmentation4;
import io.swagger.model.TapiOamContextOamContext;
import io.swagger.model.TapiPathComputationContextAugmentation1;
import io.swagger.model.TapiPathComputationPathComputationContext;
import io.swagger.model.TapiTopologyContextAugmentation7;
import io.swagger.model.TapiTopologyTopologyContext;
import io.swagger.model.TapiVirtualNetworkContextAugmentation3;
import io.swagger.model.TapiVirtualNetworkVirtualNetworkContext;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiCommonContext
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiCommonContext extends TapiCommonGlobalClass  {
  @JsonProperty("connectivity-context")
  private TapiConnectivityContextConnectivityContext connectivityContext = null;

  @JsonProperty("physical-context")
  private TapiEquipmentPhysicalContext physicalContext = null;

  @JsonProperty("notification-context")
  private TapiNotificationContextNotificationContext notificationContext = null;

  @JsonProperty("oam-context")
  private TapiOamContextOamContext oamContext = null;

  @JsonProperty("path-computation-context")
  private TapiPathComputationPathComputationContext pathComputationContext = null;

  @JsonProperty("topology-context")
  private TapiTopologyTopologyContext topologyContext = null;

  @JsonProperty("virtual-network-context")
  private TapiVirtualNetworkVirtualNetworkContext virtualNetworkContext = null;

  @JsonProperty("service-interface-point")
  @Valid
  private List<TapiCommonContextServiceInterfacePoint> serviceInterfacePoint = null;

  public TapiCommonContext connectivityContext(TapiConnectivityContextConnectivityContext connectivityContext) {
    this.connectivityContext = connectivityContext;
    return this;
  }

  /**
   * Get connectivityContext
   * @return connectivityContext
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityContextConnectivityContext getConnectivityContext() {
    return connectivityContext;
  }

  public void setConnectivityContext(TapiConnectivityContextConnectivityContext connectivityContext) {
    this.connectivityContext = connectivityContext;
  }

  public TapiCommonContext physicalContext(TapiEquipmentPhysicalContext physicalContext) {
    this.physicalContext = physicalContext;
    return this;
  }

  /**
   * Get physicalContext
   * @return physicalContext
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentPhysicalContext getPhysicalContext() {
    return physicalContext;
  }

  public void setPhysicalContext(TapiEquipmentPhysicalContext physicalContext) {
    this.physicalContext = physicalContext;
  }

  public TapiCommonContext notificationContext(TapiNotificationContextNotificationContext notificationContext) {
    this.notificationContext = notificationContext;
    return this;
  }

  /**
   * Get notificationContext
   * @return notificationContext
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiNotificationContextNotificationContext getNotificationContext() {
    return notificationContext;
  }

  public void setNotificationContext(TapiNotificationContextNotificationContext notificationContext) {
    this.notificationContext = notificationContext;
  }

  public TapiCommonContext oamContext(TapiOamContextOamContext oamContext) {
    this.oamContext = oamContext;
    return this;
  }

  /**
   * Get oamContext
   * @return oamContext
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamContextOamContext getOamContext() {
    return oamContext;
  }

  public void setOamContext(TapiOamContextOamContext oamContext) {
    this.oamContext = oamContext;
  }

  public TapiCommonContext pathComputationContext(TapiPathComputationPathComputationContext pathComputationContext) {
    this.pathComputationContext = pathComputationContext;
    return this;
  }

  /**
   * Get pathComputationContext
   * @return pathComputationContext
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPathComputationPathComputationContext getPathComputationContext() {
    return pathComputationContext;
  }

  public void setPathComputationContext(TapiPathComputationPathComputationContext pathComputationContext) {
    this.pathComputationContext = pathComputationContext;
  }

  public TapiCommonContext topologyContext(TapiTopologyTopologyContext topologyContext) {
    this.topologyContext = topologyContext;
    return this;
  }

  /**
   * Get topologyContext
   * @return topologyContext
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyTopologyContext getTopologyContext() {
    return topologyContext;
  }

  public void setTopologyContext(TapiTopologyTopologyContext topologyContext) {
    this.topologyContext = topologyContext;
  }

  public TapiCommonContext virtualNetworkContext(TapiVirtualNetworkVirtualNetworkContext virtualNetworkContext) {
    this.virtualNetworkContext = virtualNetworkContext;
    return this;
  }

  /**
   * Get virtualNetworkContext
   * @return virtualNetworkContext
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiVirtualNetworkVirtualNetworkContext getVirtualNetworkContext() {
    return virtualNetworkContext;
  }

  public void setVirtualNetworkContext(TapiVirtualNetworkVirtualNetworkContext virtualNetworkContext) {
    this.virtualNetworkContext = virtualNetworkContext;
  }

  public TapiCommonContext serviceInterfacePoint(List<TapiCommonContextServiceInterfacePoint> serviceInterfacePoint) {
    this.serviceInterfacePoint = serviceInterfacePoint;
    return this;
  }

  public TapiCommonContext addServiceInterfacePointItem(TapiCommonContextServiceInterfacePoint serviceInterfacePointItem) {
    if (this.serviceInterfacePoint == null) {
      this.serviceInterfacePoint = new ArrayList<TapiCommonContextServiceInterfacePoint>();
    }
    this.serviceInterfacePoint.add(serviceInterfacePointItem);
    return this;
  }

  /**
   * none
   * @return serviceInterfacePoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiCommonContextServiceInterfacePoint> getServiceInterfacePoint() {
    return serviceInterfacePoint;
  }

  public void setServiceInterfacePoint(List<TapiCommonContextServiceInterfacePoint> serviceInterfacePoint) {
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
    TapiCommonContext tapiCommonContext = (TapiCommonContext) o;
    return Objects.equals(this.connectivityContext, tapiCommonContext.connectivityContext) &&
        Objects.equals(this.physicalContext, tapiCommonContext.physicalContext) &&
        Objects.equals(this.notificationContext, tapiCommonContext.notificationContext) &&
        Objects.equals(this.oamContext, tapiCommonContext.oamContext) &&
        Objects.equals(this.pathComputationContext, tapiCommonContext.pathComputationContext) &&
        Objects.equals(this.topologyContext, tapiCommonContext.topologyContext) &&
        Objects.equals(this.virtualNetworkContext, tapiCommonContext.virtualNetworkContext) &&
        Objects.equals(this.serviceInterfacePoint, tapiCommonContext.serviceInterfacePoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityContext, physicalContext, notificationContext, oamContext, pathComputationContext, topologyContext, virtualNetworkContext, serviceInterfacePoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonContext {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    connectivityContext: ").append(toIndentedString(connectivityContext)).append("\n");
    sb.append("    physicalContext: ").append(toIndentedString(physicalContext)).append("\n");
    sb.append("    notificationContext: ").append(toIndentedString(notificationContext)).append("\n");
    sb.append("    oamContext: ").append(toIndentedString(oamContext)).append("\n");
    sb.append("    pathComputationContext: ").append(toIndentedString(pathComputationContext)).append("\n");
    sb.append("    topologyContext: ").append(toIndentedString(topologyContext)).append("\n");
    sb.append("    virtualNetworkContext: ").append(toIndentedString(virtualNetworkContext)).append("\n");
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
