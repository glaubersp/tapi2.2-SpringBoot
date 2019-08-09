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
 * TapiEquipmentConnectorPinAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentConnectorPinAddress   {
  @JsonProperty("connector-identification")
  private String connectorIdentification = null;

  @JsonProperty("equipment-uuid")
  private String equipmentUuid = null;

  @JsonProperty("pin-identification")
  private String pinIdentification = null;

  public TapiEquipmentConnectorPinAddress connectorIdentification(String connectorIdentification) {
    this.connectorIdentification = connectorIdentification;
    return this;
  }

  /**
   * Identification of the Connector in the conetxt of the referenced Equipment.
   * @return connectorIdentification
  **/
  @ApiModelProperty(value = "Identification of the Connector in the conetxt of the referenced Equipment.")

  public String getConnectorIdentification() {
    return connectorIdentification;
  }

  public void setConnectorIdentification(String connectorIdentification) {
    this.connectorIdentification = connectorIdentification;
  }

  public TapiEquipmentConnectorPinAddress equipmentUuid(String equipmentUuid) {
    this.equipmentUuid = equipmentUuid;
    return this;
  }

  /**
   * Reference to the Equipment that is fitted with the Connector/Pin.
   * @return equipmentUuid
  **/
  @ApiModelProperty(value = "Reference to the Equipment that is fitted with the Connector/Pin.")

  public String getEquipmentUuid() {
    return equipmentUuid;
  }

  public void setEquipmentUuid(String equipmentUuid) {
    this.equipmentUuid = equipmentUuid;
  }

  public TapiEquipmentConnectorPinAddress pinIdentification(String pinIdentification) {
    this.pinIdentification = pinIdentification;
    return this;
  }

  /**
   * Where relevant, identification of the Pin in the contect of the connector.                  Where the whole connector is used, then individual Pins need not be identified.
   * @return pinIdentification
  **/
  @ApiModelProperty(value = "Where relevant, identification of the Pin in the contect of the connector.                  Where the whole connector is used, then individual Pins need not be identified.")

  public String getPinIdentification() {
    return pinIdentification;
  }

  public void setPinIdentification(String pinIdentification) {
    this.pinIdentification = pinIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentConnectorPinAddress tapiEquipmentConnectorPinAddress = (TapiEquipmentConnectorPinAddress) o;
    return Objects.equals(this.connectorIdentification, tapiEquipmentConnectorPinAddress.connectorIdentification) &&
        Objects.equals(this.equipmentUuid, tapiEquipmentConnectorPinAddress.equipmentUuid) &&
        Objects.equals(this.pinIdentification, tapiEquipmentConnectorPinAddress.pinIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectorIdentification, equipmentUuid, pinIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentConnectorPinAddress {\n");
    
    sb.append("    connectorIdentification: ").append(toIndentedString(connectorIdentification)).append("\n");
    sb.append("    equipmentUuid: ").append(toIndentedString(equipmentUuid)).append("\n");
    sb.append("    pinIdentification: ").append(toIndentedString(pinIdentification)).append("\n");
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
