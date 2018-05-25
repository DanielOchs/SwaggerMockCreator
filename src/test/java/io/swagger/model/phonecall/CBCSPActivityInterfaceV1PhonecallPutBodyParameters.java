package io.swagger.model.phonecall;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class CBCSPActivityInterfaceV1PhonecallPutBodyParameters   {
  
  private CBCSPActivityDocPhonecall phonecall = null;

  /**
   **/
  public CBCSPActivityInterfaceV1PhonecallPutBodyParameters phonecall(CBCSPActivityDocPhonecall phonecall) {
    this.phonecall = phonecall;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("Phonecall")
  @NotNull
  public CBCSPActivityDocPhonecall getPhonecall() {
    return phonecall;
  }
  public void setPhonecall(CBCSPActivityDocPhonecall phonecall) {
    this.phonecall = phonecall;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CBCSPActivityInterfaceV1PhonecallPutBodyParameters cbCSPActivityInterfaceV1PhonecallPutBodyParameters = (CBCSPActivityInterfaceV1PhonecallPutBodyParameters) o;
    return Objects.equals(phonecall, cbCSPActivityInterfaceV1PhonecallPutBodyParameters.phonecall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phonecall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CBCSPActivityInterfaceV1PhonecallPutBodyParameters {\n");
    
    sb.append("    phonecall: ").append(toIndentedString(phonecall)).append("\n");
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

