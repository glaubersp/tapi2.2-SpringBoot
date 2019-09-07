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
 * TapiTopologyLatencyCharacteristic
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiTopologyLatencyCharacteristic   {
  @JsonProperty("fixed-latency-characteristic")
  private String fixedLatencyCharacteristic = null;

  @JsonProperty("jitter-characteristic")
  private String jitterCharacteristic = null;

  @JsonProperty("queing-latency-characteristic")
  private String queingLatencyCharacteristic = null;

  @JsonProperty("traffic-property-name")
  private String trafficPropertyName = null;

  @JsonProperty("wander-characteristic")
  private String wanderCharacteristic = null;

  public TapiTopologyLatencyCharacteristic fixedLatencyCharacteristic(String fixedLatencyCharacteristic) {
    this.fixedLatencyCharacteristic = fixedLatencyCharacteristic;
    return this;
  }

  /**
   * A TopologicalEntity suffers delay caused by the realization of the servers (e.g. distance related; FEC encoding etc.) along with some client specific processing. This is the total average latency effect of the TopologicalEntity
   * @return fixedLatencyCharacteristic
  **/
  @ApiModelProperty(value = "A TopologicalEntity suffers delay caused by the realization of the servers (e.g. distance related; FEC encoding etc.) along with some client specific processing. This is the total average latency effect of the TopologicalEntity")

  public String getFixedLatencyCharacteristic() {
    return fixedLatencyCharacteristic;
  }

  public void setFixedLatencyCharacteristic(String fixedLatencyCharacteristic) {
    this.fixedLatencyCharacteristic = fixedLatencyCharacteristic;
  }

  public TapiTopologyLatencyCharacteristic jitterCharacteristic(String jitterCharacteristic) {
    this.jitterCharacteristic = jitterCharacteristic;
    return this;
  }

  /**
   * High frequency deviation from true periodicity of a signal and therefore a small high rate of change of transfer latency.                  Applies to TDM systems (and not packet).
   * @return jitterCharacteristic
  **/
  @ApiModelProperty(value = "High frequency deviation from true periodicity of a signal and therefore a small high rate of change of transfer latency.                  Applies to TDM systems (and not packet).")

  public String getJitterCharacteristic() {
    return jitterCharacteristic;
  }

  public void setJitterCharacteristic(String jitterCharacteristic) {
    this.jitterCharacteristic = jitterCharacteristic;
  }

  public TapiTopologyLatencyCharacteristic queingLatencyCharacteristic(String queingLatencyCharacteristic) {
    this.queingLatencyCharacteristic = queingLatencyCharacteristic;
    return this;
  }

  /**
   * The specific queuing latency for the traffic property.
   * @return queingLatencyCharacteristic
  **/
  @ApiModelProperty(value = "The specific queuing latency for the traffic property.")

  public String getQueingLatencyCharacteristic() {
    return queingLatencyCharacteristic;
  }

  public void setQueingLatencyCharacteristic(String queingLatencyCharacteristic) {
    this.queingLatencyCharacteristic = queingLatencyCharacteristic;
  }

  public TapiTopologyLatencyCharacteristic trafficPropertyName(String trafficPropertyName) {
    this.trafficPropertyName = trafficPropertyName;
    return this;
  }

  /**
   * The identifier of the specific traffic property to which the queuing latency applies.
   * @return trafficPropertyName
  **/
  @ApiModelProperty(value = "The identifier of the specific traffic property to which the queuing latency applies.")

  public String getTrafficPropertyName() {
    return trafficPropertyName;
  }

  public void setTrafficPropertyName(String trafficPropertyName) {
    this.trafficPropertyName = trafficPropertyName;
  }

  public TapiTopologyLatencyCharacteristic wanderCharacteristic(String wanderCharacteristic) {
    this.wanderCharacteristic = wanderCharacteristic;
    return this;
  }

  /**
   * Low frequency deviation from true periodicity of a signal and therefore a small low rate of change of transfer latency.                  Applies to TDM systems (and not packet).
   * @return wanderCharacteristic
  **/
  @ApiModelProperty(value = "Low frequency deviation from true periodicity of a signal and therefore a small low rate of change of transfer latency.                  Applies to TDM systems (and not packet).")

  public String getWanderCharacteristic() {
    return wanderCharacteristic;
  }

  public void setWanderCharacteristic(String wanderCharacteristic) {
    this.wanderCharacteristic = wanderCharacteristic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiTopologyLatencyCharacteristic tapiTopologyLatencyCharacteristic = (TapiTopologyLatencyCharacteristic) o;
    return Objects.equals(this.fixedLatencyCharacteristic, tapiTopologyLatencyCharacteristic.fixedLatencyCharacteristic) &&
        Objects.equals(this.jitterCharacteristic, tapiTopologyLatencyCharacteristic.jitterCharacteristic) &&
        Objects.equals(this.queingLatencyCharacteristic, tapiTopologyLatencyCharacteristic.queingLatencyCharacteristic) &&
        Objects.equals(this.trafficPropertyName, tapiTopologyLatencyCharacteristic.trafficPropertyName) &&
        Objects.equals(this.wanderCharacteristic, tapiTopologyLatencyCharacteristic.wanderCharacteristic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixedLatencyCharacteristic, jitterCharacteristic, queingLatencyCharacteristic, trafficPropertyName, wanderCharacteristic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiTopologyLatencyCharacteristic {\n");
    
    sb.append("    fixedLatencyCharacteristic: ").append(toIndentedString(fixedLatencyCharacteristic)).append("\n");
    sb.append("    jitterCharacteristic: ").append(toIndentedString(jitterCharacteristic)).append("\n");
    sb.append("    queingLatencyCharacteristic: ").append(toIndentedString(queingLatencyCharacteristic)).append("\n");
    sb.append("    trafficPropertyName: ").append(toIndentedString(trafficPropertyName)).append("\n");
    sb.append("    wanderCharacteristic: ").append(toIndentedString(wanderCharacteristic)).append("\n");
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
