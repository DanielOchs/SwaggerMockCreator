package io.swagger.model.actimize.wlf;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class PersonBlackListQuery   {
  
  private Person person = null;

  /**
   **/
  public PersonBlackListQuery person(Person person) {
    this.person = person;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("person")
  @NotNull
  public Person getPerson() {
    return person;
  }
  public void setPerson(Person person) {
    this.person = person;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonBlackListQuery personBlackListQuery = (PersonBlackListQuery) o;
    return Objects.equals(person, personBlackListQuery.person);
  }

  @Override
  public int hashCode() {
    return Objects.hash(person);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonBlackListQuery {\n");
    
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
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

