package io.swagger.model.actimize.wlf;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A person
 **/
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "A person")

public class Person   {
  
  private String requestId = null;
  private String searchDefinitionId = null;
  private HitsAliases names = null;
  private PersonPersonData personData = null;
  private List<Address> addresses = new ArrayList<Address>();
  private List<Id> ids = new ArrayList<Id>();

  /**
   **/
  public Person requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   **/
  public Person searchDefinitionId(String searchDefinitionId) {
    this.searchDefinitionId = searchDefinitionId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("searchDefinitionId")
  public String getSearchDefinitionId() {
    return searchDefinitionId;
  }
  public void setSearchDefinitionId(String searchDefinitionId) {
    this.searchDefinitionId = searchDefinitionId;
  }

  /**
   **/
  public Person names(HitsAliases names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("names")
  public HitsAliases getNames() {
    return names;
  }
  public void setNames(HitsAliases names) {
    this.names = names;
  }

  /**
   **/
  public Person personData(PersonPersonData personData) {
    this.personData = personData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("personData")
  public PersonPersonData getPersonData() {
    return personData;
  }
  public void setPersonData(PersonPersonData personData) {
    this.personData = personData;
  }

  /**
   **/
  public Person addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addresses")
  public List<Address> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  /**
   **/
  public Person ids(List<Id> ids) {
    this.ids = ids;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ids")
  public List<Id> getIds() {
    return ids;
  }
  public void setIds(List<Id> ids) {
    this.ids = ids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(requestId, person.requestId) &&
        Objects.equals(searchDefinitionId, person.searchDefinitionId) &&
        Objects.equals(names, person.names) &&
        Objects.equals(personData, person.personData) &&
        Objects.equals(addresses, person.addresses) &&
        Objects.equals(ids, person.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, searchDefinitionId, names, personData, addresses, ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    searchDefinitionId: ").append(toIndentedString(searchDefinitionId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    personData: ").append(toIndentedString(personData)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

