package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiConnectivityConnectionEndPointRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityRoute
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityRoute extends TapiCommonLocalClass  {
  @JsonProperty("connection-end-point")
  @Valid
  private List<TapiConnectivityConnectionEndPointRef> connectionEndPoint = null;

  public TapiConnectivityRoute connectionEndPoint(List<TapiConnectivityConnectionEndPointRef> connectionEndPoint) {
    this.connectionEndPoint = connectionEndPoint;
    return this;
  }

  public TapiConnectivityRoute addConnectionEndPointItem(TapiConnectivityConnectionEndPointRef connectionEndPointItem) {
    if (this.connectionEndPoint == null) {
      this.connectionEndPoint = new ArrayList<TapiConnectivityConnectionEndPointRef>();
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityRoute tapiConnectivityRoute = (TapiConnectivityRoute) o;
    return Objects.equals(this.connectionEndPoint, tapiConnectivityRoute.connectionEndPoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionEndPoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityRoute {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    connectionEndPoint: ").append(toIndentedString(connectionEndPoint)).append("\n");
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
