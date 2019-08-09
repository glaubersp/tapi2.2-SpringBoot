package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEquipmentPhysicalContext;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentContextAugmentation6
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentContextAugmentation6   {
  @JsonProperty("physical-context")
  private TapiEquipmentPhysicalContext physicalContext = null;

  public TapiEquipmentContextAugmentation6 physicalContext(TapiEquipmentPhysicalContext physicalContext) {
    this.physicalContext = physicalContext;
    return this;
  }

  /**
   * Get physicalContext
   * @return physicalContext
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentPhysicalContext getPhysicalContext() {
    return physicalContext;
  }

  public void setPhysicalContext(TapiEquipmentPhysicalContext physicalContext) {
    this.physicalContext = physicalContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentContextAugmentation6 tapiEquipmentContextAugmentation6 = (TapiEquipmentContextAugmentation6) o;
    return Objects.equals(this.physicalContext, tapiEquipmentContextAugmentation6.physicalContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(physicalContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentContextAugmentation6 {\n");
    
    sb.append("    physicalContext: ").append(toIndentedString(physicalContext)).append("\n");
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
