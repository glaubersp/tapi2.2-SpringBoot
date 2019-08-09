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
 * TapiEthEthMepCommon
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthMepCommon   {
  @JsonProperty("codirectional")
  private Boolean codirectional = true;

  @JsonProperty("lck-priority")
  private Integer lckPriority = 7;

  @JsonProperty("mep-identifier")
  private Integer mepIdentifier = null;

  @JsonProperty("lck-period")
  private TapiEthOamPeriod lckPeriod = null;

  @JsonProperty("cc-priority")
  private Integer ccPriority = 7;

  public TapiEthEthMepCommon codirectional(Boolean codirectional) {
    this.codirectional = codirectional;
    return this;
  }

  /**
   * This attribute specifies the directionality of the Ethernet MEP with respect to the associated CEP. The value of TRUE means that the sink part of the MEP terminates the same signal direction as the sink part of the CEP. The Source part behaves similarly. This attribute is meaningful only when CEP is bidirectional.
   * @return codirectional
  **/
  @ApiModelProperty(value = "This attribute specifies the directionality of the Ethernet MEP with respect to the associated CEP. The value of TRUE means that the sink part of the MEP terminates the same signal direction as the sink part of the CEP. The Source part behaves similarly. This attribute is meaningful only when CEP is bidirectional.")

  public Boolean isCodirectional() {
    return codirectional;
  }

  public void setCodirectional(Boolean codirectional) {
    this.codirectional = codirectional;
  }

  public TapiEthEthMepCommon lckPriority(Integer lckPriority) {
    this.lckPriority = lckPriority;
    return this;
  }

  /**
   * This attribute models the MI_LCK_Pri signal defined in G.8021 and configured as specified in G8051. It is the priority at which the LCK messages should be sent.
   * @return lckPriority
  **/
  @ApiModelProperty(value = "This attribute models the MI_LCK_Pri signal defined in G.8021 and configured as specified in G8051. It is the priority at which the LCK messages should be sent.")

  public Integer getLckPriority() {
    return lckPriority;
  }

  public void setLckPriority(Integer lckPriority) {
    this.lckPriority = lckPriority;
  }

  public TapiEthEthMepCommon mepIdentifier(Integer mepIdentifier) {
    this.mepIdentifier = mepIdentifier;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  Integer that is unique among all the MEPs in the same Maintenance Association (MEG).                  G.8052:                  This attribute contains the identifier of the MEP.
   * @return mepIdentifier
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  Integer that is unique among all the MEPs in the same Maintenance Association (MEG).                  G.8052:                  This attribute contains the identifier of the MEP.")

  public Integer getMepIdentifier() {
    return mepIdentifier;
  }

  public void setMepIdentifier(Integer mepIdentifier) {
    this.mepIdentifier = mepIdentifier;
  }

  public TapiEthEthMepCommon lckPeriod(TapiEthOamPeriod lckPeriod) {
    this.lckPeriod = lckPeriod;
    return this;
  }

  /**
   * Get lckPeriod
   * @return lckPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthOamPeriod getLckPeriod() {
    return lckPeriod;
  }

  public void setLckPeriod(TapiEthOamPeriod lckPeriod) {
    this.lckPeriod = lckPeriod;
  }

  public TapiEthEthMepCommon ccPriority(Integer ccPriority) {
    this.ccPriority = ccPriority;
    return this;
  }

  /**
   * This attribute models the MI_CC_Pri signal defined in G.8021 and configured as specified in G8051. It is the priority at which the CCM message should be sent.
   * @return ccPriority
  **/
  @ApiModelProperty(value = "This attribute models the MI_CC_Pri signal defined in G.8021 and configured as specified in G8051. It is the priority at which the CCM message should be sent.")

  public Integer getCcPriority() {
    return ccPriority;
  }

  public void setCcPriority(Integer ccPriority) {
    this.ccPriority = ccPriority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthMepCommon tapiEthEthMepCommon = (TapiEthEthMepCommon) o;
    return Objects.equals(this.codirectional, tapiEthEthMepCommon.codirectional) &&
        Objects.equals(this.lckPriority, tapiEthEthMepCommon.lckPriority) &&
        Objects.equals(this.mepIdentifier, tapiEthEthMepCommon.mepIdentifier) &&
        Objects.equals(this.lckPeriod, tapiEthEthMepCommon.lckPeriod) &&
        Objects.equals(this.ccPriority, tapiEthEthMepCommon.ccPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codirectional, lckPriority, mepIdentifier, lckPeriod, ccPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthMepCommon {\n");
    
    sb.append("    codirectional: ").append(toIndentedString(codirectional)).append("\n");
    sb.append("    lckPriority: ").append(toIndentedString(lckPriority)).append("\n");
    sb.append("    mepIdentifier: ").append(toIndentedString(mepIdentifier)).append("\n");
    sb.append("    lckPeriod: ").append(toIndentedString(lckPeriod)).append("\n");
    sb.append("    ccPriority: ").append(toIndentedString(ccPriority)).append("\n");
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
