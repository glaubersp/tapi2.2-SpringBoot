package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityGetconnectionendpointdetailsOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiConnectivityGetconnectionendpointdetailsOutput   {
  @JsonProperty("connection-end-point")
  private TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint connectionEndPoint = null;

  public TapiConnectivityGetconnectionendpointdetailsOutput connectionEndPoint(TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint connectionEndPoint) {
    this.connectionEndPoint = connectionEndPoint;
    return this;
  }

  /**
   * Get connectionEndPoint
   * @return connectionEndPoint
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint getConnectionEndPoint() {
    return connectionEndPoint;
  }

  public void setConnectionEndPoint(TapiConnectivityGetconnectionendpointdetailsOutputConnectionEndPoint connectionEndPoint) {
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
    TapiConnectivityGetconnectionendpointdetailsOutput tapiConnectivityGetconnectionendpointdetailsOutput = (TapiConnectivityGetconnectionendpointdetailsOutput) o;
    return Objects.equals(this.connectionEndPoint, tapiConnectivityGetconnectionendpointdetailsOutput.connectionEndPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionEndPoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityGetconnectionendpointdetailsOutput {\n");
    
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
