package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonPortDirection;
import io.swagger.model.TapiConnectivityConnectionEndPointRef;
import io.swagger.model.TapiConnectivityRouteRef;
import io.swagger.model.TapiConnectivitySelectionReason;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivitySwitch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivitySwitch extends TapiCommonLocalClass  {
  @JsonProperty("selected-connection-end-point")
  @Valid
  private List<TapiConnectivityConnectionEndPointRef> selectedConnectionEndPoint = null;

  @JsonProperty("selected-route")
  @Valid
  private List<TapiConnectivityRouteRef> selectedRoute = null;

  @JsonProperty("selection-reason")
  private TapiConnectivitySelectionReason selectionReason = null;

  @JsonProperty("switch-direction")
  private TapiCommonPortDirection switchDirection = null;

  public TapiConnectivitySwitch selectedConnectionEndPoint(List<TapiConnectivityConnectionEndPointRef> selectedConnectionEndPoint) {
    this.selectedConnectionEndPoint = selectedConnectionEndPoint;
    return this;
  }

  public TapiConnectivitySwitch addSelectedConnectionEndPointItem(TapiConnectivityConnectionEndPointRef selectedConnectionEndPointItem) {
    if (this.selectedConnectionEndPoint == null) {
      this.selectedConnectionEndPoint = new ArrayList<TapiConnectivityConnectionEndPointRef>();
    }
    this.selectedConnectionEndPoint.add(selectedConnectionEndPointItem);
    return this;
  }

  /**
   * none
   * @return selectedConnectionEndPoint
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivityConnectionEndPointRef> getSelectedConnectionEndPoint() {
    return selectedConnectionEndPoint;
  }

  public void setSelectedConnectionEndPoint(List<TapiConnectivityConnectionEndPointRef> selectedConnectionEndPoint) {
    this.selectedConnectionEndPoint = selectedConnectionEndPoint;
  }

  public TapiConnectivitySwitch selectedRoute(List<TapiConnectivityRouteRef> selectedRoute) {
    this.selectedRoute = selectedRoute;
    return this;
  }

  public TapiConnectivitySwitch addSelectedRouteItem(TapiConnectivityRouteRef selectedRouteItem) {
    if (this.selectedRoute == null) {
      this.selectedRoute = new ArrayList<TapiConnectivityRouteRef>();
    }
    this.selectedRoute.add(selectedRouteItem);
    return this;
  }

  /**
   * none
   * @return selectedRoute
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivityRouteRef> getSelectedRoute() {
    return selectedRoute;
  }

  public void setSelectedRoute(List<TapiConnectivityRouteRef> selectedRoute) {
    this.selectedRoute = selectedRoute;
  }

  public TapiConnectivitySwitch selectionReason(TapiConnectivitySelectionReason selectionReason) {
    this.selectionReason = selectionReason;
    return this;
  }

  /**
   * Get selectionReason
   * @return selectionReason
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivitySelectionReason getSelectionReason() {
    return selectionReason;
  }

  public void setSelectionReason(TapiConnectivitySelectionReason selectionReason) {
    this.selectionReason = selectionReason;
  }

  public TapiConnectivitySwitch switchDirection(TapiCommonPortDirection switchDirection) {
    this.switchDirection = switchDirection;
    return this;
  }

  /**
   * Get switchDirection
   * @return switchDirection
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonPortDirection getSwitchDirection() {
    return switchDirection;
  }

  public void setSwitchDirection(TapiCommonPortDirection switchDirection) {
    this.switchDirection = switchDirection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivitySwitch tapiConnectivitySwitch = (TapiConnectivitySwitch) o;
    return Objects.equals(this.selectedConnectionEndPoint, tapiConnectivitySwitch.selectedConnectionEndPoint) &&
        Objects.equals(this.selectedRoute, tapiConnectivitySwitch.selectedRoute) &&
        Objects.equals(this.selectionReason, tapiConnectivitySwitch.selectionReason) &&
        Objects.equals(this.switchDirection, tapiConnectivitySwitch.switchDirection) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedConnectionEndPoint, selectedRoute, selectionReason, switchDirection, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivitySwitch {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    selectedConnectionEndPoint: ").append(toIndentedString(selectedConnectionEndPoint)).append("\n");
    sb.append("    selectedRoute: ").append(toIndentedString(selectedRoute)).append("\n");
    sb.append("    selectionReason: ").append(toIndentedString(selectionReason)).append("\n");
    sb.append("    switchDirection: ").append(toIndentedString(switchDirection)).append("\n");
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
