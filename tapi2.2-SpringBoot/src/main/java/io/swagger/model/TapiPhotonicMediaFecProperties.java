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
 * TapiPhotonicMediaFecProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-07T12:33:48.081-03:00[America/Sao_Paulo]")
public class TapiPhotonicMediaFecProperties   {
  @JsonProperty("corrected-bits")
  private Integer correctedBits = null;

  @JsonProperty("corrected-bytes")
  private Integer correctedBytes = null;

  @JsonProperty("post-fec-ber")
  private Integer postFecBer = null;

  @JsonProperty("pre-fec-ber")
  private Integer preFecBer = null;

  @JsonProperty("uncorrectable-bits")
  private Integer uncorrectableBits = null;

  @JsonProperty("uncorrectable-bytes")
  private Integer uncorrectableBytes = null;

  public TapiPhotonicMediaFecProperties correctedBits(Integer correctedBits) {
    this.correctedBits = correctedBits;
    return this;
  }

  /**
   * Bits corrected between those that were received corrupted
   * @return correctedBits
  **/
  @ApiModelProperty(value = "Bits corrected between those that were received corrupted")

  public Integer getCorrectedBits() {
    return correctedBits;
  }

  public void setCorrectedBits(Integer correctedBits) {
    this.correctedBits = correctedBits;
  }

  public TapiPhotonicMediaFecProperties correctedBytes(Integer correctedBytes) {
    this.correctedBytes = correctedBytes;
    return this;
  }

  /**
   * Bytes corrected between those that were received corrupted
   * @return correctedBytes
  **/
  @ApiModelProperty(value = "Bytes corrected between those that were received corrupted")

  public Integer getCorrectedBytes() {
    return correctedBytes;
  }

  public void setCorrectedBytes(Integer correctedBytes) {
    this.correctedBytes = correctedBytes;
  }

  public TapiPhotonicMediaFecProperties postFecBer(Integer postFecBer) {
    this.postFecBer = postFecBer;
    return this;
  }

  /**
   * counter: bit error rate after correction by FEC
   * @return postFecBer
  **/
  @ApiModelProperty(value = "counter: bit error rate after correction by FEC")

  public Integer getPostFecBer() {
    return postFecBer;
  }

  public void setPostFecBer(Integer postFecBer) {
    this.postFecBer = postFecBer;
  }

  public TapiPhotonicMediaFecProperties preFecBer(Integer preFecBer) {
    this.preFecBer = preFecBer;
    return this;
  }

  /**
   * counter: bit error rate before correction by FEC
   * @return preFecBer
  **/
  @ApiModelProperty(value = "counter: bit error rate before correction by FEC")

  public Integer getPreFecBer() {
    return preFecBer;
  }

  public void setPreFecBer(Integer preFecBer) {
    this.preFecBer = preFecBer;
  }

  public TapiPhotonicMediaFecProperties uncorrectableBits(Integer uncorrectableBits) {
    this.uncorrectableBits = uncorrectableBits;
    return this;
  }

  /**
   * Bits that could not be corrected by FEC
   * @return uncorrectableBits
  **/
  @ApiModelProperty(value = "Bits that could not be corrected by FEC")

  public Integer getUncorrectableBits() {
    return uncorrectableBits;
  }

  public void setUncorrectableBits(Integer uncorrectableBits) {
    this.uncorrectableBits = uncorrectableBits;
  }

  public TapiPhotonicMediaFecProperties uncorrectableBytes(Integer uncorrectableBytes) {
    this.uncorrectableBytes = uncorrectableBytes;
    return this;
  }

  /**
   * Bytes that could not be corrected by FEC
   * @return uncorrectableBytes
  **/
  @ApiModelProperty(value = "Bytes that could not be corrected by FEC")

  public Integer getUncorrectableBytes() {
    return uncorrectableBytes;
  }

  public void setUncorrectableBytes(Integer uncorrectableBytes) {
    this.uncorrectableBytes = uncorrectableBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaFecProperties tapiPhotonicMediaFecProperties = (TapiPhotonicMediaFecProperties) o;
    return Objects.equals(this.correctedBits, tapiPhotonicMediaFecProperties.correctedBits) &&
        Objects.equals(this.correctedBytes, tapiPhotonicMediaFecProperties.correctedBytes) &&
        Objects.equals(this.postFecBer, tapiPhotonicMediaFecProperties.postFecBer) &&
        Objects.equals(this.preFecBer, tapiPhotonicMediaFecProperties.preFecBer) &&
        Objects.equals(this.uncorrectableBits, tapiPhotonicMediaFecProperties.uncorrectableBits) &&
        Objects.equals(this.uncorrectableBytes, tapiPhotonicMediaFecProperties.uncorrectableBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correctedBits, correctedBytes, postFecBer, preFecBer, uncorrectableBits, uncorrectableBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaFecProperties {\n");
    
    sb.append("    correctedBits: ").append(toIndentedString(correctedBits)).append("\n");
    sb.append("    correctedBytes: ").append(toIndentedString(correctedBytes)).append("\n");
    sb.append("    postFecBer: ").append(toIndentedString(postFecBer)).append("\n");
    sb.append("    preFecBer: ").append(toIndentedString(preFecBer)).append("\n");
    sb.append("    uncorrectableBits: ").append(toIndentedString(uncorrectableBits)).append("\n");
    sb.append("    uncorrectableBytes: ").append(toIndentedString(uncorrectableBytes)).append("\n");
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
