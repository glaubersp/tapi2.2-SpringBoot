package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamTcaInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiOamNotificationAugmentation1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiOamNotificationAugmentation1   {
  @JsonProperty("tca-info")
  private TapiOamTcaInfo tcaInfo = null;

  public TapiOamNotificationAugmentation1 tcaInfo(TapiOamTcaInfo tcaInfo) {
    this.tcaInfo = tcaInfo;
    return this;
  }

  /**
   * Get tcaInfo
   * @return tcaInfo
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiOamTcaInfo getTcaInfo() {
    return tcaInfo;
  }

  public void setTcaInfo(TapiOamTcaInfo tcaInfo) {
    this.tcaInfo = tcaInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamNotificationAugmentation1 tapiOamNotificationAugmentation1 = (TapiOamNotificationAugmentation1) o;
    return Objects.equals(this.tcaInfo, tapiOamNotificationAugmentation1.tcaInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tcaInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamNotificationAugmentation1 {\n");
    
    sb.append("    tcaInfo: ").append(toIndentedString(tcaInfo)).append("\n");
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
