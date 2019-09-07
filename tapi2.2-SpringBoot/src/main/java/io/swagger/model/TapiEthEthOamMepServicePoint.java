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
 * TapiEthEthOamMepServicePoint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthOamMepServicePoint   {
  @JsonProperty("eth-mep-common")
  private TapiEthEthMepCommon ethMepCommon = null;

  @JsonProperty("eth-mep-sink")
  private TapiEthEthMepSink ethMepSink = null;

  @JsonProperty("eth-mep-source")
  private TapiEthEthMepSource ethMepSource = null;

  public TapiEthEthOamMepServicePoint ethMepCommon(TapiEthEthMepCommon ethMepCommon) {
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

  public TapiEthEthOamMepServicePoint ethMepSink(TapiEthEthMepSink ethMepSink) {
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

  public TapiEthEthOamMepServicePoint ethMepSource(TapiEthEthMepSource ethMepSource) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthOamMepServicePoint tapiEthEthOamMepServicePoint = (TapiEthEthOamMepServicePoint) o;
    return Objects.equals(this.ethMepCommon, tapiEthEthOamMepServicePoint.ethMepCommon) &&
        Objects.equals(this.ethMepSink, tapiEthEthOamMepServicePoint.ethMepSink) &&
        Objects.equals(this.ethMepSource, tapiEthEthOamMepServicePoint.ethMepSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethMepCommon, ethMepSink, ethMepSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOamMepServicePoint {\n");
    
    sb.append("    ethMepCommon: ").append(toIndentedString(ethMepCommon)).append("\n");
    sb.append("    ethMepSink: ").append(toIndentedString(ethMepSink)).append("\n");
    sb.append("    ethMepSource: ").append(toIndentedString(ethMepSource)).append("\n");
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
