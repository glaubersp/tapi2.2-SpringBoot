package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiConnectivityCreateconnectivityserviceOutputService;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityCreateconnectivityserviceOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityCreateconnectivityserviceOutput   {
  @JsonProperty("service")
  private TapiConnectivityCreateconnectivityserviceOutputService service = null;

  public TapiConnectivityCreateconnectivityserviceOutput service(TapiConnectivityCreateconnectivityserviceOutputService service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityCreateconnectivityserviceOutputService getService() {
    return service;
  }

  public void setService(TapiConnectivityCreateconnectivityserviceOutputService service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityCreateconnectivityserviceOutput tapiConnectivityCreateconnectivityserviceOutput = (TapiConnectivityCreateconnectivityserviceOutput) o;
    return Objects.equals(this.service, tapiConnectivityCreateconnectivityserviceOutput.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityCreateconnectivityserviceOutput {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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