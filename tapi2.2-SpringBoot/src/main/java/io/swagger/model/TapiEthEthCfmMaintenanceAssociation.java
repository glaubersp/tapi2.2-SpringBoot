package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthMaintenanceAssociationName;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthCfmMaintenanceAssociation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthCfmMaintenanceAssociation   {
  @JsonProperty("maintenance-association-name")
  private TapiEthMaintenanceAssociationName maintenanceAssociationName = null;

  @JsonProperty("id-permission")
  private String idPermission = null;

  public TapiEthEthCfmMaintenanceAssociation maintenanceAssociationName(TapiEthMaintenanceAssociationName maintenanceAssociationName) {
    this.maintenanceAssociationName = maintenanceAssociationName;
    return this;
  }

  /**
   * Get maintenanceAssociationName
   * @return maintenanceAssociationName
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthMaintenanceAssociationName getMaintenanceAssociationName() {
    return maintenanceAssociationName;
  }

  public void setMaintenanceAssociationName(TapiEthMaintenanceAssociationName maintenanceAssociationName) {
    this.maintenanceAssociationName = maintenanceAssociationName;
  }

  public TapiEthEthCfmMaintenanceAssociation idPermission(String idPermission) {
    this.idPermission = idPermission;
    return this;
  }

  /**
   * IEEE P802.1Qcx/D0.3:                  MEF 38:                  This parameter indicates what, if anything, is to be included in the Sender ID TLV transmitted by Maintenance Points configured in this MA.                  A value of 'defer' means that the contents of the Sender ID TLV are determined by the enclosing Maintenance Domain instance.
   * @return idPermission
  **/
  @ApiModelProperty(value = "IEEE P802.1Qcx/D0.3:                  MEF 38:                  This parameter indicates what, if anything, is to be included in the Sender ID TLV transmitted by Maintenance Points configured in this MA.                  A value of 'defer' means that the contents of the Sender ID TLV are determined by the enclosing Maintenance Domain instance.")

  public String getIdPermission() {
    return idPermission;
  }

  public void setIdPermission(String idPermission) {
    this.idPermission = idPermission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthCfmMaintenanceAssociation tapiEthEthCfmMaintenanceAssociation = (TapiEthEthCfmMaintenanceAssociation) o;
    return Objects.equals(this.maintenanceAssociationName, tapiEthEthCfmMaintenanceAssociation.maintenanceAssociationName) &&
        Objects.equals(this.idPermission, tapiEthEthCfmMaintenanceAssociation.idPermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenanceAssociationName, idPermission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthCfmMaintenanceAssociation {\n");
    
    sb.append("    maintenanceAssociationName: ").append(toIndentedString(maintenanceAssociationName)).append("\n");
    sb.append("    idPermission: ").append(toIndentedString(idPermission)).append("\n");
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
