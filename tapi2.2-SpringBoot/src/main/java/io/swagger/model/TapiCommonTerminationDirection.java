package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.common.TerminationDirection
 */
public enum TapiCommonTerminationDirection {
  BIDIRECTIONAL("BIDIRECTIONAL"),
    SINK("SINK"),
    SOURCE("SOURCE"),
    UNDEFINED_OR_UNKNOWN("UNDEFINED_OR_UNKNOWN");

  private String value;

  TapiCommonTerminationDirection(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiCommonTerminationDirection fromValue(String text) {
    for (TapiCommonTerminationDirection b : TapiCommonTerminationDirection.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
