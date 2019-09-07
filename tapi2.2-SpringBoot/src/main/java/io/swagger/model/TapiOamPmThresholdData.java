package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLocalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonTimePeriod;
import io.swagger.model.TapiOamThresholdParameter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamPmThresholdData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOamPmThresholdData extends TapiCommonLocalClass  {
  @JsonProperty("applicable-job-type")
  @Valid
  private List<String> applicableJobType = null;

  @JsonProperty("granularity-period")
  private TapiCommonTimePeriod granularityPeriod = null;

  @JsonProperty("is-transient")
  private Boolean isTransient = false;

  @JsonProperty("threshold-parameter")
  @Valid
  private List<TapiOamThresholdParameter> thresholdParameter = null;

  public TapiOamPmThresholdData applicableJobType(List<String> applicableJobType) {
    this.applicableJobType = applicableJobType;
    return this;
  }

  public TapiOamPmThresholdData addApplicableJobTypeItem(String applicableJobTypeItem) {
    if (this.applicableJobType == null) {
      this.applicableJobType = new ArrayList<>();
    }
    this.applicableJobType.add(applicableJobTypeItem);
    return this;
  }

  /**
   * This attribute allows an PMThresholdData instance to be constrained to specific job types. If an PMThresholdData instance is so configured to be applicable to more than one job type (worst case ALL), only the parameters relevant for the job instance will be used (non-applicable profile parameters will be ignored)
   * @return applicableJobType
  **/
  @ApiModelProperty(value = "This attribute allows an PMThresholdData instance to be constrained to specific job types. If an PMThresholdData instance is so configured to be applicable to more than one job type (worst case ALL), only the parameters relevant for the job instance will be used (non-applicable profile parameters will be ignored)")

  public List<String> getApplicableJobType() {
    return applicableJobType;
  }

  public void setApplicableJobType(List<String> applicableJobType) {
    this.applicableJobType = applicableJobType;
  }

  public TapiOamPmThresholdData granularityPeriod(TapiCommonTimePeriod granularityPeriod) {
    this.granularityPeriod = granularityPeriod;
    return this;
  }

  /**
   * Get granularityPeriod
   * @return granularityPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonTimePeriod getGranularityPeriod() {
    return granularityPeriod;
  }

  public void setGranularityPeriod(TapiCommonTimePeriod granularityPeriod) {
    this.granularityPeriod = granularityPeriod;
  }

  public TapiOamPmThresholdData isTransient(Boolean isTransient) {
    this.isTransient = isTransient;
    return this;
  }

  /**
   * none
   * @return isTransient
  **/
  @ApiModelProperty(value = "none")

  public Boolean isIsTransient() {
    return isTransient;
  }

  public void setIsTransient(Boolean isTransient) {
    this.isTransient = isTransient;
  }

  public TapiOamPmThresholdData thresholdParameter(List<TapiOamThresholdParameter> thresholdParameter) {
    this.thresholdParameter = thresholdParameter;
    return this;
  }

  public TapiOamPmThresholdData addThresholdParameterItem(TapiOamThresholdParameter thresholdParameterItem) {
    if (this.thresholdParameter == null) {
      this.thresholdParameter = new ArrayList<>();
    }
    this.thresholdParameter.add(thresholdParameterItem);
    return this;
  }

  /**
   * none
   * @return thresholdParameter
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiOamThresholdParameter> getThresholdParameter() {
    return thresholdParameter;
  }

  public void setThresholdParameter(List<TapiOamThresholdParameter> thresholdParameter) {
    this.thresholdParameter = thresholdParameter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamPmThresholdData tapiOamPmThresholdData = (TapiOamPmThresholdData) o;
    return Objects.equals(this.applicableJobType, tapiOamPmThresholdData.applicableJobType) &&
        Objects.equals(this.granularityPeriod, tapiOamPmThresholdData.granularityPeriod) &&
        Objects.equals(this.isTransient, tapiOamPmThresholdData.isTransient) &&
        Objects.equals(this.thresholdParameter, tapiOamPmThresholdData.thresholdParameter) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicableJobType, granularityPeriod, isTransient, thresholdParameter, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamPmThresholdData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    applicableJobType: ").append(toIndentedString(applicableJobType)).append("\n");
    sb.append("    granularityPeriod: ").append(toIndentedString(granularityPeriod)).append("\n");
    sb.append("    isTransient: ").append(toIndentedString(isTransient)).append("\n");
    sb.append("    thresholdParameter: ").append(toIndentedString(thresholdParameter)).append("\n");
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
