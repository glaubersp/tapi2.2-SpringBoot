package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiEquipmentDevice;
import io.swagger.model.TapiEquipmentPhysicalSpan;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentPhysicalContext
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentPhysicalContext extends TapiCommonGlobalClass  {
  @JsonProperty("device")
  @Valid
  private List<TapiEquipmentDevice> device = null;

  @JsonProperty("physical-span")
  @Valid
  private List<TapiEquipmentPhysicalSpan> physicalSpan = null;

  public TapiEquipmentPhysicalContext device(List<TapiEquipmentDevice> device) {
    this.device = device;
    return this;
  }

  public TapiEquipmentPhysicalContext addDeviceItem(TapiEquipmentDevice deviceItem) {
    if (this.device == null) {
      this.device = new ArrayList<TapiEquipmentDevice>();
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

  public TapiEquipmentPhysicalContext physicalSpan(List<TapiEquipmentPhysicalSpan> physicalSpan) {
    this.physicalSpan = physicalSpan;
    return this;
  }

  public TapiEquipmentPhysicalContext addPhysicalSpanItem(TapiEquipmentPhysicalSpan physicalSpanItem) {
    if (this.physicalSpan == null) {
      this.physicalSpan = new ArrayList<TapiEquipmentPhysicalSpan>();
    }
    this.physicalSpan.add(physicalSpanItem);
    return this;
  }

  /**
   * none
   * @return physicalSpan
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiEquipmentPhysicalSpan> getPhysicalSpan() {
    return physicalSpan;
  }

  public void setPhysicalSpan(List<TapiEquipmentPhysicalSpan> physicalSpan) {
    this.physicalSpan = physicalSpan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentPhysicalContext tapiEquipmentPhysicalContext = (TapiEquipmentPhysicalContext) o;
    return Objects.equals(this.device, tapiEquipmentPhysicalContext.device) &&
        Objects.equals(this.physicalSpan, tapiEquipmentPhysicalContext.physicalSpan) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, physicalSpan, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentPhysicalContext {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    physicalSpan: ").append(toIndentedString(physicalSpan)).append("\n");
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
