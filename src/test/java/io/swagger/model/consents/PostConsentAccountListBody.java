package io.swagger.model.consents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostConsentAccountListBody  {
  
  @ApiModelProperty(value = "If the value equals â€œtrueâ€�, then the consent request is on the list of all payment accounts inclusive the balance. If the value equals â€œfalseâ€�, then the consent request is on the list of accounts only.")
 /**
   * If the value equals â€œtrueâ€�, then the consent request is on the list of all payment accounts inclusive the balance. If the value equals â€œfalseâ€�, then the consent request is on the list of accounts only.  
  **/
  private Boolean withBalance = null;
 /**
   * If the value equals â€œtrueâ€�, then the consent request is on the list of all payment accounts inclusive the balance. If the value equals â€œfalseâ€�, then the consent request is on the list of accounts only.
   * @return withBalance
  **/
  @JsonProperty("with-balance")
  public Boolean isWithBalance() {
    return withBalance;
  }

  public void setWithBalance(Boolean withBalance) {
    this.withBalance = withBalance;
  }

  public PostConsentAccountListBody withBalance(Boolean withBalance) {
    this.withBalance = withBalance;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostConsentAccountListBody {\n");
    
    sb.append("    withBalance: ").append(toIndentedString(withBalance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

