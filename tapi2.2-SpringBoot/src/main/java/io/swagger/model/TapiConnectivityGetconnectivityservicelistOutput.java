package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiConnectivityGetconnectivityservicelistOutputService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityGetconnectivityservicelistOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiConnectivityGetconnectivityservicelistOutput   {
  @JsonProperty("service")
  @Valid
  private List<TapiConnectivityGetconnectivityservicelistOutputService> service = null;

  public TapiConnectivityGetconnectivityservicelistOutput service(List<TapiConnectivityGetconnectivityservicelistOutputService> service) {
    this.service = service;
    return this;
  }

  public TapiConnectivityGetconnectivityservicelistOutput addServiceItem(TapiConnectivityGetconnectivityservicelistOutputService serviceItem) {
    if (this.service == null) {
      this.service = new ArrayList<>();
    }
    this.service.add(serviceItem);
    return this;
  }

  /**
   * none
   * @return service
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiConnectivityGetconnectivityservicelistOutputService> getService() {
    return service;
  }

  public void setService(List<TapiConnectivityGetconnectivityservicelistOutputService> service) {
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
    TapiConnectivityGetconnectivityservicelistOutput tapiConnectivityGetconnectivityservicelistOutput = (TapiConnectivityGetconnectivityservicelistOutput) o;
    return Objects.equals(this.service, tapiConnectivityGetconnectivityservicelistOutput.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityGetconnectivityservicelistOutput {\n");
    
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
