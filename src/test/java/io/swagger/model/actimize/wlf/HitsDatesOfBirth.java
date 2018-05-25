package io.swagger.model.actimize.wlf;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class HitsDatesOfBirth   {
  
  private Integer dateOfBirth = null;

  /**
   **/
  public HitsDatesOfBirth dateOfBirth(Integer dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dateOfBirth")
  public Integer getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(Integer dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HitsDatesOfBirth hitsDatesOfBirth = (HitsDatesOfBirth) o;
    return Objects.equals(dateOfBirth, hitsDatesOfBirth.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HitsDatesOfBirth {\n");
    
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

