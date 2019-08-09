package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEquipmentAccessPortRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentSupportingAccessPort
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentSupportingAccessPort   {
  @JsonProperty("access-port")
  private TapiEquipmentAccessPortRef accessPort = null;

  public TapiEquipmentSupportingAccessPort accessPort(TapiEquipmentAccessPortRef accessPort) {
    this.accessPort = accessPort;
    return this;
  }

  /**
   * Get accessPort
   * @return accessPort
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentAccessPortRef getAccessPort() {
    return accessPort;
  }

  public void setAccessPort(TapiEquipmentAccessPortRef accessPort) {
    this.accessPort = accessPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentSupportingAccessPort tapiEquipmentSupportingAccessPort = (TapiEquipmentSupportingAccessPort) o;
    return Objects.equals(this.accessPort, tapiEquipmentSupportingAccessPort.accessPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentSupportingAccessPort {\n");
    
    sb.append("    accessPort: ").append(toIndentedString(accessPort)).append("\n");
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
