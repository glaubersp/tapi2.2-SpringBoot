package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthMeasurementJobControlCommon;
import io.swagger.model.TapiEthRepetitionPeriod;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthOnDemandMeasurementJobControlSink
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthOnDemandMeasurementJobControlSink extends TapiEthEthMeasurementJobControlCommon  {
  @JsonProperty("sink-mep-id")
  private Integer sinkMepId = null;

  @JsonProperty("source-address")
  private String sourceAddress = null;

  public TapiEthEthOnDemandMeasurementJobControlSink sinkMepId(Integer sinkMepId) {
    this.sinkMepId = sinkMepId;
    return this;
  }

  /**
   * none
   * @return sinkMepId
  **/
  @ApiModelProperty(value = "none")

  public Integer getSinkMepId() {
    return sinkMepId;
  }

  public void setSinkMepId(Integer sinkMepId) {
    this.sinkMepId = sinkMepId;
  }

  public TapiEthEthOnDemandMeasurementJobControlSink sourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
    return this;
  }

  /**
   * This attribute contains the MAC address of the peer MEP. See G.8013 for details.
   * @return sourceAddress
  **/
  @ApiModelProperty(value = "This attribute contains the MAC address of the peer MEP. See G.8013 for details.")

  public String getSourceAddress() {
    return sourceAddress;
  }

  public void setSourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthOnDemandMeasurementJobControlSink tapiEthEthOnDemandMeasurementJobControlSink = (TapiEthEthOnDemandMeasurementJobControlSink) o;
    return Objects.equals(this.sinkMepId, tapiEthEthOnDemandMeasurementJobControlSink.sinkMepId) &&
        Objects.equals(this.sourceAddress, tapiEthEthOnDemandMeasurementJobControlSink.sourceAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sinkMepId, sourceAddress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOnDemandMeasurementJobControlSink {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sinkMepId: ").append(toIndentedString(sinkMepId)).append("\n");
    sb.append("    sourceAddress: ").append(toIndentedString(sourceAddress)).append("\n");
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
