package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.eth.CsfConfig
 */
public enum TapiEthCsfConfig {
  DISABLED("DISABLED"),
    ENABLED("ENABLED"),
    ENABLED_WITH_RDI_FDI("ENABLED_WITH_RDI_FDI"),
    ENABLED_WITH_RDI_FDI_DCI("ENABLED_WITH_RDI_FDI_DCI"),
    ENABLED_WITH_DCI("ENABLED_WITH_DCI");

  private String value;

  TapiEthCsfConfig(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiEthCsfConfig fromValue(String text) {
    for (TapiEthCsfConfig b : TapiEthCsfConfig.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
