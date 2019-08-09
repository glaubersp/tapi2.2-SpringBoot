package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.photonic.media.LaserType
 */
public enum TapiPhotonicMediaLaserType {
  PUMP("PUMP"),
    MODULATED("MODULATED"),
    PULSE("PULSE");

  private String value;

  TapiPhotonicMediaLaserType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiPhotonicMediaLaserType fromValue(String text) {
    for (TapiPhotonicMediaLaserType b : TapiPhotonicMediaLaserType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
