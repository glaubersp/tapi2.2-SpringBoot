package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiConnectivityConnectionRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityRouteRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiConnectivityRouteRef extends TapiConnectivityConnectionRef  {
  @JsonProperty("route-local-id")
  private String routeLocalId = null;

  public TapiConnectivityRouteRef routeLocalId(String routeLocalId) {
    this.routeLocalId = routeLocalId;
    return this;
  }

  /**
   * none
   * @return routeLocalId
  **/
  @ApiModelProperty(value = "none")

  public String getRouteLocalId() {
    return routeLocalId;
  }

  public void setRouteLocalId(String routeLocalId) {
    this.routeLocalId = routeLocalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityRouteRef tapiConnectivityRouteRef = (TapiConnectivityRouteRef) o;
    return Objects.equals(this.routeLocalId, tapiConnectivityRouteRef.routeLocalId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeLocalId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityRouteRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    routeLocalId: ").append(toIndentedString(routeLocalId)).append("\n");
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
