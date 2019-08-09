package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.photonic.media.AdjustmentGranularity
 */
public enum TapiPhotonicMediaAdjustmentGranularity {
  G_100GHZ("G_100GHZ"),
    G_50GHZ("G_50GHZ"),
    G_25GHZ("G_25GHZ"),
    G_12_5GHZ("G_12_5GHZ"),
    G_6_25GHZ("G_6_25GHZ"),
    G_3_125GHZ("G_3_125GHZ"),
    UNCONSTRAINED("UNCONSTRAINED");

  private String value;

  TapiPhotonicMediaAdjustmentGranularity(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiPhotonicMediaAdjustmentGranularity fromValue(String text) {
    for (TapiPhotonicMediaAdjustmentGranularity b : TapiPhotonicMediaAdjustmentGranularity.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
