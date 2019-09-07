package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiNotificationNotificationChannel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiNotificationNotificationChannel extends TapiCommonLocalClass  {
  @JsonProperty("next-sequence-no")
  private Integer nextSequenceNo = null;

  @JsonProperty("stream-address")
  private String streamAddress = null;

  public TapiNotificationNotificationChannel nextSequenceNo(Integer nextSequenceNo) {
    this.nextSequenceNo = nextSequenceNo;
    return this;
  }

  /**
   * The sequence number of the next notification that will be published on the channel
   * @return nextSequenceNo
  **/
  @ApiModelProperty(value = "The sequence number of the next notification that will be published on the channel")

  public Integer getNextSequenceNo() {
    return nextSequenceNo;
  }

  public void setNextSequenceNo(Integer nextSequenceNo) {
    this.nextSequenceNo = nextSequenceNo;
  }

  public TapiNotificationNotificationChannel streamAddress(String streamAddress) {
    this.streamAddress = streamAddress;
    return this;
  }

  /**
   * The address/location/URI of the channel/stream to which the subscribed notifications are published.                  This specifics of this is typically dependent on the implementation protocol & mechanism and hence is typed as a string.
   * @return streamAddress
  **/
  @ApiModelProperty(value = "The address/location/URI of the channel/stream to which the subscribed notifications are published.                  This specifics of this is typically dependent on the implementation protocol & mechanism and hence is typed as a string.")

  public String getStreamAddress() {
    return streamAddress;
  }

  public void setStreamAddress(String streamAddress) {
    this.streamAddress = streamAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationNotificationChannel tapiNotificationNotificationChannel = (TapiNotificationNotificationChannel) o;
    return Objects.equals(this.nextSequenceNo, tapiNotificationNotificationChannel.nextSequenceNo) &&
        Objects.equals(this.streamAddress, tapiNotificationNotificationChannel.streamAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextSequenceNo, streamAddress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationNotificationChannel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    nextSequenceNo: ").append(toIndentedString(nextSequenceNo)).append("\n");
    sb.append("    streamAddress: ").append(toIndentedString(streamAddress)).append("\n");
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
