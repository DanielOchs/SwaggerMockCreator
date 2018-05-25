package io.swagger.model.actimize.cdd;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class CDDRiskfactors1   {
  
  private String sourceId = null;
  private String evaluationOnly = null;
  private String user = null;
  private RiskFactors riskFactors = null;

  /**
   **/
  public CDDRiskfactors1 sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("SourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  /**
   **/
  public CDDRiskfactors1 evaluationOnly(String evaluationOnly) {
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
  public CDDRiskfactors1 user(String user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("User")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  /**
   **/
  public CDDRiskfactors1 riskFactors(RiskFactors riskFactors) {
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
    CDDRiskfactors1 cdDRiskfactors1 = (CDDRiskfactors1) o;
    return Objects.equals(sourceId, cdDRiskfactors1.sourceId) &&
        Objects.equals(evaluationOnly, cdDRiskfactors1.evaluationOnly) &&
        Objects.equals(user, cdDRiskfactors1.user) &&
        Objects.equals(riskFactors, cdDRiskfactors1.riskFactors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, evaluationOnly, user, riskFactors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CDDRiskfactors1 {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    evaluationOnly: ").append(toIndentedString(evaluationOnly)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

