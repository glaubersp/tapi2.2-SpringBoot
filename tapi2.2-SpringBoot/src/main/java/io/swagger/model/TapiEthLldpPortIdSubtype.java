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
 * TapiEthLldpPortIdSubtype
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthLldpPortIdSubtype   {
  @JsonProperty("agent-circuit-id")
  private String agentCircuitId = null;

  @JsonProperty("interface-alias")
  private String interfaceAlias = null;

  @JsonProperty("interface-name")
  private String interfaceName = null;

  @JsonProperty("local")
  private String local = null;

  @JsonProperty("mac-address")
  private String macAddress = null;

  @JsonProperty("network-address")
  private String networkAddress = null;

  @JsonProperty("port-component")
  private String portComponent = null;

  public TapiEthLldpPortIdSubtype agentCircuitId(String agentCircuitId) {
    this.agentCircuitId = agentCircuitId;
    return this;
  }

  /**
   * Represents a port identifier based on the agent-local identifier of the circuit (defined in RFC 3046), detected by the agent and associated with a particular port.
   * @return agentCircuitId
  **/
  @ApiModelProperty(value = "Represents a port identifier based on the agent-local identifier of the circuit (defined in RFC 3046), detected by the agent and associated with a particular port.")

  public String getAgentCircuitId() {
    return agentCircuitId;
  }

  public void setAgentCircuitId(String agentCircuitId) {
    this.agentCircuitId = agentCircuitId;
  }

  public TapiEthLldpPortIdSubtype interfaceAlias(String interfaceAlias) {
    this.interfaceAlias = interfaceAlias;
    return this;
  }

  /**
   * String length '0..64'                  Represents a port identifier based on the ifAlias MIB object, defined in IETF RFC 2863.
   * @return interfaceAlias
  **/
  @ApiModelProperty(value = "String length '0..64'                  Represents a port identifier based on the ifAlias MIB object, defined in IETF RFC 2863.")

  public String getInterfaceAlias() {
    return interfaceAlias;
  }

  public void setInterfaceAlias(String interfaceAlias) {
    this.interfaceAlias = interfaceAlias;
  }

  public TapiEthLldpPortIdSubtype interfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
    return this;
  }

  /**
   * String length '0..64'                  Represents a port identifier based on the ifName MIB object, defined in IETF RFC 2863.
   * @return interfaceName
  **/
  @ApiModelProperty(value = "String length '0..64'                  Represents a port identifier based on the ifName MIB object, defined in IETF RFC 2863.")

  public String getInterfaceName() {
    return interfaceName;
  }

  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }

  public TapiEthLldpPortIdSubtype local(String local) {
    this.local = local;
    return this;
  }

  /**
   * Represents a port identifier based on a value locally assigned.
   * @return local
  **/
  @ApiModelProperty(value = "Represents a port identifier based on a value locally assigned.")

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public TapiEthLldpPortIdSubtype macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * Represents a port identifier based on a unicast source address (encoded in network byte order and IEEE 802.3 canonical bit order), which has been detected by the agent and associated with a particular port (IEEE Std 802-2001).
   * @return macAddress
  **/
  @ApiModelProperty(value = "Represents a port identifier based on a unicast source address (encoded in network byte order and IEEE 802.3 canonical bit order), which has been detected by the agent and associated with a particular port (IEEE Std 802-2001).")

  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public TapiEthLldpPortIdSubtype networkAddress(String networkAddress) {
    this.networkAddress = networkAddress;
    return this;
  }

  /**
   * Represents a port identifier based on a network address, detected by the agent and associated with a particular port.                  Octet string that identifies a particular network address family and an associated network address that are encoded in network octet order.                  An IP address, for example, would be encoded with the first octet containing the IANA Address Family Numbers enumeration value for the specific address type and octets 2 through n containing the address value.                  
   * @return networkAddress
  **/
  @ApiModelProperty(value = "Represents a port identifier based on a network address, detected by the agent and associated with a particular port.                  Octet string that identifies a particular network address family and an associated network address that are encoded in network octet order.                  An IP address, for example, would be encoded with the first octet containing the IANA Address Family Numbers enumeration value for the specific address type and octets 2 through n containing the address value.                  ")

  public String getNetworkAddress() {
    return networkAddress;
  }

  public void setNetworkAddress(String networkAddress) {
    this.networkAddress = networkAddress;
  }

  public TapiEthLldpPortIdSubtype portComponent(String portComponent) {
    this.portComponent = portComponent;
    return this;
  }

  /**
   * String length '0..32'                  Represents a port identifier based on the value of entPhysicalAlias (defined in IETF RFC 2737) for a port component (i.e., entPhysicalClass value of port(10)), within the containing chassis.
   * @return portComponent
  **/
  @ApiModelProperty(value = "String length '0..32'                  Represents a port identifier based on the value of entPhysicalAlias (defined in IETF RFC 2737) for a port component (i.e., entPhysicalClass value of port(10)), within the containing chassis.")

  public String getPortComponent() {
    return portComponent;
  }

  public void setPortComponent(String portComponent) {
    this.portComponent = portComponent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthLldpPortIdSubtype tapiEthLldpPortIdSubtype = (TapiEthLldpPortIdSubtype) o;
    return Objects.equals(this.agentCircuitId, tapiEthLldpPortIdSubtype.agentCircuitId) &&
        Objects.equals(this.interfaceAlias, tapiEthLldpPortIdSubtype.interfaceAlias) &&
        Objects.equals(this.interfaceName, tapiEthLldpPortIdSubtype.interfaceName) &&
        Objects.equals(this.local, tapiEthLldpPortIdSubtype.local) &&
        Objects.equals(this.macAddress, tapiEthLldpPortIdSubtype.macAddress) &&
        Objects.equals(this.networkAddress, tapiEthLldpPortIdSubtype.networkAddress) &&
        Objects.equals(this.portComponent, tapiEthLldpPortIdSubtype.portComponent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentCircuitId, interfaceAlias, interfaceName, local, macAddress, networkAddress, portComponent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthLldpPortIdSubtype {\n");
    
    sb.append("    agentCircuitId: ").append(toIndentedString(agentCircuitId)).append("\n");
    sb.append("    interfaceAlias: ").append(toIndentedString(interfaceAlias)).append("\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    networkAddress: ").append(toIndentedString(networkAddress)).append("\n");
    sb.append("    portComponent: ").append(toIndentedString(portComponent)).append("\n");
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
