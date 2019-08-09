package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.topology.RestorationPolicy
 */
public enum TapiTopologyRestorationPolicy {
  PER_DOMAIN_RESTORATION("PER_DOMAIN_RESTORATION"),
    END_TO_END_RESTORATION("END_TO_END_RESTORATION"),
    NA("NA"),
    DYNAMIC_RESTORATION("DYNAMIC_RESTORATION"),
    PRE_COMPUTED_RESTORATION("PRE_COMPUTED_RESTORATION");

  private String value;

  TapiTopologyRestorationPolicy(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiTopologyRestorationPolicy fromValue(String text) {
    for (TapiTopologyRestorationPolicy b : TapiTopologyRestorationPolicy.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
