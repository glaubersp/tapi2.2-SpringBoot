package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOduDegThr;
import io.swagger.model.TapiOduOduMipPac;
import io.swagger.model.TapiOduTimDetMo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduMepPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOduOduMepPac extends TapiOduOduMipPac  {
  @JsonProperty("dm-source")
  private Boolean dmSource = false;

  @JsonProperty("dm-value")
  private Boolean dmValue = false;

  @JsonProperty("txti")
  private String txti = null;

  public TapiOduOduMepPac dmSource(Boolean dmSource) {
    this.dmSource = dmSource;
    return this;
  }

  /**
   * This attribute is for configuring the delay measurement process at the trail termination function represented by the subject TTP object class. It models the MI_DM_Source MI signal. If MI_DM_Source is false, then the value of the DMp bit is determined by the RI_DM. If MI_DM_Source is true, then the value of the DMp bit is set to MI_DMValue.
   * @return dmSource
  **/
  @ApiModelProperty(value = "This attribute is for configuring the delay measurement process at the trail termination function represented by the subject TTP object class. It models the MI_DM_Source MI signal. If MI_DM_Source is false, then the value of the DMp bit is determined by the RI_DM. If MI_DM_Source is true, then the value of the DMp bit is set to MI_DMValue.")

  public Boolean isDmSource() {
    return dmSource;
  }

  public void setDmSource(Boolean dmSource) {
    this.dmSource = dmSource;
  }

  public TapiOduOduMepPac dmValue(Boolean dmValue) {
    this.dmValue = dmValue;
    return this;
  }

  /**
   * This attribute is for setting the DMp and DMti bits of the delay measurement process. The value of 'true' sets the DMp and DMti bits to 0 and the value of 'false' to 1.
   * @return dmValue
  **/
  @ApiModelProperty(value = "This attribute is for setting the DMp and DMti bits of the delay measurement process. The value of 'true' sets the DMp and DMti bits to 0 and the value of 'false' to 1.")

  public Boolean isDmValue() {
    return dmValue;
  }

  public void setDmValue(Boolean dmValue) {
    this.dmValue = dmValue;
  }

  public TapiOduOduMepPac txti(String txti) {
    this.txti = txti;
    return this;
  }

  /**
   * The Trail Trace Identifier (TTI) information, provisioned by the managing system at the termination source, to be placed in the TTI overhead position of the source of a trail for transmission.                  
   * @return txti
  **/
  @ApiModelProperty(value = "The Trail Trace Identifier (TTI) information, provisioned by the managing system at the termination source, to be placed in the TTI overhead position of the source of a trail for transmission.                  ")

  public String getTxti() {
    return txti;
  }

  public void setTxti(String txti) {
    this.txti = txti;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduMepPac tapiOduOduMepPac = (TapiOduOduMepPac) o;
    return Objects.equals(this.dmSource, tapiOduOduMepPac.dmSource) &&
        Objects.equals(this.dmValue, tapiOduOduMepPac.dmValue) &&
        Objects.equals(this.txti, tapiOduOduMepPac.txti) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dmSource, dmValue, txti, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduMepPac {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dmSource: ").append(toIndentedString(dmSource)).append("\n");
    sb.append("    dmValue: ").append(toIndentedString(dmValue)).append("\n");
    sb.append("    txti: ").append(toIndentedString(txti)).append("\n");
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
