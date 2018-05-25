package io.swagger.model.constraints.accounts;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class AccountTermination   {
  
  private String processingDirective = null;

  /**
   * Provides a processing directive for handling this constraint while terminating an account. Available values: KLMV1, KLMV2, KLMV3, KLMV4, KLMV5, KLMV6
   **/
  public AccountTermination processingDirective(String processingDirective) {
    this.processingDirective = processingDirective;
    return this;
  }

  
  @ApiModelProperty(value = "Provides a processing directive for handling this constraint while terminating an account. Available values: KLMV1, KLMV2, KLMV3, KLMV4, KLMV5, KLMV6")
  @JsonProperty("processingDirective")
  public String getProcessingDirective() {
    return processingDirective;
  }
  public void setProcessingDirective(String processingDirective) {
    this.processingDirective = processingDirective;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTermination accountTermination = (AccountTermination) o;
    return Objects.equals(processingDirective, accountTermination.processingDirective);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processingDirective);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTermination {\n");
    
    sb.append("    processingDirective: ").append(toIndentedString(processingDirective)).append("\n");
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

