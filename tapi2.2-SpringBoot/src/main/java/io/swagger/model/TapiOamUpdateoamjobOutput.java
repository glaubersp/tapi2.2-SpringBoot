package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamGetoamjobOutputOamJob;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamUpdateoamjobOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamUpdateoamjobOutput   {
  @JsonProperty("oam-job")
  private TapiOamGetoamjobOutputOamJob oamJob = null;

  public TapiOamUpdateoamjobOutput oamJob(TapiOamGetoamjobOutputOamJob oamJob) {
    this.oamJob = oamJob;
    return this;
  }

  /**
   * Get oamJob
   * @return oamJob
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamGetoamjobOutputOamJob getOamJob() {
    return oamJob;
  }

  public void setOamJob(TapiOamGetoamjobOutputOamJob oamJob) {
    this.oamJob = oamJob;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamUpdateoamjobOutput tapiOamUpdateoamjobOutput = (TapiOamUpdateoamjobOutput) o;
    return Objects.equals(this.oamJob, tapiOamUpdateoamjobOutput.oamJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamUpdateoamjobOutput {\n");
    
    sb.append("    oamJob: ").append(toIndentedString(oamJob)).append("\n");
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
