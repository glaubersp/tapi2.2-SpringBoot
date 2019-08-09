package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEquipmentCommonEquipmentProperties;
import io.swagger.model.TapiEquipmentExpectedHolder;
import io.swagger.model.TapiEquipmentExpectedNonFieldReplaceableModule;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentExpectedEquipment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentExpectedEquipment   {
  @JsonProperty("expected-holder")
  @Valid
  private List<TapiEquipmentExpectedHolder> expectedHolder = null;

  @JsonProperty("expected-non-field-replaceable-module")
  @Valid
  private List<TapiEquipmentExpectedNonFieldReplaceableModule> expectedNonFieldReplaceableModule = null;

  @JsonProperty("common-equipment-properties")
  private TapiEquipmentCommonEquipmentProperties commonEquipmentProperties = null;

  public TapiEquipmentExpectedEquipment expectedHolder(List<TapiEquipmentExpectedHolder> expectedHolder) {
    this.expectedHolder = expectedHolder;
    return this;
  }

  public TapiEquipmentExpectedEquipment addExpectedHolderItem(TapiEquipmentExpectedHolder expectedHolderItem) {
    if (this.expectedHolder == null) {
      this.expectedHolder = new ArrayList<TapiEquipmentExpectedHolder>();
    }
    this.expectedHolder.add(expectedHolderItem);
    return this;
  }

  /**
   * none
   * @return expectedHolder
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiEquipmentExpectedHolder> getExpectedHolder() {
    return expectedHolder;
  }

  public void setExpectedHolder(List<TapiEquipmentExpectedHolder> expectedHolder) {
    this.expectedHolder = expectedHolder;
  }

  public TapiEquipmentExpectedEquipment expectedNonFieldReplaceableModule(List<TapiEquipmentExpectedNonFieldReplaceableModule> expectedNonFieldReplaceableModule) {
    this.expectedNonFieldReplaceableModule = expectedNonFieldReplaceableModule;
    return this;
  }

  public TapiEquipmentExpectedEquipment addExpectedNonFieldReplaceableModuleItem(TapiEquipmentExpectedNonFieldReplaceableModule expectedNonFieldReplaceableModuleItem) {
    if (this.expectedNonFieldReplaceableModule == null) {
      this.expectedNonFieldReplaceableModule = new ArrayList<TapiEquipmentExpectedNonFieldReplaceableModule>();
    }
    this.expectedNonFieldReplaceableModule.add(expectedNonFieldReplaceableModuleItem);
    return this;
  }

  /**
   * none
   * @return expectedNonFieldReplaceableModule
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiEquipmentExpectedNonFieldReplaceableModule> getExpectedNonFieldReplaceableModule() {
    return expectedNonFieldReplaceableModule;
  }

  public void setExpectedNonFieldReplaceableModule(List<TapiEquipmentExpectedNonFieldReplaceableModule> expectedNonFieldReplaceableModule) {
    this.expectedNonFieldReplaceableModule = expectedNonFieldReplaceableModule;
  }

  public TapiEquipmentExpectedEquipment commonEquipmentProperties(TapiEquipmentCommonEquipmentProperties commonEquipmentProperties) {
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
    TapiEquipmentExpectedEquipment tapiEquipmentExpectedEquipment = (TapiEquipmentExpectedEquipment) o;
    return Objects.equals(this.expectedHolder, tapiEquipmentExpectedEquipment.expectedHolder) &&
        Objects.equals(this.expectedNonFieldReplaceableModule, tapiEquipmentExpectedEquipment.expectedNonFieldReplaceableModule) &&
        Objects.equals(this.commonEquipmentProperties, tapiEquipmentExpectedEquipment.commonEquipmentProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedHolder, expectedNonFieldReplaceableModule, commonEquipmentProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentExpectedEquipment {\n");
    
    sb.append("    expectedHolder: ").append(toIndentedString(expectedHolder)).append("\n");
    sb.append("    expectedNonFieldReplaceableModule: ").append(toIndentedString(expectedNonFieldReplaceableModule)).append("\n");
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
