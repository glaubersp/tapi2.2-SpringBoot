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
 * TapiEquipmentCommonActualProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEquipmentCommonActualProperties   {
  @JsonProperty("asset-instance-identifier")
  private String assetInstanceIdentifier = null;

  @JsonProperty("is-powered")
  private Boolean isPowered = false;

  @JsonProperty("manufacture-date")
  private String manufactureDate = null;

  @JsonProperty("serial-number")
  private String serialNumber = null;

  @JsonProperty("temperature")
  private String temperature = null;

  public TapiEquipmentCommonActualProperties assetInstanceIdentifier(String assetInstanceIdentifier) {
    this.assetInstanceIdentifier = assetInstanceIdentifier;
    return this;
  }

  /**
   * This attribute represents the asset identifier of this instance from the manufacturer's perspective.
   * @return assetInstanceIdentifier
  **/
  @ApiModelProperty(value = "This attribute represents the asset identifier of this instance from the manufacturer's perspective.")

  public String getAssetInstanceIdentifier() {
    return assetInstanceIdentifier;
  }

  public void setAssetInstanceIdentifier(String assetInstanceIdentifier) {
    this.assetInstanceIdentifier = assetInstanceIdentifier;
  }

  public TapiEquipmentCommonActualProperties isPowered(Boolean isPowered) {
    this.isPowered = isPowered;
    return this;
  }

  /**
   * The state of the power being supplied to the equipment.                  Note that this attribute summarizes the power state.                   Full details on the actual power system would be provided from a number of PC instances representing the relevant parts of the Power function (e.g. different voltage supplies).
   * @return isPowered
  **/
  @ApiModelProperty(value = "The state of the power being supplied to the equipment.                  Note that this attribute summarizes the power state.                   Full details on the actual power system would be provided from a number of PC instances representing the relevant parts of the Power function (e.g. different voltage supplies).")

  public Boolean isIsPowered() {
    return isPowered;
  }

  public void setIsPowered(Boolean isPowered) {
    this.isPowered = isPowered;
  }

  public TapiEquipmentCommonActualProperties manufactureDate(String manufactureDate) {
    this.manufactureDate = manufactureDate;
    return this;
  }

  /**
   * This attribute represents the date on which this instance is manufactured.
   * @return manufactureDate
  **/
  @ApiModelProperty(value = "This attribute represents the date on which this instance is manufactured.")

  public String getManufactureDate() {
    return manufactureDate;
  }

  public void setManufactureDate(String manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  public TapiEquipmentCommonActualProperties serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * This attribute represents the serial number of this instance.
   * @return serialNumber
  **/
  @ApiModelProperty(value = "This attribute represents the serial number of this instance.")

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public TapiEquipmentCommonActualProperties temperature(String temperature) {
    this.temperature = temperature;
    return this;
  }

  /**
   * The measured temperature of the Equipment.
   * @return temperature
  **/
  @ApiModelProperty(value = "The measured temperature of the Equipment.")

  public String getTemperature() {
    return temperature;
  }

  public void setTemperature(String temperature) {
    this.temperature = temperature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentCommonActualProperties tapiEquipmentCommonActualProperties = (TapiEquipmentCommonActualProperties) o;
    return Objects.equals(this.assetInstanceIdentifier, tapiEquipmentCommonActualProperties.assetInstanceIdentifier) &&
        Objects.equals(this.isPowered, tapiEquipmentCommonActualProperties.isPowered) &&
        Objects.equals(this.manufactureDate, tapiEquipmentCommonActualProperties.manufactureDate) &&
        Objects.equals(this.serialNumber, tapiEquipmentCommonActualProperties.serialNumber) &&
        Objects.equals(this.temperature, tapiEquipmentCommonActualProperties.temperature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetInstanceIdentifier, isPowered, manufactureDate, serialNumber, temperature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentCommonActualProperties {\n");
    
    sb.append("    assetInstanceIdentifier: ").append(toIndentedString(assetInstanceIdentifier)).append("\n");
    sb.append("    isPowered: ").append(toIndentedString(isPowered)).append("\n");
    sb.append("    manufactureDate: ").append(toIndentedString(manufactureDate)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
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
