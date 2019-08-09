package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.odu.TimDetMo
 */
public enum TapiOduTimDetMo {
  DAPI("DAPI"),
    SAPI("SAPI"),
    BOTH("BOTH"),
    OFF("OFF");

  private String value;

  TapiOduTimDetMo(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiOduTimDetMo fromValue(String text) {
    for (TapiOduTimDetMo b : TapiOduTimDetMo.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
