package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiEquipmentAbstractStrand;
import io.swagger.model.TapiEquipmentAccessPortRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEquipmentPhysicalSpan
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEquipmentPhysicalSpan extends TapiCommonGlobalClass  {
  @JsonProperty("abstract-strand")
  @Valid
  private List<TapiEquipmentAbstractStrand> abstractStrand = null;

  @JsonProperty("access-port")
  @Valid
  private List<TapiEquipmentAccessPortRef> accessPort = null;

  public TapiEquipmentPhysicalSpan abstractStrand(List<TapiEquipmentAbstractStrand> abstractStrand) {
    this.abstractStrand = abstractStrand;
    return this;
  }

  public TapiEquipmentPhysicalSpan addAbstractStrandItem(TapiEquipmentAbstractStrand abstractStrandItem) {
    if (this.abstractStrand == null) {
      this.abstractStrand = new ArrayList<>();
    }
    this.abstractStrand.add(abstractStrandItem);
    return this;
  }

  /**
   * Both the serial segments that form an end-end strand and the parallel end-end strands.
   * @return abstractStrand
  **/
  @ApiModelProperty(value = "Both the serial segments that form an end-end strand and the parallel end-end strands.")
  @Valid
  public List<TapiEquipmentAbstractStrand> getAbstractStrand() {
    return abstractStrand;
  }

  public void setAbstractStrand(List<TapiEquipmentAbstractStrand> abstractStrand) {
    this.abstractStrand = abstractStrand;
  }

  public TapiEquipmentPhysicalSpan accessPort(List<TapiEquipmentAccessPortRef> accessPort) {
    this.accessPort = accessPort;
    return this;
  }

  public TapiEquipmentPhysicalSpan addAccessPortItem(TapiEquipmentAccessPortRef accessPortItem) {
    if (this.accessPort == null) {
      this.accessPort = new ArrayList<>();
    }
    this.accessPort.add(accessPortItem);
    return this;
  }

  /**
   * none
   * @return accessPort
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiEquipmentAccessPortRef> getAccessPort() {
    return accessPort;
  }

  public void setAccessPort(List<TapiEquipmentAccessPortRef> accessPort) {
    this.accessPort = accessPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEquipmentPhysicalSpan tapiEquipmentPhysicalSpan = (TapiEquipmentPhysicalSpan) o;
    return Objects.equals(this.abstractStrand, tapiEquipmentPhysicalSpan.abstractStrand) &&
        Objects.equals(this.accessPort, tapiEquipmentPhysicalSpan.accessPort) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractStrand, accessPort, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEquipmentPhysicalSpan {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    abstractStrand: ").append(toIndentedString(abstractStrand)).append("\n");
    sb.append("    accessPort: ").append(toIndentedString(accessPort)).append("\n");
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
