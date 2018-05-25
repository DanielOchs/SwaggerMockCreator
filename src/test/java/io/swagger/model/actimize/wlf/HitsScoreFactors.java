package io.swagger.model.actimize.wlf;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class HitsScoreFactors   {
  
  private String factorDesc = null;
  private String factorId = null;
  private String factorImpact = null;
  private String factorScore = null;
  private String factorValue = null;

  /**
   **/
  public HitsScoreFactors factorDesc(String factorDesc) {
    this.factorDesc = factorDesc;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("factorDesc")
  public String getFactorDesc() {
    return factorDesc;
  }
  public void setFactorDesc(String factorDesc) {
    this.factorDesc = factorDesc;
  }

  /**
   **/
  public HitsScoreFactors factorId(String factorId) {
    this.factorId = factorId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("factorId")
  public String getFactorId() {
    return factorId;
  }
  public void setFactorId(String factorId) {
    this.factorId = factorId;
  }

  /**
   **/
  public HitsScoreFactors factorImpact(String factorImpact) {
    this.factorImpact = factorImpact;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("factorImpact")
  public String getFactorImpact() {
    return factorImpact;
  }
  public void setFactorImpact(String factorImpact) {
    this.factorImpact = factorImpact;
  }

  /**
   **/
  public HitsScoreFactors factorScore(String factorScore) {
    this.factorScore = factorScore;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("factorScore")
  public String getFactorScore() {
    return factorScore;
  }
  public void setFactorScore(String factorScore) {
    this.factorScore = factorScore;
  }

  /**
   **/
  public HitsScoreFactors factorValue(String factorValue) {
    this.factorValue = factorValue;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("factorValue")
  public String getFactorValue() {
    return factorValue;
  }
  public void setFactorValue(String factorValue) {
    this.factorValue = factorValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HitsScoreFactors hitsScoreFactors = (HitsScoreFactors) o;
    return Objects.equals(factorDesc, hitsScoreFactors.factorDesc) &&
        Objects.equals(factorId, hitsScoreFactors.factorId) &&
        Objects.equals(factorImpact, hitsScoreFactors.factorImpact) &&
        Objects.equals(factorScore, hitsScoreFactors.factorScore) &&
        Objects.equals(factorValue, hitsScoreFactors.factorValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factorDesc, factorId, factorImpact, factorScore, factorValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HitsScoreFactors {\n");
    
    sb.append("    factorDesc: ").append(toIndentedString(factorDesc)).append("\n");
    sb.append("    factorId: ").append(toIndentedString(factorId)).append("\n");
    sb.append("    factorImpact: ").append(toIndentedString(factorImpact)).append("\n");
    sb.append("    factorScore: ").append(toIndentedString(factorScore)).append("\n");
    sb.append("    factorValue: ").append(toIndentedString(factorValue)).append("\n");
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

