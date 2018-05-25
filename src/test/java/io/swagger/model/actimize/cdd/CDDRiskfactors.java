package io.swagger.model.actimize.cdd;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class CDDRiskfactors   {
  
  private String sourceID = null;
  private String evaluationOnly = null;
  private String manualRiskOverwriteTo = null;
  private Customer customer = null;
  private RiskFactors riskFactors = null;

  /**
   **/
  public CDDRiskfactors sourceID(String sourceID) {
    this.sourceID = sourceID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("SourceID")
  public String getSourceID() {
    return sourceID;
  }
  public void setSourceID(String sourceID) {
    this.sourceID = sourceID;
  }

  /**
   **/
  public CDDRiskfactors evaluationOnly(String evaluationOnly) {
    this.evaluationOnly = evaluationOnly;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("EvaluationOnly")
  public String getEvaluationOnly() {
    return evaluationOnly;
  }
  public void setEvaluationOnly(String evaluationOnly) {
    this.evaluationOnly = evaluationOnly;
  }

  /**
   **/
  public CDDRiskfactors manualRiskOverwriteTo(String manualRiskOverwriteTo) {
    this.manualRiskOverwriteTo = manualRiskOverwriteTo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ManualRiskOverwriteTo")
  public String getManualRiskOverwriteTo() {
    return manualRiskOverwriteTo;
  }
  public void setManualRiskOverwriteTo(String manualRiskOverwriteTo) {
    this.manualRiskOverwriteTo = manualRiskOverwriteTo;
  }

  /**
   **/
  public CDDRiskfactors customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("customer")
  @NotNull
  public Customer getCustomer() {
    return customer;
  }
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   **/
  public CDDRiskfactors riskFactors(RiskFactors riskFactors) {
    this.riskFactors = riskFactors;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("riskFactors")
  public RiskFactors getRiskFactors() {
    return riskFactors;
  }
  public void setRiskFactors(RiskFactors riskFactors) {
    this.riskFactors = riskFactors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CDDRiskfactors cdDRiskfactors = (CDDRiskfactors) o;
    return Objects.equals(sourceID, cdDRiskfactors.sourceID) &&
        Objects.equals(evaluationOnly, cdDRiskfactors.evaluationOnly) &&
        Objects.equals(manualRiskOverwriteTo, cdDRiskfactors.manualRiskOverwriteTo) &&
        Objects.equals(customer, cdDRiskfactors.customer) &&
        Objects.equals(riskFactors, cdDRiskfactors.riskFactors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceID, evaluationOnly, manualRiskOverwriteTo, customer, riskFactors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CDDRiskfactors {\n");
    
    sb.append("    sourceID: ").append(toIndentedString(sourceID)).append("\n");
    sb.append("    evaluationOnly: ").append(toIndentedString(evaluationOnly)).append("\n");
    sb.append("    manualRiskOverwriteTo: ").append(toIndentedString(manualRiskOverwriteTo)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    riskFactors: ").append(toIndentedString(riskFactors)).append("\n");
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

