package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.eth.OamPduGenerationType
 */
public enum TapiEthOamPduGenerationType {
  SINGLE_INSTANCE("SINGLE_INSTANCE"),
    REPETITIVE_INSTANCE("REPETITIVE_INSTANCE"),
    SINGLE_SERIES("SINGLE_SERIES"),
    REPETITIVE_SERIES("REPETITIVE_SERIES");

  private String value;

  TapiEthOamPduGenerationType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiEthOamPduGenerationType fromValue(String text) {
    for (TapiEthOamPduGenerationType b : TapiEthOamPduGenerationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
