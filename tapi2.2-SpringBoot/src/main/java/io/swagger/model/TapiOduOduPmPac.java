package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduUasChoice;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduPmPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOduOduPmPac   {
  @JsonProperty("f-bbe")
  private Integer fBbe = null;

  @JsonProperty("f-ses")
  private Integer fSes = null;

  @JsonProperty("n-bbe")
  private Integer nBbe = null;

  @JsonProperty("n-ses")
  private Integer nSes = null;

  @JsonProperty("uas")
  private TapiOduUasChoice uas = null;

  public TapiOduOduPmPac fBbe(Integer fBbe) {
    this.fBbe = fBbe;
    return this;
  }

  /**
   * Far-end Background Block Error
   * @return fBbe
  **/
  @ApiModelProperty(value = "Far-end Background Block Error")

  public Integer getFBbe() {
    return fBbe;
  }

  public void setFBbe(Integer fBbe) {
    this.fBbe = fBbe;
  }

  public TapiOduOduPmPac fSes(Integer fSes) {
    this.fSes = fSes;
    return this;
  }

  /**
   * Far-end Severely Errored Second
   * @return fSes
  **/
  @ApiModelProperty(value = "Far-end Severely Errored Second")

  public Integer getFSes() {
    return fSes;
  }

  public void setFSes(Integer fSes) {
    this.fSes = fSes;
  }

  public TapiOduOduPmPac nBbe(Integer nBbe) {
    this.nBbe = nBbe;
    return this;
  }

  /**
   * Near-end Background Block Error
   * @return nBbe
  **/
  @ApiModelProperty(value = "Near-end Background Block Error")

  public Integer getNBbe() {
    return nBbe;
  }

  public void setNBbe(Integer nBbe) {
    this.nBbe = nBbe;
  }

  public TapiOduOduPmPac nSes(Integer nSes) {
    this.nSes = nSes;
    return this;
  }

  /**
   * Near-end Severely Errored Second
   * @return nSes
  **/
  @ApiModelProperty(value = "Near-end Severely Errored Second")

  public Integer getNSes() {
    return nSes;
  }

  public void setNSes(Integer nSes) {
    this.nSes = nSes;
  }

  public TapiOduOduPmPac uas(TapiOduUasChoice uas) {
    this.uas = uas;
    return this;
  }

  /**
   * Get uas
   * @return uas
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduUasChoice getUas() {
    return uas;
  }

  public void setUas(TapiOduUasChoice uas) {
    this.uas = uas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduPmPac tapiOduOduPmPac = (TapiOduOduPmPac) o;
    return Objects.equals(this.fBbe, tapiOduOduPmPac.fBbe) &&
        Objects.equals(this.fSes, tapiOduOduPmPac.fSes) &&
        Objects.equals(this.nBbe, tapiOduOduPmPac.nBbe) &&
        Objects.equals(this.nSes, tapiOduOduPmPac.nSes) &&
        Objects.equals(this.uas, tapiOduOduPmPac.uas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fBbe, fSes, nBbe, nSes, uas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduPmPac {\n");
    
    sb.append("    fBbe: ").append(toIndentedString(fBbe)).append("\n");
    sb.append("    fSes: ").append(toIndentedString(fSes)).append("\n");
    sb.append("    nBbe: ").append(toIndentedString(nBbe)).append("\n");
    sb.append("    nSes: ").append(toIndentedString(nSes)).append("\n");
    sb.append("    uas: ").append(toIndentedString(uas)).append("\n");
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
