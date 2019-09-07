package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaSpectrumBand;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaMediaChannelConfigPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaMediaChannelConfigPac   {
  @JsonProperty("spectrum")
  private TapiPhotonicMediaSpectrumBand spectrum = null;

  public TapiPhotonicMediaMediaChannelConfigPac spectrum(TapiPhotonicMediaSpectrumBand spectrum) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaMediaChannelConfigPac tapiPhotonicMediaMediaChannelConfigPac = (TapiPhotonicMediaMediaChannelConfigPac) o;
    return Objects.equals(this.spectrum, tapiPhotonicMediaMediaChannelConfigPac.spectrum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spectrum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaMediaChannelConfigPac {\n");
    
    sb.append("    spectrum: ").append(toIndentedString(spectrum)).append("\n");
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
