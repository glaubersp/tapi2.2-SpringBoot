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
 * TapiEquipmentPhysicalSpanRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentPhysicalSpanRef   {
  @JsonProperty("physical-span-uuid")
  private String physicalSpanUuid = null;

  public TapiEquipmentPhysicalSpanRef physicalSpanUuid(String physicalSpanUuid) {
    this.physicalSpanUuid = physicalSpanUuid;
    return this;
  }

  /**
   * none
   * @return physicalSpanUuid
  **/
  @ApiModelProperty(value = "none")

  public String getPhysicalSpanUuid() {
    return physicalSpanUuid;
  }

  public void setPhysicalSpanUuid(String physicalSpanUuid) {
    this.physicalSpanUuid = physicalSpanUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentPhysicalSpanRef tapiEquipmentPhysicalSpanRef = (TapiEquipmentPhysicalSpanRef) o;
    return Objects.equals(this.physicalSpanUuid, tapiEquipmentPhysicalSpanRef.physicalSpanUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(physicalSpanUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentPhysicalSpanRef {\n");
    
    sb.append("    physicalSpanUuid: ").append(toIndentedString(physicalSpanUuid)).append("\n");
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
