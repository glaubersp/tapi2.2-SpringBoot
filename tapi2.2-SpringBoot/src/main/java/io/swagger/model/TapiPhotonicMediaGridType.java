package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.photonic.media.GridType
 */
public enum TapiPhotonicMediaGridType {
  DWDM("DWDM"),
    CWDM("CWDM"),
    FLEX("FLEX"),
    GRIDLESS("GRIDLESS"),
    UNSPECIFIED("UNSPECIFIED");

  private String value;

  TapiPhotonicMediaGridType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiPhotonicMediaGridType fromValue(String text) {
    for (TapiPhotonicMediaGridType b : TapiPhotonicMediaGridType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
