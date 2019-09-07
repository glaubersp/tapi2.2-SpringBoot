package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiConnectivityConnectionRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivitySwitchControlRef
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiConnectivitySwitchControlRef extends TapiConnectivityConnectionRef  {
  @JsonProperty("switch-control-uuid")
  private String switchControlUuid = null;

  public TapiConnectivitySwitchControlRef switchControlUuid(String switchControlUuid) {
    this.switchControlUuid = switchControlUuid;
    return this;
  }

  /**
   * none
   * @return switchControlUuid
  **/
  @ApiModelProperty(value = "none")

  public String getSwitchControlUuid() {
    return switchControlUuid;
  }

  public void setSwitchControlUuid(String switchControlUuid) {
    this.switchControlUuid = switchControlUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivitySwitchControlRef tapiConnectivitySwitchControlRef = (TapiConnectivitySwitchControlRef) o;
    return Objects.equals(this.switchControlUuid, tapiConnectivitySwitchControlRef.switchControlUuid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(switchControlUuid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivitySwitchControlRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    switchControlUuid: ").append(toIndentedString(switchControlUuid)).append("\n");
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
