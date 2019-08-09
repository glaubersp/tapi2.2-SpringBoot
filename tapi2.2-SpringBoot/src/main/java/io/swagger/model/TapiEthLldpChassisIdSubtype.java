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
 * TapiEthLldpChassisIdSubtype
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthLldpChassisIdSubtype   {
  @JsonProperty("mac-address")
  private String macAddress = null;

  @JsonProperty("chassis-component")
  private String chassisComponent = null;

  @JsonProperty("interface-name")
  private String interfaceName = null;

  @JsonProperty("network-address")
  private String networkAddress = null;

  @JsonProperty("interface-alias")
  private String interfaceAlias = null;

  @JsonProperty("port-component")
  private String portComponent = null;

  @JsonProperty("local")
  private String local = null;

  public TapiEthLldpChassisIdSubtype macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * Represents a chassis identifier based on the value of a unicast source address (encoded in network byte order and IEEE 802.3 canonical bit order), of a port on the containing chassis as defined in IEEE Std 802-2001.
   * @return macAddress
  **/
  @ApiModelProperty(value = "Represents a chassis identifier based on the value of a unicast source address (encoded in network byte order and IEEE 802.3 canonical bit order), of a port on the containing chassis as defined in IEEE Std 802-2001.")

  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public TapiEthLldpChassisIdSubtype chassisComponent(String chassisComponent) {
    this.chassisComponent = chassisComponent;
    return this;
  }

  /**
   * String length '0..32'                  Represents a chassis identifier based on the value of entPhysicalAlias object (defined in IETF RFC 2737) for a chassis component (i.e., an entPhysicalClass value of chassis(3)).
   * @return chassisComponent
  **/
  @ApiModelProperty(value = "String length '0..32'                  Represents a chassis identifier based on the value of entPhysicalAlias object (defined in IETF RFC 2737) for a chassis component (i.e., an entPhysicalClass value of chassis(3)).")

  public String getChassisComponent() {
    return chassisComponent;
  }

  public void setChassisComponent(String chassisComponent) {
    this.chassisComponent = chassisComponent;
  }

  public TapiEthLldpChassisIdSubtype interfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
    return this;
  }

  /**
   * Represents a chassis identifier based on the value of ifName object (defined in IETF RFC 2863) for an interface on the containing chassis.
   * @return interfaceName
  **/
  @ApiModelProperty(value = "Represents a chassis identifier based on the value of ifName object (defined in IETF RFC 2863) for an interface on the containing chassis.")

  public String getInterfaceName() {
    return interfaceName;
  }

  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }

  public TapiEthLldpChassisIdSubtype networkAddress(String networkAddress) {
    this.networkAddress = networkAddress;
    return this;
  }

  /**
   * Octet string that identifies a particular network address family and an associated network address that are encoded in network octet order.                  An IP address, for example, would be encoded with the first octet containing the IANA Address Family Numbers enumeration value for the specific address type and octets 2 through n containing the address value.
   * @return networkAddress
  **/
  @ApiModelProperty(value = "Octet string that identifies a particular network address family and an associated network address that are encoded in network octet order.                  An IP address, for example, would be encoded with the first octet containing the IANA Address Family Numbers enumeration value for the specific address type and octets 2 through n containing the address value.")

  public String getNetworkAddress() {
    return networkAddress;
  }

  public void setNetworkAddress(String networkAddress) {
    this.networkAddress = networkAddress;
  }

  public TapiEthLldpChassisIdSubtype interfaceAlias(String interfaceAlias) {
    this.interfaceAlias = interfaceAlias;
    return this;
  }

  /**
   * String length '0..64'                  Represents a chassis identifier based on the value of ifAlias object (defined in IETF RFC 2863) for an interface on the containing chassis.
   * @return interfaceAlias
  **/
  @ApiModelProperty(value = "String length '0..64'                  Represents a chassis identifier based on the value of ifAlias object (defined in IETF RFC 2863) for an interface on the containing chassis.")

  public String getInterfaceAlias() {
    return interfaceAlias;
  }

  public void setInterfaceAlias(String interfaceAlias) {
    this.interfaceAlias = interfaceAlias;
  }

  public TapiEthLldpChassisIdSubtype portComponent(String portComponent) {
    this.portComponent = portComponent;
    return this;
  }

  /**
   * String length '0..32'                  Represents a chassis identifier based on the value of entPhysicalAlias object (defined in IETF RFC 2737) for a port or backplane component (i.e., entPhysicalClass value of port(10) or backplane(4)), within the containing chassis.
   * @return portComponent
  **/
  @ApiModelProperty(value = "String length '0..32'                  Represents a chassis identifier based on the value of entPhysicalAlias object (defined in IETF RFC 2737) for a port or backplane component (i.e., entPhysicalClass value of port(10) or backplane(4)), within the containing chassis.")

  public String getPortComponent() {
    return portComponent;
  }

  public void setPortComponent(String portComponent) {
    this.portComponent = portComponent;
  }

  public TapiEthLldpChassisIdSubtype local(String local) {
    this.local = local;
    return this;
  }

  /**
   * Represents a chassis identifier based on a locally defined value.
   * @return local
  **/
  @ApiModelProperty(value = "Represents a chassis identifier based on a locally defined value.")

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthLldpChassisIdSubtype tapiEthLldpChassisIdSubtype = (TapiEthLldpChassisIdSubtype) o;
    return Objects.equals(this.macAddress, tapiEthLldpChassisIdSubtype.macAddress) &&
        Objects.equals(this.chassisComponent, tapiEthLldpChassisIdSubtype.chassisComponent) &&
        Objects.equals(this.interfaceName, tapiEthLldpChassisIdSubtype.interfaceName) &&
        Objects.equals(this.networkAddress, tapiEthLldpChassisIdSubtype.networkAddress) &&
        Objects.equals(this.interfaceAlias, tapiEthLldpChassisIdSubtype.interfaceAlias) &&
        Objects.equals(this.portComponent, tapiEthLldpChassisIdSubtype.portComponent) &&
        Objects.equals(this.local, tapiEthLldpChassisIdSubtype.local);
  }

  @Override
  public int hashCode() {
    return Objects.hash(macAddress, chassisComponent, interfaceName, networkAddress, interfaceAlias, portComponent, local);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthLldpChassisIdSubtype {\n");
    
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    chassisComponent: ").append(toIndentedString(chassisComponent)).append("\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    networkAddress: ").append(toIndentedString(networkAddress)).append("\n");
    sb.append("    interfaceAlias: ").append(toIndentedString(interfaceAlias)).append("\n");
    sb.append("    portComponent: ").append(toIndentedString(portComponent)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
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
