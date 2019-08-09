package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthCtpCommonPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthCtpPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthCtpPac   {
  @JsonProperty("eth-ctp-common-pac")
  private TapiEthEthCtpCommonPac ethCtpCommonPac = null;

  @JsonProperty("partner-system-priority")
  private Integer partnerSystemPriority = null;

  @JsonProperty("partner-oper-key")
  private Integer partnerOperKey = null;

  @JsonProperty("actor-system-priority")
  private Integer actorSystemPriority = null;

  @JsonProperty("actor-oper-key")
  private Integer actorOperKey = null;

  @JsonProperty("data-rate")
  private Integer dataRate = null;

  @JsonProperty("actor-system-id")
  private String actorSystemId = null;

  @JsonProperty("partner-system-id")
  private String partnerSystemId = null;

  public TapiEthEthCtpPac ethCtpCommonPac(TapiEthEthCtpCommonPac ethCtpCommonPac) {
    this.ethCtpCommonPac = ethCtpCommonPac;
    return this;
  }

  /**
   * Get ethCtpCommonPac
   * @return ethCtpCommonPac
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthCtpCommonPac getEthCtpCommonPac() {
    return ethCtpCommonPac;
  }

  public void setEthCtpCommonPac(TapiEthEthCtpCommonPac ethCtpCommonPac) {
    this.ethCtpCommonPac = ethCtpCommonPac;
  }

  public TapiEthEthCtpPac partnerSystemPriority(Integer partnerSystemPriority) {
    this.partnerSystemPriority = partnerSystemPriority;
    return this;
  }

  /**
   * See 802.1AX:                  Indicates the priority associated with the Partners System ID. If the aggregation is manually configured, this System Priority value will be a value assigned by the local System.                  range of type : 2-octet
   * @return partnerSystemPriority
  **/
  @ApiModelProperty(value = "See 802.1AX:                  Indicates the priority associated with the Partners System ID. If the aggregation is manually configured, this System Priority value will be a value assigned by the local System.                  range of type : 2-octet")

  public Integer getPartnerSystemPriority() {
    return partnerSystemPriority;
  }

  public void setPartnerSystemPriority(Integer partnerSystemPriority) {
    this.partnerSystemPriority = partnerSystemPriority;
  }

  public TapiEthEthCtpPac partnerOperKey(Integer partnerOperKey) {
    this.partnerOperKey = partnerOperKey;
    return this;
  }

  /**
   * See 802.1AX:                  The current operational value of the Key for the Aggregators current protocol Partner. If the aggregation is manually configured, this Key value will be a value assigned by the local System.                  range of type : 16-bit
   * @return partnerOperKey
  **/
  @ApiModelProperty(value = "See 802.1AX:                  The current operational value of the Key for the Aggregators current protocol Partner. If the aggregation is manually configured, this Key value will be a value assigned by the local System.                  range of type : 16-bit")

  public Integer getPartnerOperKey() {
    return partnerOperKey;
  }

  public void setPartnerOperKey(Integer partnerOperKey) {
    this.partnerOperKey = partnerOperKey;
  }

  public TapiEthEthCtpPac actorSystemPriority(Integer actorSystemPriority) {
    this.actorSystemPriority = actorSystemPriority;
    return this;
  }

  /**
   * See 802.1AX:                  Indicating the priority associated with the Actors System ID.                  range of type : 2-octet
   * @return actorSystemPriority
  **/
  @ApiModelProperty(value = "See 802.1AX:                  Indicating the priority associated with the Actors System ID.                  range of type : 2-octet")

  public Integer getActorSystemPriority() {
    return actorSystemPriority;
  }

  public void setActorSystemPriority(Integer actorSystemPriority) {
    this.actorSystemPriority = actorSystemPriority;
  }

  public TapiEthEthCtpPac actorOperKey(Integer actorOperKey) {
    this.actorOperKey = actorOperKey;
    return this;
  }

  /**
   * See 802.1AX:                  The current operational value of the Key for the Aggregator. The administrative Key value may differ from the operational Key value for the reasons discussed in 5.6.2.                  The meaning of particular Key values is of local significance.                  range of type : 16 bit
   * @return actorOperKey
  **/
  @ApiModelProperty(value = "See 802.1AX:                  The current operational value of the Key for the Aggregator. The administrative Key value may differ from the operational Key value for the reasons discussed in 5.6.2.                  The meaning of particular Key values is of local significance.                  range of type : 16 bit")

  public Integer getActorOperKey() {
    return actorOperKey;
  }

  public void setActorOperKey(Integer actorOperKey) {
    this.actorOperKey = actorOperKey;
  }

  public TapiEthEthCtpPac dataRate(Integer dataRate) {
    this.dataRate = dataRate;
    return this;
  }

  /**
   * See 802.1AX:                  The current data rate, in bits per second, of the aggregate link. The value is calculated as N times the data rate of a single link in the aggregation, where N is the number of active links.
   * @return dataRate
  **/
  @ApiModelProperty(value = "See 802.1AX:                  The current data rate, in bits per second, of the aggregate link. The value is calculated as N times the data rate of a single link in the aggregation, where N is the number of active links.")

  public Integer getDataRate() {
    return dataRate;
  }

  public void setDataRate(Integer dataRate) {
    this.dataRate = dataRate;
  }

  public TapiEthEthCtpPac actorSystemId(String actorSystemId) {
    this.actorSystemId = actorSystemId;
    return this;
  }

  /**
   * See 802.1AX:                  A MAC address used as a unique identifier for the System that contains this Aggregator.
   * @return actorSystemId
  **/
  @ApiModelProperty(value = "See 802.1AX:                  A MAC address used as a unique identifier for the System that contains this Aggregator.")

  public String getActorSystemId() {
    return actorSystemId;
  }

  public void setActorSystemId(String actorSystemId) {
    this.actorSystemId = actorSystemId;
  }

  public TapiEthEthCtpPac partnerSystemId(String partnerSystemId) {
    this.partnerSystemId = partnerSystemId;
    return this;
  }

  /**
   * See 802.1AX:                  A MAC address consisting of the unique identifier for the current protocol Partner of this Aggregator. A value of zero indicates that there is no known Partner. If the aggregation is manually configured, this System ID value will be a value assigned by the local System.
   * @return partnerSystemId
  **/
  @ApiModelProperty(value = "See 802.1AX:                  A MAC address consisting of the unique identifier for the current protocol Partner of this Aggregator. A value of zero indicates that there is no known Partner. If the aggregation is manually configured, this System ID value will be a value assigned by the local System.")

  public String getPartnerSystemId() {
    return partnerSystemId;
  }

  public void setPartnerSystemId(String partnerSystemId) {
    this.partnerSystemId = partnerSystemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthCtpPac tapiEthEthCtpPac = (TapiEthEthCtpPac) o;
    return Objects.equals(this.ethCtpCommonPac, tapiEthEthCtpPac.ethCtpCommonPac) &&
        Objects.equals(this.partnerSystemPriority, tapiEthEthCtpPac.partnerSystemPriority) &&
        Objects.equals(this.partnerOperKey, tapiEthEthCtpPac.partnerOperKey) &&
        Objects.equals(this.actorSystemPriority, tapiEthEthCtpPac.actorSystemPriority) &&
        Objects.equals(this.actorOperKey, tapiEthEthCtpPac.actorOperKey) &&
        Objects.equals(this.dataRate, tapiEthEthCtpPac.dataRate) &&
        Objects.equals(this.actorSystemId, tapiEthEthCtpPac.actorSystemId) &&
        Objects.equals(this.partnerSystemId, tapiEthEthCtpPac.partnerSystemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethCtpCommonPac, partnerSystemPriority, partnerOperKey, actorSystemPriority, actorOperKey, dataRate, actorSystemId, partnerSystemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthCtpPac {\n");
    
    sb.append("    ethCtpCommonPac: ").append(toIndentedString(ethCtpCommonPac)).append("\n");
    sb.append("    partnerSystemPriority: ").append(toIndentedString(partnerSystemPriority)).append("\n");
    sb.append("    partnerOperKey: ").append(toIndentedString(partnerOperKey)).append("\n");
    sb.append("    actorSystemPriority: ").append(toIndentedString(actorSystemPriority)).append("\n");
    sb.append("    actorOperKey: ").append(toIndentedString(actorOperKey)).append("\n");
    sb.append("    dataRate: ").append(toIndentedString(dataRate)).append("\n");
    sb.append("    actorSystemId: ").append(toIndentedString(actorSystemId)).append("\n");
    sb.append("    partnerSystemId: ").append(toIndentedString(partnerSystemId)).append("\n");
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
