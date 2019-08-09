package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthMepCommon;
import io.swagger.model.TapiEthEthMepSink;
import io.swagger.model.TapiEthEthMepSource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthMepSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthMepSpec   {
  @JsonProperty("eth-mep-common")
  private TapiEthEthMepCommon ethMepCommon = null;

  @JsonProperty("mep-mac")
  private String mepMac = null;

  @JsonProperty("eth-mep-source")
  private TapiEthEthMepSource ethMepSource = null;

  @JsonProperty("eth-mep-sink")
  private TapiEthEthMepSink ethMepSink = null;

  public TapiEthEthMepSpec ethMepCommon(TapiEthEthMepCommon ethMepCommon) {
    this.ethMepCommon = ethMepCommon;
    return this;
  }

  /**
   * Get ethMepCommon
   * @return ethMepCommon
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthMepCommon getEthMepCommon() {
    return ethMepCommon;
  }

  public void setEthMepCommon(TapiEthEthMepCommon ethMepCommon) {
    this.ethMepCommon = ethMepCommon;
  }

  public TapiEthEthMepSpec mepMac(String mepMac) {
    this.mepMac = mepMac;
    return this;
  }

  /**
   * This attribute contains the MAC Address of the MEP.
   * @return mepMac
  **/
  @ApiModelProperty(value = "This attribute contains the MAC Address of the MEP.")

  public String getMepMac() {
    return mepMac;
  }

  public void setMepMac(String mepMac) {
    this.mepMac = mepMac;
  }

  public TapiEthEthMepSpec ethMepSource(TapiEthEthMepSource ethMepSource) {
    this.ethMepSource = ethMepSource;
    return this;
  }

  /**
   * Get ethMepSource
   * @return ethMepSource
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthMepSource getEthMepSource() {
    return ethMepSource;
  }

  public void setEthMepSource(TapiEthEthMepSource ethMepSource) {
    this.ethMepSource = ethMepSource;
  }

  public TapiEthEthMepSpec ethMepSink(TapiEthEthMepSink ethMepSink) {
    this.ethMepSink = ethMepSink;
    return this;
  }

  /**
   * Get ethMepSink
   * @return ethMepSink
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthMepSink getEthMepSink() {
    return ethMepSink;
  }

  public void setEthMepSink(TapiEthEthMepSink ethMepSink) {
    this.ethMepSink = ethMepSink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthMepSpec tapiEthEthMepSpec = (TapiEthEthMepSpec) o;
    return Objects.equals(this.ethMepCommon, tapiEthEthMepSpec.ethMepCommon) &&
        Objects.equals(this.mepMac, tapiEthEthMepSpec.mepMac) &&
        Objects.equals(this.ethMepSource, tapiEthEthMepSpec.ethMepSource) &&
        Objects.equals(this.ethMepSink, tapiEthEthMepSpec.ethMepSink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethMepCommon, mepMac, ethMepSource, ethMepSink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthMepSpec {\n");
    
    sb.append("    ethMepCommon: ").append(toIndentedString(ethMepCommon)).append("\n");
    sb.append("    mepMac: ").append(toIndentedString(mepMac)).append("\n");
    sb.append("    ethMepSource: ").append(toIndentedString(ethMepSource)).append("\n");
    sb.append("    ethMepSink: ").append(toIndentedString(ethMepSink)).append("\n");
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
