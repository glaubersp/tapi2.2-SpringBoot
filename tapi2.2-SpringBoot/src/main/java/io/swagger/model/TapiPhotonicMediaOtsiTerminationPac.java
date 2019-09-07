package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaApplicationIdentifier;
import io.swagger.model.TapiPhotonicMediaCentralFrequency;
import io.swagger.model.TapiPhotonicMediaLaserProperties;
import io.swagger.model.TapiPhotonicMediaPowerProperties;
import io.swagger.model.TapiPhotonicMediaSelectedModulation;
import io.swagger.model.TapiPhotonicMediaSpectrumBand;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaOtsiTerminationPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaOtsiTerminationPac   {
  @JsonProperty("laser-properties")
  private TapiPhotonicMediaLaserProperties laserProperties = null;

  @JsonProperty("received-power")
  private TapiPhotonicMediaPowerProperties receivedPower = null;

  @JsonProperty("selected-application-identifier")
  private TapiPhotonicMediaApplicationIdentifier selectedApplicationIdentifier = null;

  @JsonProperty("selected-central-frequency")
  private TapiPhotonicMediaCentralFrequency selectedCentralFrequency = null;

  @JsonProperty("selected-modulation")
  private TapiPhotonicMediaSelectedModulation selectedModulation = null;

  @JsonProperty("selected-spectrum")
  private TapiPhotonicMediaSpectrumBand selectedSpectrum = null;

  @JsonProperty("transmited-power")
  private TapiPhotonicMediaPowerProperties transmitedPower = null;

  public TapiPhotonicMediaOtsiTerminationPac laserProperties(TapiPhotonicMediaLaserProperties laserProperties) {
    this.laserProperties = laserProperties;
    return this;
  }

  /**
   * Get laserProperties
   * @return laserProperties
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaLaserProperties getLaserProperties() {
    return laserProperties;
  }

  public void setLaserProperties(TapiPhotonicMediaLaserProperties laserProperties) {
    this.laserProperties = laserProperties;
  }

  public TapiPhotonicMediaOtsiTerminationPac receivedPower(TapiPhotonicMediaPowerProperties receivedPower) {
    this.receivedPower = receivedPower;
    return this;
  }

  /**
   * Get receivedPower
   * @return receivedPower
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerProperties getReceivedPower() {
    return receivedPower;
  }

  public void setReceivedPower(TapiPhotonicMediaPowerProperties receivedPower) {
    this.receivedPower = receivedPower;
  }

  public TapiPhotonicMediaOtsiTerminationPac selectedApplicationIdentifier(TapiPhotonicMediaApplicationIdentifier selectedApplicationIdentifier) {
    this.selectedApplicationIdentifier = selectedApplicationIdentifier;
    return this;
  }

  /**
   * Get selectedApplicationIdentifier
   * @return selectedApplicationIdentifier
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaApplicationIdentifier getSelectedApplicationIdentifier() {
    return selectedApplicationIdentifier;
  }

  public void setSelectedApplicationIdentifier(TapiPhotonicMediaApplicationIdentifier selectedApplicationIdentifier) {
    this.selectedApplicationIdentifier = selectedApplicationIdentifier;
  }

  public TapiPhotonicMediaOtsiTerminationPac selectedCentralFrequency(TapiPhotonicMediaCentralFrequency selectedCentralFrequency) {
    this.selectedCentralFrequency = selectedCentralFrequency;
    return this;
  }

  /**
   * Get selectedCentralFrequency
   * @return selectedCentralFrequency
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaCentralFrequency getSelectedCentralFrequency() {
    return selectedCentralFrequency;
  }

  public void setSelectedCentralFrequency(TapiPhotonicMediaCentralFrequency selectedCentralFrequency) {
    this.selectedCentralFrequency = selectedCentralFrequency;
  }

  public TapiPhotonicMediaOtsiTerminationPac selectedModulation(TapiPhotonicMediaSelectedModulation selectedModulation) {
    this.selectedModulation = selectedModulation;
    return this;
  }

  /**
   * Get selectedModulation
   * @return selectedModulation
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaSelectedModulation getSelectedModulation() {
    return selectedModulation;
  }

  public void setSelectedModulation(TapiPhotonicMediaSelectedModulation selectedModulation) {
    this.selectedModulation = selectedModulation;
  }

  public TapiPhotonicMediaOtsiTerminationPac selectedSpectrum(TapiPhotonicMediaSpectrumBand selectedSpectrum) {
    this.selectedSpectrum = selectedSpectrum;
    return this;
  }

  /**
   * Get selectedSpectrum
   * @return selectedSpectrum
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaSpectrumBand getSelectedSpectrum() {
    return selectedSpectrum;
  }

  public void setSelectedSpectrum(TapiPhotonicMediaSpectrumBand selectedSpectrum) {
    this.selectedSpectrum = selectedSpectrum;
  }

  public TapiPhotonicMediaOtsiTerminationPac transmitedPower(TapiPhotonicMediaPowerProperties transmitedPower) {
    this.transmitedPower = transmitedPower;
    return this;
  }

  /**
   * Get transmitedPower
   * @return transmitedPower
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerProperties getTransmitedPower() {
    return transmitedPower;
  }

  public void setTransmitedPower(TapiPhotonicMediaPowerProperties transmitedPower) {
    this.transmitedPower = transmitedPower;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaOtsiTerminationPac tapiPhotonicMediaOtsiTerminationPac = (TapiPhotonicMediaOtsiTerminationPac) o;
    return Objects.equals(this.laserProperties, tapiPhotonicMediaOtsiTerminationPac.laserProperties) &&
        Objects.equals(this.receivedPower, tapiPhotonicMediaOtsiTerminationPac.receivedPower) &&
        Objects.equals(this.selectedApplicationIdentifier, tapiPhotonicMediaOtsiTerminationPac.selectedApplicationIdentifier) &&
        Objects.equals(this.selectedCentralFrequency, tapiPhotonicMediaOtsiTerminationPac.selectedCentralFrequency) &&
        Objects.equals(this.selectedModulation, tapiPhotonicMediaOtsiTerminationPac.selectedModulation) &&
        Objects.equals(this.selectedSpectrum, tapiPhotonicMediaOtsiTerminationPac.selectedSpectrum) &&
        Objects.equals(this.transmitedPower, tapiPhotonicMediaOtsiTerminationPac.transmitedPower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(laserProperties, receivedPower, selectedApplicationIdentifier, selectedCentralFrequency, selectedModulation, selectedSpectrum, transmitedPower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaOtsiTerminationPac {\n");
    
    sb.append("    laserProperties: ").append(toIndentedString(laserProperties)).append("\n");
    sb.append("    receivedPower: ").append(toIndentedString(receivedPower)).append("\n");
    sb.append("    selectedApplicationIdentifier: ").append(toIndentedString(selectedApplicationIdentifier)).append("\n");
    sb.append("    selectedCentralFrequency: ").append(toIndentedString(selectedCentralFrequency)).append("\n");
    sb.append("    selectedModulation: ").append(toIndentedString(selectedModulation)).append("\n");
    sb.append("    selectedSpectrum: ").append(toIndentedString(selectedSpectrum)).append("\n");
    sb.append("    transmitedPower: ").append(toIndentedString(transmitedPower)).append("\n");
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
