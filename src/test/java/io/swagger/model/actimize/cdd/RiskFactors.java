package io.swagger.model.actimize.cdd;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class RiskFactors   {
  
  private String companyHasPEP = null;
  private String intransparentOwnershipStructure = null;
  private String negativeNews = null;
  private String santionsandEmbargos = null;
  private String suspiciousSourceOfFunds = null;
  private String unusualClientBehavior = null;
  private RiskFactorsBearerShares bearerShares = null;
  private String specialRiskIndustries = null;
  private String customerType = null;
  private String industry = null;
  private String legalForm = null;
  private String countryOfResidence = null;
  private String countryOfIncorporation = null;
  private RiskFactorsUBO UBO = null;
  private String countryOfOperations = null;
  private String products = null;
  private String lengthOfRelationship = null;
  private String deliveryChannel = null;
  private String cashTransactionAmount = null;
  private String top5countries = null;
  private String wireTransactionAmount = null;

  /**
   **/
  public RiskFactors companyHasPEP(String companyHasPEP) {
    this.companyHasPEP = companyHasPEP;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CompanyHasPEP")
  public String getCompanyHasPEP() {
    return companyHasPEP;
  }
  public void setCompanyHasPEP(String companyHasPEP) {
    this.companyHasPEP = companyHasPEP;
  }

  /**
   **/
  public RiskFactors intransparentOwnershipStructure(String intransparentOwnershipStructure) {
    this.intransparentOwnershipStructure = intransparentOwnershipStructure;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("IntransparentOwnershipStructure")
  public String getIntransparentOwnershipStructure() {
    return intransparentOwnershipStructure;
  }
  public void setIntransparentOwnershipStructure(String intransparentOwnershipStructure) {
    this.intransparentOwnershipStructure = intransparentOwnershipStructure;
  }

  /**
   **/
  public RiskFactors negativeNews(String negativeNews) {
    this.negativeNews = negativeNews;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("NegativeNews")
  public String getNegativeNews() {
    return negativeNews;
  }
  public void setNegativeNews(String negativeNews) {
    this.negativeNews = negativeNews;
  }

  /**
   **/
  public RiskFactors santionsandEmbargos(String santionsandEmbargos) {
    this.santionsandEmbargos = santionsandEmbargos;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("SantionsandEmbargos")
  public String getSantionsandEmbargos() {
    return santionsandEmbargos;
  }
  public void setSantionsandEmbargos(String santionsandEmbargos) {
    this.santionsandEmbargos = santionsandEmbargos;
  }

  /**
   **/
  public RiskFactors suspiciousSourceOfFunds(String suspiciousSourceOfFunds) {
    this.suspiciousSourceOfFunds = suspiciousSourceOfFunds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("SuspiciousSourceOfFunds")
  public String getSuspiciousSourceOfFunds() {
    return suspiciousSourceOfFunds;
  }
  public void setSuspiciousSourceOfFunds(String suspiciousSourceOfFunds) {
    this.suspiciousSourceOfFunds = suspiciousSourceOfFunds;
  }

  /**
   **/
  public RiskFactors unusualClientBehavior(String unusualClientBehavior) {
    this.unusualClientBehavior = unusualClientBehavior;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("UnusualClientBehavior")
  public String getUnusualClientBehavior() {
    return unusualClientBehavior;
  }
  public void setUnusualClientBehavior(String unusualClientBehavior) {
    this.unusualClientBehavior = unusualClientBehavior;
  }

  /**
   **/
  public RiskFactors bearerShares(RiskFactorsBearerShares bearerShares) {
    this.bearerShares = bearerShares;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("BearerShares")
  public RiskFactorsBearerShares getBearerShares() {
    return bearerShares;
  }
  public void setBearerShares(RiskFactorsBearerShares bearerShares) {
    this.bearerShares = bearerShares;
  }

  /**
   **/
  public RiskFactors specialRiskIndustries(String specialRiskIndustries) {
    this.specialRiskIndustries = specialRiskIndustries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Special_Risk_Industries")
  public String getSpecialRiskIndustries() {
    return specialRiskIndustries;
  }
  public void setSpecialRiskIndustries(String specialRiskIndustries) {
    this.specialRiskIndustries = specialRiskIndustries;
  }

  /**
   **/
  public RiskFactors customerType(String customerType) {
    this.customerType = customerType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Customer_Type")
  public String getCustomerType() {
    return customerType;
  }
  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }

  /**
   **/
  public RiskFactors industry(String industry) {
    this.industry = industry;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Industry")
  public String getIndustry() {
    return industry;
  }
  public void setIndustry(String industry) {
    this.industry = industry;
  }

  /**
   **/
  public RiskFactors legalForm(String legalForm) {
    this.legalForm = legalForm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Legal_Form")
  public String getLegalForm() {
    return legalForm;
  }
  public void setLegalForm(String legalForm) {
    this.legalForm = legalForm;
  }

  /**
   **/
  public RiskFactors countryOfResidence(String countryOfResidence) {
    this.countryOfResidence = countryOfResidence;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CountryOfResidence")
  public String getCountryOfResidence() {
    return countryOfResidence;
  }
  public void setCountryOfResidence(String countryOfResidence) {
    this.countryOfResidence = countryOfResidence;
  }

  /**
   **/
  public RiskFactors countryOfIncorporation(String countryOfIncorporation) {
    this.countryOfIncorporation = countryOfIncorporation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CountryOfIncorporation")
  public String getCountryOfIncorporation() {
    return countryOfIncorporation;
  }
  public void setCountryOfIncorporation(String countryOfIncorporation) {
    this.countryOfIncorporation = countryOfIncorporation;
  }

  /**
   **/
  public RiskFactors UBO(RiskFactorsUBO UBO) {
    this.UBO = UBO;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("UBO")
  public RiskFactorsUBO getUBO() {
    return UBO;
  }
  public void setUBO(RiskFactorsUBO UBO) {
    this.UBO = UBO;
  }

  /**
   **/
  public RiskFactors countryOfOperations(String countryOfOperations) {
    this.countryOfOperations = countryOfOperations;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CountryOfOperations")
  public String getCountryOfOperations() {
    return countryOfOperations;
  }
  public void setCountryOfOperations(String countryOfOperations) {
    this.countryOfOperations = countryOfOperations;
  }

  /**
   **/
  public RiskFactors products(String products) {
    this.products = products;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Products")
  public String getProducts() {
    return products;
  }
  public void setProducts(String products) {
    this.products = products;
  }

  /**
   **/
  public RiskFactors lengthOfRelationship(String lengthOfRelationship) {
    this.lengthOfRelationship = lengthOfRelationship;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("LengthOfRelationship")
  public String getLengthOfRelationship() {
    return lengthOfRelationship;
  }
  public void setLengthOfRelationship(String lengthOfRelationship) {
    this.lengthOfRelationship = lengthOfRelationship;
  }

  /**
   **/
  public RiskFactors deliveryChannel(String deliveryChannel) {
    this.deliveryChannel = deliveryChannel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliveryChannel")
  public String getDeliveryChannel() {
    return deliveryChannel;
  }
  public void setDeliveryChannel(String deliveryChannel) {
    this.deliveryChannel = deliveryChannel;
  }

  /**
   **/
  public RiskFactors cashTransactionAmount(String cashTransactionAmount) {
    this.cashTransactionAmount = cashTransactionAmount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cashTransactionAmount")
  public String getCashTransactionAmount() {
    return cashTransactionAmount;
  }
  public void setCashTransactionAmount(String cashTransactionAmount) {
    this.cashTransactionAmount = cashTransactionAmount;
  }

  /**
   **/
  public RiskFactors top5countries(String top5countries) {
    this.top5countries = top5countries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("top5countries")
  public String getTop5countries() {
    return top5countries;
  }
  public void setTop5countries(String top5countries) {
    this.top5countries = top5countries;
  }

  /**
   **/
  public RiskFactors wireTransactionAmount(String wireTransactionAmount) {
    this.wireTransactionAmount = wireTransactionAmount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("wireTransactionAmount")
  public String getWireTransactionAmount() {
    return wireTransactionAmount;
  }
  public void setWireTransactionAmount(String wireTransactionAmount) {
    this.wireTransactionAmount = wireTransactionAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskFactors riskFactors = (RiskFactors) o;
    return Objects.equals(companyHasPEP, riskFactors.companyHasPEP) &&
        Objects.equals(intransparentOwnershipStructure, riskFactors.intransparentOwnershipStructure) &&
        Objects.equals(negativeNews, riskFactors.negativeNews) &&
        Objects.equals(santionsandEmbargos, riskFactors.santionsandEmbargos) &&
        Objects.equals(suspiciousSourceOfFunds, riskFactors.suspiciousSourceOfFunds) &&
        Objects.equals(unusualClientBehavior, riskFactors.unusualClientBehavior) &&
        Objects.equals(bearerShares, riskFactors.bearerShares) &&
        Objects.equals(specialRiskIndustries, riskFactors.specialRiskIndustries) &&
        Objects.equals(customerType, riskFactors.customerType) &&
        Objects.equals(industry, riskFactors.industry) &&
        Objects.equals(legalForm, riskFactors.legalForm) &&
        Objects.equals(countryOfResidence, riskFactors.countryOfResidence) &&
        Objects.equals(countryOfIncorporation, riskFactors.countryOfIncorporation) &&
        Objects.equals(UBO, riskFactors.UBO) &&
        Objects.equals(countryOfOperations, riskFactors.countryOfOperations) &&
        Objects.equals(products, riskFactors.products) &&
        Objects.equals(lengthOfRelationship, riskFactors.lengthOfRelationship) &&
        Objects.equals(deliveryChannel, riskFactors.deliveryChannel) &&
        Objects.equals(cashTransactionAmount, riskFactors.cashTransactionAmount) &&
        Objects.equals(top5countries, riskFactors.top5countries) &&
        Objects.equals(wireTransactionAmount, riskFactors.wireTransactionAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyHasPEP, intransparentOwnershipStructure, negativeNews, santionsandEmbargos, suspiciousSourceOfFunds, unusualClientBehavior, bearerShares, specialRiskIndustries, customerType, industry, legalForm, countryOfResidence, countryOfIncorporation, UBO, countryOfOperations, products, lengthOfRelationship, deliveryChannel, cashTransactionAmount, top5countries, wireTransactionAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskFactors {\n");
    
    sb.append("    companyHasPEP: ").append(toIndentedString(companyHasPEP)).append("\n");
    sb.append("    intransparentOwnershipStructure: ").append(toIndentedString(intransparentOwnershipStructure)).append("\n");
    sb.append("    negativeNews: ").append(toIndentedString(negativeNews)).append("\n");
    sb.append("    santionsandEmbargos: ").append(toIndentedString(santionsandEmbargos)).append("\n");
    sb.append("    suspiciousSourceOfFunds: ").append(toIndentedString(suspiciousSourceOfFunds)).append("\n");
    sb.append("    unusualClientBehavior: ").append(toIndentedString(unusualClientBehavior)).append("\n");
    sb.append("    bearerShares: ").append(toIndentedString(bearerShares)).append("\n");
    sb.append("    specialRiskIndustries: ").append(toIndentedString(specialRiskIndustries)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    legalForm: ").append(toIndentedString(legalForm)).append("\n");
    sb.append("    countryOfResidence: ").append(toIndentedString(countryOfResidence)).append("\n");
    sb.append("    countryOfIncorporation: ").append(toIndentedString(countryOfIncorporation)).append("\n");
    sb.append("    UBO: ").append(toIndentedString(UBO)).append("\n");
    sb.append("    countryOfOperations: ").append(toIndentedString(countryOfOperations)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    lengthOfRelationship: ").append(toIndentedString(lengthOfRelationship)).append("\n");
    sb.append("    deliveryChannel: ").append(toIndentedString(deliveryChannel)).append("\n");
    sb.append("    cashTransactionAmount: ").append(toIndentedString(cashTransactionAmount)).append("\n");
    sb.append("    top5countries: ").append(toIndentedString(top5countries)).append("\n");
    sb.append("    wireTransactionAmount: ").append(toIndentedString(wireTransactionAmount)).append("\n");
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

