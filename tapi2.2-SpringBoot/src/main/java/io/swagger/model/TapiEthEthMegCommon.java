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
 * TapiEthEthMegCommon
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthMegCommon   {
  @JsonProperty("meg-identifier")
  private String megIdentifier = null;

  @JsonProperty("meg-level")
  private Integer megLevel = null;

  @JsonProperty("cc-period")
  private TapiEthOamPeriod ccPeriod = null;

  @JsonProperty("client-mel")
  private Integer clientMel = null;

  @JsonProperty("is-cc-enabled")
  private Boolean isCcEnabled = false;

  public TapiEthEthMegCommon megIdentifier(String megIdentifier) {
    this.megIdentifier = megIdentifier;
    return this;
  }

  /**
   * Optional in case 802.1Q maintenanceAssociationName is used.
   * @return megIdentifier
  **/
  @ApiModelProperty(value = "Optional in case 802.1Q maintenanceAssociationName is used.")

  public String getMegIdentifier() {
    return megIdentifier;
  }

  public void setMegIdentifier(String megIdentifier) {
    this.megIdentifier = megIdentifier;
  }

  public TapiEthEthMegCommon megLevel(Integer megLevel) {
    this.megLevel = megLevel;
    return this;
  }

  /**
   * none
   * @return megLevel
  **/
  @ApiModelProperty(value = "none")

  public Integer getMegLevel() {
    return megLevel;
  }

  public void setMegLevel(Integer megLevel) {
    this.megLevel = megLevel;
  }

  public TapiEthEthMegCommon ccPeriod(TapiEthOamPeriod ccPeriod) {
    this.ccPeriod = ccPeriod;
    return this;
  }

  /**
   * Get ccPeriod
   * @return ccPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthOamPeriod getCcPeriod() {
    return ccPeriod;
  }

  public void setCcPeriod(TapiEthOamPeriod ccPeriod) {
    this.ccPeriod = ccPeriod;
  }

  public TapiEthEthMegCommon clientMel(Integer clientMel) {
    this.clientMel = clientMel;
    return this;
  }

  /**
   * none
   * @return clientMel
  **/
  @ApiModelProperty(value = "none")

  public Integer getClientMel() {
    return clientMel;
  }

  public void setClientMel(Integer clientMel) {
    this.clientMel = clientMel;
  }

  public TapiEthEthMegCommon isCcEnabled(Boolean isCcEnabled) {
    this.isCcEnabled = isCcEnabled;
    return this;
  }

  /**
   * This attribute models the MI_CC_Enable signal defined in G.8021 and configured as specified in G8051.                  ITU-T G.8013/Y.1731 (2015)/Amd.1 (11/2018): When ETH-CC transmission is enabled in a MEG,                  all MEPs are enabled to periodically transmit frames with ETH-CC information to their peer MEPs in the MEG.
   * @return isCcEnabled
  **/
  @ApiModelProperty(value = "This attribute models the MI_CC_Enable signal defined in G.8021 and configured as specified in G8051.                  ITU-T G.8013/Y.1731 (2015)/Amd.1 (11/2018): When ETH-CC transmission is enabled in a MEG,                  all MEPs are enabled to periodically transmit frames with ETH-CC information to their peer MEPs in the MEG.")

  public Boolean isIsCcEnabled() {
    return isCcEnabled;
  }

  public void setIsCcEnabled(Boolean isCcEnabled) {
    this.isCcEnabled = isCcEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthMegCommon tapiEthEthMegCommon = (TapiEthEthMegCommon) o;
    return Objects.equals(this.megIdentifier, tapiEthEthMegCommon.megIdentifier) &&
        Objects.equals(this.megLevel, tapiEthEthMegCommon.megLevel) &&
        Objects.equals(this.ccPeriod, tapiEthEthMegCommon.ccPeriod) &&
        Objects.equals(this.clientMel, tapiEthEthMegCommon.clientMel) &&
        Objects.equals(this.isCcEnabled, tapiEthEthMegCommon.isCcEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(megIdentifier, megLevel, ccPeriod, clientMel, isCcEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthMegCommon {\n");
    
    sb.append("    megIdentifier: ").append(toIndentedString(megIdentifier)).append("\n");
    sb.append("    megLevel: ").append(toIndentedString(megLevel)).append("\n");
    sb.append("    ccPeriod: ").append(toIndentedString(ccPeriod)).append("\n");
    sb.append("    clientMel: ").append(toIndentedString(clientMel)).append("\n");
    sb.append("    isCcEnabled: ").append(toIndentedString(isCcEnabled)).append("\n");
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
