package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEquipmentDeviceRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentEquipmentRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentEquipmentRef extends TapiEquipmentDeviceRef  {
  @JsonProperty("equipment-uuid")
  private String equipmentUuid = null;

  public TapiEquipmentEquipmentRef equipmentUuid(String equipmentUuid) {
    this.equipmentUuid = equipmentUuid;
    return this;
  }

  /**
   * none
   * @return equipmentUuid
  **/
  @ApiModelProperty(value = "none")

  public String getEquipmentUuid() {
    return equipmentUuid;
  }

  public void setEquipmentUuid(String equipmentUuid) {
    this.equipmentUuid = equipmentUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentEquipmentRef tapiEquipmentEquipmentRef = (TapiEquipmentEquipmentRef) o;
    return Objects.equals(this.equipmentUuid, tapiEquipmentEquipmentRef.equipmentUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equipmentUuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentEquipmentRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    equipmentUuid: ").append(toIndentedString(equipmentUuid)).append("\n");
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
