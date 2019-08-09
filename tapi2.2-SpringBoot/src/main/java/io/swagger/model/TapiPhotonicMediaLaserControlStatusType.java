package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.photonic.media.LaserControlStatusType
 */
public enum TapiPhotonicMediaLaserControlStatusType {
  ON("ON"),
    OFF("OFF"),
    PULSING("PULSING"),
    UNDEFINED("UNDEFINED");

  private String value;

  TapiPhotonicMediaLaserControlStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiPhotonicMediaLaserControlStatusType fromValue(String text) {
    for (TapiPhotonicMediaLaserControlStatusType b : TapiPhotonicMediaLaserControlStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
