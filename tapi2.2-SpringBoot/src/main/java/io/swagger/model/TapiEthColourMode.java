package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.eth.ColourMode
 */
public enum TapiEthColourMode {
  BLIND("COLOUR_BLIND"),
    AWARE("COLOUR_AWARE");

  private String value;

  TapiEthColourMode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiEthColourMode fromValue(String text) {
    for (TapiEthColourMode b : TapiEthColourMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
