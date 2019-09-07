package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiConnectivityConnection;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityGetconnectiondetailsOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiConnectivityGetconnectiondetailsOutput   {
  @JsonProperty("connection")
  private TapiConnectivityConnection connection = null;

  public TapiConnectivityGetconnectiondetailsOutput connection(TapiConnectivityConnection connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Get connection
   * @return connection
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityConnection getConnection() {
    return connection;
  }

  public void setConnection(TapiConnectivityConnection connection) {
    this.connection = connection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityGetconnectiondetailsOutput tapiConnectivityGetconnectiondetailsOutput = (TapiConnectivityGetconnectiondetailsOutput) o;
    return Objects.equals(this.connection, tapiConnectivityGetconnectiondetailsOutput.connection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityGetconnectiondetailsOutput {\n");
    
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
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
