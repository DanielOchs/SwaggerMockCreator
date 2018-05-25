package io.swagger.model.actimize.cdd;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class RiskFactorsBearerShares   {
  
  private String issuedBearerShares = null;
  private String publiclyTraded = null;

  /**
   **/
  public RiskFactorsBearerShares issuedBearerShares(String issuedBearerShares) {
    this.issuedBearerShares = issuedBearerShares;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("IssuedBearerShares")
  public String getIssuedBearerShares() {
    return issuedBearerShares;
  }
  public void setIssuedBearerShares(String issuedBearerShares) {
    this.issuedBearerShares = issuedBearerShares;
  }

  /**
   **/
  public RiskFactorsBearerShares publiclyTraded(String publiclyTraded) {
    this.publiclyTraded = publiclyTraded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("PubliclyTraded")
  public String getPubliclyTraded() {
    return publiclyTraded;
  }
  public void setPubliclyTraded(String publiclyTraded) {
    this.publiclyTraded = publiclyTraded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskFactorsBearerShares riskFactorsBearerShares = (RiskFactorsBearerShares) o;
    return Objects.equals(issuedBearerShares, riskFactorsBearerShares.issuedBearerShares) &&
        Objects.equals(publiclyTraded, riskFactorsBearerShares.publiclyTraded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedBearerShares, publiclyTraded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskFactorsBearerShares {\n");
    
    sb.append("    issuedBearerShares: ").append(toIndentedString(issuedBearerShares)).append("\n");
    sb.append("    publiclyTraded: ").append(toIndentedString(publiclyTraded)).append("\n");
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

