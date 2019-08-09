package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.odu.PercentageGranularity
 */
public enum TapiOduPercentageGranularity {
  ONES("ONES"),
    ONE_TENTHS("ONE_TENTHS"),
    ONE_HUNDREDTHS("ONE_HUNDREDTHS"),
    ONE_THOUSANDTHS("ONE_THOUSANDTHS");

  private String value;

  TapiOduPercentageGranularity(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiOduPercentageGranularity fromValue(String text) {
    for (TapiOduPercentageGranularity b : TapiOduPercentageGranularity.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
