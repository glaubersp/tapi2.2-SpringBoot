package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiPhotonicMediaAdjustmentGranularity;
import io.swagger.model.TapiPhotonicMediaGridType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaFrequencyConstraint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaFrequencyConstraint   {
  @JsonProperty("adjustment-granularity")
  private TapiPhotonicMediaAdjustmentGranularity adjustmentGranularity = null;

  @JsonProperty("grid-type")
  private TapiPhotonicMediaGridType gridType = null;

  public TapiPhotonicMediaFrequencyConstraint adjustmentGranularity(TapiPhotonicMediaAdjustmentGranularity adjustmentGranularity) {
    this.adjustmentGranularity = adjustmentGranularity;
    return this;
  }

  /**
   * Get adjustmentGranularity
   * @return adjustmentGranularity
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaAdjustmentGranularity getAdjustmentGranularity() {
    return adjustmentGranularity;
  }

  public void setAdjustmentGranularity(TapiPhotonicMediaAdjustmentGranularity adjustmentGranularity) {
    this.adjustmentGranularity = adjustmentGranularity;
  }

  public TapiPhotonicMediaFrequencyConstraint gridType(TapiPhotonicMediaGridType gridType) {
    this.gridType = gridType;
    return this;
  }

  /**
   * Get gridType
   * @return gridType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiPhotonicMediaGridType getGridType() {
    return gridType;
  }

  public void setGridType(TapiPhotonicMediaGridType gridType) {
    this.gridType = gridType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaFrequencyConstraint tapiPhotonicMediaFrequencyConstraint = (TapiPhotonicMediaFrequencyConstraint) o;
    return Objects.equals(this.adjustmentGranularity, tapiPhotonicMediaFrequencyConstraint.adjustmentGranularity) &&
        Objects.equals(this.gridType, tapiPhotonicMediaFrequencyConstraint.gridType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentGranularity, gridType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaFrequencyConstraint {\n");
    
    sb.append("    adjustmentGranularity: ").append(toIndentedString(adjustmentGranularity)).append("\n");
    sb.append("    gridType: ").append(toIndentedString(gridType)).append("\n");
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
