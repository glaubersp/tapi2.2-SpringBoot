package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.eth.OamPeriod
 */
public enum TapiEthOamPeriod {
  _3_33MS("3_33MS"),
    _10MS("10MS"),
    _100MS("100MS"),
    _1S("1S"),
    _10S("10S"),
    _1MIN("1MIN"),
    _10MIN("10MIN");

  private String value;

  TapiEthOamPeriod(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiEthOamPeriod fromValue(String text) {
    for (TapiEthOamPeriod b : TapiEthOamPeriod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
