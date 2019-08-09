package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiEquipmentAccessPort;
import io.swagger.model.TapiEquipmentEquipment;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentDevice
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentDevice extends TapiCommonGlobalClass  {
  @JsonProperty("equipment")
  @Valid
  private List<TapiEquipmentEquipment> equipment = null;

  @JsonProperty("access-port")
  @Valid
  private List<TapiEquipmentAccessPort> accessPort = null;

  public TapiEquipmentDevice equipment(List<TapiEquipmentEquipment> equipment) {
    this.equipment = equipment;
    return this;
  }

  public TapiEquipmentDevice addEquipmentItem(TapiEquipmentEquipment equipmentItem) {
    if (this.equipment == null) {
      this.equipment = new ArrayList<TapiEquipmentEquipment>();
    }
    this.equipment.add(equipmentItem);
    return this;
  }

  /**
   * none
   * @return equipment
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiEquipmentEquipment> getEquipment() {
    return equipment;
  }

  public void setEquipment(List<TapiEquipmentEquipment> equipment) {
    this.equipment = equipment;
  }

  public TapiEquipmentDevice accessPort(List<TapiEquipmentAccessPort> accessPort) {
    this.accessPort = accessPort;
    return this;
  }

  public TapiEquipmentDevice addAccessPortItem(TapiEquipmentAccessPort accessPortItem) {
    if (this.accessPort == null) {
      this.accessPort = new ArrayList<TapiEquipmentAccessPort>();
    }
    this.accessPort.add(accessPortItem);
    return this;
  }

  /**
   * none
   * @return accessPort
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiEquipmentAccessPort> getAccessPort() {
    return accessPort;
  }

  public void setAccessPort(List<TapiEquipmentAccessPort> accessPort) {
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
    TapiEquipmentDevice tapiEquipmentDevice = (TapiEquipmentDevice) o;
    return Objects.equals(this.equipment, tapiEquipmentDevice.equipment) &&
        Objects.equals(this.accessPort, tapiEquipmentDevice.accessPort) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(equipment, accessPort, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentDevice {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    equipment: ").append(toIndentedString(equipment)).append("\n");
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
