package io.swagger.model.payments;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class Links  {
  
  @ApiModelProperty(value = "A link to an ASPSP site where SCA is performed within the Redirect SCA approach.")
 /**
   * A link to an ASPSP site where SCA is performed within the Redirect SCA approach.  
  **/
  private String redirect = null;

  @ApiModelProperty(value = "The link to the payment initiation or account information resource, which needs to be updated by the psu identification if not delivered yet.")
 /**
   * The link to the payment initiation or account information resource, which needs to be updated by the psu identification if not delivered yet.  
  **/
  private String updatePsuIdentification = null;

  @ApiModelProperty(value = "The link to the payment initiation or account information resource, which needs to be updated by a psu password and eventually the psu identification if not delivered yet.")
 /**
   * The link to the payment initiation or account information resource, which needs to be updated by a psu password and eventually the psu identification if not delivered yet.  
  **/
  private String updatePsuAuthentication = null;

  @ApiModelProperty(value = "This is a link to a resource, where the TPP can select the applicable second factor authentication methods for the PSU, if there were several available authentication methods.")
 /**
   * This is a link to a resource, where the TPP can select the applicable second factor authentication methods for the PSU, if there were several available authentication methods.  
  **/
  private String selectAuthenticationMethod = null;

  @ApiModelProperty(value = "The link to the payment initiation or consent resource, where the “Transaction Authorization”Request“ is sent to. This is the link to the resource which will authorize the payment or the consent by checking the SCA authentication data within the Embedded SCA approach.")
 /**
   * The link to the payment initiation or consent resource, where the “Transaction Authorization”Request“ is sent to. This is the link to the resource which will authorize the payment or the consent by checking the SCA authentication data within the Embedded SCA approach.  
  **/
  private String authoriseTransaction = null;

  @ApiModelProperty(value = "The link to the payment initiation resource created by the request itself. This link can be used later to retrieve the transaction status of the payment initiation.")
 /**
   * The link to the payment initiation resource created by the request itself. This link can be used later to retrieve the transaction status of the payment initiation.  
  **/
  private String self = null;

  @ApiModelProperty(value = "")
  private String status = null;

  @ApiModelProperty(value = "")
  private String accountLink = null;

  @ApiModelProperty(value = "A link to the resource providing the balance of a dedicated account.")
 /**
   * A link to the resource providing the balance of a dedicated account.  
  **/
  private String balances = null;

  @ApiModelProperty(value = "A link to the resource providing the transaction history of a dediated amount.")
 /**
   * A link to the resource providing the transaction history of a dediated amount.  
  **/
  private String transactions = null;

  @ApiModelProperty(value = "Navigation link for account reports.")
 /**
   * Navigation link for account reports.  
  **/
  private String firstPageLink = null;

  @ApiModelProperty(value = "Navigation link for account reports.")
 /**
   * Navigation link for account reports.  
  **/
  private String secondPageLink = null;

  @ApiModelProperty(value = "Navigation link for account reports.")
 /**
   * Navigation link for account reports.  
  **/
  private String currentPageLink = null;

  @ApiModelProperty(value = "Navigation link for account reports.")
 /**
   * Navigation link for account reports.  
  **/
  private String lastPageLink = null;
 /**
   * A link to an ASPSP site where SCA is performed within the Redirect SCA approach.
   * @return redirect
  **/
  @JsonProperty("redirect")
  public String getRedirect() {
    return redirect;
  }

  public void setRedirect(String redirect) {
    this.redirect = redirect;
  }

  public Links redirect(String redirect) {
    this.redirect = redirect;
    return this;
  }

 /**
   * The link to the payment initiation or account information resource, which needs to be updated by the psu identification if not delivered yet.
   * @return updatePsuIdentification
  **/
  @JsonProperty("update_psu_identification")
  public String getUpdatePsuIdentification() {
    return updatePsuIdentification;
  }

  public void setUpdatePsuIdentification(String updatePsuIdentification) {
    this.updatePsuIdentification = updatePsuIdentification;
  }

  public Links updatePsuIdentification(String updatePsuIdentification) {
    this.updatePsuIdentification = updatePsuIdentification;
    return this;
  }

 /**
   * The link to the payment initiation or account information resource, which needs to be updated by a psu password and eventually the psu identification if not delivered yet.
   * @return updatePsuAuthentication
  **/
  @JsonProperty("update_psu_authentication")
  public String getUpdatePsuAuthentication() {
    return updatePsuAuthentication;
  }

  public void setUpdatePsuAuthentication(String updatePsuAuthentication) {
    this.updatePsuAuthentication = updatePsuAuthentication;
  }

  public Links updatePsuAuthentication(String updatePsuAuthentication) {
    this.updatePsuAuthentication = updatePsuAuthentication;
    return this;
  }

 /**
   * This is a link to a resource, where the TPP can select the applicable second factor authentication methods for the PSU, if there were several available authentication methods.
   * @return selectAuthenticationMethod
  **/
  @JsonProperty("select_authentication_method")
  public String getSelectAuthenticationMethod() {
    return selectAuthenticationMethod;
  }

  public void setSelectAuthenticationMethod(String selectAuthenticationMethod) {
    this.selectAuthenticationMethod = selectAuthenticationMethod;
  }

  public Links selectAuthenticationMethod(String selectAuthenticationMethod) {
    this.selectAuthenticationMethod = selectAuthenticationMethod;
    return this;
  }

 /**
   * The link to the payment initiation or consent resource, where the “Transaction Authorization”Request“ is sent to. This is the link to the resource which will authorize the payment or the consent by checking the SCA authentication data within the Embedded SCA approach.
   * @return authoriseTransaction
  **/
  @JsonProperty("authorise_transaction")
  public String getAuthoriseTransaction() {
    return authoriseTransaction;
  }

  public void setAuthoriseTransaction(String authoriseTransaction) {
    this.authoriseTransaction = authoriseTransaction;
  }

  public Links authoriseTransaction(String authoriseTransaction) {
    this.authoriseTransaction = authoriseTransaction;
    return this;
  }

 /**
   * The link to the payment initiation resource created by the request itself. This link can be used later to retrieve the transaction status of the payment initiation.
   * @return self
  **/
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public Links self(String self) {
    this.self = self;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Links status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get accountLink
   * @return accountLink
  **/
  @JsonProperty("account-link")
  public String getAccountLink() {
    return accountLink;
  }

  public void setAccountLink(String accountLink) {
    this.accountLink = accountLink;
  }

  public Links accountLink(String accountLink) {
    this.accountLink = accountLink;
    return this;
  }

 /**
   * A link to the resource providing the balance of a dedicated account.
   * @return balances
  **/
  @JsonProperty("balances")
  public String getBalances() {
    return balances;
  }

  public void setBalances(String balances) {
    this.balances = balances;
  }

  public Links balances(String balances) {
    this.balances = balances;
    return this;
  }

 /**
   * A link to the resource providing the transaction history of a dediated amount.
   * @return transactions
  **/
  @JsonProperty("transactions")
  public String getTransactions() {
    return transactions;
  }

  public void setTransactions(String transactions) {
    this.transactions = transactions;
  }

  public Links transactions(String transactions) {
    this.transactions = transactions;
    return this;
  }

 /**
   * Navigation link for account reports.
   * @return firstPageLink
  **/
  @JsonProperty("first_page_link")
  public String getFirstPageLink() {
    return firstPageLink;
  }

  public void setFirstPageLink(String firstPageLink) {
    this.firstPageLink = firstPageLink;
  }

  public Links firstPageLink(String firstPageLink) {
    this.firstPageLink = firstPageLink;
    return this;
  }

 /**
   * Navigation link for account reports.
   * @return secondPageLink
  **/
  @JsonProperty("second_page_link")
  public String getSecondPageLink() {
    return secondPageLink;
  }

  public void setSecondPageLink(String secondPageLink) {
    this.secondPageLink = secondPageLink;
  }

  public Links secondPageLink(String secondPageLink) {
    this.secondPageLink = secondPageLink;
    return this;
  }

 /**
   * Navigation link for account reports.
   * @return currentPageLink
  **/
  @JsonProperty("current_page_link")
  public String getCurrentPageLink() {
    return currentPageLink;
  }

  public void setCurrentPageLink(String currentPageLink) {
    this.currentPageLink = currentPageLink;
  }

  public Links currentPageLink(String currentPageLink) {
    this.currentPageLink = currentPageLink;
    return this;
  }

 /**
   * Navigation link for account reports.
   * @return lastPageLink
  **/
  @JsonProperty("last_page_link")
  public String getLastPageLink() {
    return lastPageLink;
  }

  public void setLastPageLink(String lastPageLink) {
    this.lastPageLink = lastPageLink;
  }

  public Links lastPageLink(String lastPageLink) {
    this.lastPageLink = lastPageLink;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    updatePsuIdentification: ").append(toIndentedString(updatePsuIdentification)).append("\n");
    sb.append("    updatePsuAuthentication: ").append(toIndentedString(updatePsuAuthentication)).append("\n");
    sb.append("    selectAuthenticationMethod: ").append(toIndentedString(selectAuthenticationMethod)).append("\n");
    sb.append("    authoriseTransaction: ").append(toIndentedString(authoriseTransaction)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    accountLink: ").append(toIndentedString(accountLink)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    firstPageLink: ").append(toIndentedString(firstPageLink)).append("\n");
    sb.append("    secondPageLink: ").append(toIndentedString(secondPageLink)).append("\n");
    sb.append("    currentPageLink: ").append(toIndentedString(currentPageLink)).append("\n");
    sb.append("    lastPageLink: ").append(toIndentedString(lastPageLink)).append("\n");
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

