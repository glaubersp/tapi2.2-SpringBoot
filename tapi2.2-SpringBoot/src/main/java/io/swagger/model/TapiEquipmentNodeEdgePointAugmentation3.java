package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEquipmentSupportingAccessPort;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentNodeEdgePointAugmentation3
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentNodeEdgePointAugmentation3   {
  @JsonProperty("supporting-access-port")
  private TapiEquipmentSupportingAccessPort supportingAccessPort = null;

  public TapiEquipmentNodeEdgePointAugmentation3 supportingAccessPort(TapiEquipmentSupportingAccessPort supportingAccessPort) {
    this.supportingAccessPort = supportingAccessPort;
    return this;
  }

  /**
   * Get supportingAccessPort
   * @return supportingAccessPort
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentSupportingAccessPort getSupportingAccessPort() {
    return supportingAccessPort;
  }

  public void setSupportingAccessPort(TapiEquipmentSupportingAccessPort supportingAccessPort) {
    this.supportingAccessPort = supportingAccessPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentNodeEdgePointAugmentation3 tapiEquipmentNodeEdgePointAugmentation3 = (TapiEquipmentNodeEdgePointAugmentation3) o;
    return Objects.equals(this.supportingAccessPort, tapiEquipmentNodeEdgePointAugmentation3.supportingAccessPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportingAccessPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentNodeEdgePointAugmentation3 {\n");
    
    sb.append("    supportingAccessPort: ").append(toIndentedString(supportingAccessPort)).append("\n");
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
