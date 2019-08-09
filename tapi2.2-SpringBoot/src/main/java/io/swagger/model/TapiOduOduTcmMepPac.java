package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonAdministrativeState;
import io.swagger.model.TapiOduTcmExtension;
import io.swagger.model.TapiOduTcmMode;
import io.swagger.model.TapiOduTcmStatus;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduTcmMepPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduOduTcmMepPac   {
  @JsonProperty("admin-state-sink")
  private TapiCommonAdministrativeState adminStateSink = null;

  @JsonProperty("codirectional")
  private Boolean codirectional = false;

  @JsonProperty("admin-state-source")
  private TapiCommonAdministrativeState adminStateSource = null;

  @JsonProperty("ac-status-source")
  private TapiOduTcmStatus acStatusSource = null;

  @JsonProperty("tcm-extension")
  private TapiOduTcmExtension tcmExtension = null;

  @JsonProperty("ac-status-sink")
  private TapiOduTcmStatus acStatusSink = null;

  @JsonProperty("tcm-mode")
  private TapiOduTcmMode tcmMode = null;

  @JsonProperty("tcm-field")
  private Integer tcmField = null;

  public TapiOduOduTcmMepPac adminStateSink(TapiCommonAdministrativeState adminStateSink) {
    this.adminStateSink = adminStateSink;
    return this;
  }

  /**
   * Get adminStateSink
   * @return adminStateSink
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonAdministrativeState getAdminStateSink() {
    return adminStateSink;
  }

  public void setAdminStateSink(TapiCommonAdministrativeState adminStateSink) {
    this.adminStateSink = adminStateSink;
  }

  public TapiOduOduTcmMepPac codirectional(Boolean codirectional) {
    this.codirectional = codirectional;
    return this;
  }

  /**
   * This attribute specifies the directionality of the ODUT MEP with respect to the associated ODU CEP. The value of TRUE means that the sink part of the ODUT MEP terminates the same signal direction as the sink part of the ODU CEP. The Source part behaves similarly. This attribute is meaningful only on objects instantiated under ODU CEP, and at least one among ODU CEP and the subordinate object is bidirectional.
   * @return codirectional
  **/
  @ApiModelProperty(value = "This attribute specifies the directionality of the ODUT MEP with respect to the associated ODU CEP. The value of TRUE means that the sink part of the ODUT MEP terminates the same signal direction as the sink part of the ODU CEP. The Source part behaves similarly. This attribute is meaningful only on objects instantiated under ODU CEP, and at least one among ODU CEP and the subordinate object is bidirectional.")

  public Boolean isCodirectional() {
    return codirectional;
  }

  public void setCodirectional(Boolean codirectional) {
    this.codirectional = codirectional;
  }

  public TapiOduOduTcmMepPac adminStateSource(TapiCommonAdministrativeState adminStateSource) {
    this.adminStateSource = adminStateSource;
    return this;
  }

  /**
   * Get adminStateSource
   * @return adminStateSource
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonAdministrativeState getAdminStateSource() {
    return adminStateSource;
  }

  public void setAdminStateSource(TapiCommonAdministrativeState adminStateSource) {
    this.adminStateSource = adminStateSource;
  }

  public TapiOduOduTcmMepPac acStatusSource(TapiOduTcmStatus acStatusSource) {
    this.acStatusSource = acStatusSource;
    return this;
  }

  /**
   * Get acStatusSource
   * @return acStatusSource
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduTcmStatus getAcStatusSource() {
    return acStatusSource;
  }

  public void setAcStatusSource(TapiOduTcmStatus acStatusSource) {
    this.acStatusSource = acStatusSource;
  }

  public TapiOduOduTcmMepPac tcmExtension(TapiOduTcmExtension tcmExtension) {
    this.tcmExtension = tcmExtension;
    return this;
  }

  /**
   * Get tcmExtension
   * @return tcmExtension
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduTcmExtension getTcmExtension() {
    return tcmExtension;
  }

  public void setTcmExtension(TapiOduTcmExtension tcmExtension) {
    this.tcmExtension = tcmExtension;
  }

  public TapiOduOduTcmMepPac acStatusSink(TapiOduTcmStatus acStatusSink) {
    this.acStatusSink = acStatusSink;
    return this;
  }

  /**
   * Get acStatusSink
   * @return acStatusSink
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduTcmStatus getAcStatusSink() {
    return acStatusSink;
  }

  public void setAcStatusSink(TapiOduTcmStatus acStatusSink) {
    this.acStatusSink = acStatusSink;
  }

  public TapiOduOduTcmMepPac tcmMode(TapiOduTcmMode tcmMode) {
    this.tcmMode = tcmMode;
    return this;
  }

  /**
   * Get tcmMode
   * @return tcmMode
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOduTcmMode getTcmMode() {
    return tcmMode;
  }

  public void setTcmMode(TapiOduTcmMode tcmMode) {
    this.tcmMode = tcmMode;
  }

  public TapiOduOduTcmMepPac tcmField(Integer tcmField) {
    this.tcmField = tcmField;
    return this;
  }

  /**
   * This attribute indicates the tandem connection monitoring field of the ODU OH.
   * @return tcmField
  **/
  @ApiModelProperty(value = "This attribute indicates the tandem connection monitoring field of the ODU OH.")

  public Integer getTcmField() {
    return tcmField;
  }

  public void setTcmField(Integer tcmField) {
    this.tcmField = tcmField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduTcmMepPac tapiOduOduTcmMepPac = (TapiOduOduTcmMepPac) o;
    return Objects.equals(this.adminStateSink, tapiOduOduTcmMepPac.adminStateSink) &&
        Objects.equals(this.codirectional, tapiOduOduTcmMepPac.codirectional) &&
        Objects.equals(this.adminStateSource, tapiOduOduTcmMepPac.adminStateSource) &&
        Objects.equals(this.acStatusSource, tapiOduOduTcmMepPac.acStatusSource) &&
        Objects.equals(this.tcmExtension, tapiOduOduTcmMepPac.tcmExtension) &&
        Objects.equals(this.acStatusSink, tapiOduOduTcmMepPac.acStatusSink) &&
        Objects.equals(this.tcmMode, tapiOduOduTcmMepPac.tcmMode) &&
        Objects.equals(this.tcmField, tapiOduOduTcmMepPac.tcmField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminStateSink, codirectional, adminStateSource, acStatusSource, tcmExtension, acStatusSink, tcmMode, tcmField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduTcmMepPac {\n");
    
    sb.append("    adminStateSink: ").append(toIndentedString(adminStateSink)).append("\n");
    sb.append("    codirectional: ").append(toIndentedString(codirectional)).append("\n");
    sb.append("    adminStateSource: ").append(toIndentedString(adminStateSource)).append("\n");
    sb.append("    acStatusSource: ").append(toIndentedString(acStatusSource)).append("\n");
    sb.append("    tcmExtension: ").append(toIndentedString(tcmExtension)).append("\n");
    sb.append("    acStatusSink: ").append(toIndentedString(acStatusSink)).append("\n");
    sb.append("    tcmMode: ").append(toIndentedString(tcmMode)).append("\n");
    sb.append("    tcmField: ").append(toIndentedString(tcmField)).append("\n");
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
