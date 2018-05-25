package io.swagger.model.actimize.wlf;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class PersonPersonData   {
  
  private String dateOfBirth = null;
  private Integer yearOfBirth = null;
  private String locationOfBirth = null;
  private String countryOfBirth = null;
  private List<String> nationalities = new ArrayList<String>();
  private String gender = null;
  private String title = null;

  /**
   **/
  public PersonPersonData dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dateOfBirth")
  public String getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   **/
  public PersonPersonData yearOfBirth(Integer yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("yearOfBirth")
  public Integer getYearOfBirth() {
    return yearOfBirth;
  }
  public void setYearOfBirth(Integer yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  /**
   **/
  public PersonPersonData locationOfBirth(String locationOfBirth) {
    this.locationOfBirth = locationOfBirth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("locationOfBirth")
  public String getLocationOfBirth() {
    return locationOfBirth;
  }
  public void setLocationOfBirth(String locationOfBirth) {
    this.locationOfBirth = locationOfBirth;
  }

  /**
   **/
  public PersonPersonData countryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("countryOfBirth")
  public String getCountryOfBirth() {
    return countryOfBirth;
  }
  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  /**
   **/
  public PersonPersonData nationalities(List<String> nationalities) {
    this.nationalities = nationalities;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nationalities")
  public List<String> getNationalities() {
    return nationalities;
  }
  public void setNationalities(List<String> nationalities) {
    this.nationalities = nationalities;
  }

  /**
   **/
  public PersonPersonData gender(String gender) {
    this.gender = gender;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   **/
  public PersonPersonData title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonPersonData personPersonData = (PersonPersonData) o;
    return Objects.equals(dateOfBirth, personPersonData.dateOfBirth) &&
        Objects.equals(yearOfBirth, personPersonData.yearOfBirth) &&
        Objects.equals(locationOfBirth, personPersonData.locationOfBirth) &&
        Objects.equals(countryOfBirth, personPersonData.countryOfBirth) &&
        Objects.equals(nationalities, personPersonData.nationalities) &&
        Objects.equals(gender, personPersonData.gender) &&
        Objects.equals(title, personPersonData.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, yearOfBirth, locationOfBirth, countryOfBirth, nationalities, gender, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonPersonData {\n");
    
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    yearOfBirth: ").append(toIndentedString(yearOfBirth)).append("\n");
    sb.append("    locationOfBirth: ").append(toIndentedString(locationOfBirth)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    nationalities: ").append(toIndentedString(nationalities)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

