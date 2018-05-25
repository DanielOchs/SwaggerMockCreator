package io.swagger.model.consents;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class SingleAccountAccess  {
  
  @ApiModelProperty(required = true, value = "")
  private AccountReference account = null;

  @ApiModelProperty(required = true, value = "The values ”balance” and \"transactions” are permitted.")
 /**
   * The values ”balance” and \"transactions” are permitted.  
  **/
  private List<String> accessType = new ArrayList<String>();
 /**
   * Get account
   * @return account
  **/
  @JsonProperty("account")
  @NotNull
  public AccountReference getAccount() {
    return account;
  }

  public void setAccount(AccountReference account) {
    this.account = account;
  }

  public SingleAccountAccess account(AccountReference account) {
    this.account = account;
    return this;
  }

 /**
   * The values ”balance” and \&quot;transactions” are permitted.
   * @return accessType
  **/
  @JsonProperty("access-type")
  @NotNull
  public List<String> getAccessType() {
    return accessType;
  }

  public void setAccessType(List<String> accessType) {
    this.accessType = accessType;
  }

  public SingleAccountAccess accessType(List<String> accessType) {
    this.accessType = accessType;
    return this;
  }

  public SingleAccountAccess addAccessTypeItem(String accessTypeItem) {
    this.accessType.add(accessTypeItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleAccountAccess {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
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

