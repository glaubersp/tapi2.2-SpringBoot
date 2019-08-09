package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEquipmentSupportingPhysicalSpan;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentNodeAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentNodeAugmentation1   {
  @JsonProperty("supporting-physical-span")
  private TapiEquipmentSupportingPhysicalSpan supportingPhysicalSpan = null;

  public TapiEquipmentNodeAugmentation1 supportingPhysicalSpan(TapiEquipmentSupportingPhysicalSpan supportingPhysicalSpan) {
    this.supportingPhysicalSpan = supportingPhysicalSpan;
    return this;
  }

  /**
   * Get supportingPhysicalSpan
   * @return supportingPhysicalSpan
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentSupportingPhysicalSpan getSupportingPhysicalSpan() {
    return supportingPhysicalSpan;
  }

  public void setSupportingPhysicalSpan(TapiEquipmentSupportingPhysicalSpan supportingPhysicalSpan) {
    this.supportingPhysicalSpan = supportingPhysicalSpan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentNodeAugmentation1 tapiEquipmentNodeAugmentation1 = (TapiEquipmentNodeAugmentation1) o;
    return Objects.equals(this.supportingPhysicalSpan, tapiEquipmentNodeAugmentation1.supportingPhysicalSpan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportingPhysicalSpan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentNodeAugmentation1 {\n");
    
    sb.append("    supportingPhysicalSpan: ").append(toIndentedString(supportingPhysicalSpan)).append("\n");
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
