package io.swagger.model.accounts.verwsvc;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Dependency   {
  
  private String dependencyType = null;
  private String dependencyTypeLabel = null;
  private String dependencySeverity = null;
  private String dependencyContractId = null;
  private String dependencyContractIdType = null;
  private String dependencyRelationType = null;
  private String dependencyAccountId = null;
  private String dependencyContractBusinessCategory = null;

  /**
   * FDTE: AVEBSL
   **/
  public Dependency dependencyType(String dependencyType) {
    this.dependencyType = dependencyType;
    return this;
  }

  
  @ApiModelProperty(value = "FDTE: AVEBSL")
  @JsonProperty("dependencyType")
  public String getDependencyType() {
    return dependencyType;
  }
  public void setDependencyType(String dependencyType) {
    this.dependencyType = dependencyType;
  }

  /**
   * FDTE: AVEBTX
   **/
  public Dependency dependencyTypeLabel(String dependencyTypeLabel) {
    this.dependencyTypeLabel = dependencyTypeLabel;
    return this;
  }

  
  @ApiModelProperty(value = "FDTE: AVEBTX")
  @JsonProperty("dependencyTypeLabel")
  public String getDependencyTypeLabel() {
    return dependencyTypeLabel;
  }
  public void setDependencyTypeLabel(String dependencyTypeLabel) {
    this.dependencyTypeLabel = dependencyTypeLabel;
  }

  /**
   * FDTE: PRVORLKZ
   **/
  public Dependency dependencySeverity(String dependencySeverity) {
    this.dependencySeverity = dependencySeverity;
    return this;
  }

  
  @ApiModelProperty(value = "FDTE: PRVORLKZ")
  @JsonProperty("dependencySeverity")
  public String getDependencySeverity() {
    return dependencySeverity;
  }
  public void setDependencySeverity(String dependencySeverity) {
    this.dependencySeverity = dependencySeverity;
  }

  /**
   * FDTE: GESNRGEN
   **/
  public Dependency dependencyContractId(String dependencyContractId) {
    this.dependencyContractId = dependencyContractId;
    return this;
  }

  
  @ApiModelProperty(value = "FDTE: GESNRGEN")
  @JsonProperty("dependencyContractId")
  public String getDependencyContractId() {
    return dependencyContractId;
  }
  public void setDependencyContractId(String dependencyContractId) {
    this.dependencyContractId = dependencyContractId;
  }

  /**
   * FDTE: GESNRGKZ
   **/
  public Dependency dependencyContractIdType(String dependencyContractIdType) {
    this.dependencyContractIdType = dependencyContractIdType;
    return this;
  }

  
  @ApiModelProperty(value = "FDTE: GESNRGKZ")
  @JsonProperty("dependencyContractIdType")
  public String getDependencyContractIdType() {
    return dependencyContractIdType;
  }
  public void setDependencyContractIdType(String dependencyContractIdType) {
    this.dependencyContractIdType = dependencyContractIdType;
  }

  /**
   * FDTE: TVESL
   **/
  public Dependency dependencyRelationType(String dependencyRelationType) {
    this.dependencyRelationType = dependencyRelationType;
    return this;
  }

  
  @ApiModelProperty(value = "FDTE: TVESL")
  @JsonProperty("dependencyRelationType")
  public String getDependencyRelationType() {
    return dependencyRelationType;
  }
  public void setDependencyRelationType(String dependencyRelationType) {
    this.dependencyRelationType = dependencyRelationType;
  }

  /**
   * FDTE: KTONRGEN + ISOWHRCD
   **/
  public Dependency dependencyAccountId(String dependencyAccountId) {
    this.dependencyAccountId = dependencyAccountId;
    return this;
  }

  
  @ApiModelProperty(value = "FDTE: KTONRGEN + ISOWHRCD")
  @JsonProperty("dependencyAccountId")
  public String getDependencyAccountId() {
    return dependencyAccountId;
  }
  public void setDependencyAccountId(String dependencyAccountId) {
    this.dependencyAccountId = dependencyAccountId;
  }

  /**
   * FDTE: SPARTE
   **/
  public Dependency dependencyContractBusinessCategory(String dependencyContractBusinessCategory) {
    this.dependencyContractBusinessCategory = dependencyContractBusinessCategory;
    return this;
  }

  
  @ApiModelProperty(value = "FDTE: SPARTE")
  @JsonProperty("dependencyContractBusinessCategory")
  public String getDependencyContractBusinessCategory() {
    return dependencyContractBusinessCategory;
  }
  public void setDependencyContractBusinessCategory(String dependencyContractBusinessCategory) {
    this.dependencyContractBusinessCategory = dependencyContractBusinessCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dependency dependency = (Dependency) o;
    return Objects.equals(dependencyType, dependency.dependencyType) &&
        Objects.equals(dependencyTypeLabel, dependency.dependencyTypeLabel) &&
        Objects.equals(dependencySeverity, dependency.dependencySeverity) &&
        Objects.equals(dependencyContractId, dependency.dependencyContractId) &&
        Objects.equals(dependencyContractIdType, dependency.dependencyContractIdType) &&
        Objects.equals(dependencyRelationType, dependency.dependencyRelationType) &&
        Objects.equals(dependencyAccountId, dependency.dependencyAccountId) &&
        Objects.equals(dependencyContractBusinessCategory, dependency.dependencyContractBusinessCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencyType, dependencyTypeLabel, dependencySeverity, dependencyContractId, dependencyContractIdType, dependencyRelationType, dependencyAccountId, dependencyContractBusinessCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dependency {\n");
    
    sb.append("    dependencyType: ").append(toIndentedString(dependencyType)).append("\n");
    sb.append("    dependencyTypeLabel: ").append(toIndentedString(dependencyTypeLabel)).append("\n");
    sb.append("    dependencySeverity: ").append(toIndentedString(dependencySeverity)).append("\n");
    sb.append("    dependencyContractId: ").append(toIndentedString(dependencyContractId)).append("\n");
    sb.append("    dependencyContractIdType: ").append(toIndentedString(dependencyContractIdType)).append("\n");
    sb.append("    dependencyRelationType: ").append(toIndentedString(dependencyRelationType)).append("\n");
    sb.append("    dependencyAccountId: ").append(toIndentedString(dependencyAccountId)).append("\n");
    sb.append("    dependencyContractBusinessCategory: ").append(toIndentedString(dependencyContractBusinessCategory)).append("\n");
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

