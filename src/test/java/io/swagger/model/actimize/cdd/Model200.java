package io.swagger.model.actimize.cdd;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Model200   {
  
  private String globalRiskLevel = null;
  private Float globalRiskScore = null;
  private Float crRGlobalScoreVersion = null;
  private String calculationDate = null;
  private String autoHighReason = null;

  /**
   **/
  public Model200 globalRiskLevel(String globalRiskLevel) {
    this.globalRiskLevel = globalRiskLevel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("GlobalRiskLevel")
  public String getGlobalRiskLevel() {
    return globalRiskLevel;
  }
  public void setGlobalRiskLevel(String globalRiskLevel) {
    this.globalRiskLevel = globalRiskLevel;
  }

  /**
   **/
  public Model200 globalRiskScore(Float globalRiskScore) {
    this.globalRiskScore = globalRiskScore;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("GlobalRiskScore")
  public Float getGlobalRiskScore() {
    return globalRiskScore;
  }
  public void setGlobalRiskScore(Float globalRiskScore) {
    this.globalRiskScore = globalRiskScore;
  }

  /**
   **/
  public Model200 crRGlobalScoreVersion(Float crRGlobalScoreVersion) {
    this.crRGlobalScoreVersion = crRGlobalScoreVersion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CRRGlobalScoreVersion")
  public Float getCrRGlobalScoreVersion() {
    return crRGlobalScoreVersion;
  }
  public void setCrRGlobalScoreVersion(Float crRGlobalScoreVersion) {
    this.crRGlobalScoreVersion = crRGlobalScoreVersion;
  }

  /**
   **/
  public Model200 calculationDate(String calculationDate) {
    this.calculationDate = calculationDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CalculationDate")
  public String getCalculationDate() {
    return calculationDate;
  }
  public void setCalculationDate(String calculationDate) {
    this.calculationDate = calculationDate;
  }

  /**
   **/
  public Model200 autoHighReason(String autoHighReason) {
    this.autoHighReason = autoHighReason;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("AutoHighReason")
  public String getAutoHighReason() {
    return autoHighReason;
  }
  public void setAutoHighReason(String autoHighReason) {
    this.autoHighReason = autoHighReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model200 _200 = (Model200) o;
    return Objects.equals(globalRiskLevel, _200.globalRiskLevel) &&
        Objects.equals(globalRiskScore, _200.globalRiskScore) &&
        Objects.equals(crRGlobalScoreVersion, _200.crRGlobalScoreVersion) &&
        Objects.equals(calculationDate, _200.calculationDate) &&
        Objects.equals(autoHighReason, _200.autoHighReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalRiskLevel, globalRiskScore, crRGlobalScoreVersion, calculationDate, autoHighReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model200 {\n");
    
    sb.append("    globalRiskLevel: ").append(toIndentedString(globalRiskLevel)).append("\n");
    sb.append("    globalRiskScore: ").append(toIndentedString(globalRiskScore)).append("\n");
    sb.append("    crRGlobalScoreVersion: ").append(toIndentedString(crRGlobalScoreVersion)).append("\n");
    sb.append("    calculationDate: ").append(toIndentedString(calculationDate)).append("\n");
    sb.append("    autoHighReason: ").append(toIndentedString(autoHighReason)).append("\n");
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

