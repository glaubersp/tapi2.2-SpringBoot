package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiConnectivityConnectivityServiceRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityConnectivityServiceEndPointRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityConnectivityServiceEndPointRef extends TapiConnectivityConnectivityServiceRef  {
  @JsonProperty("connectivity-service-end-point-local-id")
  private String connectivityServiceEndPointLocalId = null;

  public TapiConnectivityConnectivityServiceEndPointRef connectivityServiceEndPointLocalId(String connectivityServiceEndPointLocalId) {
    this.connectivityServiceEndPointLocalId = connectivityServiceEndPointLocalId;
    return this;
  }

  /**
   * none
   * @return connectivityServiceEndPointLocalId
  **/
  @ApiModelProperty(value = "none")

  public String getConnectivityServiceEndPointLocalId() {
    return connectivityServiceEndPointLocalId;
  }

  public void setConnectivityServiceEndPointLocalId(String connectivityServiceEndPointLocalId) {
    this.connectivityServiceEndPointLocalId = connectivityServiceEndPointLocalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityConnectivityServiceEndPointRef tapiConnectivityConnectivityServiceEndPointRef = (TapiConnectivityConnectivityServiceEndPointRef) o;
    return Objects.equals(this.connectivityServiceEndPointLocalId, tapiConnectivityConnectivityServiceEndPointRef.connectivityServiceEndPointLocalId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityServiceEndPointLocalId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityConnectivityServiceEndPointRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    connectivityServiceEndPointLocalId: ").append(toIndentedString(connectivityServiceEndPointLocalId)).append("\n");
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
