package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEquipmentCommonHolderProperties;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentActualHolder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentActualHolder   {
  @JsonProperty("common-holder-properties")
  private TapiEquipmentCommonHolderProperties commonHolderProperties = null;

  public TapiEquipmentActualHolder commonHolderProperties(TapiEquipmentCommonHolderProperties commonHolderProperties) {
    this.commonHolderProperties = commonHolderProperties;
    return this;
  }

  /**
   * Get commonHolderProperties
   * @return commonHolderProperties
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentCommonHolderProperties getCommonHolderProperties() {
    return commonHolderProperties;
  }

  public void setCommonHolderProperties(TapiEquipmentCommonHolderProperties commonHolderProperties) {
    this.commonHolderProperties = commonHolderProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentActualHolder tapiEquipmentActualHolder = (TapiEquipmentActualHolder) o;
    return Objects.equals(this.commonHolderProperties, tapiEquipmentActualHolder.commonHolderProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonHolderProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentActualHolder {\n");
    
    sb.append("    commonHolderProperties: ").append(toIndentedString(commonHolderProperties)).append("\n");
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
