package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEquipmentCommonActualProperties;
import io.swagger.model.TapiEquipmentCommonEquipmentProperties;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentActualNonFieldReplaceableModule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentActualNonFieldReplaceableModule   {
  @JsonProperty("common-actual-properties")
  private TapiEquipmentCommonActualProperties commonActualProperties = null;

  @JsonProperty("common-equipment-properties")
  private TapiEquipmentCommonEquipmentProperties commonEquipmentProperties = null;

  public TapiEquipmentActualNonFieldReplaceableModule commonActualProperties(TapiEquipmentCommonActualProperties commonActualProperties) {
    this.commonActualProperties = commonActualProperties;
    return this;
  }

  /**
   * Get commonActualProperties
   * @return commonActualProperties
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentCommonActualProperties getCommonActualProperties() {
    return commonActualProperties;
  }

  public void setCommonActualProperties(TapiEquipmentCommonActualProperties commonActualProperties) {
    this.commonActualProperties = commonActualProperties;
  }

  public TapiEquipmentActualNonFieldReplaceableModule commonEquipmentProperties(TapiEquipmentCommonEquipmentProperties commonEquipmentProperties) {
    this.commonEquipmentProperties = commonEquipmentProperties;
    return this;
  }

  /**
   * Get commonEquipmentProperties
   * @return commonEquipmentProperties
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEquipmentCommonEquipmentProperties getCommonEquipmentProperties() {
    return commonEquipmentProperties;
  }

  public void setCommonEquipmentProperties(TapiEquipmentCommonEquipmentProperties commonEquipmentProperties) {
    this.commonEquipmentProperties = commonEquipmentProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentActualNonFieldReplaceableModule tapiEquipmentActualNonFieldReplaceableModule = (TapiEquipmentActualNonFieldReplaceableModule) o;
    return Objects.equals(this.commonActualProperties, tapiEquipmentActualNonFieldReplaceableModule.commonActualProperties) &&
        Objects.equals(this.commonEquipmentProperties, tapiEquipmentActualNonFieldReplaceableModule.commonEquipmentProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonActualProperties, commonEquipmentProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentActualNonFieldReplaceableModule {\n");
    
    sb.append("    commonActualProperties: ").append(toIndentedString(commonActualProperties)).append("\n");
    sb.append("    commonEquipmentProperties: ").append(toIndentedString(commonEquipmentProperties)).append("\n");
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
