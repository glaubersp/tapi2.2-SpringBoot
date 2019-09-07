package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduDefectPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOduOduDefectPac   {
  @JsonProperty("bdi")
  private Boolean bdi = false;

  @JsonProperty("deg")
  private Boolean deg = false;

  @JsonProperty("lck")
  private Boolean lck = false;

  @JsonProperty("oci")
  private Boolean oci = false;

  @JsonProperty("ssf")
  private Boolean ssf = false;

  @JsonProperty("tim")
  private Boolean tim = false;

  public TapiOduOduDefectPac bdi(Boolean bdi) {
    this.bdi = bdi;
    return this;
  }

  /**
   * Backward Defect Indication
   * @return bdi
  **/
  @ApiModelProperty(value = "Backward Defect Indication")

  public Boolean isBdi() {
    return bdi;
  }

  public void setBdi(Boolean bdi) {
    this.bdi = bdi;
  }

  public TapiOduOduDefectPac deg(Boolean deg) {
    this.deg = deg;
    return this;
  }

  /**
   * Signal Degraded
   * @return deg
  **/
  @ApiModelProperty(value = "Signal Degraded")

  public Boolean isDeg() {
    return deg;
  }

  public void setDeg(Boolean deg) {
    this.deg = deg;
  }

  public TapiOduOduDefectPac lck(Boolean lck) {
    this.lck = lck;
    return this;
  }

  /**
   * Locked
   * @return lck
  **/
  @ApiModelProperty(value = "Locked")

  public Boolean isLck() {
    return lck;
  }

  public void setLck(Boolean lck) {
    this.lck = lck;
  }

  public TapiOduOduDefectPac oci(Boolean oci) {
    this.oci = oci;
    return this;
  }

  /**
   * Open Connection Indicator
   * @return oci
  **/
  @ApiModelProperty(value = "Open Connection Indicator")

  public Boolean isOci() {
    return oci;
  }

  public void setOci(Boolean oci) {
    this.oci = oci;
  }

  public TapiOduOduDefectPac ssf(Boolean ssf) {
    this.ssf = ssf;
    return this;
  }

  /**
   * Server Signal Failure
   * @return ssf
  **/
  @ApiModelProperty(value = "Server Signal Failure")

  public Boolean isSsf() {
    return ssf;
  }

  public void setSsf(Boolean ssf) {
    this.ssf = ssf;
  }

  public TapiOduOduDefectPac tim(Boolean tim) {
    this.tim = tim;
    return this;
  }

  /**
   * Trail Trace Identifier Mismatch
   * @return tim
  **/
  @ApiModelProperty(value = "Trail Trace Identifier Mismatch")

  public Boolean isTim() {
    return tim;
  }

  public void setTim(Boolean tim) {
    this.tim = tim;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduDefectPac tapiOduOduDefectPac = (TapiOduOduDefectPac) o;
    return Objects.equals(this.bdi, tapiOduOduDefectPac.bdi) &&
        Objects.equals(this.deg, tapiOduOduDefectPac.deg) &&
        Objects.equals(this.lck, tapiOduOduDefectPac.lck) &&
        Objects.equals(this.oci, tapiOduOduDefectPac.oci) &&
        Objects.equals(this.ssf, tapiOduOduDefectPac.ssf) &&
        Objects.equals(this.tim, tapiOduOduDefectPac.tim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bdi, deg, lck, oci, ssf, tim);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduDefectPac {\n");
    
    sb.append("    bdi: ").append(toIndentedString(bdi)).append("\n");
    sb.append("    deg: ").append(toIndentedString(deg)).append("\n");
    sb.append("    lck: ").append(toIndentedString(lck)).append("\n");
    sb.append("    oci: ").append(toIndentedString(oci)).append("\n");
    sb.append("    ssf: ").append(toIndentedString(ssf)).append("\n");
    sb.append("    tim: ").append(toIndentedString(tim)).append("\n");
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
