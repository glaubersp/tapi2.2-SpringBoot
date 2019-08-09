package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityConnectionEndPointRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityConnectionEndPointRef extends TapiTopologyNodeEdgePointRef  {
  @JsonProperty("connection-end-point-uuid")
  private String connectionEndPointUuid = null;

  public TapiConnectivityConnectionEndPointRef connectionEndPointUuid(String connectionEndPointUuid) {
    this.connectionEndPointUuid = connectionEndPointUuid;
    return this;
  }

  /**
   * none
   * @return connectionEndPointUuid
  **/
  @ApiModelProperty(value = "none")

  public String getConnectionEndPointUuid() {
    return connectionEndPointUuid;
  }

  public void setConnectionEndPointUuid(String connectionEndPointUuid) {
    this.connectionEndPointUuid = connectionEndPointUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityConnectionEndPointRef tapiConnectivityConnectionEndPointRef = (TapiConnectivityConnectionEndPointRef) o;
    return Objects.equals(this.connectionEndPointUuid, tapiConnectivityConnectionEndPointRef.connectionEndPointUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionEndPointUuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityConnectionEndPointRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    connectionEndPointUuid: ").append(toIndentedString(connectionEndPointUuid)).append("\n");
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
