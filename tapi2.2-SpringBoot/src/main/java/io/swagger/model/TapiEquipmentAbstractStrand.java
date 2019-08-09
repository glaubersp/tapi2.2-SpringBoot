package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiEquipmentAbstractStrandRef;
import io.swagger.model.TapiEquipmentConnectorPinAddress;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentAbstractStrand
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEquipmentAbstractStrand extends TapiCommonLocalClass  {
  @JsonProperty("strand-media-characteristics")
  @Valid
  private List<TapiCommonNameAndValue> strandMediaCharacteristics = null;

  @JsonProperty("connector-pin")
  @Valid
  private List<TapiEquipmentConnectorPinAddress> connectorPin = null;

  @JsonProperty("spliced-strand")
  @Valid
  private List<TapiEquipmentAbstractStrandRef> splicedStrand = null;

  @JsonProperty("adjacent-strand")
  @Valid
  private List<TapiEquipmentAbstractStrandRef> adjacentStrand = null;

  public TapiEquipmentAbstractStrand strandMediaCharacteristics(List<TapiCommonNameAndValue> strandMediaCharacteristics) {
    this.strandMediaCharacteristics = strandMediaCharacteristics;
    return this;
  }

  public TapiEquipmentAbstractStrand addStrandMediaCharacteristicsItem(TapiCommonNameAndValue strandMediaCharacteristicsItem) {
    if (this.strandMediaCharacteristics == null) {
      this.strandMediaCharacteristics = new ArrayList<TapiCommonNameAndValue>();
    }
    this.strandMediaCharacteristics.add(strandMediaCharacteristicsItem);
    return this;
  }

  /**
   * Relevant physical properties of the abstract strand.
   * @return strandMediaCharacteristics
  **/
  @ApiModelProperty(value = "Relevant physical properties of the abstract strand.")
  @Valid
  public List<TapiCommonNameAndValue> getStrandMediaCharacteristics() {
    return strandMediaCharacteristics;
  }

  public void setStrandMediaCharacteristics(List<TapiCommonNameAndValue> strandMediaCharacteristics) {
    this.strandMediaCharacteristics = strandMediaCharacteristics;
  }

  public TapiEquipmentAbstractStrand connectorPin(List<TapiEquipmentConnectorPinAddress> connectorPin) {
    this.connectorPin = connectorPin;
    return this;
  }

  public TapiEquipmentAbstractStrand addConnectorPinItem(TapiEquipmentConnectorPinAddress connectorPinItem) {
    if (this.connectorPin == null) {
      this.connectorPin = new ArrayList<TapiEquipmentConnectorPinAddress>();
    }
    this.connectorPin.add(connectorPinItem);
    return this;
  }

  /**
   * A strand can end on two or more Pins (usually 2 pins, but a strand my be spliced to split a signal). This model supports only 2 ended strands.                  A abstract strand may be spliced at both ends and hence have no direct relationship to pins or may be connected to pins at one or both ends.                  In the essential model these Pins would be on connectors that plug in to connectors on Equipments.                  The AbstractStrand is extended to the pins of the AccessPort which are the Pins on the Connectors of the Equipment.                  In some cases it may not be relevant to represent the pin detail and hence the reference is to a connector alone.
   * @return connectorPin
  **/
  @ApiModelProperty(value = "A strand can end on two or more Pins (usually 2 pins, but a strand my be spliced to split a signal). This model supports only 2 ended strands.                  A abstract strand may be spliced at both ends and hence have no direct relationship to pins or may be connected to pins at one or both ends.                  In the essential model these Pins would be on connectors that plug in to connectors on Equipments.                  The AbstractStrand is extended to the pins of the AccessPort which are the Pins on the Connectors of the Equipment.                  In some cases it may not be relevant to represent the pin detail and hence the reference is to a connector alone.")
  @Valid
  public List<TapiEquipmentConnectorPinAddress> getConnectorPin() {
    return connectorPin;
  }

  public void setConnectorPin(List<TapiEquipmentConnectorPinAddress> connectorPin) {
    this.connectorPin = connectorPin;
  }

  public TapiEquipmentAbstractStrand splicedStrand(List<TapiEquipmentAbstractStrandRef> splicedStrand) {
    this.splicedStrand = splicedStrand;
    return this;
  }

  public TapiEquipmentAbstractStrand addSplicedStrandItem(TapiEquipmentAbstractStrandRef splicedStrandItem) {
    if (this.splicedStrand == null) {
      this.splicedStrand = new ArrayList<TapiEquipmentAbstractStrandRef>();
    }
    this.splicedStrand.add(splicedStrandItem);
    return this;
  }

  /**
   * none
   * @return splicedStrand
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiEquipmentAbstractStrandRef> getSplicedStrand() {
    return splicedStrand;
  }

  public void setSplicedStrand(List<TapiEquipmentAbstractStrandRef> splicedStrand) {
    this.splicedStrand = splicedStrand;
  }

  public TapiEquipmentAbstractStrand adjacentStrand(List<TapiEquipmentAbstractStrandRef> adjacentStrand) {
    this.adjacentStrand = adjacentStrand;
    return this;
  }

  public TapiEquipmentAbstractStrand addAdjacentStrandItem(TapiEquipmentAbstractStrandRef adjacentStrandItem) {
    if (this.adjacentStrand == null) {
      this.adjacentStrand = new ArrayList<TapiEquipmentAbstractStrandRef>();
    }
    this.adjacentStrand.add(adjacentStrandItem);
    return this;
  }

  /**
   * none
   * @return adjacentStrand
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiEquipmentAbstractStrandRef> getAdjacentStrand() {
    return adjacentStrand;
  }

  public void setAdjacentStrand(List<TapiEquipmentAbstractStrandRef> adjacentStrand) {
    this.adjacentStrand = adjacentStrand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentAbstractStrand tapiEquipmentAbstractStrand = (TapiEquipmentAbstractStrand) o;
    return Objects.equals(this.strandMediaCharacteristics, tapiEquipmentAbstractStrand.strandMediaCharacteristics) &&
        Objects.equals(this.connectorPin, tapiEquipmentAbstractStrand.connectorPin) &&
        Objects.equals(this.splicedStrand, tapiEquipmentAbstractStrand.splicedStrand) &&
        Objects.equals(this.adjacentStrand, tapiEquipmentAbstractStrand.adjacentStrand) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strandMediaCharacteristics, connectorPin, splicedStrand, adjacentStrand, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentAbstractStrand {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    strandMediaCharacteristics: ").append(toIndentedString(strandMediaCharacteristics)).append("\n");
    sb.append("    connectorPin: ").append(toIndentedString(connectorPin)).append("\n");
    sb.append("    splicedStrand: ").append(toIndentedString(splicedStrand)).append("\n");
    sb.append("    adjacentStrand: ").append(toIndentedString(adjacentStrand)).append("\n");
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
