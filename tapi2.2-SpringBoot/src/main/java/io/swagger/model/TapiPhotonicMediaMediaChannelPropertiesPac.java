package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaPowerProperties;
import io.swagger.model.TapiPhotonicMediaSpectrumBand;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaMediaChannelPropertiesPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaMediaChannelPropertiesPac   {
  @JsonProperty("measured-power-egress")
  private TapiPhotonicMediaPowerProperties measuredPowerEgress = null;

  @JsonProperty("measured-power-ingress")
  private TapiPhotonicMediaPowerProperties measuredPowerIngress = null;

  @JsonProperty("occupied-spectrum")
  private TapiPhotonicMediaSpectrumBand occupiedSpectrum = null;

  public TapiPhotonicMediaMediaChannelPropertiesPac measuredPowerEgress(TapiPhotonicMediaPowerProperties measuredPowerEgress) {
    this.measuredPowerEgress = measuredPowerEgress;
    return this;
  }

  /**
   * Get measuredPowerEgress
   * @return measuredPowerEgress
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerProperties getMeasuredPowerEgress() {
    return measuredPowerEgress;
  }

  public void setMeasuredPowerEgress(TapiPhotonicMediaPowerProperties measuredPowerEgress) {
    this.measuredPowerEgress = measuredPowerEgress;
  }

  public TapiPhotonicMediaMediaChannelPropertiesPac measuredPowerIngress(TapiPhotonicMediaPowerProperties measuredPowerIngress) {
    this.measuredPowerIngress = measuredPowerIngress;
    return this;
  }

  /**
   * Get measuredPowerIngress
   * @return measuredPowerIngress
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaPowerProperties getMeasuredPowerIngress() {
    return measuredPowerIngress;
  }

  public void setMeasuredPowerIngress(TapiPhotonicMediaPowerProperties measuredPowerIngress) {
    this.measuredPowerIngress = measuredPowerIngress;
  }

  public TapiPhotonicMediaMediaChannelPropertiesPac occupiedSpectrum(TapiPhotonicMediaSpectrumBand occupiedSpectrum) {
    this.occupiedSpectrum = occupiedSpectrum;
    return this;
  }

  /**
   * Get occupiedSpectrum
   * @return occupiedSpectrum
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaSpectrumBand getOccupiedSpectrum() {
    return occupiedSpectrum;
  }

  public void setOccupiedSpectrum(TapiPhotonicMediaSpectrumBand occupiedSpectrum) {
    this.occupiedSpectrum = occupiedSpectrum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaMediaChannelPropertiesPac tapiPhotonicMediaMediaChannelPropertiesPac = (TapiPhotonicMediaMediaChannelPropertiesPac) o;
    return Objects.equals(this.measuredPowerEgress, tapiPhotonicMediaMediaChannelPropertiesPac.measuredPowerEgress) &&
        Objects.equals(this.measuredPowerIngress, tapiPhotonicMediaMediaChannelPropertiesPac.measuredPowerIngress) &&
        Objects.equals(this.occupiedSpectrum, tapiPhotonicMediaMediaChannelPropertiesPac.occupiedSpectrum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measuredPowerEgress, measuredPowerIngress, occupiedSpectrum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaMediaChannelPropertiesPac {\n");
    
    sb.append("    measuredPowerEgress: ").append(toIndentedString(measuredPowerEgress)).append("\n");
    sb.append("    measuredPowerIngress: ").append(toIndentedString(measuredPowerIngress)).append("\n");
    sb.append("    occupiedSpectrum: ").append(toIndentedString(occupiedSpectrum)).append("\n");
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
