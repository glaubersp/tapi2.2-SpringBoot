package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamMepMipList;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamConnectionEndPointAugmentation5
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamConnectionEndPointAugmentation5   {
  @JsonProperty("mep-mip-list")
  private TapiOamMepMipList mepMipList = null;

  public TapiOamConnectionEndPointAugmentation5 mepMipList(TapiOamMepMipList mepMipList) {
    this.mepMipList = mepMipList;
    return this;
  }

  /**
   * Get mepMipList
   * @return mepMipList
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamMepMipList getMepMipList() {
    return mepMipList;
  }

  public void setMepMipList(TapiOamMepMipList mepMipList) {
    this.mepMipList = mepMipList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamConnectionEndPointAugmentation5 tapiOamConnectionEndPointAugmentation5 = (TapiOamConnectionEndPointAugmentation5) o;
    return Objects.equals(this.mepMipList, tapiOamConnectionEndPointAugmentation5.mepMipList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mepMipList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamConnectionEndPointAugmentation5 {\n");
    
    sb.append("    mepMipList: ").append(toIndentedString(mepMipList)).append("\n");
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
