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
 * TapiEthEthCfmMaintenanceDomain
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthCfmMaintenanceDomain   {
  @JsonProperty("maintenance-domain-name")
  private String maintenanceDomainName = null;

  @JsonProperty("maintenance-domain-name-type")
  private String maintenanceDomainNameType = null;

  public TapiEthEthCfmMaintenanceDomain maintenanceDomainName(String maintenanceDomainName) {
    this.maintenanceDomainName = maintenanceDomainName;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  A reference to the maintenance domain that this maintenance group is associated with.
   * @return maintenanceDomainName
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  A reference to the maintenance domain that this maintenance group is associated with.")

  public String getMaintenanceDomainName() {
    return maintenanceDomainName;
  }

  public void setMaintenanceDomainName(String maintenanceDomainName) {
    this.maintenanceDomainName = maintenanceDomainName;
  }

  public TapiEthEthCfmMaintenanceDomain maintenanceDomainNameType(String maintenanceDomainNameType) {
    this.maintenanceDomainNameType = maintenanceDomainNameType;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  The Maintenance Domain name format choice.
   * @return maintenanceDomainNameType
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  The Maintenance Domain name format choice.")

  public String getMaintenanceDomainNameType() {
    return maintenanceDomainNameType;
  }

  public void setMaintenanceDomainNameType(String maintenanceDomainNameType) {
    this.maintenanceDomainNameType = maintenanceDomainNameType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthCfmMaintenanceDomain tapiEthEthCfmMaintenanceDomain = (TapiEthEthCfmMaintenanceDomain) o;
    return Objects.equals(this.maintenanceDomainName, tapiEthEthCfmMaintenanceDomain.maintenanceDomainName) &&
        Objects.equals(this.maintenanceDomainNameType, tapiEthEthCfmMaintenanceDomain.maintenanceDomainNameType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenanceDomainName, maintenanceDomainNameType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthCfmMaintenanceDomain {\n");
    
    sb.append("    maintenanceDomainName: ").append(toIndentedString(maintenanceDomainName)).append("\n");
    sb.append("    maintenanceDomainNameType: ").append(toIndentedString(maintenanceDomainNameType)).append("\n");
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
