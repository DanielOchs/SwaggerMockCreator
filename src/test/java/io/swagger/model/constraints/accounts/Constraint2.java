package io.swagger.model.constraints.accounts;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Constraint2   {
  
  private String category = null;
  private String type = null;
  private String typeLabelShort = null;
  private String typeLabel = null;
  private String startDate = null;
  private String endDate = null;
  private DebitCardIssuance debitCardIssuance = null;
  private ImmediateAuthorisation immediateAuthorisation = null;
  private AccountTermination accountTermination = null;

  /**
   * Constraint Category (value &#39;O&#39; for all account constraints).  FDTE: SPTYP.
   **/
  public Constraint2 category(String category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Constraint Category (value 'O' for all account constraints).  FDTE: SPTYP.")
  @JsonProperty("category")
  @NotNull
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Constraint type.  FDTE: SPTYPAUS.
   **/
  public Constraint2 type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Constraint type.  FDTE: SPTYPAUS.")
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Constraint type label (short term).  FDTE: SPTYPTXT.
   **/
  public Constraint2 typeLabelShort(String typeLabelShort) {
    this.typeLabelShort = typeLabelShort;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Constraint type label (short term).  FDTE: SPTYPTXT.")
  @JsonProperty("typeLabelShort")
  @NotNull
  public String getTypeLabelShort() {
    return typeLabelShort;
  }
  public void setTypeLabelShort(String typeLabelShort) {
    this.typeLabelShort = typeLabelShort;
  }

  /**
   * Constraint type label.  FDTE: SPTYPBEZ.
   **/
  public Constraint2 typeLabel(String typeLabel) {
    this.typeLabel = typeLabel;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Constraint type label.  FDTE: SPTYPBEZ.")
  @JsonProperty("typeLabel")
  @NotNull
  public String getTypeLabel() {
    return typeLabel;
  }
  public void setTypeLabel(String typeLabel) {
    this.typeLabel = typeLabel;
  }

  /**
   * Constraint start date.  FDTE: KTSPGVON.
   **/
  public Constraint2 startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Constraint start date.  FDTE: KTSPGVON.")
  @JsonProperty("startDate")
  @NotNull
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Constraint end date.  FDTE: KTSPGBIS.  Remark: In case of &#39;until further notice&#39; the value will be stated as &#39;9999-12-31&#39;.
   **/
  public Constraint2 endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Constraint end date.  FDTE: KTSPGBIS.  Remark: In case of 'until further notice' the value will be stated as '9999-12-31'.")
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
  public Constraint2 debitCardIssuance(DebitCardIssuance debitCardIssuance) {
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
  public Constraint2 immediateAuthorisation(ImmediateAuthorisation immediateAuthorisation) {
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
  public Constraint2 accountTermination(AccountTermination accountTermination) {
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
    Constraint2 constraint2 = (Constraint2) o;
    return Objects.equals(category, constraint2.category) &&
        Objects.equals(type, constraint2.type) &&
        Objects.equals(typeLabelShort, constraint2.typeLabelShort) &&
        Objects.equals(typeLabel, constraint2.typeLabel) &&
        Objects.equals(startDate, constraint2.startDate) &&
        Objects.equals(endDate, constraint2.endDate) &&
        Objects.equals(debitCardIssuance, constraint2.debitCardIssuance) &&
        Objects.equals(immediateAuthorisation, constraint2.immediateAuthorisation) &&
        Objects.equals(accountTermination, constraint2.accountTermination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, type, typeLabelShort, typeLabel, startDate, endDate, debitCardIssuance, immediateAuthorisation, accountTermination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Constraint2 {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeLabelShort: ").append(toIndentedString(typeLabelShort)).append("\n");
    sb.append("    typeLabel: ").append(toIndentedString(typeLabel)).append("\n");
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

