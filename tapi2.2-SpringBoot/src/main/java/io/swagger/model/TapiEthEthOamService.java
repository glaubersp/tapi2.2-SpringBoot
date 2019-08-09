package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthCfmMaintenanceAssociation;
import io.swagger.model.TapiEthEthCfmMaintenanceDomain;
import io.swagger.model.TapiEthEthMegCommon;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthOamService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthOamService   {
  @JsonProperty("eth-cfm-maintenance-association")
  private TapiEthEthCfmMaintenanceAssociation ethCfmMaintenanceAssociation = null;

  @JsonProperty("eth-meg-common")
  private TapiEthEthMegCommon ethMegCommon = null;

  @JsonProperty("eth-cfm-maintenance-domain")
  private TapiEthEthCfmMaintenanceDomain ethCfmMaintenanceDomain = null;

  public TapiEthEthOamService ethCfmMaintenanceAssociation(TapiEthEthCfmMaintenanceAssociation ethCfmMaintenanceAssociation) {
    this.ethCfmMaintenanceAssociation = ethCfmMaintenanceAssociation;
    return this;
  }

  /**
   * Get ethCfmMaintenanceAssociation
   * @return ethCfmMaintenanceAssociation
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthCfmMaintenanceAssociation getEthCfmMaintenanceAssociation() {
    return ethCfmMaintenanceAssociation;
  }

  public void setEthCfmMaintenanceAssociation(TapiEthEthCfmMaintenanceAssociation ethCfmMaintenanceAssociation) {
    this.ethCfmMaintenanceAssociation = ethCfmMaintenanceAssociation;
  }

  public TapiEthEthOamService ethMegCommon(TapiEthEthMegCommon ethMegCommon) {
    this.ethMegCommon = ethMegCommon;
    return this;
  }

  /**
   * Get ethMegCommon
   * @return ethMegCommon
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthMegCommon getEthMegCommon() {
    return ethMegCommon;
  }

  public void setEthMegCommon(TapiEthEthMegCommon ethMegCommon) {
    this.ethMegCommon = ethMegCommon;
  }

  public TapiEthEthOamService ethCfmMaintenanceDomain(TapiEthEthCfmMaintenanceDomain ethCfmMaintenanceDomain) {
    this.ethCfmMaintenanceDomain = ethCfmMaintenanceDomain;
    return this;
  }

  /**
   * Get ethCfmMaintenanceDomain
   * @return ethCfmMaintenanceDomain
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthEthCfmMaintenanceDomain getEthCfmMaintenanceDomain() {
    return ethCfmMaintenanceDomain;
  }

  public void setEthCfmMaintenanceDomain(TapiEthEthCfmMaintenanceDomain ethCfmMaintenanceDomain) {
    this.ethCfmMaintenanceDomain = ethCfmMaintenanceDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthOamService tapiEthEthOamService = (TapiEthEthOamService) o;
    return Objects.equals(this.ethCfmMaintenanceAssociation, tapiEthEthOamService.ethCfmMaintenanceAssociation) &&
        Objects.equals(this.ethMegCommon, tapiEthEthOamService.ethMegCommon) &&
        Objects.equals(this.ethCfmMaintenanceDomain, tapiEthEthOamService.ethCfmMaintenanceDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethCfmMaintenanceAssociation, ethMegCommon, ethCfmMaintenanceDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthOamService {\n");
    
    sb.append("    ethCfmMaintenanceAssociation: ").append(toIndentedString(ethCfmMaintenanceAssociation)).append("\n");
    sb.append("    ethMegCommon: ").append(toIndentedString(ethMegCommon)).append("\n");
    sb.append("    ethCfmMaintenanceDomain: ").append(toIndentedString(ethCfmMaintenanceDomain)).append("\n");
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
