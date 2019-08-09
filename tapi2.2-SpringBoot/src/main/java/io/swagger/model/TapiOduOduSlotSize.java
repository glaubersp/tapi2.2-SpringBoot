package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.odu.OduSlotSize
 */
public enum TapiOduOduSlotSize {
  _1G25("1G25"),
    _2G5("2G5");

  private String value;

  TapiOduOduSlotSize(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiOduOduSlotSize fromValue(String text) {
    for (TapiOduOduSlotSize b : TapiOduOduSlotSize.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
