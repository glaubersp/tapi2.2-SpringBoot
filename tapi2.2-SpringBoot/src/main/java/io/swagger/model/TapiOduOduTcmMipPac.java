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
 * TapiOduOduTcmMipPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOduOduTcmMipPac   {
  @JsonProperty("codirectional")
  private Boolean codirectional = false;

  @JsonProperty("tcm-field")
  private Integer tcmField = null;

  public TapiOduOduTcmMipPac codirectional(Boolean codirectional) {
    this.codirectional = codirectional;
    return this;
  }

  /**
   * This attribute specifies the directionality of the ODU MIP with respect to the associated ODU CEP. The value of TRUE means that the (half MIP/sink part of the) ODU MIP receives the same signal direction as the sink part of the ODU CEP. The Source part behaves similarly. This attribute is meaningful only on objects instantiated under ODU CEP, and at least one among ODU CEP and the subordinate object is bidirectional.
   * @return codirectional
  **/
  @ApiModelProperty(value = "This attribute specifies the directionality of the ODU MIP with respect to the associated ODU CEP. The value of TRUE means that the (half MIP/sink part of the) ODU MIP receives the same signal direction as the sink part of the ODU CEP. The Source part behaves similarly. This attribute is meaningful only on objects instantiated under ODU CEP, and at least one among ODU CEP and the subordinate object is bidirectional.")

  public Boolean isCodirectional() {
    return codirectional;
  }

  public void setCodirectional(Boolean codirectional) {
    this.codirectional = codirectional;
  }

  public TapiOduOduTcmMipPac tcmField(Integer tcmField) {
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
    TapiOduOduTcmMipPac tapiOduOduTcmMipPac = (TapiOduOduTcmMipPac) o;
    return Objects.equals(this.codirectional, tapiOduOduTcmMipPac.codirectional) &&
        Objects.equals(this.tcmField, tapiOduOduTcmMipPac.tcmField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codirectional, tcmField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduTcmMipPac {\n");
    
    sb.append("    codirectional: ").append(toIndentedString(codirectional)).append("\n");
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
