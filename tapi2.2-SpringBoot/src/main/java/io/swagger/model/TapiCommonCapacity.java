package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonCapacityValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiCommonCapacity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiCommonCapacity   {
  @JsonProperty("total-size")
  private TapiCommonCapacityValue totalSize = null;

  public TapiCommonCapacity totalSize(TapiCommonCapacityValue totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  /**
   * Get totalSize
   * @return totalSize
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiCommonCapacityValue getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(TapiCommonCapacityValue totalSize) {
    this.totalSize = totalSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiCommonCapacity tapiCommonCapacity = (TapiCommonCapacity) o;
    return Objects.equals(this.totalSize, tapiCommonCapacity.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonCapacity {\n");
    
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
