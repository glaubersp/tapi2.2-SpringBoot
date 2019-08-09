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
 * TapiEthEthOamTestLoopbackCommonPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthOamTestLoopbackCommonPac   {
  @JsonProperty("data-tlv-length")
  private Integer dataTlvLength = null;

  @JsonProperty("period")
  private TapiEthOamPeriod period = null;

  @JsonProperty("drop-eligibility")
  private Boolean dropEligibility = false;

  public TapiEthEthOamTestLoopbackCommonPac dataTlvLength(Integer dataTlvLength) {
    this.dataTlvLength = dataTlvLength;
    return this;
  }

  /**
   * G.8052: This parameter provides the length (in number of octet) of the optional Data TLV to be included in the TST frame.
   * @return dataTlvLength
  **/
  @ApiModelProperty(value = "G.8052: This parameter provides the length (in number of octet) of the optional Data TLV to be included in the TST frame.")

  public Integer getDataTlvLength() {
    return dataTlvLength;
  }

  public void setDataTlvLength(Integer dataTlvLength) {
    this.dataTlvLength = dataTlvLength;
  }

  public TapiEthEthOamTestLoopbackCommonPac period(TapiEthOamPeriod period) {
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

  public TapiEthEthOamTestLoopbackCommonPac dropEligibility(Boolean dropEligibility) {
    this.dropEligibility = dropEligibility;
    return this;
  }

  /**
   * G.8052: This parameter provides the eligibility of frames with unicast ETH-TST information to be discarded when congestion conditions are encountered.                  G.8052: This parameter provides the eligibility of frames with unicast ETH-LB information to be discarded when congestion conditions are encountered.
   * @return dropEligibility
  **/
  @ApiModelProperty(value = "G.8052: This parameter provides the eligibility of frames with unicast ETH-TST information to be discarded when congestion conditions are encountered.                  G.8052: This parameter provides the eligibility of frames with unicast ETH-LB information to be discarded when congestion conditions are encountered.")

  public Boolean isDropEligibility() {
    return dropEligibility;
  }

  public void setDropEligibility(Boolean dropEligibility) {
    this.dropEligibility = dropEligibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthOamTestLoopbackCommonPac tapiEthEthOamTestLoopbackCommonPac = (TapiEthEthOamTestLoopbackCommonPac) o;
    return Objects.equals(this.dataTlvLength, tapiEthEthOamTestLoopbackCommonPac.dataTlvLength) &&
        Objects.equals(this.period, tapiEthEthOamTestLoopbackCommonPac.period) &&
        Objects.equals(this.dropEligibility, tapiEthEthOamTestLoopbackCommonPac.dropEligibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTlvLength, period, dropEligibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOamTestLoopbackCommonPac {\n");
    
    sb.append("    dataTlvLength: ").append(toIndentedString(dataTlvLength)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    dropEligibility: ").append(toIndentedString(dropEligibility)).append("\n");
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
