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
 * TapiEthEtyTerminationCommonPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEtyTerminationCommonPac   {
  @JsonProperty("is-fts-enabled")
  private Boolean isFtsEnabled = false;

  @JsonProperty("is-tx-pause-enabled")
  private Boolean isTxPauseEnabled = false;

  public TapiEthEtyTerminationCommonPac isFtsEnabled(Boolean isFtsEnabled) {
    this.isFtsEnabled = isFtsEnabled;
    return this;
  }

  /**
   * This attribute indicates whether Forced Transmitter Shutdown (FTS) is enabled or not. It models the ETYn_TT_So_MI_FTSEnable information.
   * @return isFtsEnabled
  **/
  @ApiModelProperty(value = "This attribute indicates whether Forced Transmitter Shutdown (FTS) is enabled or not. It models the ETYn_TT_So_MI_FTSEnable information.")

  public Boolean isIsFtsEnabled() {
    return isFtsEnabled;
  }

  public void setIsFtsEnabled(Boolean isFtsEnabled) {
    this.isFtsEnabled = isFtsEnabled;
  }

  public TapiEthEtyTerminationCommonPac isTxPauseEnabled(Boolean isTxPauseEnabled) {
    this.isTxPauseEnabled = isTxPauseEnabled;
    return this;
  }

  /**
   * This attribute identifies whether the Transmit Pause process is enabled or not. It models the MI_TxPauseEnable defined in G.8021.
   * @return isTxPauseEnabled
  **/
  @ApiModelProperty(value = "This attribute identifies whether the Transmit Pause process is enabled or not. It models the MI_TxPauseEnable defined in G.8021.")

  public Boolean isIsTxPauseEnabled() {
    return isTxPauseEnabled;
  }

  public void setIsTxPauseEnabled(Boolean isTxPauseEnabled) {
    this.isTxPauseEnabled = isTxPauseEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEtyTerminationCommonPac tapiEthEtyTerminationCommonPac = (TapiEthEtyTerminationCommonPac) o;
    return Objects.equals(this.isFtsEnabled, tapiEthEtyTerminationCommonPac.isFtsEnabled) &&
        Objects.equals(this.isTxPauseEnabled, tapiEthEtyTerminationCommonPac.isTxPauseEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFtsEnabled, isTxPauseEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEtyTerminationCommonPac {\n");
    
    sb.append("    isFtsEnabled: ").append(toIndentedString(isFtsEnabled)).append("\n");
    sb.append("    isTxPauseEnabled: ").append(toIndentedString(isTxPauseEnabled)).append("\n");
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
