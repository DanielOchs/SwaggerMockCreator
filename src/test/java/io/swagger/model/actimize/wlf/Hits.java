package io.swagger.model.actimize.wlf;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Hits   {
  
  private List<HitsAdditionalInfo> additionalInfo = new ArrayList<HitsAdditionalInfo>();
  private List<HitsAddresses> addresses = new ArrayList<HitsAddresses>();
  private List<HitsAliases> aliases = new ArrayList<HitsAliases>();
  private List<HitsCategories> categories = new ArrayList<HitsCategories>();
  private List<HitsCountriesOfBirth> countriesOfBirth = new ArrayList<HitsCountriesOfBirth>();
  private List<HitsDatesOfBirth> datesOfBirth = new ArrayList<HitsDatesOfBirth>();
  private String deceasedDate = null;
  private String entryCreatedDate = null;
  private String entryUpdateDate = null;
  private String gender = null;
  private List<HitsKeywords> keywords = new ArrayList<HitsKeywords>();
  private String listEntryKey = null;
  private String listId = null;
  private String listUpdateDate = null;
  private List<HitsIds> ids = new ArrayList<HitsIds>();
  private String matchType = null;
  private List<HitsAliases> names = new ArrayList<HitsAliases>();
  private List<HitsNationalityCountries> nationalityCountries = new ArrayList<HitsNationalityCountries>();
  private String position = null;
  private Integer score = null;
  private List<HitsScoreFactors> scoreFactors = new ArrayList<HitsScoreFactors>();
  private String title = null;
  private String type = null;

  /**
   **/
  public Hits additionalInfo(List<HitsAdditionalInfo> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("additionalInfo")
  public List<HitsAdditionalInfo> getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(List<HitsAdditionalInfo> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  /**
   **/
  public Hits addresses(List<HitsAddresses> addresses) {
    this.addresses = addresses;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addresses")
  public List<HitsAddresses> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<HitsAddresses> addresses) {
    this.addresses = addresses;
  }

  /**
   **/
  public Hits aliases(List<HitsAliases> aliases) {
    this.aliases = aliases;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("aliases")
  public List<HitsAliases> getAliases() {
    return aliases;
  }
  public void setAliases(List<HitsAliases> aliases) {
    this.aliases = aliases;
  }

  /**
   **/
  public Hits categories(List<HitsCategories> categories) {
    this.categories = categories;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("categories")
  public List<HitsCategories> getCategories() {
    return categories;
  }
  public void setCategories(List<HitsCategories> categories) {
    this.categories = categories;
  }

  /**
   **/
  public Hits countriesOfBirth(List<HitsCountriesOfBirth> countriesOfBirth) {
    this.countriesOfBirth = countriesOfBirth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("countriesOfBirth")
  public List<HitsCountriesOfBirth> getCountriesOfBirth() {
    return countriesOfBirth;
  }
  public void setCountriesOfBirth(List<HitsCountriesOfBirth> countriesOfBirth) {
    this.countriesOfBirth = countriesOfBirth;
  }

  /**
   **/
  public Hits datesOfBirth(List<HitsDatesOfBirth> datesOfBirth) {
    this.datesOfBirth = datesOfBirth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("datesOfBirth")
  public List<HitsDatesOfBirth> getDatesOfBirth() {
    return datesOfBirth;
  }
  public void setDatesOfBirth(List<HitsDatesOfBirth> datesOfBirth) {
    this.datesOfBirth = datesOfBirth;
  }

  /**
   **/
  public Hits deceasedDate(String deceasedDate) {
    this.deceasedDate = deceasedDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("deceasedDate")
  public String getDeceasedDate() {
    return deceasedDate;
  }
  public void setDeceasedDate(String deceasedDate) {
    this.deceasedDate = deceasedDate;
  }

  /**
   **/
  public Hits entryCreatedDate(String entryCreatedDate) {
    this.entryCreatedDate = entryCreatedDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("entryCreatedDate")
  public String getEntryCreatedDate() {
    return entryCreatedDate;
  }
  public void setEntryCreatedDate(String entryCreatedDate) {
    this.entryCreatedDate = entryCreatedDate;
  }

  /**
   **/
  public Hits entryUpdateDate(String entryUpdateDate) {
    this.entryUpdateDate = entryUpdateDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("entryUpdateDate")
  public String getEntryUpdateDate() {
    return entryUpdateDate;
  }
  public void setEntryUpdateDate(String entryUpdateDate) {
    this.entryUpdateDate = entryUpdateDate;
  }

  /**
   **/
  public Hits gender(String gender) {
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
  public Hits keywords(List<HitsKeywords> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keywords")
  public List<HitsKeywords> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<HitsKeywords> keywords) {
    this.keywords = keywords;
  }

  /**
   **/
  public Hits listEntryKey(String listEntryKey) {
    this.listEntryKey = listEntryKey;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("listEntryKey")
  public String getListEntryKey() {
    return listEntryKey;
  }
  public void setListEntryKey(String listEntryKey) {
    this.listEntryKey = listEntryKey;
  }

  /**
   **/
  public Hits listId(String listId) {
    this.listId = listId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("listId")
  public String getListId() {
    return listId;
  }
  public void setListId(String listId) {
    this.listId = listId;
  }

  /**
   **/
  public Hits listUpdateDate(String listUpdateDate) {
    this.listUpdateDate = listUpdateDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("listUpdateDate")
  public String getListUpdateDate() {
    return listUpdateDate;
  }
  public void setListUpdateDate(String listUpdateDate) {
    this.listUpdateDate = listUpdateDate;
  }

  /**
   **/
  public Hits ids(List<HitsIds> ids) {
    this.ids = ids;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ids")
  public List<HitsIds> getIds() {
    return ids;
  }
  public void setIds(List<HitsIds> ids) {
    this.ids = ids;
  }

  /**
   **/
  public Hits matchType(String matchType) {
    this.matchType = matchType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("matchType")
  public String getMatchType() {
    return matchType;
  }
  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }

  /**
   **/
  public Hits names(List<HitsAliases> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("names")
  public List<HitsAliases> getNames() {
    return names;
  }
  public void setNames(List<HitsAliases> names) {
    this.names = names;
  }

  /**
   **/
  public Hits nationalityCountries(List<HitsNationalityCountries> nationalityCountries) {
    this.nationalityCountries = nationalityCountries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nationalityCountries")
  public List<HitsNationalityCountries> getNationalityCountries() {
    return nationalityCountries;
  }
  public void setNationalityCountries(List<HitsNationalityCountries> nationalityCountries) {
    this.nationalityCountries = nationalityCountries;
  }

  /**
   **/
  public Hits position(String position) {
    this.position = position;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("position")
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }

  /**
   **/
  public Hits score(Integer score) {
    this.score = score;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }

  /**
   **/
  public Hits scoreFactors(List<HitsScoreFactors> scoreFactors) {
    this.scoreFactors = scoreFactors;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scoreFactors")
  public List<HitsScoreFactors> getScoreFactors() {
    return scoreFactors;
  }
  public void setScoreFactors(List<HitsScoreFactors> scoreFactors) {
    this.scoreFactors = scoreFactors;
  }

  /**
   **/
  public Hits title(String title) {
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

  /**
   **/
  public Hits type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hits hits = (Hits) o;
    return Objects.equals(additionalInfo, hits.additionalInfo) &&
        Objects.equals(addresses, hits.addresses) &&
        Objects.equals(aliases, hits.aliases) &&
        Objects.equals(categories, hits.categories) &&
        Objects.equals(countriesOfBirth, hits.countriesOfBirth) &&
        Objects.equals(datesOfBirth, hits.datesOfBirth) &&
        Objects.equals(deceasedDate, hits.deceasedDate) &&
        Objects.equals(entryCreatedDate, hits.entryCreatedDate) &&
        Objects.equals(entryUpdateDate, hits.entryUpdateDate) &&
        Objects.equals(gender, hits.gender) &&
        Objects.equals(keywords, hits.keywords) &&
        Objects.equals(listEntryKey, hits.listEntryKey) &&
        Objects.equals(listId, hits.listId) &&
        Objects.equals(listUpdateDate, hits.listUpdateDate) &&
        Objects.equals(ids, hits.ids) &&
        Objects.equals(matchType, hits.matchType) &&
        Objects.equals(names, hits.names) &&
        Objects.equals(nationalityCountries, hits.nationalityCountries) &&
        Objects.equals(position, hits.position) &&
        Objects.equals(score, hits.score) &&
        Objects.equals(scoreFactors, hits.scoreFactors) &&
        Objects.equals(title, hits.title) &&
        Objects.equals(type, hits.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, addresses, aliases, categories, countriesOfBirth, datesOfBirth, deceasedDate, entryCreatedDate, entryUpdateDate, gender, keywords, listEntryKey, listId, listUpdateDate, ids, matchType, names, nationalityCountries, position, score, scoreFactors, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hits {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    countriesOfBirth: ").append(toIndentedString(countriesOfBirth)).append("\n");
    sb.append("    datesOfBirth: ").append(toIndentedString(datesOfBirth)).append("\n");
    sb.append("    deceasedDate: ").append(toIndentedString(deceasedDate)).append("\n");
    sb.append("    entryCreatedDate: ").append(toIndentedString(entryCreatedDate)).append("\n");
    sb.append("    entryUpdateDate: ").append(toIndentedString(entryUpdateDate)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    listEntryKey: ").append(toIndentedString(listEntryKey)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    listUpdateDate: ").append(toIndentedString(listUpdateDate)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    nationalityCountries: ").append(toIndentedString(nationalityCountries)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    scoreFactors: ").append(toIndentedString(scoreFactors)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

