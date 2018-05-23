package io.swagger.model.branch;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Branch   {
  
  private String id = null;
  private String importGroup = null;
  private String number = null;
  private String orgNumber = null;
  private String orgType = null;
  private String orgTypeName = null;
  private String orgSpec = null;
  private String orgSpecName = null;
  private String country = null;
  private String sate = null;
  private String name = null;
  private String zip = null;
  private String city = null;
  private String postalCity = null;
  private String postalCountry = null;
  private String postalStreet = null;
  private Boolean vault = null;
  private String barriereTyp = null;
  private String naechsteFilHB = null;
  private List<Float> position = new ArrayList<Float>();
  private Boolean kasse = null;
  private BranchOffice branchOffice = null;

  /**
   **/
  public Branch id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public Branch importGroup(String importGroup) {
    this.importGroup = importGroup;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("importGroup")
  public String getImportGroup() {
    return importGroup;
  }
  public void setImportGroup(String importGroup) {
    this.importGroup = importGroup;
  }

  /**
   **/
  public Branch number(String number) {
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
  public Branch orgNumber(String orgNumber) {
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
  public Branch orgType(String orgType) {
    this.orgType = orgType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orgType")
  public String getOrgType() {
    return orgType;
  }
  public void setOrgType(String orgType) {
    this.orgType = orgType;
  }

  /**
   **/
  public Branch orgTypeName(String orgTypeName) {
    this.orgTypeName = orgTypeName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orgTypeName")
  public String getOrgTypeName() {
    return orgTypeName;
  }
  public void setOrgTypeName(String orgTypeName) {
    this.orgTypeName = orgTypeName;
  }

  /**
   **/
  public Branch orgSpec(String orgSpec) {
    this.orgSpec = orgSpec;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orgSpec")
  public String getOrgSpec() {
    return orgSpec;
  }
  public void setOrgSpec(String orgSpec) {
    this.orgSpec = orgSpec;
  }

  /**
   **/
  public Branch orgSpecName(String orgSpecName) {
    this.orgSpecName = orgSpecName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orgSpecName")
  public String getOrgSpecName() {
    return orgSpecName;
  }
  public void setOrgSpecName(String orgSpecName) {
    this.orgSpecName = orgSpecName;
  }

  /**
   **/
  public Branch country(String country) {
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
  public Branch sate(String sate) {
    this.sate = sate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sate")
  public String getSate() {
    return sate;
  }
  public void setSate(String sate) {
    this.sate = sate;
  }

  /**
   **/
  public Branch name(String name) {
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
  public Branch zip(String zip) {
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
  public Branch city(String city) {
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
  public Branch postalCity(String postalCity) {
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
  public Branch postalCountry(String postalCountry) {
    this.postalCountry = postalCountry;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postalCountry")
  public String getPostalCountry() {
    return postalCountry;
  }
  public void setPostalCountry(String postalCountry) {
    this.postalCountry = postalCountry;
  }

  /**
   **/
  public Branch postalStreet(String postalStreet) {
    this.postalStreet = postalStreet;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postalStreet")
  public String getPostalStreet() {
    return postalStreet;
  }
  public void setPostalStreet(String postalStreet) {
    this.postalStreet = postalStreet;
  }

  /**
   **/
  public Branch vault(Boolean vault) {
    this.vault = vault;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("vault")
  public Boolean isVault() {
    return vault;
  }
  public void setVault(Boolean vault) {
    this.vault = vault;
  }

  /**
   **/
  public Branch barriereTyp(String barriereTyp) {
    this.barriereTyp = barriereTyp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("barriereTyp")
  public String getBarriereTyp() {
    return barriereTyp;
  }
  public void setBarriereTyp(String barriereTyp) {
    this.barriereTyp = barriereTyp;
  }

  /**
   **/
  public Branch naechsteFilHB(String naechsteFilHB) {
    this.naechsteFilHB = naechsteFilHB;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("naechsteFilHB")
  public String getNaechsteFilHB() {
    return naechsteFilHB;
  }
  public void setNaechsteFilHB(String naechsteFilHB) {
    this.naechsteFilHB = naechsteFilHB;
  }

  /**
   **/
  public Branch position(List<Float> position) {
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
  public Branch kasse(Boolean kasse) {
    this.kasse = kasse;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("kasse")
  public Boolean isKasse() {
    return kasse;
  }
  public void setKasse(Boolean kasse) {
    this.kasse = kasse;
  }

  /**
   **/
  public Branch branchOffice(BranchOffice branchOffice) {
    this.branchOffice = branchOffice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("branchOffice")
  public BranchOffice getBranchOffice() {
    return branchOffice;
  }
  public void setBranchOffice(BranchOffice branchOffice) {
    this.branchOffice = branchOffice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Branch branch = (Branch) o;
    return Objects.equals(id, branch.id) &&
        Objects.equals(importGroup, branch.importGroup) &&
        Objects.equals(number, branch.number) &&
        Objects.equals(orgNumber, branch.orgNumber) &&
        Objects.equals(orgType, branch.orgType) &&
        Objects.equals(orgTypeName, branch.orgTypeName) &&
        Objects.equals(orgSpec, branch.orgSpec) &&
        Objects.equals(orgSpecName, branch.orgSpecName) &&
        Objects.equals(country, branch.country) &&
        Objects.equals(sate, branch.sate) &&
        Objects.equals(name, branch.name) &&
        Objects.equals(zip, branch.zip) &&
        Objects.equals(city, branch.city) &&
        Objects.equals(postalCity, branch.postalCity) &&
        Objects.equals(postalCountry, branch.postalCountry) &&
        Objects.equals(postalStreet, branch.postalStreet) &&
        Objects.equals(vault, branch.vault) &&
        Objects.equals(barriereTyp, branch.barriereTyp) &&
        Objects.equals(naechsteFilHB, branch.naechsteFilHB) &&
        Objects.equals(position, branch.position) &&
        Objects.equals(kasse, branch.kasse) &&
        Objects.equals(branchOffice, branch.branchOffice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, importGroup, number, orgNumber, orgType, orgTypeName, orgSpec, orgSpecName, country, sate, name, zip, city, postalCity, postalCountry, postalStreet, vault, barriereTyp, naechsteFilHB, position, kasse, branchOffice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branch {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importGroup: ").append(toIndentedString(importGroup)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    orgNumber: ").append(toIndentedString(orgNumber)).append("\n");
    sb.append("    orgType: ").append(toIndentedString(orgType)).append("\n");
    sb.append("    orgTypeName: ").append(toIndentedString(orgTypeName)).append("\n");
    sb.append("    orgSpec: ").append(toIndentedString(orgSpec)).append("\n");
    sb.append("    orgSpecName: ").append(toIndentedString(orgSpecName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    sate: ").append(toIndentedString(sate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCity: ").append(toIndentedString(postalCity)).append("\n");
    sb.append("    postalCountry: ").append(toIndentedString(postalCountry)).append("\n");
    sb.append("    postalStreet: ").append(toIndentedString(postalStreet)).append("\n");
    sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
    sb.append("    barriereTyp: ").append(toIndentedString(barriereTyp)).append("\n");
    sb.append("    naechsteFilHB: ").append(toIndentedString(naechsteFilHB)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    kasse: ").append(toIndentedString(kasse)).append("\n");
    sb.append("    branchOffice: ").append(toIndentedString(branchOffice)).append("\n");
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

