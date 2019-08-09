package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthMeasurementJobControlCommon;
import io.swagger.model.TapiEthOamPduGenerationType;
import io.swagger.model.TapiEthRepetitionPeriod;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthOnDemandMeasurementJobControlSource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthOnDemandMeasurementJobControlSource extends TapiEthEthMeasurementJobControlCommon  {
  @JsonProperty("data-tlv-length")
  private Integer dataTlvLength = null;

  @JsonProperty("destination-address")
  private String destinationAddress = null;

  @JsonProperty("oam-pdu-generation-type")
  private TapiEthOamPduGenerationType oamPduGenerationType = null;

  @JsonProperty("controller-mep-id")
  private Integer controllerMepId = null;

  public TapiEthEthOnDemandMeasurementJobControlSource dataTlvLength(Integer dataTlvLength) {
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

  public TapiEthEthOnDemandMeasurementJobControlSource destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

  /**
   * This attribute contains the MAC address of the peer MEP. See G.8013 for details.
   * @return destinationAddress
  **/
  @ApiModelProperty(value = "This attribute contains the MAC address of the peer MEP. See G.8013 for details.")

  public String getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public TapiEthEthOnDemandMeasurementJobControlSource oamPduGenerationType(TapiEthOamPduGenerationType oamPduGenerationType) {
    this.oamPduGenerationType = oamPduGenerationType;
    return this;
  }

  /**
   * Get oamPduGenerationType
   * @return oamPduGenerationType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthOamPduGenerationType getOamPduGenerationType() {
    return oamPduGenerationType;
  }

  public void setOamPduGenerationType(TapiEthOamPduGenerationType oamPduGenerationType) {
    this.oamPduGenerationType = oamPduGenerationType;
  }

  public TapiEthEthOnDemandMeasurementJobControlSource controllerMepId(Integer controllerMepId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthOnDemandMeasurementJobControlSource tapiEthEthOnDemandMeasurementJobControlSource = (TapiEthEthOnDemandMeasurementJobControlSource) o;
    return Objects.equals(this.dataTlvLength, tapiEthEthOnDemandMeasurementJobControlSource.dataTlvLength) &&
        Objects.equals(this.destinationAddress, tapiEthEthOnDemandMeasurementJobControlSource.destinationAddress) &&
        Objects.equals(this.oamPduGenerationType, tapiEthEthOnDemandMeasurementJobControlSource.oamPduGenerationType) &&
        Objects.equals(this.controllerMepId, tapiEthEthOnDemandMeasurementJobControlSource.controllerMepId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTlvLength, destinationAddress, oamPduGenerationType, controllerMepId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOnDemandMeasurementJobControlSource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataTlvLength: ").append(toIndentedString(dataTlvLength)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    oamPduGenerationType: ").append(toIndentedString(oamPduGenerationType)).append("\n");
    sb.append("    controllerMepId: ").append(toIndentedString(controllerMepId)).append("\n");
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
