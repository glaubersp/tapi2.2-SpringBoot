package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiOamPmThresholdData;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamOamProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamOamProfile extends TapiCommonGlobalClass  {
  @JsonProperty("pm-threshold-data")
  @Valid
  private List<TapiOamPmThresholdData> pmThresholdData = null;

  public TapiOamOamProfile pmThresholdData(List<TapiOamPmThresholdData> pmThresholdData) {
    this.pmThresholdData = pmThresholdData;
    return this;
  }

  public TapiOamOamProfile addPmThresholdDataItem(TapiOamPmThresholdData pmThresholdDataItem) {
    if (this.pmThresholdData == null) {
      this.pmThresholdData = new ArrayList<TapiOamPmThresholdData>();
    }
    this.pmThresholdData.add(pmThresholdDataItem);
    return this;
  }

  /**
   * none
   * @return pmThresholdData
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiOamPmThresholdData> getPmThresholdData() {
    return pmThresholdData;
  }

  public void setPmThresholdData(List<TapiOamPmThresholdData> pmThresholdData) {
    this.pmThresholdData = pmThresholdData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamOamProfile tapiOamOamProfile = (TapiOamOamProfile) o;
    return Objects.equals(this.pmThresholdData, tapiOamOamProfile.pmThresholdData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pmThresholdData, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamOamProfile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pmThresholdData: ").append(toIndentedString(pmThresholdData)).append("\n");
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
