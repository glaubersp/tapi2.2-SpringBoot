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
 * TapiConnectivityConnectionRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityConnectionRef   {
  @JsonProperty("connection-uuid")
  private String connectionUuid = null;

  public TapiConnectivityConnectionRef connectionUuid(String connectionUuid) {
    this.connectionUuid = connectionUuid;
    return this;
  }

  /**
   * none
   * @return connectionUuid
  **/
  @ApiModelProperty(value = "none")

  public String getConnectionUuid() {
    return connectionUuid;
  }

  public void setConnectionUuid(String connectionUuid) {
    this.connectionUuid = connectionUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityConnectionRef tapiConnectivityConnectionRef = (TapiConnectivityConnectionRef) o;
    return Objects.equals(this.connectionUuid, tapiConnectivityConnectionRef.connectionUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityConnectionRef {\n");
    
    sb.append("    connectionUuid: ").append(toIndentedString(connectionUuid)).append("\n");
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
