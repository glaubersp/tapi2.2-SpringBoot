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
 * TapiCommonServiceInterfacePointRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiCommonServiceInterfacePointRef   {
  @JsonProperty("service-interface-point-uuid")
  private String serviceInterfacePointUuid = null;

  public TapiCommonServiceInterfacePointRef serviceInterfacePointUuid(String serviceInterfacePointUuid) {
    this.serviceInterfacePointUuid = serviceInterfacePointUuid;
    return this;
  }

  /**
   * none
   * @return serviceInterfacePointUuid
  **/
  @ApiModelProperty(value = "none")

  public String getServiceInterfacePointUuid() {
    return serviceInterfacePointUuid;
  }

  public void setServiceInterfacePointUuid(String serviceInterfacePointUuid) {
    this.serviceInterfacePointUuid = serviceInterfacePointUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiCommonServiceInterfacePointRef tapiCommonServiceInterfacePointRef = (TapiCommonServiceInterfacePointRef) o;
    return Objects.equals(this.serviceInterfacePointUuid, tapiCommonServiceInterfacePointRef.serviceInterfacePointUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceInterfacePointUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonServiceInterfacePointRef {\n");
    
    sb.append("    serviceInterfacePointUuid: ").append(toIndentedString(serviceInterfacePointUuid)).append("\n");
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
