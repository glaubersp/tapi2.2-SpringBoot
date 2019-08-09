package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaSpectrumBand;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaMediaChannelPoolCapabilityPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaMediaChannelPoolCapabilityPac   {
  @JsonProperty("available-spectrum")
  @Valid
  private List<TapiPhotonicMediaSpectrumBand> availableSpectrum = null;

  @JsonProperty("supportable-spectrum")
  @Valid
  private List<TapiPhotonicMediaSpectrumBand> supportableSpectrum = null;

  @JsonProperty("occupied-spectrum")
  @Valid
  private List<TapiPhotonicMediaSpectrumBand> occupiedSpectrum = null;

  public TapiPhotonicMediaMediaChannelPoolCapabilityPac availableSpectrum(List<TapiPhotonicMediaSpectrumBand> availableSpectrum) {
    this.availableSpectrum = availableSpectrum;
    return this;
  }

  public TapiPhotonicMediaMediaChannelPoolCapabilityPac addAvailableSpectrumItem(TapiPhotonicMediaSpectrumBand availableSpectrumItem) {
    if (this.availableSpectrum == null) {
      this.availableSpectrum = new ArrayList<TapiPhotonicMediaSpectrumBand>();
    }
    this.availableSpectrum.add(availableSpectrumItem);
    return this;
  }

  /**
   * none
   * @return availableSpectrum
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiPhotonicMediaSpectrumBand> getAvailableSpectrum() {
    return availableSpectrum;
  }

  public void setAvailableSpectrum(List<TapiPhotonicMediaSpectrumBand> availableSpectrum) {
    this.availableSpectrum = availableSpectrum;
  }

  public TapiPhotonicMediaMediaChannelPoolCapabilityPac supportableSpectrum(List<TapiPhotonicMediaSpectrumBand> supportableSpectrum) {
    this.supportableSpectrum = supportableSpectrum;
    return this;
  }

  public TapiPhotonicMediaMediaChannelPoolCapabilityPac addSupportableSpectrumItem(TapiPhotonicMediaSpectrumBand supportableSpectrumItem) {
    if (this.supportableSpectrum == null) {
      this.supportableSpectrum = new ArrayList<TapiPhotonicMediaSpectrumBand>();
    }
    this.supportableSpectrum.add(supportableSpectrumItem);
    return this;
  }

  /**
   * none
   * @return supportableSpectrum
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiPhotonicMediaSpectrumBand> getSupportableSpectrum() {
    return supportableSpectrum;
  }

  public void setSupportableSpectrum(List<TapiPhotonicMediaSpectrumBand> supportableSpectrum) {
    this.supportableSpectrum = supportableSpectrum;
  }

  public TapiPhotonicMediaMediaChannelPoolCapabilityPac occupiedSpectrum(List<TapiPhotonicMediaSpectrumBand> occupiedSpectrum) {
    this.occupiedSpectrum = occupiedSpectrum;
    return this;
  }

  public TapiPhotonicMediaMediaChannelPoolCapabilityPac addOccupiedSpectrumItem(TapiPhotonicMediaSpectrumBand occupiedSpectrumItem) {
    if (this.occupiedSpectrum == null) {
      this.occupiedSpectrum = new ArrayList<TapiPhotonicMediaSpectrumBand>();
    }
    this.occupiedSpectrum.add(occupiedSpectrumItem);
    return this;
  }

  /**
   * none
   * @return occupiedSpectrum
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiPhotonicMediaSpectrumBand> getOccupiedSpectrum() {
    return occupiedSpectrum;
  }

  public void setOccupiedSpectrum(List<TapiPhotonicMediaSpectrumBand> occupiedSpectrum) {
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
    TapiPhotonicMediaMediaChannelPoolCapabilityPac tapiPhotonicMediaMediaChannelPoolCapabilityPac = (TapiPhotonicMediaMediaChannelPoolCapabilityPac) o;
    return Objects.equals(this.availableSpectrum, tapiPhotonicMediaMediaChannelPoolCapabilityPac.availableSpectrum) &&
        Objects.equals(this.supportableSpectrum, tapiPhotonicMediaMediaChannelPoolCapabilityPac.supportableSpectrum) &&
        Objects.equals(this.occupiedSpectrum, tapiPhotonicMediaMediaChannelPoolCapabilityPac.occupiedSpectrum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableSpectrum, supportableSpectrum, occupiedSpectrum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaMediaChannelPoolCapabilityPac {\n");
    
    sb.append("    availableSpectrum: ").append(toIndentedString(availableSpectrum)).append("\n");
    sb.append("    supportableSpectrum: ").append(toIndentedString(supportableSpectrum)).append("\n");
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
