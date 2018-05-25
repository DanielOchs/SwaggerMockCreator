package io.swagger.model.actimize.wlf;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class HitsNationalityCountries   {
  
  private String country1 = null;
  private String country2 = null;

  /**
   **/
  public HitsNationalityCountries country1(String country1) {
    this.country1 = country1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("country1")
  public String getCountry1() {
    return country1;
  }
  public void setCountry1(String country1) {
    this.country1 = country1;
  }

  /**
   **/
  public HitsNationalityCountries country2(String country2) {
    this.country2 = country2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("country2")
  public String getCountry2() {
    return country2;
  }
  public void setCountry2(String country2) {
    this.country2 = country2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HitsNationalityCountries hitsNationalityCountries = (HitsNationalityCountries) o;
    return Objects.equals(country1, hitsNationalityCountries.country1) &&
        Objects.equals(country2, hitsNationalityCountries.country2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country1, country2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HitsNationalityCountries {\n");
    
    sb.append("    country1: ").append(toIndentedString(country1)).append("\n");
    sb.append("    country2: ").append(toIndentedString(country2)).append("\n");
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

