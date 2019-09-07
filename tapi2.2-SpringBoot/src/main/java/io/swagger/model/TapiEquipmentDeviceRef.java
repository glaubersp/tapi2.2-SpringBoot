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
 * TapiEquipmentDeviceRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEquipmentDeviceRef   {
  @JsonProperty("device-uuid")
  private String deviceUuid = null;

  public TapiEquipmentDeviceRef deviceUuid(String deviceUuid) {
    this.deviceUuid = deviceUuid;
    return this;
  }

  /**
   * none
   * @return deviceUuid
  **/
  @ApiModelProperty(value = "none")

  public String getDeviceUuid() {
    return deviceUuid;
  }

  public void setDeviceUuid(String deviceUuid) {
    this.deviceUuid = deviceUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentDeviceRef tapiEquipmentDeviceRef = (TapiEquipmentDeviceRef) o;
    return Objects.equals(this.deviceUuid, tapiEquipmentDeviceRef.deviceUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentDeviceRef {\n");
    
    sb.append("    deviceUuid: ").append(toIndentedString(deviceUuid)).append("\n");
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
