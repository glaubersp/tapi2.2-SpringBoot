package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthEthCfmLinkTraceResultData;
import io.swagger.model.TapiEthLinkTraceResult;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthLinkTraceResultData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthLinkTraceResultData   {
  @JsonProperty("eth-cfm-link-trace-result-data")
  @Valid
  private List<TapiEthEthCfmLinkTraceResultData> ethCfmLinkTraceResultData = null;

  @JsonProperty("result-list")
  @Valid
  private List<TapiEthLinkTraceResult> resultList = null;

  public TapiEthEthLinkTraceResultData ethCfmLinkTraceResultData(List<TapiEthEthCfmLinkTraceResultData> ethCfmLinkTraceResultData) {
    this.ethCfmLinkTraceResultData = ethCfmLinkTraceResultData;
    return this;
  }

  public TapiEthEthLinkTraceResultData addEthCfmLinkTraceResultDataItem(TapiEthEthCfmLinkTraceResultData ethCfmLinkTraceResultDataItem) {
    if (this.ethCfmLinkTraceResultData == null) {
      this.ethCfmLinkTraceResultData = new ArrayList<>();
    }
    this.ethCfmLinkTraceResultData.add(ethCfmLinkTraceResultDataItem);
    return this;
  }

  /**
   * none
   * @return ethCfmLinkTraceResultData
  **/
  @ApiModelProperty(value = "none")
  @Valid
  public List<TapiEthEthCfmLinkTraceResultData> getEthCfmLinkTraceResultData() {
    return ethCfmLinkTraceResultData;
  }

  public void setEthCfmLinkTraceResultData(List<TapiEthEthCfmLinkTraceResultData> ethCfmLinkTraceResultData) {
    this.ethCfmLinkTraceResultData = ethCfmLinkTraceResultData;
  }

  public TapiEthEthLinkTraceResultData resultList(List<TapiEthLinkTraceResult> resultList) {
    this.resultList = resultList;
    return this;
  }

  public TapiEthEthLinkTraceResultData addResultListItem(TapiEthLinkTraceResult resultListItem) {
    if (this.resultList == null) {
      this.resultList = new ArrayList<>();
    }
    this.resultList.add(resultListItem);
    return this;
  }

  /**
   * G.8052: This parameter returns the results of the LT process. It contains a list of the result received from the individual LTR frames.                  The result from the individual LTR frame include the Source Mac Address, the TTL, and TLV.
   * @return resultList
  **/
  @ApiModelProperty(value = "G.8052: This parameter returns the results of the LT process. It contains a list of the result received from the individual LTR frames.                  The result from the individual LTR frame include the Source Mac Address, the TTL, and TLV.")
  @Valid
  public List<TapiEthLinkTraceResult> getResultList() {
    return resultList;
  }

  public void setResultList(List<TapiEthLinkTraceResult> resultList) {
    this.resultList = resultList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthLinkTraceResultData tapiEthEthLinkTraceResultData = (TapiEthEthLinkTraceResultData) o;
    return Objects.equals(this.ethCfmLinkTraceResultData, tapiEthEthLinkTraceResultData.ethCfmLinkTraceResultData) &&
        Objects.equals(this.resultList, tapiEthEthLinkTraceResultData.resultList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ethCfmLinkTraceResultData, resultList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthLinkTraceResultData {\n");
    
    sb.append("    ethCfmLinkTraceResultData: ").append(toIndentedString(ethCfmLinkTraceResultData)).append("\n");
    sb.append("    resultList: ").append(toIndentedString(resultList)).append("\n");
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
