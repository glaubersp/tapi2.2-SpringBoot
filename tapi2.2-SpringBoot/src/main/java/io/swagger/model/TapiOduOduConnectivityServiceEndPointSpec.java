package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduMappingType;
import io.swagger.model.TapiOduOduPayloadType;
import io.swagger.model.TapiOduOduSlotSize;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduConnectivityServiceEndPointSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduOduConnectivityServiceEndPointSpec   {
  @JsonProperty("accepted-payload-type")
  private TapiOduOduPayloadType acceptedPayloadType = null;

  @JsonProperty("opu-tributary-slot-size")
  private TapiOduOduSlotSize opuTributarySlotSize = null;

  @JsonProperty("tributary-port-number")
  private Integer tributaryPortNumber = null;

  @JsonProperty("tributary-slot-list")
  @Valid
  private List<Integer> tributarySlotList = null;

  @JsonProperty("configured-mapping-type")
  private TapiOduMappingType configuredMappingType = null;

  @JsonProperty("odu-type")
  private String oduType = null;

  public TapiOduOduConnectivityServiceEndPointSpec acceptedPayloadType(TapiOduOduPayloadType acceptedPayloadType) {
    this.acceptedPayloadType = acceptedPayloadType;
    return this;
  }

  /**
   * Get acceptedPayloadType
   * @return acceptedPayloadType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduPayloadType getAcceptedPayloadType() {
    return acceptedPayloadType;
  }

  public void setAcceptedPayloadType(TapiOduOduPayloadType acceptedPayloadType) {
    this.acceptedPayloadType = acceptedPayloadType;
  }

  public TapiOduOduConnectivityServiceEndPointSpec opuTributarySlotSize(TapiOduOduSlotSize opuTributarySlotSize) {
    this.opuTributarySlotSize = opuTributarySlotSize;
    return this;
  }

  /**
   * Get opuTributarySlotSize
   * @return opuTributarySlotSize
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduSlotSize getOpuTributarySlotSize() {
    return opuTributarySlotSize;
  }

  public void setOpuTributarySlotSize(TapiOduOduSlotSize opuTributarySlotSize) {
    this.opuTributarySlotSize = opuTributarySlotSize;
  }

  public TapiOduOduConnectivityServiceEndPointSpec tributaryPortNumber(Integer tributaryPortNumber) {
    this.tributaryPortNumber = tributaryPortNumber;
    return this;
  }

  /**
   * This attribute identifies the tributary port number that is associated with the ODU CTP.                  range of type : The value range depends on the size of the Tributary Port Number (TPN) field used which depends on th server-layer ODU or OTU.                  In case of ODUk mapping into OTUk, there is no TPN field, so the tributaryPortNumber shall be zero.                  In case of LO ODUj mapping over ODU1, ODU2 or ODU3, the TPN is encoded in a 6-bit field so the value range is 0-63. See clause 14.4.1/G.709-2016.                  In case of LO ODUj mapping over ODU4, the TPN is encoded in a 7-bit field so the value range is 0-127. See clause 14.4.1.4/G.709-2016.                  In case of ODUk mapping over ODUCn, the TPN is encoded in a 14-bit field so the value range is 0-16383. See clause 20.4.1.1/G.709-2016.                  
   * @return tributaryPortNumber
  **/
  @ApiModelProperty(value = "This attribute identifies the tributary port number that is associated with the ODU CTP.                  range of type : The value range depends on the size of the Tributary Port Number (TPN) field used which depends on th server-layer ODU or OTU.                  In case of ODUk mapping into OTUk, there is no TPN field, so the tributaryPortNumber shall be zero.                  In case of LO ODUj mapping over ODU1, ODU2 or ODU3, the TPN is encoded in a 6-bit field so the value range is 0-63. See clause 14.4.1/G.709-2016.                  In case of LO ODUj mapping over ODU4, the TPN is encoded in a 7-bit field so the value range is 0-127. See clause 14.4.1.4/G.709-2016.                  In case of ODUk mapping over ODUCn, the TPN is encoded in a 14-bit field so the value range is 0-16383. See clause 20.4.1.1/G.709-2016.                  ")

  public Integer getTributaryPortNumber() {
    return tributaryPortNumber;
  }

  public void setTributaryPortNumber(Integer tributaryPortNumber) {
    this.tributaryPortNumber = tributaryPortNumber;
  }

  public TapiOduOduConnectivityServiceEndPointSpec tributarySlotList(List<Integer> tributarySlotList) {
    this.tributarySlotList = tributarySlotList;
    return this;
  }

  public TapiOduOduConnectivityServiceEndPointSpec addTributarySlotListItem(Integer tributarySlotListItem) {
    if (this.tributarySlotList == null) {
      this.tributarySlotList = new ArrayList<Integer>();
    }
    this.tributarySlotList.add(tributarySlotListItem);
    return this;
  }

  /**
   * This attribute contains a set of distinct (i.e. unique) integers (e.g. 2, 3, 5, 9, 15 representing the tributary slots TS2, TS3, TS5, TS9 and TS15) which represents the resources occupied by the Low Order ODU Link Connection (e.g. carrying an ODUflex with a bit rate of 6.25G).                   This attribute applies when the LO ODU_ ConnectionTerminationPoint connects with an HO ODU_TrailTerminationPoint object.                   It will not apply if this ODU_ ConnectionTerminationPoint object directly connects to an OTU_TrailTerminationPoint object (i.e. OTU has no trib slots).                   The upper bound of the integer allowed in this set is a function of the HO-ODU server layer to which the ODU connection has been mapped (adapted).                   Thus, for example, M=8/32/80 for ODU2/ODU3/ODU4 server layers (respectively). Note that the value of this attribute can be changed only in the case of ODUflex and has to be through specific operations (i.e. not be changing the attribute tributarySlotList directly).
   * @return tributarySlotList
  **/
  @ApiModelProperty(value = "This attribute contains a set of distinct (i.e. unique) integers (e.g. 2, 3, 5, 9, 15 representing the tributary slots TS2, TS3, TS5, TS9 and TS15) which represents the resources occupied by the Low Order ODU Link Connection (e.g. carrying an ODUflex with a bit rate of 6.25G).                   This attribute applies when the LO ODU_ ConnectionTerminationPoint connects with an HO ODU_TrailTerminationPoint object.                   It will not apply if this ODU_ ConnectionTerminationPoint object directly connects to an OTU_TrailTerminationPoint object (i.e. OTU has no trib slots).                   The upper bound of the integer allowed in this set is a function of the HO-ODU server layer to which the ODU connection has been mapped (adapted).                   Thus, for example, M=8/32/80 for ODU2/ODU3/ODU4 server layers (respectively). Note that the value of this attribute can be changed only in the case of ODUflex and has to be through specific operations (i.e. not be changing the attribute tributarySlotList directly).")

  public List<Integer> getTributarySlotList() {
    return tributarySlotList;
  }

  public void setTributarySlotList(List<Integer> tributarySlotList) {
    this.tributarySlotList = tributarySlotList;
  }

  public TapiOduOduConnectivityServiceEndPointSpec configuredMappingType(TapiOduMappingType configuredMappingType) {
    this.configuredMappingType = configuredMappingType;
    return this;
  }

  /**
   * Get configuredMappingType
   * @return configuredMappingType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduMappingType getConfiguredMappingType() {
    return configuredMappingType;
  }

  public void setConfiguredMappingType(TapiOduMappingType configuredMappingType) {
    this.configuredMappingType = configuredMappingType;
  }

  public TapiOduOduConnectivityServiceEndPointSpec oduType(String oduType) {
    this.oduType = oduType;
    return this;
  }

  /**
   * This attribute specifies the type of the ODU termination point.
   * @return oduType
  **/
  @ApiModelProperty(value = "This attribute specifies the type of the ODU termination point.")

  public String getOduType() {
    return oduType;
  }

  public void setOduType(String oduType) {
    this.oduType = oduType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduConnectivityServiceEndPointSpec tapiOduOduConnectivityServiceEndPointSpec = (TapiOduOduConnectivityServiceEndPointSpec) o;
    return Objects.equals(this.acceptedPayloadType, tapiOduOduConnectivityServiceEndPointSpec.acceptedPayloadType) &&
        Objects.equals(this.opuTributarySlotSize, tapiOduOduConnectivityServiceEndPointSpec.opuTributarySlotSize) &&
        Objects.equals(this.tributaryPortNumber, tapiOduOduConnectivityServiceEndPointSpec.tributaryPortNumber) &&
        Objects.equals(this.tributarySlotList, tapiOduOduConnectivityServiceEndPointSpec.tributarySlotList) &&
        Objects.equals(this.configuredMappingType, tapiOduOduConnectivityServiceEndPointSpec.configuredMappingType) &&
        Objects.equals(this.oduType, tapiOduOduConnectivityServiceEndPointSpec.oduType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedPayloadType, opuTributarySlotSize, tributaryPortNumber, tributarySlotList, configuredMappingType, oduType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduConnectivityServiceEndPointSpec {\n");
    
    sb.append("    acceptedPayloadType: ").append(toIndentedString(acceptedPayloadType)).append("\n");
    sb.append("    opuTributarySlotSize: ").append(toIndentedString(opuTributarySlotSize)).append("\n");
    sb.append("    tributaryPortNumber: ").append(toIndentedString(tributaryPortNumber)).append("\n");
    sb.append("    tributarySlotList: ").append(toIndentedString(tributarySlotList)).append("\n");
    sb.append("    configuredMappingType: ").append(toIndentedString(configuredMappingType)).append("\n");
    sb.append("    oduType: ").append(toIndentedString(oduType)).append("\n");
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
