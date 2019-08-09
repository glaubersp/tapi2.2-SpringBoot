package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaApplicationIdentifier;
import io.swagger.model.TapiPhotonicMediaCentralFrequencyBand;
import io.swagger.model.TapiPhotonicMediaModulationTechnique;
import io.swagger.model.TapiPhotonicMediaTotalPowerThresholdPac;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaOtsiCapabilityPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaOtsiCapabilityPac   {
  @JsonProperty("supportable-application-identifier")
  @Valid
  private List<TapiPhotonicMediaApplicationIdentifier> supportableApplicationIdentifier = null;

  @JsonProperty("supportable-modulation")
  @Valid
  private List<TapiPhotonicMediaModulationTechnique> supportableModulation = null;

  @JsonProperty("total-power-warn-threshold")
  private TapiPhotonicMediaTotalPowerThresholdPac totalPowerWarnThreshold = null;

  @JsonProperty("supportable-central-frequency-band")
  @Valid
  private List<TapiPhotonicMediaCentralFrequencyBand> supportableCentralFrequencyBand = null;

  public TapiPhotonicMediaOtsiCapabilityPac supportableApplicationIdentifier(List<TapiPhotonicMediaApplicationIdentifier> supportableApplicationIdentifier) {
    this.supportableApplicationIdentifier = supportableApplicationIdentifier;
    return this;
  }

  public TapiPhotonicMediaOtsiCapabilityPac addSupportableApplicationIdentifierItem(TapiPhotonicMediaApplicationIdentifier supportableApplicationIdentifierItem) {
    if (this.supportableApplicationIdentifier == null) {
      this.supportableApplicationIdentifier = new ArrayList<TapiPhotonicMediaApplicationIdentifier>();
    }
    this.supportableApplicationIdentifier.add(supportableApplicationIdentifierItem);
    return this;
  }

  /**
   * The list of supportable ApplicationIdentifiers.
   * @return supportableApplicationIdentifier
  **/
  @ApiModelProperty(value = "The list of supportable ApplicationIdentifiers.")
  @Valid
  public List<TapiPhotonicMediaApplicationIdentifier> getSupportableApplicationIdentifier() {
    return supportableApplicationIdentifier;
  }

  public void setSupportableApplicationIdentifier(List<TapiPhotonicMediaApplicationIdentifier> supportableApplicationIdentifier) {
    this.supportableApplicationIdentifier = supportableApplicationIdentifier;
  }

  public TapiPhotonicMediaOtsiCapabilityPac supportableModulation(List<TapiPhotonicMediaModulationTechnique> supportableModulation) {
    this.supportableModulation = supportableModulation;
    return this;
  }

  public TapiPhotonicMediaOtsiCapabilityPac addSupportableModulationItem(TapiPhotonicMediaModulationTechnique supportableModulationItem) {
    if (this.supportableModulation == null) {
      this.supportableModulation = new ArrayList<TapiPhotonicMediaModulationTechnique>();
    }
    this.supportableModulation.add(supportableModulationItem);
    return this;
  }

  /**
   * This parameter defines the modulation used at the source
   * @return supportableModulation
  **/
  @ApiModelProperty(value = "This parameter defines the modulation used at the source")
  @Valid
  public List<TapiPhotonicMediaModulationTechnique> getSupportableModulation() {
    return supportableModulation;
  }

  public void setSupportableModulation(List<TapiPhotonicMediaModulationTechnique> supportableModulation) {
    this.supportableModulation = supportableModulation;
  }

  public TapiPhotonicMediaOtsiCapabilityPac totalPowerWarnThreshold(TapiPhotonicMediaTotalPowerThresholdPac totalPowerWarnThreshold) {
    this.totalPowerWarnThreshold = totalPowerWarnThreshold;
    return this;
  }

  /**
   * Get totalPowerWarnThreshold
   * @return totalPowerWarnThreshold
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaTotalPowerThresholdPac getTotalPowerWarnThreshold() {
    return totalPowerWarnThreshold;
  }

  public void setTotalPowerWarnThreshold(TapiPhotonicMediaTotalPowerThresholdPac totalPowerWarnThreshold) {
    this.totalPowerWarnThreshold = totalPowerWarnThreshold;
  }

  public TapiPhotonicMediaOtsiCapabilityPac supportableCentralFrequencyBand(List<TapiPhotonicMediaCentralFrequencyBand> supportableCentralFrequencyBand) {
    this.supportableCentralFrequencyBand = supportableCentralFrequencyBand;
    return this;
  }

  public TapiPhotonicMediaOtsiCapabilityPac addSupportableCentralFrequencyBandItem(TapiPhotonicMediaCentralFrequencyBand supportableCentralFrequencyBandItem) {
    if (this.supportableCentralFrequencyBand == null) {
      this.supportableCentralFrequencyBand = new ArrayList<TapiPhotonicMediaCentralFrequencyBand>();
    }
    this.supportableCentralFrequencyBand.add(supportableCentralFrequencyBandItem);
    return this;
  }

  /**
   * Each spectrum band supported for otsi trasmitter to be tuned on, is specified                  as per it's lower and upper central frequencies supported and its frequency constraints,                  consisting in the frequency Grid and the AdjustmentGranularity, used to uniquely identify all                  central frequencies supported within the band.
   * @return supportableCentralFrequencyBand
  **/
  @ApiModelProperty(value = "Each spectrum band supported for otsi trasmitter to be tuned on, is specified                  as per it's lower and upper central frequencies supported and its frequency constraints,                  consisting in the frequency Grid and the AdjustmentGranularity, used to uniquely identify all                  central frequencies supported within the band.")
  @Valid
  public List<TapiPhotonicMediaCentralFrequencyBand> getSupportableCentralFrequencyBand() {
    return supportableCentralFrequencyBand;
  }

  public void setSupportableCentralFrequencyBand(List<TapiPhotonicMediaCentralFrequencyBand> supportableCentralFrequencyBand) {
    this.supportableCentralFrequencyBand = supportableCentralFrequencyBand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaOtsiCapabilityPac tapiPhotonicMediaOtsiCapabilityPac = (TapiPhotonicMediaOtsiCapabilityPac) o;
    return Objects.equals(this.supportableApplicationIdentifier, tapiPhotonicMediaOtsiCapabilityPac.supportableApplicationIdentifier) &&
        Objects.equals(this.supportableModulation, tapiPhotonicMediaOtsiCapabilityPac.supportableModulation) &&
        Objects.equals(this.totalPowerWarnThreshold, tapiPhotonicMediaOtsiCapabilityPac.totalPowerWarnThreshold) &&
        Objects.equals(this.supportableCentralFrequencyBand, tapiPhotonicMediaOtsiCapabilityPac.supportableCentralFrequencyBand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportableApplicationIdentifier, supportableModulation, totalPowerWarnThreshold, supportableCentralFrequencyBand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaOtsiCapabilityPac {\n");
    
    sb.append("    supportableApplicationIdentifier: ").append(toIndentedString(supportableApplicationIdentifier)).append("\n");
    sb.append("    supportableModulation: ").append(toIndentedString(supportableModulation)).append("\n");
    sb.append("    totalPowerWarnThreshold: ").append(toIndentedString(totalPowerWarnThreshold)).append("\n");
    sb.append("    supportableCentralFrequencyBand: ").append(toIndentedString(supportableCentralFrequencyBand)).append("\n");
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
