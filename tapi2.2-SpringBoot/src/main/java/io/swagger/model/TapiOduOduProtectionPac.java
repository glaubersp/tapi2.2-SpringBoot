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
 * TapiOduOduProtectionPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduOduProtectionPac   {
  @JsonProperty("aps-enable")
  private Boolean apsEnable = true;

  @JsonProperty("aps-level")
  private Integer apsLevel = null;

  public TapiOduOduProtectionPac apsEnable(Boolean apsEnable) {
    this.apsEnable = apsEnable;
    return this;
  }

  /**
   * This attribute is for enabling/disabling the automatic protection switching (APS) capability at the transport adaptation function that is represented by the ODU_ConnectionTerminationPoint object class. It triggers the MI_APS_EN signal to the transport adaptation function.
   * @return apsEnable
  **/
  @ApiModelProperty(value = "This attribute is for enabling/disabling the automatic protection switching (APS) capability at the transport adaptation function that is represented by the ODU_ConnectionTerminationPoint object class. It triggers the MI_APS_EN signal to the transport adaptation function.")

  public Boolean isApsEnable() {
    return apsEnable;
  }

  public void setApsEnable(Boolean apsEnable) {
    this.apsEnable = apsEnable;
  }

  public TapiOduOduProtectionPac apsLevel(Integer apsLevel) {
    this.apsLevel = apsLevel;
    return this;
  }

  /**
   * This attribute is for configuring the automatic protection switching (APS) level that should operate at the transport adaptation function that is represented by the ODU_ConnectionTerminationPoint object class. It triggers the MI_APS_LVL signal to the transport adaptation function. The value 0 means path and the values 1 through 6 mean TCM level 1 through 6 respectively.
   * @return apsLevel
  **/
  @ApiModelProperty(value = "This attribute is for configuring the automatic protection switching (APS) level that should operate at the transport adaptation function that is represented by the ODU_ConnectionTerminationPoint object class. It triggers the MI_APS_LVL signal to the transport adaptation function. The value 0 means path and the values 1 through 6 mean TCM level 1 through 6 respectively.")

  public Integer getApsLevel() {
    return apsLevel;
  }

  public void setApsLevel(Integer apsLevel) {
    this.apsLevel = apsLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduProtectionPac tapiOduOduProtectionPac = (TapiOduOduProtectionPac) o;
    return Objects.equals(this.apsEnable, tapiOduOduProtectionPac.apsEnable) &&
        Objects.equals(this.apsLevel, tapiOduOduProtectionPac.apsLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apsEnable, apsLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduProtectionPac {\n");
    
    sb.append("    apsEnable: ").append(toIndentedString(apsEnable)).append("\n");
    sb.append("    apsLevel: ").append(toIndentedString(apsLevel)).append("\n");
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
