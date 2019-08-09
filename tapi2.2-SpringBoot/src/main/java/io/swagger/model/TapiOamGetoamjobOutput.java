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
 * TapiOamGetoamjobOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamGetoamjobOutput   {
  @JsonProperty("oam-job")
  private TapiOamGetoamjobOutputOamJob oamJob = null;

  public TapiOamGetoamjobOutput oamJob(TapiOamGetoamjobOutputOamJob oamJob) {
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
    TapiOamGetoamjobOutput tapiOamGetoamjobOutput = (TapiOamGetoamjobOutput) o;
    return Objects.equals(this.oamJob, tapiOamGetoamjobOutput.oamJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamGetoamjobOutput {\n");
    
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
