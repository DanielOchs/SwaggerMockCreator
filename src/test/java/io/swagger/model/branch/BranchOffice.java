package io.swagger.model.branch;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class BranchOffice   {
  
  private String city = null;
  private String zip = null;
  private String street = null;
  private String name = null;
  private String number = null;
  private String orgNumber = null;
  private List<Float> position = new ArrayList<Float>();
  private String postalCity = null;
  private String postbox = null;
  private String postalZip = null;
  private String fax = null;
  private String phone = null;

  /**
   **/
  public BranchOffice city(String city) {
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
  public BranchOffice zip(String zip) {
    this.zip = zip;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("zip")
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }

  /**
   **/
  public BranchOffice street(String street) {
    this.street = street;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   **/
  public BranchOffice name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public BranchOffice number(String number) {
    this.number = number;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   **/
  public BranchOffice orgNumber(String orgNumber) {
    this.orgNumber = orgNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orgNumber")
  public String getOrgNumber() {
    return orgNumber;
  }
  public void setOrgNumber(String orgNumber) {
    this.orgNumber = orgNumber;
  }

  /**
   **/
  public BranchOffice position(List<Float> position) {
    this.position = position;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("position")
  public List<Float> getPosition() {
    return position;
  }
  public void setPosition(List<Float> position) {
    this.position = position;
  }

  /**
   **/
  public BranchOffice postalCity(String postalCity) {
    this.postalCity = postalCity;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postalCity")
  public String getPostalCity() {
    return postalCity;
  }
  public void setPostalCity(String postalCity) {
    this.postalCity = postalCity;
  }

  /**
   **/
  public BranchOffice postbox(String postbox) {
    this.postbox = postbox;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postbox")
  public String getPostbox() {
    return postbox;
  }
  public void setPostbox(String postbox) {
    this.postbox = postbox;
  }

  /**
   **/
  public BranchOffice postalZip(String postalZip) {
    this.postalZip = postalZip;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postalZip")
  public String getPostalZip() {
    return postalZip;
  }
  public void setPostalZip(String postalZip) {
    this.postalZip = postalZip;
  }

  /**
   **/
  public BranchOffice fax(String fax) {
    this.fax = fax;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fax")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }

  /**
   **/
  public BranchOffice phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchOffice branchOffice = (BranchOffice) o;
    return Objects.equals(city, branchOffice.city) &&
        Objects.equals(zip, branchOffice.zip) &&
        Objects.equals(street, branchOffice.street) &&
        Objects.equals(name, branchOffice.name) &&
        Objects.equals(number, branchOffice.number) &&
        Objects.equals(orgNumber, branchOffice.orgNumber) &&
        Objects.equals(position, branchOffice.position) &&
        Objects.equals(postalCity, branchOffice.postalCity) &&
        Objects.equals(postbox, branchOffice.postbox) &&
        Objects.equals(postalZip, branchOffice.postalZip) &&
        Objects.equals(fax, branchOffice.fax) &&
        Objects.equals(phone, branchOffice.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, zip, street, name, number, orgNumber, position, postalCity, postbox, postalZip, fax, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchOffice {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    orgNumber: ").append(toIndentedString(orgNumber)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    postalCity: ").append(toIndentedString(postalCity)).append("\n");
    sb.append("    postbox: ").append(toIndentedString(postbox)).append("\n");
    sb.append("    postalZip: ").append(toIndentedString(postalZip)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

