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
 * TapiEthControlFrameFilter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthControlFrameFilter   {
  @JsonProperty("c-2-00-00-0-a")
  private Boolean c200000A = false;

  @JsonProperty("c-2-00-00-0-b")
  private Boolean c200000B = false;

  @JsonProperty("c-2-00-00-0-c")
  private Boolean c200000C = false;

  @JsonProperty("c-2-00-00-0-d")
  private Boolean c200000D = false;

  @JsonProperty("c-2-00-00-0-e")
  private Boolean c200000E = false;

  @JsonProperty("c-2-00-00-0-f")
  private Boolean c200000F = false;

  @JsonProperty("c-2-00-00-00")
  private Boolean c2000000 = false;

  @JsonProperty("c-2-00-00-01")
  private Boolean c2000001 = false;

  @JsonProperty("c-2-00-00-02")
  private Boolean c2000002 = false;

  @JsonProperty("c-2-00-00-03")
  private Boolean c2000003 = false;

  @JsonProperty("c-2-00-00-04")
  private Boolean c2000004 = false;

  @JsonProperty("c-2-00-00-05")
  private Boolean c2000005 = false;

  @JsonProperty("c-2-00-00-06")
  private Boolean c2000006 = false;

  @JsonProperty("c-2-00-00-07")
  private Boolean c2000007 = false;

  @JsonProperty("c-2-00-00-08")
  private Boolean c2000008 = false;

  @JsonProperty("c-2-00-00-09")
  private Boolean c2000009 = false;

  @JsonProperty("c-2-00-00-10")
  private Boolean c2000010 = false;

  @JsonProperty("c-2-00-00-2-a")
  private Boolean c200002A = false;

  @JsonProperty("c-2-00-00-2-b")
  private Boolean c200002B = false;

  @JsonProperty("c-2-00-00-2-c")
  private Boolean c200002C = false;

  @JsonProperty("c-2-00-00-2-d")
  private Boolean c200002D = false;

  @JsonProperty("c-2-00-00-2-e")
  private Boolean c200002E = false;

  @JsonProperty("c-2-00-00-2-f")
  private Boolean c200002F = false;

  @JsonProperty("c-2-00-00-20")
  private Boolean c2000020 = false;

  @JsonProperty("c-2-00-00-21")
  private Boolean c2000021 = false;

  @JsonProperty("c-2-00-00-22")
  private Boolean c2000022 = false;

  @JsonProperty("c-2-00-00-23")
  private Boolean c2000023 = false;

  @JsonProperty("c-2-00-00-24")
  private Boolean c2000024 = false;

  @JsonProperty("c-2-00-00-25")
  private Boolean c2000025 = false;

  @JsonProperty("c-2-00-00-26")
  private Boolean c2000026 = false;

  @JsonProperty("c-2-00-00-27")
  private Boolean c2000027 = false;

  @JsonProperty("c-2-00-00-28")
  private Boolean c2000028 = false;

  @JsonProperty("c-2-00-00-29")
  private Boolean c2000029 = false;

  public TapiEthControlFrameFilter c200000A(Boolean c200000A) {
    this.c200000A = c200000A;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c200000A
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC200000A() {
    return c200000A;
  }

  public void setC200000A(Boolean c200000A) {
    this.c200000A = c200000A;
  }

  public TapiEthControlFrameFilter c200000B(Boolean c200000B) {
    this.c200000B = c200000B;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c200000B
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC200000B() {
    return c200000B;
  }

  public void setC200000B(Boolean c200000B) {
    this.c200000B = c200000B;
  }

  public TapiEthControlFrameFilter c200000C(Boolean c200000C) {
    this.c200000C = c200000C;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c200000C
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC200000C() {
    return c200000C;
  }

  public void setC200000C(Boolean c200000C) {
    this.c200000C = c200000C;
  }

  public TapiEthControlFrameFilter c200000D(Boolean c200000D) {
    this.c200000D = c200000D;
    return this;
  }

  /**
   * This attribute identifies the Provider Bridge MVRP address.
   * @return c200000D
  **/
  @ApiModelProperty(value = "This attribute identifies the Provider Bridge MVRP address.")

  public Boolean isC200000D() {
    return c200000D;
  }

  public void setC200000D(Boolean c200000D) {
    this.c200000D = c200000D;
  }

  public TapiEthControlFrameFilter c200000E(Boolean c200000E) {
    this.c200000E = c200000E;
    return this;
  }

  /**
   * This attribute identifies the Individual LAN Scope group address, Nearest Bridge group address (LLDP protocol).
   * @return c200000E
  **/
  @ApiModelProperty(value = "This attribute identifies the Individual LAN Scope group address, Nearest Bridge group address (LLDP protocol).")

  public Boolean isC200000E() {
    return c200000E;
  }

  public void setC200000E(Boolean c200000E) {
    this.c200000E = c200000E;
  }

  public TapiEthControlFrameFilter c200000F(Boolean c200000F) {
    this.c200000F = c200000F;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c200000F
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC200000F() {
    return c200000F;
  }

  public void setC200000F(Boolean c200000F) {
    this.c200000F = c200000F;
  }

  public TapiEthControlFrameFilter c2000000(Boolean c2000000) {
    this.c2000000 = c2000000;
    return this;
  }

  /**
   * This attribute identifies the STP/RSTP/MSTP protocol address.
   * @return c2000000
  **/
  @ApiModelProperty(value = "This attribute identifies the STP/RSTP/MSTP protocol address.")

  public Boolean isC2000000() {
    return c2000000;
  }

  public void setC2000000(Boolean c2000000) {
    this.c2000000 = c2000000;
  }

  public TapiEthControlFrameFilter c2000001(Boolean c2000001) {
    this.c2000001 = c2000001;
    return this;
  }

  /**
   * This attribute identifies the IEEE MAC-specific Control Protocols group address (PAUSE protocol).
   * @return c2000001
  **/
  @ApiModelProperty(value = "This attribute identifies the IEEE MAC-specific Control Protocols group address (PAUSE protocol).")

  public Boolean isC2000001() {
    return c2000001;
  }

  public void setC2000001(Boolean c2000001) {
    this.c2000001 = c2000001;
  }

  public TapiEthControlFrameFilter c2000002(Boolean c2000002) {
    this.c2000002 = c2000002;
    return this;
  }

  /**
   * This attribute identifies the IEEE 802.3 Slow_Protocols_Multicast address (LACP/LAMP or Link OAM protocols).
   * @return c2000002
  **/
  @ApiModelProperty(value = "This attribute identifies the IEEE 802.3 Slow_Protocols_Multicast address (LACP/LAMP or Link OAM protocols).")

  public Boolean isC2000002() {
    return c2000002;
  }

  public void setC2000002(Boolean c2000002) {
    this.c2000002 = c2000002;
  }

  public TapiEthControlFrameFilter c2000003(Boolean c2000003) {
    this.c2000003 = c2000003;
    return this;
  }

  /**
   * This attribute identifies the Nearest non-TPMR Bridge group address (Port Authentication protocol).
   * @return c2000003
  **/
  @ApiModelProperty(value = "This attribute identifies the Nearest non-TPMR Bridge group address (Port Authentication protocol).")

  public Boolean isC2000003() {
    return c2000003;
  }

  public void setC2000003(Boolean c2000003) {
    this.c2000003 = c2000003;
  }

  public TapiEthControlFrameFilter c2000004(Boolean c2000004) {
    this.c2000004 = c2000004;
    return this;
  }

  /**
   * This attribute identifies the IEEE MAC-specific Control Protocols group address.
   * @return c2000004
  **/
  @ApiModelProperty(value = "This attribute identifies the IEEE MAC-specific Control Protocols group address.")

  public Boolean isC2000004() {
    return c2000004;
  }

  public void setC2000004(Boolean c2000004) {
    this.c2000004 = c2000004;
  }

  public TapiEthControlFrameFilter c2000005(Boolean c2000005) {
    this.c2000005 = c2000005;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c2000005
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC2000005() {
    return c2000005;
  }

  public void setC2000005(Boolean c2000005) {
    this.c2000005 = c2000005;
  }

  public TapiEthControlFrameFilter c2000006(Boolean c2000006) {
    this.c2000006 = c2000006;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c2000006
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC2000006() {
    return c2000006;
  }

  public void setC2000006(Boolean c2000006) {
    this.c2000006 = c2000006;
  }

  public TapiEthControlFrameFilter c2000007(Boolean c2000007) {
    this.c2000007 = c2000007;
    return this;
  }

  /**
   * This attribute identifies the Metro Ethernet Forum E-LMI protocol group address.
   * @return c2000007
  **/
  @ApiModelProperty(value = "This attribute identifies the Metro Ethernet Forum E-LMI protocol group address.")

  public Boolean isC2000007() {
    return c2000007;
  }

  public void setC2000007(Boolean c2000007) {
    this.c2000007 = c2000007;
  }

  public TapiEthControlFrameFilter c2000008(Boolean c2000008) {
    this.c2000008 = c2000008;
    return this;
  }

  /**
   * This attribute identifies the Provider Bridge Group address.
   * @return c2000008
  **/
  @ApiModelProperty(value = "This attribute identifies the Provider Bridge Group address.")

  public Boolean isC2000008() {
    return c2000008;
  }

  public void setC2000008(Boolean c2000008) {
    this.c2000008 = c2000008;
  }

  public TapiEthControlFrameFilter c2000009(Boolean c2000009) {
    this.c2000009 = c2000009;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c2000009
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC2000009() {
    return c2000009;
  }

  public void setC2000009(Boolean c2000009) {
    this.c2000009 = c2000009;
  }

  public TapiEthControlFrameFilter c2000010(Boolean c2000010) {
    this.c2000010 = c2000010;
    return this;
  }

  /**
   * This attribute identifies the 'All LANs Bridge Management Group Address'.
   * @return c2000010
  **/
  @ApiModelProperty(value = "This attribute identifies the 'All LANs Bridge Management Group Address'.")

  public Boolean isC2000010() {
    return c2000010;
  }

  public void setC2000010(Boolean c2000010) {
    this.c2000010 = c2000010;
  }

  public TapiEthControlFrameFilter c200002A(Boolean c200002A) {
    this.c200002A = c200002A;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c200002A
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC200002A() {
    return c200002A;
  }

  public void setC200002A(Boolean c200002A) {
    this.c200002A = c200002A;
  }

  public TapiEthControlFrameFilter c200002B(Boolean c200002B) {
    this.c200002B = c200002B;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c200002B
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC200002B() {
    return c200002B;
  }

  public void setC200002B(Boolean c200002B) {
    this.c200002B = c200002B;
  }

  public TapiEthControlFrameFilter c200002C(Boolean c200002C) {
    this.c200002C = c200002C;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c200002C
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC200002C() {
    return c200002C;
  }

  public void setC200002C(Boolean c200002C) {
    this.c200002C = c200002C;
  }

  public TapiEthControlFrameFilter c200002D(Boolean c200002D) {
    this.c200002D = c200002D;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c200002D
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC200002D() {
    return c200002D;
  }

  public void setC200002D(Boolean c200002D) {
    this.c200002D = c200002D;
  }

  public TapiEthControlFrameFilter c200002E(Boolean c200002E) {
    this.c200002E = c200002E;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c200002E
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC200002E() {
    return c200002E;
  }

  public void setC200002E(Boolean c200002E) {
    this.c200002E = c200002E;
  }

  public TapiEthControlFrameFilter c200002F(Boolean c200002F) {
    this.c200002F = c200002F;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c200002F
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC200002F() {
    return c200002F;
  }

  public void setC200002F(Boolean c200002F) {
    this.c200002F = c200002F;
  }

  public TapiEthControlFrameFilter c2000020(Boolean c2000020) {
    this.c2000020 = c2000020;
    return this;
  }

  /**
   * This attribute identifies the Customer and Provider Bridge MMRP address.
   * @return c2000020
  **/
  @ApiModelProperty(value = "This attribute identifies the Customer and Provider Bridge MMRP address.")

  public Boolean isC2000020() {
    return c2000020;
  }

  public void setC2000020(Boolean c2000020) {
    this.c2000020 = c2000020;
  }

  public TapiEthControlFrameFilter c2000021(Boolean c2000021) {
    this.c2000021 = c2000021;
    return this;
  }

  /**
   * This attribute identifies the Customer Bridge MVRP address.
   * @return c2000021
  **/
  @ApiModelProperty(value = "This attribute identifies the Customer Bridge MVRP address.")

  public Boolean isC2000021() {
    return c2000021;
  }

  public void setC2000021(Boolean c2000021) {
    this.c2000021 = c2000021;
  }

  public TapiEthControlFrameFilter c2000022(Boolean c2000022) {
    this.c2000022 = c2000022;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c2000022
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC2000022() {
    return c2000022;
  }

  public void setC2000022(Boolean c2000022) {
    this.c2000022 = c2000022;
  }

  public TapiEthControlFrameFilter c2000023(Boolean c2000023) {
    this.c2000023 = c2000023;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c2000023
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC2000023() {
    return c2000023;
  }

  public void setC2000023(Boolean c2000023) {
    this.c2000023 = c2000023;
  }

  public TapiEthControlFrameFilter c2000024(Boolean c2000024) {
    this.c2000024 = c2000024;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c2000024
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC2000024() {
    return c2000024;
  }

  public void setC2000024(Boolean c2000024) {
    this.c2000024 = c2000024;
  }

  public TapiEthControlFrameFilter c2000025(Boolean c2000025) {
    this.c2000025 = c2000025;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c2000025
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC2000025() {
    return c2000025;
  }

  public void setC2000025(Boolean c2000025) {
    this.c2000025 = c2000025;
  }

  public TapiEthControlFrameFilter c2000026(Boolean c2000026) {
    this.c2000026 = c2000026;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c2000026
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC2000026() {
    return c2000026;
  }

  public void setC2000026(Boolean c2000026) {
    this.c2000026 = c2000026;
  }

  public TapiEthControlFrameFilter c2000027(Boolean c2000027) {
    this.c2000027 = c2000027;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c2000027
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC2000027() {
    return c2000027;
  }

  public void setC2000027(Boolean c2000027) {
    this.c2000027 = c2000027;
  }

  public TapiEthControlFrameFilter c2000028(Boolean c2000028) {
    this.c2000028 = c2000028;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c2000028
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC2000028() {
    return c2000028;
  }

  public void setC2000028(Boolean c2000028) {
    this.c2000028 = c2000028;
  }

  public TapiEthControlFrameFilter c2000029(Boolean c2000029) {
    this.c2000029 = c2000029;
    return this;
  }

  /**
   * Reserved for future standardization.
   * @return c2000029
  **/
  @ApiModelProperty(value = "Reserved for future standardization.")

  public Boolean isC2000029() {
    return c2000029;
  }

  public void setC2000029(Boolean c2000029) {
    this.c2000029 = c2000029;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthControlFrameFilter tapiEthControlFrameFilter = (TapiEthControlFrameFilter) o;
    return Objects.equals(this.c200000A, tapiEthControlFrameFilter.c200000A) &&
        Objects.equals(this.c200000B, tapiEthControlFrameFilter.c200000B) &&
        Objects.equals(this.c200000C, tapiEthControlFrameFilter.c200000C) &&
        Objects.equals(this.c200000D, tapiEthControlFrameFilter.c200000D) &&
        Objects.equals(this.c200000E, tapiEthControlFrameFilter.c200000E) &&
        Objects.equals(this.c200000F, tapiEthControlFrameFilter.c200000F) &&
        Objects.equals(this.c2000000, tapiEthControlFrameFilter.c2000000) &&
        Objects.equals(this.c2000001, tapiEthControlFrameFilter.c2000001) &&
        Objects.equals(this.c2000002, tapiEthControlFrameFilter.c2000002) &&
        Objects.equals(this.c2000003, tapiEthControlFrameFilter.c2000003) &&
        Objects.equals(this.c2000004, tapiEthControlFrameFilter.c2000004) &&
        Objects.equals(this.c2000005, tapiEthControlFrameFilter.c2000005) &&
        Objects.equals(this.c2000006, tapiEthControlFrameFilter.c2000006) &&
        Objects.equals(this.c2000007, tapiEthControlFrameFilter.c2000007) &&
        Objects.equals(this.c2000008, tapiEthControlFrameFilter.c2000008) &&
        Objects.equals(this.c2000009, tapiEthControlFrameFilter.c2000009) &&
        Objects.equals(this.c2000010, tapiEthControlFrameFilter.c2000010) &&
        Objects.equals(this.c200002A, tapiEthControlFrameFilter.c200002A) &&
        Objects.equals(this.c200002B, tapiEthControlFrameFilter.c200002B) &&
        Objects.equals(this.c200002C, tapiEthControlFrameFilter.c200002C) &&
        Objects.equals(this.c200002D, tapiEthControlFrameFilter.c200002D) &&
        Objects.equals(this.c200002E, tapiEthControlFrameFilter.c200002E) &&
        Objects.equals(this.c200002F, tapiEthControlFrameFilter.c200002F) &&
        Objects.equals(this.c2000020, tapiEthControlFrameFilter.c2000020) &&
        Objects.equals(this.c2000021, tapiEthControlFrameFilter.c2000021) &&
        Objects.equals(this.c2000022, tapiEthControlFrameFilter.c2000022) &&
        Objects.equals(this.c2000023, tapiEthControlFrameFilter.c2000023) &&
        Objects.equals(this.c2000024, tapiEthControlFrameFilter.c2000024) &&
        Objects.equals(this.c2000025, tapiEthControlFrameFilter.c2000025) &&
        Objects.equals(this.c2000026, tapiEthControlFrameFilter.c2000026) &&
        Objects.equals(this.c2000027, tapiEthControlFrameFilter.c2000027) &&
        Objects.equals(this.c2000028, tapiEthControlFrameFilter.c2000028) &&
        Objects.equals(this.c2000029, tapiEthControlFrameFilter.c2000029);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c200000A, c200000B, c200000C, c200000D, c200000E, c200000F, c2000000, c2000001, c2000002, c2000003, c2000004, c2000005, c2000006, c2000007, c2000008, c2000009, c2000010, c200002A, c200002B, c200002C, c200002D, c200002E, c200002F, c2000020, c2000021, c2000022, c2000023, c2000024, c2000025, c2000026, c2000027, c2000028, c2000029);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthControlFrameFilter {\n");
    
    sb.append("    c200000A: ").append(toIndentedString(c200000A)).append("\n");
    sb.append("    c200000B: ").append(toIndentedString(c200000B)).append("\n");
    sb.append("    c200000C: ").append(toIndentedString(c200000C)).append("\n");
    sb.append("    c200000D: ").append(toIndentedString(c200000D)).append("\n");
    sb.append("    c200000E: ").append(toIndentedString(c200000E)).append("\n");
    sb.append("    c200000F: ").append(toIndentedString(c200000F)).append("\n");
    sb.append("    c2000000: ").append(toIndentedString(c2000000)).append("\n");
    sb.append("    c2000001: ").append(toIndentedString(c2000001)).append("\n");
    sb.append("    c2000002: ").append(toIndentedString(c2000002)).append("\n");
    sb.append("    c2000003: ").append(toIndentedString(c2000003)).append("\n");
    sb.append("    c2000004: ").append(toIndentedString(c2000004)).append("\n");
    sb.append("    c2000005: ").append(toIndentedString(c2000005)).append("\n");
    sb.append("    c2000006: ").append(toIndentedString(c2000006)).append("\n");
    sb.append("    c2000007: ").append(toIndentedString(c2000007)).append("\n");
    sb.append("    c2000008: ").append(toIndentedString(c2000008)).append("\n");
    sb.append("    c2000009: ").append(toIndentedString(c2000009)).append("\n");
    sb.append("    c2000010: ").append(toIndentedString(c2000010)).append("\n");
    sb.append("    c200002A: ").append(toIndentedString(c200002A)).append("\n");
    sb.append("    c200002B: ").append(toIndentedString(c200002B)).append("\n");
    sb.append("    c200002C: ").append(toIndentedString(c200002C)).append("\n");
    sb.append("    c200002D: ").append(toIndentedString(c200002D)).append("\n");
    sb.append("    c200002E: ").append(toIndentedString(c200002E)).append("\n");
    sb.append("    c200002F: ").append(toIndentedString(c200002F)).append("\n");
    sb.append("    c2000020: ").append(toIndentedString(c2000020)).append("\n");
    sb.append("    c2000021: ").append(toIndentedString(c2000021)).append("\n");
    sb.append("    c2000022: ").append(toIndentedString(c2000022)).append("\n");
    sb.append("    c2000023: ").append(toIndentedString(c2000023)).append("\n");
    sb.append("    c2000024: ").append(toIndentedString(c2000024)).append("\n");
    sb.append("    c2000025: ").append(toIndentedString(c2000025)).append("\n");
    sb.append("    c2000026: ").append(toIndentedString(c2000026)).append("\n");
    sb.append("    c2000027: ").append(toIndentedString(c2000027)).append("\n");
    sb.append("    c2000028: ").append(toIndentedString(c2000028)).append("\n");
    sb.append("    c2000029: ").append(toIndentedString(c2000029)).append("\n");
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
