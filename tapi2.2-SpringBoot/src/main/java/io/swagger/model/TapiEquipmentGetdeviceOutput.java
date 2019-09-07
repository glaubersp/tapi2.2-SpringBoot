package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEquipmentDevice;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentGetdeviceOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEquipmentGetdeviceOutput   {
  @JsonProperty("device")
  private TapiEquipmentDevice device = null;

  public TapiEquipmentGetdeviceOutput device(TapiEquipmentDevice device) {
    this.device = device;
    return this;
  }

  /**
   * Get device
   * @return device
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentDevice getDevice() {
    return device;
  }

  public void setDevice(TapiEquipmentDevice device) {
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
    TapiEquipmentGetdeviceOutput tapiEquipmentGetdeviceOutput = (TapiEquipmentGetdeviceOutput) o;
    return Objects.equals(this.device, tapiEquipmentGetdeviceOutput.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentGetdeviceOutput {\n");
    
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
