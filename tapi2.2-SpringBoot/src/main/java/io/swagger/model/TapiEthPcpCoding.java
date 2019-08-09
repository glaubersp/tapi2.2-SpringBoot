package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.eth.PcpCoding
 */
public enum TapiEthPcpCoding {
  _8P0D("8P0D"),
    _7P1D("7P1D"),
    _6P2D("6P2D"),
    _5P3D("5P3D"),
    DEI("DEI");

  private String value;

  TapiEthPcpCoding(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiEthPcpCoding fromValue(String text) {
    for (TapiEthPcpCoding b : TapiEthPcpCoding.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
