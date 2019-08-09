package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthMeasurementJobControlCommon;
import io.swagger.model.TapiEthRepetitionPeriod;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthProActiveMeasurementJobControlSource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthProActiveMeasurementJobControlSource extends TapiEthEthMeasurementJobControlCommon  {
  @JsonProperty("data-tlv-length")
  private Integer dataTlvLength = null;

  @JsonProperty("destination-address")
  private String destinationAddress = null;

  @JsonProperty("controller-mep-id")
  private Integer controllerMepId = null;

  @JsonProperty("is-enabled")
  private Boolean isEnabled = true;

  public TapiEthEthProActiveMeasurementJobControlSource dataTlvLength(Integer dataTlvLength) {
    this.dataTlvLength = dataTlvLength;
    return this;
  }

  /**
   * This parameter provides the size of the optional data TLV.                  Non-negative integer represents the number of bytes for the length of the padding TLV.                  Notes:                  When configuring this parameter one should be aware of the maximum allowed total frame size limitation.                  The attribute is not used in case of 2-way loss measurement.                  range of type : Depends on the allowed MTU size.
   * @return dataTlvLength
  **/
  @ApiModelProperty(value = "This parameter provides the size of the optional data TLV.                  Non-negative integer represents the number of bytes for the length of the padding TLV.                  Notes:                  When configuring this parameter one should be aware of the maximum allowed total frame size limitation.                  The attribute is not used in case of 2-way loss measurement.                  range of type : Depends on the allowed MTU size.")

  public Integer getDataTlvLength() {
    return dataTlvLength;
  }

  public void setDataTlvLength(Integer dataTlvLength) {
    this.dataTlvLength = dataTlvLength;
  }

  public TapiEthEthProActiveMeasurementJobControlSource destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

  /**
   * This attribute provides the Unicast MAC address of the intented destination.
   * @return destinationAddress
  **/
  @ApiModelProperty(value = "This attribute provides the Unicast MAC address of the intented destination.")

  public String getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public TapiEthEthProActiveMeasurementJobControlSource controllerMepId(Integer controllerMepId) {
    this.controllerMepId = controllerMepId;
    return this;
  }

  /**
   * none
   * @return controllerMepId
  **/
  @ApiModelProperty(value = "none")

  public Integer getControllerMepId() {
    return controllerMepId;
  }

  public void setControllerMepId(Integer controllerMepId) {
    this.controllerMepId = controllerMepId;
  }

  public TapiEthEthProActiveMeasurementJobControlSource isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * This attribute identifies the state of the measurement job. If set to TRUE, the MEP performs proactive Performance Measurement.
   * @return isEnabled
  **/
  @ApiModelProperty(value = "This attribute identifies the state of the measurement job. If set to TRUE, the MEP performs proactive Performance Measurement.")

  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthProActiveMeasurementJobControlSource tapiEthEthProActiveMeasurementJobControlSource = (TapiEthEthProActiveMeasurementJobControlSource) o;
    return Objects.equals(this.dataTlvLength, tapiEthEthProActiveMeasurementJobControlSource.dataTlvLength) &&
        Objects.equals(this.destinationAddress, tapiEthEthProActiveMeasurementJobControlSource.destinationAddress) &&
        Objects.equals(this.controllerMepId, tapiEthEthProActiveMeasurementJobControlSource.controllerMepId) &&
        Objects.equals(this.isEnabled, tapiEthEthProActiveMeasurementJobControlSource.isEnabled) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTlvLength, destinationAddress, controllerMepId, isEnabled, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthProActiveMeasurementJobControlSource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataTlvLength: ").append(toIndentedString(dataTlvLength)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    controllerMepId: ").append(toIndentedString(controllerMepId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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
