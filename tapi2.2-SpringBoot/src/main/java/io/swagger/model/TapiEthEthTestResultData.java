package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiEthEthTestResultData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiEthEthTestResultData   {
  @JsonProperty("rec-tst-frames")
  private Integer recTstFrames = null;

  @JsonProperty("sent-tst-frames")
  private Integer sentTstFrames = null;

  public TapiEthEthTestResultData recTstFrames(Integer recTstFrames) {
    this.recTstFrames = recTstFrames;
    return this;
  }

  /**
   * Received TST frames. Optional in case of source only MEP.
   * @return recTstFrames
  **/
  @ApiModelProperty(value = "Received TST frames. Optional in case of source only MEP.")

  public Integer getRecTstFrames() {
    return recTstFrames;
  }

  public void setRecTstFrames(Integer recTstFrames) {
    this.recTstFrames = recTstFrames;
  }

  public TapiEthEthTestResultData sentTstFrames(Integer sentTstFrames) {
    this.sentTstFrames = sentTstFrames;
    return this;
  }

  /**
   * G.8052: This parameter returns the total number of sent TST frames.                  Optional in case of sink only MEP.
   * @return sentTstFrames
  **/
  @ApiModelProperty(value = "G.8052: This parameter returns the total number of sent TST frames.                  Optional in case of sink only MEP.")

  public Integer getSentTstFrames() {
    return sentTstFrames;
  }

  public void setSentTstFrames(Integer sentTstFrames) {
    this.sentTstFrames = sentTstFrames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthTestResultData tapiEthEthTestResultData = (TapiEthEthTestResultData) o;
    return Objects.equals(this.recTstFrames, tapiEthEthTestResultData.recTstFrames) &&
        Objects.equals(this.sentTstFrames, tapiEthEthTestResultData.sentTstFrames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recTstFrames, sentTstFrames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthTestResultData {\n");
    
    sb.append("    recTstFrames: ").append(toIndentedString(recTstFrames)).append("\n");
    sb.append("    sentTstFrames: ").append(toIndentedString(sentTstFrames)).append("\n");
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
