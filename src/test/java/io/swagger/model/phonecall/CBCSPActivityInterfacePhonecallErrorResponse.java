package io.swagger.model.phonecall;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class CBCSPActivityInterfacePhonecallErrorResponse   {
  
  private List<CBCSPActivityDocError> errors = new ArrayList<CBCSPActivityDocError>();

  /**
   **/
  public CBCSPActivityInterfacePhonecallErrorResponse errors(List<CBCSPActivityDocError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("errors")
  public List<CBCSPActivityDocError> getErrors() {
    return errors;
  }
  public void setErrors(List<CBCSPActivityDocError> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CBCSPActivityInterfacePhonecallErrorResponse cbCSPActivityInterfacePhonecallErrorResponse = (CBCSPActivityInterfacePhonecallErrorResponse) o;
    return Objects.equals(errors, cbCSPActivityInterfacePhonecallErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CBCSPActivityInterfacePhonecallErrorResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

