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
 * TapiVirtualNetworkVirtualNetworkContext
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiVirtualNetworkVirtualNetworkContext   {
  @JsonProperty("virtual-nw-service")
  @Valid
  private List<TapiVirtualNetworkVirtualNetworkService> virtualNwService = null;

  public TapiVirtualNetworkVirtualNetworkContext virtualNwService(List<TapiVirtualNetworkVirtualNetworkService> virtualNwService) {
    this.virtualNwService = virtualNwService;
    return this;
  }

  public TapiVirtualNetworkVirtualNetworkContext addVirtualNwServiceItem(TapiVirtualNetworkVirtualNetworkService virtualNwServiceItem) {
    if (this.virtualNwService == null) {
      this.virtualNwService = new ArrayList<>();
    }
    this.virtualNwService.add(virtualNwServiceItem);
    return this;
  }

  /**
   * none
   * @return virtualNwService
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiVirtualNetworkVirtualNetworkService> getVirtualNwService() {
    return virtualNwService;
  }

  public void setVirtualNwService(List<TapiVirtualNetworkVirtualNetworkService> virtualNwService) {
    this.virtualNwService = virtualNwService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiVirtualNetworkVirtualNetworkContext tapiVirtualNetworkVirtualNetworkContext = (TapiVirtualNetworkVirtualNetworkContext) o;
    return Objects.equals(this.virtualNwService, tapiVirtualNetworkVirtualNetworkContext.virtualNwService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualNwService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiVirtualNetworkVirtualNetworkContext {\n");
    
    sb.append("    virtualNwService: ").append(toIndentedString(virtualNwService)).append("\n");
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
