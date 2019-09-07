package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEquipmentDevice;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentGetdevicelistOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEquipmentGetdevicelistOutput   {
  @JsonProperty("device")
  @Valid
  private List<TapiEquipmentDevice> device = null;

  public TapiEquipmentGetdevicelistOutput device(List<TapiEquipmentDevice> device) {
    this.device = device;
    return this;
  }

  public TapiEquipmentGetdevicelistOutput addDeviceItem(TapiEquipmentDevice deviceItem) {
    if (this.device == null) {
      this.device = new ArrayList<>();
    }
    this.device.add(deviceItem);
    return this;
  }

  /**
   * none
   * @return device
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiEquipmentDevice> getDevice() {
    return device;
  }

  public void setDevice(List<TapiEquipmentDevice> device) {
    this.device = device;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentGetdevicelistOutput tapiEquipmentGetdevicelistOutput = (TapiEquipmentGetdevicelistOutput) o;
    return Objects.equals(this.device, tapiEquipmentGetdevicelistOutput.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentGetdevicelistOutput {\n");
    
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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
