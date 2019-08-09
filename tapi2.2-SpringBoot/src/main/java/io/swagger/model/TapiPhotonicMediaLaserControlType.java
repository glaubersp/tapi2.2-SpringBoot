package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.photonic.media.LaserControlType
 */
public enum TapiPhotonicMediaLaserControlType {
  FORCED_ON("FORCED-ON"),
    FORCED_OFF("FORCED-OFF"),
    AUTOMATIC_LASER_SHUTDOWN("AUTOMATIC-LASER-SHUTDOWN"),
    UNDEFINED("UNDEFINED");

  private String value;

  TapiPhotonicMediaLaserControlType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiPhotonicMediaLaserControlType fromValue(String text) {
    for (TapiPhotonicMediaLaserControlType b : TapiPhotonicMediaLaserControlType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
