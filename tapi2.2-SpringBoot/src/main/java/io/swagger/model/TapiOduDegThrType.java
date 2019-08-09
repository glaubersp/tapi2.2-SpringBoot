package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.odu.DegThrType
 */
public enum TapiOduDegThrType {
  PERCENTAGE("PERCENTAGE"),
    NUMBER_ERRORED_BLOCKS("NUMBER_ERRORED_BLOCKS");

  private String value;

  TapiOduDegThrType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiOduDegThrType fromValue(String text) {
    for (TapiOduDegThrType b : TapiOduDegThrType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
