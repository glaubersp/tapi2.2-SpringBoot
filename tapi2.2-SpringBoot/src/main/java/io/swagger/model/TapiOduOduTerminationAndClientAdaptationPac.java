package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduMappingType;
import io.swagger.model.TapiOduOduPayloadType;
import io.swagger.model.TapiOduOduSlotSize;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduTerminationAndClientAdaptationPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduOduTerminationAndClientAdaptationPac   {
  @JsonProperty("configured-mapping-type")
  private TapiOduMappingType configuredMappingType = null;

  @JsonProperty("auto-payload-type")
  private Boolean autoPayloadType = false;

  @JsonProperty("accepted-payload-type")
  private TapiOduOduPayloadType acceptedPayloadType = null;

  @JsonProperty("opu-tributary-slot-size")
  private TapiOduOduSlotSize opuTributarySlotSize = null;

  @JsonProperty("configured-client-type")
  private String configuredClientType = null;

  public TapiOduOduTerminationAndClientAdaptationPac configuredMappingType(TapiOduMappingType configuredMappingType) {
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

  public TapiOduOduTerminationAndClientAdaptationPac autoPayloadType(Boolean autoPayloadType) {
    this.autoPayloadType = autoPayloadType;
    return this;
  }

  /**
   * This attribute is applicable when the ODU CTP object instance represents a lower order ODU CTP Source at the client layer of the ODUP/ODUj-21 adaptation function. The value of true of this attribute configures that the adaptation source function shall fall back to the payload type PT=20 if the conditions specified in 14.3.10.1/G.798 are satisfied. 
   * @return autoPayloadType
  **/
  @ApiModelProperty(value = "This attribute is applicable when the ODU CTP object instance represents a lower order ODU CTP Source at the client layer of the ODUP/ODUj-21 adaptation function. The value of true of this attribute configures that the adaptation source function shall fall back to the payload type PT=20 if the conditions specified in 14.3.10.1/G.798 are satisfied. ")

  public Boolean isAutoPayloadType() {
    return autoPayloadType;
  }

  public void setAutoPayloadType(Boolean autoPayloadType) {
    this.autoPayloadType = autoPayloadType;
  }

  public TapiOduOduTerminationAndClientAdaptationPac acceptedPayloadType(TapiOduOduPayloadType acceptedPayloadType) {
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

  public TapiOduOduTerminationAndClientAdaptationPac opuTributarySlotSize(TapiOduOduSlotSize opuTributarySlotSize) {
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

  public TapiOduOduTerminationAndClientAdaptationPac configuredClientType(String configuredClientType) {
    this.configuredClientType = configuredClientType;
    return this;
  }

  /**
   * This attribute configures the type of the client CTP of the server ODU TTP.
   * @return configuredClientType
  **/
  @ApiModelProperty(value = "This attribute configures the type of the client CTP of the server ODU TTP.")

  public String getConfiguredClientType() {
    return configuredClientType;
  }

  public void setConfiguredClientType(String configuredClientType) {
    this.configuredClientType = configuredClientType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduTerminationAndClientAdaptationPac tapiOduOduTerminationAndClientAdaptationPac = (TapiOduOduTerminationAndClientAdaptationPac) o;
    return Objects.equals(this.configuredMappingType, tapiOduOduTerminationAndClientAdaptationPac.configuredMappingType) &&
        Objects.equals(this.autoPayloadType, tapiOduOduTerminationAndClientAdaptationPac.autoPayloadType) &&
        Objects.equals(this.acceptedPayloadType, tapiOduOduTerminationAndClientAdaptationPac.acceptedPayloadType) &&
        Objects.equals(this.opuTributarySlotSize, tapiOduOduTerminationAndClientAdaptationPac.opuTributarySlotSize) &&
        Objects.equals(this.configuredClientType, tapiOduOduTerminationAndClientAdaptationPac.configuredClientType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuredMappingType, autoPayloadType, acceptedPayloadType, opuTributarySlotSize, configuredClientType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduTerminationAndClientAdaptationPac {\n");
    
    sb.append("    configuredMappingType: ").append(toIndentedString(configuredMappingType)).append("\n");
    sb.append("    autoPayloadType: ").append(toIndentedString(autoPayloadType)).append("\n");
    sb.append("    acceptedPayloadType: ").append(toIndentedString(acceptedPayloadType)).append("\n");
    sb.append("    opuTributarySlotSize: ").append(toIndentedString(opuTributarySlotSize)).append("\n");
    sb.append("    configuredClientType: ").append(toIndentedString(configuredClientType)).append("\n");
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
