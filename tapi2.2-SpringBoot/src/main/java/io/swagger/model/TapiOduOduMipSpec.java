package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduOduDefectPac;
import io.swagger.model.TapiOduOduMipPac;
import io.swagger.model.TapiOduOduNcmPac;
import io.swagger.model.TapiOduOduPmPac;
import io.swagger.model.TapiOduOduTcmMipPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduMipSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOduOduMipSpec   {
  @JsonProperty("odu-defect")
  private TapiOduOduDefectPac oduDefect = null;

  @JsonProperty("odu-mip")
  private TapiOduOduMipPac oduMip = null;

  @JsonProperty("odu-ncm")
  private TapiOduOduNcmPac oduNcm = null;

  @JsonProperty("odu-pm")
  private TapiOduOduPmPac oduPm = null;

  @JsonProperty("odu-tcm")
  private TapiOduOduTcmMipPac oduTcm = null;

  public TapiOduOduMipSpec oduDefect(TapiOduOduDefectPac oduDefect) {
    this.oduDefect = oduDefect;
    return this;
  }

  /**
   * Get oduDefect
   * @return oduDefect
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduDefectPac getOduDefect() {
    return oduDefect;
  }

  public void setOduDefect(TapiOduOduDefectPac oduDefect) {
    this.oduDefect = oduDefect;
  }

  public TapiOduOduMipSpec oduMip(TapiOduOduMipPac oduMip) {
    this.oduMip = oduMip;
    return this;
  }

  /**
   * Get oduMip
   * @return oduMip
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduMipPac getOduMip() {
    return oduMip;
  }

  public void setOduMip(TapiOduOduMipPac oduMip) {
    this.oduMip = oduMip;
  }

  public TapiOduOduMipSpec oduNcm(TapiOduOduNcmPac oduNcm) {
    this.oduNcm = oduNcm;
    return this;
  }

  /**
   * Get oduNcm
   * @return oduNcm
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduNcmPac getOduNcm() {
    return oduNcm;
  }

  public void setOduNcm(TapiOduOduNcmPac oduNcm) {
    this.oduNcm = oduNcm;
  }

  public TapiOduOduMipSpec oduPm(TapiOduOduPmPac oduPm) {
    this.oduPm = oduPm;
    return this;
  }

  /**
   * Get oduPm
   * @return oduPm
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduPmPac getOduPm() {
    return oduPm;
  }

  public void setOduPm(TapiOduOduPmPac oduPm) {
    this.oduPm = oduPm;
  }

  public TapiOduOduMipSpec oduTcm(TapiOduOduTcmMipPac oduTcm) {
    this.oduTcm = oduTcm;
    return this;
  }

  /**
   * Get oduTcm
   * @return oduTcm
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduTcmMipPac getOduTcm() {
    return oduTcm;
  }

  public void setOduTcm(TapiOduOduTcmMipPac oduTcm) {
    this.oduTcm = oduTcm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduMipSpec tapiOduOduMipSpec = (TapiOduOduMipSpec) o;
    return Objects.equals(this.oduDefect, tapiOduOduMipSpec.oduDefect) &&
        Objects.equals(this.oduMip, tapiOduOduMipSpec.oduMip) &&
        Objects.equals(this.oduNcm, tapiOduOduMipSpec.oduNcm) &&
        Objects.equals(this.oduPm, tapiOduOduMipSpec.oduPm) &&
        Objects.equals(this.oduTcm, tapiOduOduMipSpec.oduTcm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oduDefect, oduMip, oduNcm, oduPm, oduTcm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduMipSpec {\n");
    
    sb.append("    oduDefect: ").append(toIndentedString(oduDefect)).append("\n");
    sb.append("    oduMip: ").append(toIndentedString(oduMip)).append("\n");
    sb.append("    oduNcm: ").append(toIndentedString(oduNcm)).append("\n");
    sb.append("    oduPm: ").append(toIndentedString(oduPm)).append("\n");
    sb.append("    oduTcm: ").append(toIndentedString(oduTcm)).append("\n");
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
