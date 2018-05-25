package io.swagger.model.actimize.wlf;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class HitsAliases   {
  
  private String firstName = null;
  private String fullName = null;
  private String lastName = null;
  private String maidenName = null;
  private String middleName = null;

  /**
   **/
  public HitsAliases firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  public HitsAliases fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  /**
   **/
  public HitsAliases lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  public HitsAliases maidenName(String maidenName) {
    this.maidenName = maidenName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maidenName")
  public String getMaidenName() {
    return maidenName;
  }
  public void setMaidenName(String maidenName) {
    this.maidenName = maidenName;
  }

  /**
   **/
  public HitsAliases middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HitsAliases hitsAliases = (HitsAliases) o;
    return Objects.equals(firstName, hitsAliases.firstName) &&
        Objects.equals(fullName, hitsAliases.fullName) &&
        Objects.equals(lastName, hitsAliases.lastName) &&
        Objects.equals(maidenName, hitsAliases.maidenName) &&
        Objects.equals(middleName, hitsAliases.middleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, fullName, lastName, maidenName, middleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HitsAliases {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    maidenName: ").append(toIndentedString(maidenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
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

