package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiVirtualNetworkVirtualNetworkService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiVirtualNetworkGetvirtualnetworkservicelistOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiVirtualNetworkGetvirtualnetworkservicelistOutput   {
  @JsonProperty("service")
  @Valid
  private List<TapiVirtualNetworkVirtualNetworkService> service = null;

  public TapiVirtualNetworkGetvirtualnetworkservicelistOutput service(List<TapiVirtualNetworkVirtualNetworkService> service) {
    this.service = service;
    return this;
  }

  public TapiVirtualNetworkGetvirtualnetworkservicelistOutput addServiceItem(TapiVirtualNetworkVirtualNetworkService serviceItem) {
    if (this.service == null) {
      this.service = new ArrayList<TapiVirtualNetworkVirtualNetworkService>();
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
  public List<TapiVirtualNetworkVirtualNetworkService> getService() {
    return service;
  }

  public void setService(List<TapiVirtualNetworkVirtualNetworkService> service) {
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
    TapiVirtualNetworkGetvirtualnetworkservicelistOutput tapiVirtualNetworkGetvirtualnetworkservicelistOutput = (TapiVirtualNetworkGetvirtualnetworkservicelistOutput) o;
    return Objects.equals(this.service, tapiVirtualNetworkGetvirtualnetworkservicelistOutput.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkGetvirtualnetworkservicelistOutput {\n");
    
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
