package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaApplicationIdentifier;
import io.swagger.model.TapiPhotonicMediaCentralFrequency;
import io.swagger.model.TapiPhotonicMediaLaserControlType;
import io.swagger.model.TapiPhotonicMediaModulationTechnique;
import io.swagger.model.TapiPhotonicMediaPowerProperties;
import io.swagger.model.TapiPhotonicMediaSpectrumBand;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaOtsiTerminationConfigPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaOtsiTerminationConfigPac   {
  @JsonProperty("application-identifier")
  private TapiPhotonicMediaApplicationIdentifier applicationIdentifier = null;

  @JsonProperty("central-frequency")
  private TapiPhotonicMediaCentralFrequency centralFrequency = null;

  @JsonProperty("laser-control")
  private TapiPhotonicMediaLaserControlType laserControl = null;

  @JsonProperty("modulation")
  private TapiPhotonicMediaModulationTechnique modulation = null;

  @JsonProperty("spectrum")
  private TapiPhotonicMediaSpectrumBand spectrum = null;

  @JsonProperty("total-power-warn-threshold-lower")
  private String totalPowerWarnThresholdLower = null;

  @JsonProperty("total-power-warn-threshold-upper")
  private String totalPowerWarnThresholdUpper = null;

  @JsonProperty("transmit-power")
  private TapiPhotonicMediaPowerProperties transmitPower = null;

  public TapiPhotonicMediaOtsiTerminationConfigPac applicationIdentifier(TapiPhotonicMediaApplicationIdentifier applicationIdentifier) {
    this.applicationIdentifier = applicationIdentifier;
    return this;
  }

  /**
   * Get applicationIdentifier
   * @return applicationIdentifier
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaApplicationIdentifier getApplicationIdentifier() {
    return applicationIdentifier;
  }

  public void setApplicationIdentifier(TapiPhotonicMediaApplicationIdentifier applicationIdentifier) {
    this.applicationIdentifier = applicationIdentifier;
  }

  public TapiPhotonicMediaOtsiTerminationConfigPac centralFrequency(TapiPhotonicMediaCentralFrequency centralFrequency) {
    this.centralFrequency = centralFrequency;
    return this;
  }

  /**
   * Get centralFrequency
   * @return centralFrequency
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaCentralFrequency getCentralFrequency() {
    return centralFrequency;
  }

  public void setCentralFrequency(TapiPhotonicMediaCentralFrequency centralFrequency) {
    this.centralFrequency = centralFrequency;
  }

  public TapiPhotonicMediaOtsiTerminationConfigPac laserControl(TapiPhotonicMediaLaserControlType laserControl) {
    this.laserControl = laserControl;
    return this;
  }

  /**
   * Get laserControl
   * @return laserControl
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaLaserControlType getLaserControl() {
    return laserControl;
  }

  public void setLaserControl(TapiPhotonicMediaLaserControlType laserControl) {
    this.laserControl = laserControl;
  }

  public TapiPhotonicMediaOtsiTerminationConfigPac modulation(TapiPhotonicMediaModulationTechnique modulation) {
    this.modulation = modulation;
    return this;
  }

  /**
   * Get modulation
   * @return modulation
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaModulationTechnique getModulation() {
    return modulation;
  }

  public void setModulation(TapiPhotonicMediaModulationTechnique modulation) {
    this.modulation = modulation;
  }

  public TapiPhotonicMediaOtsiTerminationConfigPac spectrum(TapiPhotonicMediaSpectrumBand spectrum) {
    this.spectrum = spectrum;
    return this;
  }

  /**
   * Get spectrum
   * @return spectrum
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaSpectrumBand getSpectrum() {
    return spectrum;
  }

  public void setSpectrum(TapiPhotonicMediaSpectrumBand spectrum) {
    this.spectrum = spectrum;
  }

  public TapiPhotonicMediaOtsiTerminationConfigPac totalPowerWarnThresholdLower(String totalPowerWarnThresholdLower) {
    this.totalPowerWarnThresholdLower = totalPowerWarnThresholdLower;
    return this;
  }

  /**
   * Allows to configure the Lowerpower threshold which is expected to be different from Default, but within the Min and Max values specified as OTSi SIP capability.
   * @return totalPowerWarnThresholdLower
  **/
  @ApiModelProperty(value = "Allows to configure the Lowerpower threshold which is expected to be different from Default, but within the Min and Max values specified as OTSi SIP capability.")

  public String getTotalPowerWarnThresholdLower() {
    return totalPowerWarnThresholdLower;
  }

  public void setTotalPowerWarnThresholdLower(String totalPowerWarnThresholdLower) {
    this.totalPowerWarnThresholdLower = totalPowerWarnThresholdLower;
  }

  public TapiPhotonicMediaOtsiTerminationConfigPac totalPowerWarnThresholdUpper(String totalPowerWarnThresholdUpper) {
    this.totalPowerWarnThresholdUpper = totalPowerWarnThresholdUpper;
    return this;
  }

  /**
   * Allows to configure the Upper power threshold which is expected to be different from Default, but within the Min and Max values specified as OTSi SIP capability.
   * @return totalPowerWarnThresholdUpper
  **/
  @ApiModelProperty(value = "Allows to configure the Upper power threshold which is expected to be different from Default, but within the Min and Max values specified as OTSi SIP capability.")

  public String getTotalPowerWarnThresholdUpper() {
    return totalPowerWarnThresholdUpper;
  }

  public void setTotalPowerWarnThresholdUpper(String totalPowerWarnThresholdUpper) {
    this.totalPowerWarnThresholdUpper = totalPowerWarnThresholdUpper;
  }

  public TapiPhotonicMediaOtsiTerminationConfigPac transmitPower(TapiPhotonicMediaPowerProperties transmitPower) {
    this.transmitPower = transmitPower;
    return this;
  }

  /**
   * Get transmitPower
   * @return transmitPower
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerProperties getTransmitPower() {
    return transmitPower;
  }

  public void setTransmitPower(TapiPhotonicMediaPowerProperties transmitPower) {
    this.transmitPower = transmitPower;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaOtsiTerminationConfigPac tapiPhotonicMediaOtsiTerminationConfigPac = (TapiPhotonicMediaOtsiTerminationConfigPac) o;
    return Objects.equals(this.applicationIdentifier, tapiPhotonicMediaOtsiTerminationConfigPac.applicationIdentifier) &&
        Objects.equals(this.centralFrequency, tapiPhotonicMediaOtsiTerminationConfigPac.centralFrequency) &&
        Objects.equals(this.laserControl, tapiPhotonicMediaOtsiTerminationConfigPac.laserControl) &&
        Objects.equals(this.modulation, tapiPhotonicMediaOtsiTerminationConfigPac.modulation) &&
        Objects.equals(this.spectrum, tapiPhotonicMediaOtsiTerminationConfigPac.spectrum) &&
        Objects.equals(this.totalPowerWarnThresholdLower, tapiPhotonicMediaOtsiTerminationConfigPac.totalPowerWarnThresholdLower) &&
        Objects.equals(this.totalPowerWarnThresholdUpper, tapiPhotonicMediaOtsiTerminationConfigPac.totalPowerWarnThresholdUpper) &&
        Objects.equals(this.transmitPower, tapiPhotonicMediaOtsiTerminationConfigPac.transmitPower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationIdentifier, centralFrequency, laserControl, modulation, spectrum, totalPowerWarnThresholdLower, totalPowerWarnThresholdUpper, transmitPower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaOtsiTerminationConfigPac {\n");
    
    sb.append("    applicationIdentifier: ").append(toIndentedString(applicationIdentifier)).append("\n");
    sb.append("    centralFrequency: ").append(toIndentedString(centralFrequency)).append("\n");
    sb.append("    laserControl: ").append(toIndentedString(laserControl)).append("\n");
    sb.append("    modulation: ").append(toIndentedString(modulation)).append("\n");
    sb.append("    spectrum: ").append(toIndentedString(spectrum)).append("\n");
    sb.append("    totalPowerWarnThresholdLower: ").append(toIndentedString(totalPowerWarnThresholdLower)).append("\n");
    sb.append("    totalPowerWarnThresholdUpper: ").append(toIndentedString(totalPowerWarnThresholdUpper)).append("\n");
    sb.append("    transmitPower: ").append(toIndentedString(transmitPower)).append("\n");
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
