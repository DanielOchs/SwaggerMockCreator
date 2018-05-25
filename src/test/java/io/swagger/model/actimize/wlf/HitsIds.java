package io.swagger.model.actimize.wlf;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class HitsIds   {
  
  private String idCountry = null;
  private String idType = null;
  private String idValue = null;

  /**
   **/
  public HitsIds idCountry(String idCountry) {
    this.idCountry = idCountry;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("idCountry")
  public String getIdCountry() {
    return idCountry;
  }
  public void setIdCountry(String idCountry) {
    this.idCountry = idCountry;
  }

  /**
   **/
  public HitsIds idType(String idType) {
    this.idType = idType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("idType")
  public String getIdType() {
    return idType;
  }
  public void setIdType(String idType) {
    this.idType = idType;
  }

  /**
   **/
  public HitsIds idValue(String idValue) {
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
    HitsIds hitsIds = (HitsIds) o;
    return Objects.equals(idCountry, hitsIds.idCountry) &&
        Objects.equals(idType, hitsIds.idType) &&
        Objects.equals(idValue, hitsIds.idValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCountry, idType, idValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HitsIds {\n");
    
    sb.append("    idCountry: ").append(toIndentedString(idCountry)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
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

