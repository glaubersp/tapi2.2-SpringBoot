package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.common.LayerProtocolName
 */
public enum TapiCommonLayerProtocolName {
  ODU("ODU"),
    ETH("ETH"),
    DSR("DSR"),
    PHOTONIC_MEDIA("PHOTONIC_MEDIA");

  private String value;

  TapiCommonLayerProtocolName(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiCommonLayerProtocolName fromValue(String text) {
    for (TapiCommonLayerProtocolName b : TapiCommonLayerProtocolName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
