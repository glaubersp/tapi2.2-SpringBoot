package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthOamPeriod;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthCfmLinkTracePac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthCfmLinkTracePac   {
  @JsonProperty("period")
  private TapiEthOamPeriod period = null;

  @JsonProperty("target-mep-id")
  private Integer targetMepId = null;

  @JsonProperty("drop-eligibility")
  private Boolean dropEligibility = false;

  @JsonProperty("ltm-flags")
  private String ltmFlags = null;

  public TapiEthEthCfmLinkTracePac period(TapiEthOamPeriod period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthOamPeriod getPeriod() {
    return period;
  }

  public void setPeriod(TapiEthOamPeriod period) {
    this.period = period;
  }

  public TapiEthEthCfmLinkTracePac targetMepId(Integer targetMepId) {
    this.targetMepId = targetMepId;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  An indication of a destination MEP, the MEPID of a MEP.                  Alternative to destination MAC address.                  
   * @return targetMepId
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  An indication of a destination MEP, the MEPID of a MEP.                  Alternative to destination MAC address.                  ")

  public Integer getTargetMepId() {
    return targetMepId;
  }

  public void setTargetMepId(Integer targetMepId) {
    this.targetMepId = targetMepId;
  }

  public TapiEthEthCfmLinkTracePac dropEligibility(Boolean dropEligibility) {
    this.dropEligibility = dropEligibility;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  Drop eligible bit value to be used in the VLAN tag, if present in the transmitted frame.
   * @return dropEligibility
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  Drop eligible bit value to be used in the VLAN tag, if present in the transmitted frame.")

  public Boolean isDropEligibility() {
    return dropEligibility;
  }

  public void setDropEligibility(Boolean dropEligibility) {
    this.dropEligibility = dropEligibility;
  }

  public TapiEthEthCfmLinkTracePac ltmFlags(String ltmFlags) {
    this.ltmFlags = ltmFlags;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  The flags field for the LTMs transmitted by the MEP.
   * @return ltmFlags
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  The flags field for the LTMs transmitted by the MEP.")

  public String getLtmFlags() {
    return ltmFlags;
  }

  public void setLtmFlags(String ltmFlags) {
    this.ltmFlags = ltmFlags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthCfmLinkTracePac tapiEthEthCfmLinkTracePac = (TapiEthEthCfmLinkTracePac) o;
    return Objects.equals(this.period, tapiEthEthCfmLinkTracePac.period) &&
        Objects.equals(this.targetMepId, tapiEthEthCfmLinkTracePac.targetMepId) &&
        Objects.equals(this.dropEligibility, tapiEthEthCfmLinkTracePac.dropEligibility) &&
        Objects.equals(this.ltmFlags, tapiEthEthCfmLinkTracePac.ltmFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, targetMepId, dropEligibility, ltmFlags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthCfmLinkTracePac {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    targetMepId: ").append(toIndentedString(targetMepId)).append("\n");
    sb.append("    dropEligibility: ").append(toIndentedString(dropEligibility)).append("\n");
    sb.append("    ltmFlags: ").append(toIndentedString(ltmFlags)).append("\n");
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
