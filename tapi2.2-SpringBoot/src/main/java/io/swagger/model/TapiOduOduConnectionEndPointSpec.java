package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduOduCommonPac;
import io.swagger.model.TapiOduOduCtpPac;
import io.swagger.model.TapiOduOduProtectionPac;
import io.swagger.model.TapiOduOduTerminationAndClientAdaptationPac;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduConnectionEndPointSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOduOduConnectionEndPointSpec   {
  @JsonProperty("odu-common")
  private TapiOduOduCommonPac oduCommon = null;

  @JsonProperty("odu-ctp")
  private TapiOduOduCtpPac oduCtp = null;

  @JsonProperty("odu-protection")
  private TapiOduOduProtectionPac oduProtection = null;

  @JsonProperty("odu-term-and-adapter")
  private TapiOduOduTerminationAndClientAdaptationPac oduTermAndAdapter = null;

  public TapiOduOduConnectionEndPointSpec oduCommon(TapiOduOduCommonPac oduCommon) {
    this.oduCommon = oduCommon;
    return this;
  }

  /**
   * Get oduCommon
   * @return oduCommon
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduCommonPac getOduCommon() {
    return oduCommon;
  }

  public void setOduCommon(TapiOduOduCommonPac oduCommon) {
    this.oduCommon = oduCommon;
  }

  public TapiOduOduConnectionEndPointSpec oduCtp(TapiOduOduCtpPac oduCtp) {
    this.oduCtp = oduCtp;
    return this;
  }

  /**
   * Get oduCtp
   * @return oduCtp
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduCtpPac getOduCtp() {
    return oduCtp;
  }

  public void setOduCtp(TapiOduOduCtpPac oduCtp) {
    this.oduCtp = oduCtp;
  }

  public TapiOduOduConnectionEndPointSpec oduProtection(TapiOduOduProtectionPac oduProtection) {
    this.oduProtection = oduProtection;
    return this;
  }

  /**
   * Get oduProtection
   * @return oduProtection
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduProtectionPac getOduProtection() {
    return oduProtection;
  }

  public void setOduProtection(TapiOduOduProtectionPac oduProtection) {
    this.oduProtection = oduProtection;
  }

  public TapiOduOduConnectionEndPointSpec oduTermAndAdapter(TapiOduOduTerminationAndClientAdaptationPac oduTermAndAdapter) {
    this.oduTermAndAdapter = oduTermAndAdapter;
    return this;
  }

  /**
   * Get oduTermAndAdapter
   * @return oduTermAndAdapter
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduOduTerminationAndClientAdaptationPac getOduTermAndAdapter() {
    return oduTermAndAdapter;
  }

  public void setOduTermAndAdapter(TapiOduOduTerminationAndClientAdaptationPac oduTermAndAdapter) {
    this.oduTermAndAdapter = oduTermAndAdapter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduConnectionEndPointSpec tapiOduOduConnectionEndPointSpec = (TapiOduOduConnectionEndPointSpec) o;
    return Objects.equals(this.oduCommon, tapiOduOduConnectionEndPointSpec.oduCommon) &&
        Objects.equals(this.oduCtp, tapiOduOduConnectionEndPointSpec.oduCtp) &&
        Objects.equals(this.oduProtection, tapiOduOduConnectionEndPointSpec.oduProtection) &&
        Objects.equals(this.oduTermAndAdapter, tapiOduOduConnectionEndPointSpec.oduTermAndAdapter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oduCommon, oduCtp, oduProtection, oduTermAndAdapter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduConnectionEndPointSpec {\n");
    
    sb.append("    oduCommon: ").append(toIndentedString(oduCommon)).append("\n");
    sb.append("    oduCtp: ").append(toIndentedString(oduCtp)).append("\n");
    sb.append("    oduProtection: ").append(toIndentedString(oduProtection)).append("\n");
    sb.append("    oduTermAndAdapter: ").append(toIndentedString(oduTermAndAdapter)).append("\n");
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
