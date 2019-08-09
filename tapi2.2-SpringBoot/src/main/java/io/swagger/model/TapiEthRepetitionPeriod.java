package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.eth.RepetitionPeriod
 */
public enum TapiEthRepetitionPeriod {
  _1MIN("1MIN"),
    _1S("1S"),
    _10S("10S"),
    _0("0");

  private String value;

  TapiEthRepetitionPeriod(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiEthRepetitionPeriod fromValue(String text) {
    for (TapiEthRepetitionPeriod b : TapiEthRepetitionPeriod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
