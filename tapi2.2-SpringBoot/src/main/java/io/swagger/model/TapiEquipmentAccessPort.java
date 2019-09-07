package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiEquipmentConnectorPinAddress;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentAccessPort
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEquipmentAccessPort extends TapiCommonGlobalClass  {
  @JsonProperty("connector-pin")
  @Valid
  private List<TapiEquipmentConnectorPinAddress> connectorPin = null;

  public TapiEquipmentAccessPort connectorPin(List<TapiEquipmentConnectorPinAddress> connectorPin) {
    this.connectorPin = connectorPin;
    return this;
  }

  public TapiEquipmentAccessPort addConnectorPinItem(TapiEquipmentConnectorPinAddress connectorPinItem) {
    if (this.connectorPin == null) {
      this.connectorPin = new ArrayList<>();
    }
    this.connectorPin.add(connectorPinItem);
    return this;
  }

  /**
   * The list of Pins that support the AccessPort.
   * @return connectorPin
  **/
  @ApiModelProperty(value = "The list of Pins that support the AccessPort.")
  @Valid
  public List<TapiEquipmentConnectorPinAddress> getConnectorPin() {
    return connectorPin;
  }

  public void setConnectorPin(List<TapiEquipmentConnectorPinAddress> connectorPin) {
    this.connectorPin = connectorPin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentAccessPort tapiEquipmentAccessPort = (TapiEquipmentAccessPort) o;
    return Objects.equals(this.connectorPin, tapiEquipmentAccessPort.connectorPin) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectorPin, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentAccessPort {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    connectorPin: ").append(toIndentedString(connectorPin)).append("\n");
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
