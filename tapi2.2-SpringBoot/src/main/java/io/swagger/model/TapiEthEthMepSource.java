package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthCsfConfig;
import io.swagger.model.TapiEthOamPeriod;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthMepSource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiEthEthMepSource   {
  @JsonProperty("csf-period")
  private TapiEthOamPeriod csfPeriod = null;

  @JsonProperty("csf-priority")
  private Integer csfPriority = 7;

  @JsonProperty("csf-config")
  private TapiEthCsfConfig csfConfig = null;

  @JsonProperty("aps-priority")
  private Integer apsPriority = 7;

  public TapiEthEthMepSource csfPeriod(TapiEthOamPeriod csfPeriod) {
    this.csfPeriod = csfPeriod;
    return this;
  }

  /**
   * Get csfPeriod
   * @return csfPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthOamPeriod getCsfPeriod() {
    return csfPeriod;
  }

  public void setCsfPeriod(TapiEthOamPeriod csfPeriod) {
    this.csfPeriod = csfPeriod;
  }

  public TapiEthEthMepSource csfPriority(Integer csfPriority) {
    this.csfPriority = csfPriority;
    return this;
  }

  /**
   * This attribute models the MI_CSF_Pri signal defined in G.8021 and configured as specified in G8051. It is the priority at which the CSF messages should be sent
   * @return csfPriority
  **/
  @ApiModelProperty(value = "This attribute models the MI_CSF_Pri signal defined in G.8021 and configured as specified in G8051. It is the priority at which the CSF messages should be sent")

  public Integer getCsfPriority() {
    return csfPriority;
  }

  public void setCsfPriority(Integer csfPriority) {
    this.csfPriority = csfPriority;
  }

  public TapiEthEthMepSource csfConfig(TapiEthCsfConfig csfConfig) {
    this.csfConfig = csfConfig;
    return this;
  }

  /**
   * Get csfConfig
   * @return csfConfig
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiEthCsfConfig getCsfConfig() {
    return csfConfig;
  }

  public void setCsfConfig(TapiEthCsfConfig csfConfig) {
    this.csfConfig = csfConfig;
  }

  public TapiEthEthMepSource apsPriority(Integer apsPriority) {
    this.apsPriority = apsPriority;
    return this;
  }

  /**
   * This attribute specifies the priority of the APS messages.                  See section 8.1.5    APS insert process in G.8021.
   * @return apsPriority
  **/
  @ApiModelProperty(value = "This attribute specifies the priority of the APS messages.                  See section 8.1.5    APS insert process in G.8021.")

  public Integer getApsPriority() {
    return apsPriority;
  }

  public void setApsPriority(Integer apsPriority) {
    this.apsPriority = apsPriority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthMepSource tapiEthEthMepSource = (TapiEthEthMepSource) o;
    return Objects.equals(this.csfPeriod, tapiEthEthMepSource.csfPeriod) &&
        Objects.equals(this.csfPriority, tapiEthEthMepSource.csfPriority) &&
        Objects.equals(this.csfConfig, tapiEthEthMepSource.csfConfig) &&
        Objects.equals(this.apsPriority, tapiEthEthMepSource.apsPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csfPeriod, csfPriority, csfConfig, apsPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthMepSource {\n");
    
    sb.append("    csfPeriod: ").append(toIndentedString(csfPeriod)).append("\n");
    sb.append("    csfPriority: ").append(toIndentedString(csfPriority)).append("\n");
    sb.append("    csfConfig: ").append(toIndentedString(csfConfig)).append("\n");
    sb.append("    apsPriority: ").append(toIndentedString(apsPriority)).append("\n");
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
