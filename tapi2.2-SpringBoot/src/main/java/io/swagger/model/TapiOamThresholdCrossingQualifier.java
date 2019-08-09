package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.oam.ThresholdCrossingQualifier
 */
public enum TapiOamThresholdCrossingQualifier {
  NOT_APPLICABLE("NOT_APPLICABLE"),
    NEAR_END("NEAR_END"),
    FAR_END("FAR_END"),
    BIDIRECTIONAL("BIDIRECTIONAL"),
    FORWARD("FORWARD"),
    BACKWARD("BACKWARD");

  private String value;

  TapiOamThresholdCrossingQualifier(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiOamThresholdCrossingQualifier fromValue(String text) {
    for (TapiOamThresholdCrossingQualifier b : TapiOamThresholdCrossingQualifier.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
