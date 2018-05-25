package io.swagger.model.actimize.wlf;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * an address
 **/
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "an address")

public class Address   {
  
  private String city = null;
  private Integer postalcode = null;
  private String country = null;
  private String stateProvince = null;
  private String street1 = null;
  private String street2 = null;

  /**
   **/
  public Address city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  public Address postalcode(Integer postalcode) {
    this.postalcode = postalcode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postalcode")
  public Integer getPostalcode() {
    return postalcode;
  }
  public void setPostalcode(Integer postalcode) {
    this.postalcode = postalcode;
  }

  /**
   **/
  public Address country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  public Address stateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stateProvince")
  public String getStateProvince() {
    return stateProvince;
  }
  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

  /**
   **/
  public Address street1(String street1) {
    this.street1 = street1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("street1")
  public String getStreet1() {
    return street1;
  }
  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  /**
   **/
  public Address street2(String street2) {
    this.street2 = street2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("street2")
  public String getStreet2() {
    return street2;
  }
  public void setStreet2(String street2) {
    this.street2 = street2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(city, address.city) &&
        Objects.equals(postalcode, address.postalcode) &&
        Objects.equals(country, address.country) &&
        Objects.equals(stateProvince, address.stateProvince) &&
        Objects.equals(street1, address.street1) &&
        Objects.equals(street2, address.street2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, postalcode, country, stateProvince, street1, street2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalcode: ").append(toIndentedString(postalcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
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

