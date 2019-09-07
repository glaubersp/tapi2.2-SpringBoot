package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonTimeUnit;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiCommonTimePeriod
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiCommonTimePeriod   {
  @JsonProperty("unit")
  private TapiCommonTimeUnit unit = null;

  @JsonProperty("value")
  private Integer value = null;

  public TapiCommonTimePeriod unit(TapiCommonTimeUnit unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonTimeUnit getUnit() {
    return unit;
  }

  public void setUnit(TapiCommonTimeUnit unit) {
    this.unit = unit;
  }

  public TapiCommonTimePeriod value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * none
   * @return value
  **/
  @ApiModelProperty(value = "none")

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiCommonTimePeriod tapiCommonTimePeriod = (TapiCommonTimePeriod) o;
    return Objects.equals(this.unit, tapiCommonTimePeriod.unit) &&
        Objects.equals(this.value, tapiCommonTimePeriod.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonTimePeriod {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
