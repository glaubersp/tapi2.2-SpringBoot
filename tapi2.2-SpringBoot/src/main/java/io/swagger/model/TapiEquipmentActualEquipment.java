package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEquipmentActualNonFieldReplaceableModule;
import io.swagger.model.TapiEquipmentCommonActualProperties;
import io.swagger.model.TapiEquipmentCommonEquipmentProperties;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentActualEquipment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentActualEquipment   {
  @JsonProperty("common-actual-properties")
  private TapiEquipmentCommonActualProperties commonActualProperties = null;

  @JsonProperty("actual-non-field-replaceable-module")
  @Valid
  private List<TapiEquipmentActualNonFieldReplaceableModule> actualNonFieldReplaceableModule = null;

  @JsonProperty("common-equipment-properties")
  private TapiEquipmentCommonEquipmentProperties commonEquipmentProperties = null;

  public TapiEquipmentActualEquipment commonActualProperties(TapiEquipmentCommonActualProperties commonActualProperties) {
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

  public TapiEquipmentActualEquipment actualNonFieldReplaceableModule(List<TapiEquipmentActualNonFieldReplaceableModule> actualNonFieldReplaceableModule) {
    this.actualNonFieldReplaceableModule = actualNonFieldReplaceableModule;
    return this;
  }

  public TapiEquipmentActualEquipment addActualNonFieldReplaceableModuleItem(TapiEquipmentActualNonFieldReplaceableModule actualNonFieldReplaceableModuleItem) {
    if (this.actualNonFieldReplaceableModule == null) {
      this.actualNonFieldReplaceableModule = new ArrayList<TapiEquipmentActualNonFieldReplaceableModule>();
    }
    this.actualNonFieldReplaceableModule.add(actualNonFieldReplaceableModuleItem);
    return this;
  }

  /**
   * none
   * @return actualNonFieldReplaceableModule
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiEquipmentActualNonFieldReplaceableModule> getActualNonFieldReplaceableModule() {
    return actualNonFieldReplaceableModule;
  }

  public void setActualNonFieldReplaceableModule(List<TapiEquipmentActualNonFieldReplaceableModule> actualNonFieldReplaceableModule) {
    this.actualNonFieldReplaceableModule = actualNonFieldReplaceableModule;
  }

  public TapiEquipmentActualEquipment commonEquipmentProperties(TapiEquipmentCommonEquipmentProperties commonEquipmentProperties) {
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
    TapiEquipmentActualEquipment tapiEquipmentActualEquipment = (TapiEquipmentActualEquipment) o;
    return Objects.equals(this.commonActualProperties, tapiEquipmentActualEquipment.commonActualProperties) &&
        Objects.equals(this.actualNonFieldReplaceableModule, tapiEquipmentActualEquipment.actualNonFieldReplaceableModule) &&
        Objects.equals(this.commonEquipmentProperties, tapiEquipmentActualEquipment.commonEquipmentProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonActualProperties, actualNonFieldReplaceableModule, commonEquipmentProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentActualEquipment {\n");
    
    sb.append("    commonActualProperties: ").append(toIndentedString(commonActualProperties)).append("\n");
    sb.append("    actualNonFieldReplaceableModule: ").append(toIndentedString(actualNonFieldReplaceableModule)).append("\n");
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
