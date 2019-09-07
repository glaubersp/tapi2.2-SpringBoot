package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEquipmentPhysicalSpan;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentGetphysicalspanlistOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEquipmentGetphysicalspanlistOutput   {
  @JsonProperty("physical-span")
  @Valid
  private List<TapiEquipmentPhysicalSpan> physicalSpan = null;

  public TapiEquipmentGetphysicalspanlistOutput physicalSpan(List<TapiEquipmentPhysicalSpan> physicalSpan) {
    this.physicalSpan = physicalSpan;
    return this;
  }

  public TapiEquipmentGetphysicalspanlistOutput addPhysicalSpanItem(TapiEquipmentPhysicalSpan physicalSpanItem) {
    if (this.physicalSpan == null) {
      this.physicalSpan = new ArrayList<>();
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
    TapiEquipmentGetphysicalspanlistOutput tapiEquipmentGetphysicalspanlistOutput = (TapiEquipmentGetphysicalspanlistOutput) o;
    return Objects.equals(this.physicalSpan, tapiEquipmentGetphysicalspanlistOutput.physicalSpan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(physicalSpan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentGetphysicalspanlistOutput {\n");
    
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
