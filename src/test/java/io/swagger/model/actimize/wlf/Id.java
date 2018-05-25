package io.swagger.model.actimize.wlf;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ID information
 **/
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "ID information")

public class Id   {
  
  private String country = null;
  private String type = null;
  private String idValue = null;

  /**
   **/
  public Id country(String country) {
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
  public Id type(String type) {
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

  /**
   **/
  public Id idValue(String idValue) {
    this.idValue = idValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("idValue")
  public String getIdValue() {
    return idValue;
  }
  public void setIdValue(String idValue) {
    this.idValue = idValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Id id = (Id) o;
    return Objects.equals(country, id.country) &&
        Objects.equals(type, id.type) &&
        Objects.equals(idValue, id.idValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, type, idValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Id {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    idValue: ").append(toIndentedString(idValue)).append("\n");
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

