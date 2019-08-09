package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiConnectivityCoordinateType;
import io.swagger.model.TapiConnectivityReversionMode;
import io.swagger.model.TapiConnectivitySelectionControl;
import io.swagger.model.TapiTopologyProtectionType;
import io.swagger.model.TapiTopologyRestorationPolicy;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TapiConnectivityResilienceConstraint
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-08-08T12:17:00.417-03:00[America/Sao_Paulo]")
public class TapiConnectivityResilienceConstraint   {
  @JsonProperty("is-lock-out")
  private Boolean isLockOut = false;

  @JsonProperty("max-switch-times")
  private Integer maxSwitchTimes = null;

  @JsonProperty("protection-type")
  private TapiTopologyProtectionType protectionType = null;

  @JsonProperty("hold-off-time")
  private Integer holdOffTime = null;

  @JsonProperty("wait-to-revert-time")
  private Integer waitToRevertTime = 15;

  @JsonProperty("selection-control")
  private TapiConnectivitySelectionControl selectionControl = null;

  @JsonProperty("preferred-restoration-layer")
  @Valid
  private List<TapiCommonLayerProtocolName> preferredRestorationLayer = null;

  @JsonProperty("restore-priority")
  private Integer restorePriority = null;

  @JsonProperty("restoration-policy")
  private TapiTopologyRestorationPolicy restorationPolicy = null;

  @JsonProperty("restoration-coordinate-type")
  private TapiConnectivityCoordinateType restorationCoordinateType = null;

  @JsonProperty("is-coordinated-switching-both-ends")
  private Boolean isCoordinatedSwitchingBothEnds = false;

  @JsonProperty("fault-condition-determination")
  private String faultConditionDetermination = null;

  @JsonProperty("is-frozen")
  private Boolean isFrozen = false;

  @JsonProperty("reversion-mode")
  private TapiConnectivityReversionMode reversionMode = null;

  public TapiConnectivityResilienceConstraint isLockOut(Boolean isLockOut) {
    this.isLockOut = isLockOut;
    return this;
  }

  /**
   * The resource is configured to temporarily not be available for use in the protection scheme(s) it is part of.                  This overrides all other protection control states including forced.                  If the item is locked out then it cannot be used under any circumstances.                  Note: Only relevant when part of a protection scheme.
   * @return isLockOut
  **/
  @ApiModelProperty(value = "The resource is configured to temporarily not be available for use in the protection scheme(s) it is part of.                  This overrides all other protection control states including forced.                  If the item is locked out then it cannot be used under any circumstances.                  Note: Only relevant when part of a protection scheme.")

  public Boolean isIsLockOut() {
    return isLockOut;
  }

  public void setIsLockOut(Boolean isLockOut) {
    this.isLockOut = isLockOut;
  }

  public TapiConnectivityResilienceConstraint maxSwitchTimes(Integer maxSwitchTimes) {
    this.maxSwitchTimes = maxSwitchTimes;
    return this;
  }

  /**
   * Used to limit the maximum swtich times. When work fault disappears , and traffic return to the original work path, switch counter reset.
   * @return maxSwitchTimes
  **/
  @ApiModelProperty(value = "Used to limit the maximum swtich times. When work fault disappears , and traffic return to the original work path, switch counter reset.")

  public Integer getMaxSwitchTimes() {
    return maxSwitchTimes;
  }

  public void setMaxSwitchTimes(Integer maxSwitchTimes) {
    this.maxSwitchTimes = maxSwitchTimes;
  }

  public TapiConnectivityResilienceConstraint protectionType(TapiTopologyProtectionType protectionType) {
    this.protectionType = protectionType;
    return this;
  }

  /**
   * Get protectionType
   * @return protectionType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyProtectionType getProtectionType() {
    return protectionType;
  }

  public void setProtectionType(TapiTopologyProtectionType protectionType) {
    this.protectionType = protectionType;
  }

  public TapiConnectivityResilienceConstraint holdOffTime(Integer holdOffTime) {
    this.holdOffTime = holdOffTime;
    return this;
  }

  /**
   * This attribute indicates the time, in milliseconds, between declaration of signal degrade or signal fail, and the initialization of the protection switching algorithm.
   * @return holdOffTime
  **/
  @ApiModelProperty(value = "This attribute indicates the time, in milliseconds, between declaration of signal degrade or signal fail, and the initialization of the protection switching algorithm.")

  public Integer getHoldOffTime() {
    return holdOffTime;
  }

  public void setHoldOffTime(Integer holdOffTime) {
    this.holdOffTime = holdOffTime;
  }

  public TapiConnectivityResilienceConstraint waitToRevertTime(Integer waitToRevertTime) {
    this.waitToRevertTime = waitToRevertTime;
    return this;
  }

  /**
   * If the protection system is revertive, this attribute specifies the time, in minutes, to wait after a fault clears on a higher priority (preferred) resource before reverting to the preferred resource.
   * @return waitToRevertTime
  **/
  @ApiModelProperty(value = "If the protection system is revertive, this attribute specifies the time, in minutes, to wait after a fault clears on a higher priority (preferred) resource before reverting to the preferred resource.")

  public Integer getWaitToRevertTime() {
    return waitToRevertTime;
  }

  public void setWaitToRevertTime(Integer waitToRevertTime) {
    this.waitToRevertTime = waitToRevertTime;
  }

  public TapiConnectivityResilienceConstraint selectionControl(TapiConnectivitySelectionControl selectionControl) {
    this.selectionControl = selectionControl;
    return this;
  }

  /**
   * Get selectionControl
   * @return selectionControl
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivitySelectionControl getSelectionControl() {
    return selectionControl;
  }

  public void setSelectionControl(TapiConnectivitySelectionControl selectionControl) {
    this.selectionControl = selectionControl;
  }

  public TapiConnectivityResilienceConstraint preferredRestorationLayer(List<TapiCommonLayerProtocolName> preferredRestorationLayer) {
    this.preferredRestorationLayer = preferredRestorationLayer;
    return this;
  }

  public TapiConnectivityResilienceConstraint addPreferredRestorationLayerItem(TapiCommonLayerProtocolName preferredRestorationLayerItem) {
    if (this.preferredRestorationLayer == null) {
      this.preferredRestorationLayer = new ArrayList<TapiCommonLayerProtocolName>();
    }
    this.preferredRestorationLayer.add(preferredRestorationLayerItem);
    return this;
  }

  /**
   * Indicate which layer this resilience parameters package configured for.
   * @return preferredRestorationLayer
  **/
  @ApiModelProperty(value = "Indicate which layer this resilience parameters package configured for.")
  @Valid
  public List<TapiCommonLayerProtocolName> getPreferredRestorationLayer() {
    return preferredRestorationLayer;
  }

  public void setPreferredRestorationLayer(List<TapiCommonLayerProtocolName> preferredRestorationLayer) {
    this.preferredRestorationLayer = preferredRestorationLayer;
  }

  public TapiConnectivityResilienceConstraint restorePriority(Integer restorePriority) {
    this.restorePriority = restorePriority;
    return this;
  }

  /**
   * none
   * @return restorePriority
  **/
  @ApiModelProperty(value = "none")

  public Integer getRestorePriority() {
    return restorePriority;
  }

  public void setRestorePriority(Integer restorePriority) {
    this.restorePriority = restorePriority;
  }

  public TapiConnectivityResilienceConstraint restorationPolicy(TapiTopologyRestorationPolicy restorationPolicy) {
    this.restorationPolicy = restorationPolicy;
    return this;
  }

  /**
   * Get restorationPolicy
   * @return restorationPolicy
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiTopologyRestorationPolicy getRestorationPolicy() {
    return restorationPolicy;
  }

  public void setRestorationPolicy(TapiTopologyRestorationPolicy restorationPolicy) {
    this.restorationPolicy = restorationPolicy;
  }

  public TapiConnectivityResilienceConstraint restorationCoordinateType(TapiConnectivityCoordinateType restorationCoordinateType) {
    this.restorationCoordinateType = restorationCoordinateType;
    return this;
  }

  /**
   * Get restorationCoordinateType
   * @return restorationCoordinateType
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityCoordinateType getRestorationCoordinateType() {
    return restorationCoordinateType;
  }

  public void setRestorationCoordinateType(TapiConnectivityCoordinateType restorationCoordinateType) {
    this.restorationCoordinateType = restorationCoordinateType;
  }

  public TapiConnectivityResilienceConstraint isCoordinatedSwitchingBothEnds(Boolean isCoordinatedSwitchingBothEnds) {
    this.isCoordinatedSwitchingBothEnds = isCoordinatedSwitchingBothEnds;
    return this;
  }

  /**
   * Is operating such that switching at both ends of each flow acorss the FC is coordinated at both ingress and egress ends.
   * @return isCoordinatedSwitchingBothEnds
  **/
  @ApiModelProperty(value = "Is operating such that switching at both ends of each flow acorss the FC is coordinated at both ingress and egress ends.")

  public Boolean isIsCoordinatedSwitchingBothEnds() {
    return isCoordinatedSwitchingBothEnds;
  }

  public void setIsCoordinatedSwitchingBothEnds(Boolean isCoordinatedSwitchingBothEnds) {
    this.isCoordinatedSwitchingBothEnds = isCoordinatedSwitchingBothEnds;
  }

  public TapiConnectivityResilienceConstraint faultConditionDetermination(String faultConditionDetermination) {
    this.faultConditionDetermination = faultConditionDetermination;
    return this;
  }

  /**
   * none
   * @return faultConditionDetermination
  **/
  @ApiModelProperty(value = "none")

  public String getFaultConditionDetermination() {
    return faultConditionDetermination;
  }

  public void setFaultConditionDetermination(String faultConditionDetermination) {
    this.faultConditionDetermination = faultConditionDetermination;
  }

  public TapiConnectivityResilienceConstraint isFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
    return this;
  }

  /**
   * Temporarily prevents any switch action to be taken and, as such, freezes the current state.                   Until the freeze is cleared, additional near-end external commands are rejected and fault condition changes and received APS messages are ignored.                  All administrative controls of any aspect of protection are rejected.
   * @return isFrozen
  **/
  @ApiModelProperty(value = "Temporarily prevents any switch action to be taken and, as such, freezes the current state.                   Until the freeze is cleared, additional near-end external commands are rejected and fault condition changes and received APS messages are ignored.                  All administrative controls of any aspect of protection are rejected.")

  public Boolean isIsFrozen() {
    return isFrozen;
  }

  public void setIsFrozen(Boolean isFrozen) {
    this.isFrozen = isFrozen;
  }

  public TapiConnectivityResilienceConstraint reversionMode(TapiConnectivityReversionMode reversionMode) {
    this.reversionMode = reversionMode;
    return this;
  }

  /**
   * Get reversionMode
   * @return reversionMode
  **/
  @ApiModelProperty(value = "")

  @Valid
  public TapiConnectivityReversionMode getReversionMode() {
    return reversionMode;
  }

  public void setReversionMode(TapiConnectivityReversionMode reversionMode) {
    this.reversionMode = reversionMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityResilienceConstraint tapiConnectivityResilienceConstraint = (TapiConnectivityResilienceConstraint) o;
    return Objects.equals(this.isLockOut, tapiConnectivityResilienceConstraint.isLockOut) &&
        Objects.equals(this.maxSwitchTimes, tapiConnectivityResilienceConstraint.maxSwitchTimes) &&
        Objects.equals(this.protectionType, tapiConnectivityResilienceConstraint.protectionType) &&
        Objects.equals(this.holdOffTime, tapiConnectivityResilienceConstraint.holdOffTime) &&
        Objects.equals(this.waitToRevertTime, tapiConnectivityResilienceConstraint.waitToRevertTime) &&
        Objects.equals(this.selectionControl, tapiConnectivityResilienceConstraint.selectionControl) &&
        Objects.equals(this.preferredRestorationLayer, tapiConnectivityResilienceConstraint.preferredRestorationLayer) &&
        Objects.equals(this.restorePriority, tapiConnectivityResilienceConstraint.restorePriority) &&
        Objects.equals(this.restorationPolicy, tapiConnectivityResilienceConstraint.restorationPolicy) &&
        Objects.equals(this.restorationCoordinateType, tapiConnectivityResilienceConstraint.restorationCoordinateType) &&
        Objects.equals(this.isCoordinatedSwitchingBothEnds, tapiConnectivityResilienceConstraint.isCoordinatedSwitchingBothEnds) &&
        Objects.equals(this.faultConditionDetermination, tapiConnectivityResilienceConstraint.faultConditionDetermination) &&
        Objects.equals(this.isFrozen, tapiConnectivityResilienceConstraint.isFrozen) &&
        Objects.equals(this.reversionMode, tapiConnectivityResilienceConstraint.reversionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLockOut, maxSwitchTimes, protectionType, holdOffTime, waitToRevertTime, selectionControl, preferredRestorationLayer, restorePriority, restorationPolicy, restorationCoordinateType, isCoordinatedSwitchingBothEnds, faultConditionDetermination, isFrozen, reversionMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityResilienceConstraint {\n");
    
    sb.append("    isLockOut: ").append(toIndentedString(isLockOut)).append("\n");
    sb.append("    maxSwitchTimes: ").append(toIndentedString(maxSwitchTimes)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
    sb.append("    holdOffTime: ").append(toIndentedString(holdOffTime)).append("\n");
    sb.append("    waitToRevertTime: ").append(toIndentedString(waitToRevertTime)).append("\n");
    sb.append("    selectionControl: ").append(toIndentedString(selectionControl)).append("\n");
    sb.append("    preferredRestorationLayer: ").append(toIndentedString(preferredRestorationLayer)).append("\n");
    sb.append("    restorePriority: ").append(toIndentedString(restorePriority)).append("\n");
    sb.append("    restorationPolicy: ").append(toIndentedString(restorationPolicy)).append("\n");
    sb.append("    restorationCoordinateType: ").append(toIndentedString(restorationCoordinateType)).append("\n");
    sb.append("    isCoordinatedSwitchingBothEnds: ").append(toIndentedString(isCoordinatedSwitchingBothEnds)).append("\n");
    sb.append("    faultConditionDetermination: ").append(toIndentedString(faultConditionDetermination)).append("\n");
    sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
    sb.append("    reversionMode: ").append(toIndentedString(reversionMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
