package io.swagger.model.constraints.costumers;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class CustomerConstraint   {
  
  private String accountHolderNo = null;
  private String category = null;
  private String type = null;
  private String typeLabelShort = null;
  private String startDate = null;
  private String endDate = null;
  private DebitCardIssuance debitCardIssuance = null;
  private ImmediateAuthorisation immediateAuthorisation = null;
  private AccountTermination accountTermination = null;

  /**
   * Account holder number (KTOINHNR).
   **/
  public CustomerConstraint accountHolderNo(String accountHolderNo) {
    this.accountHolderNo = accountHolderNo;
    return this;
  }

  
  @ApiModelProperty(value = "Account holder number (KTOINHNR).")
  @JsonProperty("accountHolderNo")
  public String getAccountHolderNo() {
    return accountHolderNo;
  }
  public void setAccountHolderNo(String accountHolderNo) {
    this.accountHolderNo = accountHolderNo;
  }

  /**
   * Constraint category (value &#39;K&#39; for all customer constraints) (SPTYP).
   **/
  public CustomerConstraint category(String category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Constraint category (value 'K' for all customer constraints) (SPTYP).")
  @JsonProperty("category")
  @NotNull
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Constraint type (SPTYPAUS).
   **/
  public CustomerConstraint type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Constraint type (SPTYPAUS).")
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Constraint type label (short term) (SPTYPTXT).
   **/
  public CustomerConstraint typeLabelShort(String typeLabelShort) {
    this.typeLabelShort = typeLabelShort;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Constraint type label (short term) (SPTYPTXT).")
  @JsonProperty("typeLabelShort")
  @NotNull
  public String getTypeLabelShort() {
    return typeLabelShort;
  }
  public void setTypeLabelShort(String typeLabelShort) {
    this.typeLabelShort = typeLabelShort;
  }

  /**
   * Constraint start date (KDSPVON).
   **/
  public CustomerConstraint startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Constraint start date (KDSPVON).")
  @JsonProperty("startDate")
  @NotNull
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Constraint end date (KDSPBIS).  Remark: In case of &#39;until further notice&#39; the value will be stated as &#39;9999-12-31&#39;.
   **/
  public CustomerConstraint endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Constraint end date (KDSPBIS).  Remark: In case of 'until further notice' the value will be stated as '9999-12-31'.")
  @JsonProperty("endDate")
  @NotNull
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Available if QueryParm &#39;group&#39; is set to &#39;debitcardIssuance&#39;.
   **/
  public CustomerConstraint debitCardIssuance(DebitCardIssuance debitCardIssuance) {
    this.debitCardIssuance = debitCardIssuance;
    return this;
  }

  
  @ApiModelProperty(value = "Available if QueryParm 'group' is set to 'debitcardIssuance'.")
  @JsonProperty("debitCardIssuance")
  public DebitCardIssuance getDebitCardIssuance() {
    return debitCardIssuance;
  }
  public void setDebitCardIssuance(DebitCardIssuance debitCardIssuance) {
    this.debitCardIssuance = debitCardIssuance;
  }

  /**
   * Available if QueryParm &#39;group&#39; is set to &#39;immediateAuthorisation&#39;.
   **/
  public CustomerConstraint immediateAuthorisation(ImmediateAuthorisation immediateAuthorisation) {
    this.immediateAuthorisation = immediateAuthorisation;
    return this;
  }

  
  @ApiModelProperty(value = "Available if QueryParm 'group' is set to 'immediateAuthorisation'.")
  @JsonProperty("immediateAuthorisation")
  public ImmediateAuthorisation getImmediateAuthorisation() {
    return immediateAuthorisation;
  }
  public void setImmediateAuthorisation(ImmediateAuthorisation immediateAuthorisation) {
    this.immediateAuthorisation = immediateAuthorisation;
  }

  /**
   * Available if QueryParm &#39;group&#39; is set to &#39;accountTermination&#39;.
   **/
  public CustomerConstraint accountTermination(AccountTermination accountTermination) {
    this.accountTermination = accountTermination;
    return this;
  }

  
  @ApiModelProperty(value = "Available if QueryParm 'group' is set to 'accountTermination'.")
  @JsonProperty("accountTermination")
  public AccountTermination getAccountTermination() {
    return accountTermination;
  }
  public void setAccountTermination(AccountTermination accountTermination) {
    this.accountTermination = accountTermination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerConstraint customerConstraint = (CustomerConstraint) o;
    return Objects.equals(accountHolderNo, customerConstraint.accountHolderNo) &&
        Objects.equals(category, customerConstraint.category) &&
        Objects.equals(type, customerConstraint.type) &&
        Objects.equals(typeLabelShort, customerConstraint.typeLabelShort) &&
        Objects.equals(startDate, customerConstraint.startDate) &&
        Objects.equals(endDate, customerConstraint.endDate) &&
        Objects.equals(debitCardIssuance, customerConstraint.debitCardIssuance) &&
        Objects.equals(immediateAuthorisation, customerConstraint.immediateAuthorisation) &&
        Objects.equals(accountTermination, customerConstraint.accountTermination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderNo, category, type, typeLabelShort, startDate, endDate, debitCardIssuance, immediateAuthorisation, accountTermination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerConstraint {\n");
    
    sb.append("    accountHolderNo: ").append(toIndentedString(accountHolderNo)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeLabelShort: ").append(toIndentedString(typeLabelShort)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    debitCardIssuance: ").append(toIndentedString(debitCardIssuance)).append("\n");
    sb.append("    immediateAuthorisation: ").append(toIndentedString(immediateAuthorisation)).append("\n");
    sb.append("    accountTermination: ").append(toIndentedString(accountTermination)).append("\n");
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

