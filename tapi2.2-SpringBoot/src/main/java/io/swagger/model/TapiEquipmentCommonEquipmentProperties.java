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
 * TapiEquipmentCommonEquipmentProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEquipmentCommonEquipmentProperties   {
  @JsonProperty("asset-type-identifier")
  private String assetTypeIdentifier = null;

  @JsonProperty("equipment-type-description")
  private String equipmentTypeDescription = null;

  @JsonProperty("equipment-type-identifier")
  private String equipmentTypeIdentifier = null;

  @JsonProperty("equipment-type-name")
  private String equipmentTypeName = null;

  @JsonProperty("equipment-type-version")
  private String equipmentTypeVersion = null;

  @JsonProperty("manufacturer-identifier")
  private String manufacturerIdentifier = null;

  @JsonProperty("manufacturer-name")
  private String manufacturerName = null;

  public TapiEquipmentCommonEquipmentProperties assetTypeIdentifier(String assetTypeIdentifier) {
    this.assetTypeIdentifier = assetTypeIdentifier;
    return this;
  }

  /**
   * Represents the invariant properties of the equipment asset allocated by the operator that define and characterize the type.
   * @return assetTypeIdentifier
  **/
  @ApiModelProperty(value = "Represents the invariant properties of the equipment asset allocated by the operator that define and characterize the type.")

  public String getAssetTypeIdentifier() {
    return assetTypeIdentifier;
  }

  public void setAssetTypeIdentifier(String assetTypeIdentifier) {
    this.assetTypeIdentifier = assetTypeIdentifier;
  }

  public TapiEquipmentCommonEquipmentProperties equipmentTypeDescription(String equipmentTypeDescription) {
    this.equipmentTypeDescription = equipmentTypeDescription;
    return this;
  }

  /**
   * Text describing the type of Equipment.
   * @return equipmentTypeDescription
  **/
  @ApiModelProperty(value = "Text describing the type of Equipment.")

  public String getEquipmentTypeDescription() {
    return equipmentTypeDescription;
  }

  public void setEquipmentTypeDescription(String equipmentTypeDescription) {
    this.equipmentTypeDescription = equipmentTypeDescription;
  }

  public TapiEquipmentCommonEquipmentProperties equipmentTypeIdentifier(String equipmentTypeIdentifier) {
    this.equipmentTypeIdentifier = equipmentTypeIdentifier;
    return this;
  }

  /**
   * This attribute identifies the part type of the equipment.
   * @return equipmentTypeIdentifier
  **/
  @ApiModelProperty(value = "This attribute identifies the part type of the equipment.")

  public String getEquipmentTypeIdentifier() {
    return equipmentTypeIdentifier;
  }

  public void setEquipmentTypeIdentifier(String equipmentTypeIdentifier) {
    this.equipmentTypeIdentifier = equipmentTypeIdentifier;
  }

  public TapiEquipmentCommonEquipmentProperties equipmentTypeName(String equipmentTypeName) {
    this.equipmentTypeName = equipmentTypeName;
    return this;
  }

  /**
   * This attribute identifies the type of the equipment.
   * @return equipmentTypeName
  **/
  @ApiModelProperty(value = "This attribute identifies the type of the equipment.")

  public String getEquipmentTypeName() {
    return equipmentTypeName;
  }

  public void setEquipmentTypeName(String equipmentTypeName) {
    this.equipmentTypeName = equipmentTypeName;
  }

  public TapiEquipmentCommonEquipmentProperties equipmentTypeVersion(String equipmentTypeVersion) {
    this.equipmentTypeVersion = equipmentTypeVersion;
    return this;
  }

  /**
   * This attribute identifies the version of the equipment.
   * @return equipmentTypeVersion
  **/
  @ApiModelProperty(value = "This attribute identifies the version of the equipment.")

  public String getEquipmentTypeVersion() {
    return equipmentTypeVersion;
  }

  public void setEquipmentTypeVersion(String equipmentTypeVersion) {
    this.equipmentTypeVersion = equipmentTypeVersion;
  }

  public TapiEquipmentCommonEquipmentProperties manufacturerIdentifier(String manufacturerIdentifier) {
    this.manufacturerIdentifier = manufacturerIdentifier;
    return this;
  }

  /**
   * The formal unique identifier of the manufacturer.
   * @return manufacturerIdentifier
  **/
  @ApiModelProperty(value = "The formal unique identifier of the manufacturer.")

  public String getManufacturerIdentifier() {
    return manufacturerIdentifier;
  }

  public void setManufacturerIdentifier(String manufacturerIdentifier) {
    this.manufacturerIdentifier = manufacturerIdentifier;
  }

  public TapiEquipmentCommonEquipmentProperties manufacturerName(String manufacturerName) {
    this.manufacturerName = manufacturerName;
    return this;
  }

  /**
   * The formal name of the manufacturer of the Equipment.
   * @return manufacturerName
  **/
  @ApiModelProperty(value = "The formal name of the manufacturer of the Equipment.")

  public String getManufacturerName() {
    return manufacturerName;
  }

  public void setManufacturerName(String manufacturerName) {
    this.manufacturerName = manufacturerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentCommonEquipmentProperties tapiEquipmentCommonEquipmentProperties = (TapiEquipmentCommonEquipmentProperties) o;
    return Objects.equals(this.assetTypeIdentifier, tapiEquipmentCommonEquipmentProperties.assetTypeIdentifier) &&
        Objects.equals(this.equipmentTypeDescription, tapiEquipmentCommonEquipmentProperties.equipmentTypeDescription) &&
        Objects.equals(this.equipmentTypeIdentifier, tapiEquipmentCommonEquipmentProperties.equipmentTypeIdentifier) &&
        Objects.equals(this.equipmentTypeName, tapiEquipmentCommonEquipmentProperties.equipmentTypeName) &&
        Objects.equals(this.equipmentTypeVersion, tapiEquipmentCommonEquipmentProperties.equipmentTypeVersion) &&
        Objects.equals(this.manufacturerIdentifier, tapiEquipmentCommonEquipmentProperties.manufacturerIdentifier) &&
        Objects.equals(this.manufacturerName, tapiEquipmentCommonEquipmentProperties.manufacturerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetTypeIdentifier, equipmentTypeDescription, equipmentTypeIdentifier, equipmentTypeName, equipmentTypeVersion, manufacturerIdentifier, manufacturerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentCommonEquipmentProperties {\n");
    
    sb.append("    assetTypeIdentifier: ").append(toIndentedString(assetTypeIdentifier)).append("\n");
    sb.append("    equipmentTypeDescription: ").append(toIndentedString(equipmentTypeDescription)).append("\n");
    sb.append("    equipmentTypeIdentifier: ").append(toIndentedString(equipmentTypeIdentifier)).append("\n");
    sb.append("    equipmentTypeName: ").append(toIndentedString(equipmentTypeName)).append("\n");
    sb.append("    equipmentTypeVersion: ").append(toIndentedString(equipmentTypeVersion)).append("\n");
    sb.append("    manufacturerIdentifier: ").append(toIndentedString(manufacturerIdentifier)).append("\n");
    sb.append("    manufacturerName: ").append(toIndentedString(manufacturerName)).append("\n");
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
