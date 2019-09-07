package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamGetoamjobOutputOamJob;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamGetoamjoblistOutput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamGetoamjoblistOutput   {
  @JsonProperty("oam-job")
  @Valid
  private List<TapiOamGetoamjobOutputOamJob> oamJob = null;

  public TapiOamGetoamjoblistOutput oamJob(List<TapiOamGetoamjobOutputOamJob> oamJob) {
    this.oamJob = oamJob;
    return this;
  }

  public TapiOamGetoamjoblistOutput addOamJobItem(TapiOamGetoamjobOutputOamJob oamJobItem) {
    if (this.oamJob == null) {
      this.oamJob = new ArrayList<>();
    }
    this.oamJob.add(oamJobItem);
    return this;
  }

  /**
   * none
   * @return oamJob
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiOamGetoamjobOutputOamJob> getOamJob() {
    return oamJob;
  }

  public void setOamJob(List<TapiOamGetoamjobOutputOamJob> oamJob) {
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
    TapiOamGetoamjoblistOutput tapiOamGetoamjoblistOutput = (TapiOamGetoamjoblistOutput) o;
    return Objects.equals(this.oamJob, tapiOamGetoamjoblistOutput.oamJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oamJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamGetoamjoblistOutput {\n");
    
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
