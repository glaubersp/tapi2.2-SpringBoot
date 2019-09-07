package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOduOduNcmPac
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiOduOduNcmPac   {
  @JsonProperty("tcm-fields-in-use")
  @Valid
  private List<Integer> tcmFieldsInUse = null;

  public TapiOduOduNcmPac tcmFieldsInUse(List<Integer> tcmFieldsInUse) {
    this.tcmFieldsInUse = tcmFieldsInUse;
    return this;
  }

  public TapiOduOduNcmPac addTcmFieldsInUseItem(Integer tcmFieldsInUseItem) {
    if (this.tcmFieldsInUse == null) {
      this.tcmFieldsInUse = new ArrayList<>();
    }
    this.tcmFieldsInUse.add(tcmFieldsInUseItem);
    return this;
  }

  /**
   * This attribute indicates the used TCM fields of the ODU OH.
   * @return tcmFieldsInUse
  **/
  @ApiModelProperty(value = "This attribute indicates the used TCM fields of the ODU OH.")

  public List<Integer> getTcmFieldsInUse() {
    return tcmFieldsInUse;
  }

  public void setTcmFieldsInUse(List<Integer> tcmFieldsInUse) {
    this.tcmFieldsInUse = tcmFieldsInUse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduNcmPac tapiOduOduNcmPac = (TapiOduOduNcmPac) o;
    return Objects.equals(this.tcmFieldsInUse, tapiOduOduNcmPac.tcmFieldsInUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tcmFieldsInUse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduNcmPac {\n");
    
    sb.append("    tcmFieldsInUse: ").append(toIndentedString(tcmFieldsInUse)).append("\n");
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
