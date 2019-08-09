package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityConnectivityServiceRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityConnectivityServiceRef   {
  @JsonProperty("connectivity-service-uuid")
  private String connectivityServiceUuid = null;

  public TapiConnectivityConnectivityServiceRef connectivityServiceUuid(String connectivityServiceUuid) {
    this.connectivityServiceUuid = connectivityServiceUuid;
    return this;
  }

  /**
   * none
   * @return connectivityServiceUuid
  **/
  @ApiModelProperty(value = "none")

  public String getConnectivityServiceUuid() {
    return connectivityServiceUuid;
  }

  public void setConnectivityServiceUuid(String connectivityServiceUuid) {
    this.connectivityServiceUuid = connectivityServiceUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityConnectivityServiceRef tapiConnectivityConnectivityServiceRef = (TapiConnectivityConnectivityServiceRef) o;
    return Objects.equals(this.connectivityServiceUuid, tapiConnectivityConnectivityServiceRef.connectivityServiceUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectivityServiceUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityConnectivityServiceRef {\n");
    
    sb.append("    connectivityServiceUuid: ").append(toIndentedString(connectivityServiceUuid)).append("\n");
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
