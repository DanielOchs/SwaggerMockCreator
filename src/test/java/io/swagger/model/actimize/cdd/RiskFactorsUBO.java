package io.swagger.model.actimize.cdd;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class RiskFactorsUBO   {
  
  private Boolean ubOAvailable = null;
  private String ubOCountries = null;

  /**
   **/
  public RiskFactorsUBO ubOAvailable(Boolean ubOAvailable) {
    this.ubOAvailable = ubOAvailable;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("UBO_available")
  public Boolean isUbOAvailable() {
    return ubOAvailable;
  }
  public void setUbOAvailable(Boolean ubOAvailable) {
    this.ubOAvailable = ubOAvailable;
  }

  /**
   **/
  public RiskFactorsUBO ubOCountries(String ubOCountries) {
    this.ubOCountries = ubOCountries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("UBOCountries")
  public String getUbOCountries() {
    return ubOCountries;
  }
  public void setUbOCountries(String ubOCountries) {
    this.ubOCountries = ubOCountries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskFactorsUBO riskFactorsUBO = (RiskFactorsUBO) o;
    return Objects.equals(ubOAvailable, riskFactorsUBO.ubOAvailable) &&
        Objects.equals(ubOCountries, riskFactorsUBO.ubOCountries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ubOAvailable, ubOCountries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskFactorsUBO {\n");
    
    sb.append("    ubOAvailable: ").append(toIndentedString(ubOAvailable)).append("\n");
    sb.append("    ubOCountries: ").append(toIndentedString(ubOCountries)).append("\n");
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

