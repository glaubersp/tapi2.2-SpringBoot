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
 * TapiEthMaintenanceAssociationName
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthMaintenanceAssociationName   {
  @JsonProperty("char-string")
  private String charString = null;

  @JsonProperty("ieee-reserved")
  private String ieeeReserved = "0";

  @JsonProperty("unsigned-int-16")
  private Integer unsignedInt16 = null;

  @JsonProperty("icc-format")
  private String iccFormat = null;

  @JsonProperty("primary-vlan-id")
  private String primaryVlanId = null;

  @JsonProperty("rfc-2865-vpn-id")
  private String rfc2865VpnId = null;

  public TapiEthMaintenanceAssociationName charString(String charString) {
    this.charString = charString;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  RFC2579 DisplayString, except that the character codes 0-31 (decimal) are not used.                  Length '1..45'
   * @return charString
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  RFC2579 DisplayString, except that the character codes 0-31 (decimal) are not used.                  Length '1..45'")

  public String getCharString() {
    return charString;
  }

  public void setCharString(String charString) {
    this.charString = charString;
  }

  public TapiEthMaintenanceAssociationName ieeeReserved(String ieeeReserved) {
    this.ieeeReserved = ieeeReserved;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  Reserved for definition by IEEE 802.1. Recommend not to use zero unless absolutely needed.                  Length '1..45'.
   * @return ieeeReserved
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  Reserved for definition by IEEE 802.1. Recommend not to use zero unless absolutely needed.                  Length '1..45'.")

  public String getIeeeReserved() {
    return ieeeReserved;
  }

  public void setIeeeReserved(String ieeeReserved) {
    this.ieeeReserved = ieeeReserved;
  }

  public TapiEthMaintenanceAssociationName unsignedInt16(Integer unsignedInt16) {
    this.unsignedInt16 = unsignedInt16;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  2-octet integer/big endian.
   * @return unsignedInt16
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  2-octet integer/big endian.")

  public Integer getUnsignedInt16() {
    return unsignedInt16;
  }

  public void setUnsignedInt16(Integer unsignedInt16) {
    this.unsignedInt16 = unsignedInt16;
  }

  public TapiEthMaintenanceAssociationName iccFormat(String iccFormat) {
    this.iccFormat = iccFormat;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  ICC-based format as specified in ITU-T Y.1731.                  Length '1..45'
   * @return iccFormat
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  ICC-based format as specified in ITU-T Y.1731.                  Length '1..45'")

  public String getIccFormat() {
    return iccFormat;
  }

  public void setIccFormat(String iccFormat) {
    this.iccFormat = iccFormat;
  }

  public TapiEthMaintenanceAssociationName primaryVlanId(String primaryVlanId) {
    this.primaryVlanId = primaryVlanId;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  Primary VLAN ID. 12 bits represented in a 2-octet integer.
   * @return primaryVlanId
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  Primary VLAN ID. 12 bits represented in a 2-octet integer.")

  public String getPrimaryVlanId() {
    return primaryVlanId;
  }

  public void setPrimaryVlanId(String primaryVlanId) {
    this.primaryVlanId = primaryVlanId;
  }

  public TapiEthMaintenanceAssociationName rfc2865VpnId(String rfc2865VpnId) {
    this.rfc2865VpnId = rfc2865VpnId;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  RFC2685 VPN ID. 3 octet VPN authority Organizationally Unique Identifier followed by 4 octet VPN index identifying VPN according to the OUI.                  Length '1..45';
   * @return rfc2865VpnId
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  RFC2685 VPN ID. 3 octet VPN authority Organizationally Unique Identifier followed by 4 octet VPN index identifying VPN according to the OUI.                  Length '1..45';")

  public String getRfc2865VpnId() {
    return rfc2865VpnId;
  }

  public void setRfc2865VpnId(String rfc2865VpnId) {
    this.rfc2865VpnId = rfc2865VpnId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthMaintenanceAssociationName tapiEthMaintenanceAssociationName = (TapiEthMaintenanceAssociationName) o;
    return Objects.equals(this.charString, tapiEthMaintenanceAssociationName.charString) &&
        Objects.equals(this.ieeeReserved, tapiEthMaintenanceAssociationName.ieeeReserved) &&
        Objects.equals(this.unsignedInt16, tapiEthMaintenanceAssociationName.unsignedInt16) &&
        Objects.equals(this.iccFormat, tapiEthMaintenanceAssociationName.iccFormat) &&
        Objects.equals(this.primaryVlanId, tapiEthMaintenanceAssociationName.primaryVlanId) &&
        Objects.equals(this.rfc2865VpnId, tapiEthMaintenanceAssociationName.rfc2865VpnId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charString, ieeeReserved, unsignedInt16, iccFormat, primaryVlanId, rfc2865VpnId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthMaintenanceAssociationName {\n");
    
    sb.append("    charString: ").append(toIndentedString(charString)).append("\n");
    sb.append("    ieeeReserved: ").append(toIndentedString(ieeeReserved)).append("\n");
    sb.append("    unsignedInt16: ").append(toIndentedString(unsignedInt16)).append("\n");
    sb.append("    iccFormat: ").append(toIndentedString(iccFormat)).append("\n");
    sb.append("    primaryVlanId: ").append(toIndentedString(primaryVlanId)).append("\n");
    sb.append("    rfc2865VpnId: ").append(toIndentedString(rfc2865VpnId)).append("\n");
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
