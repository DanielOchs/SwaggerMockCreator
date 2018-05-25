package io.swagger.model.savings;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class BonusScale   {
  
  private String dynBonusSavingsText = null;
  private String dynBonusSavingsInterestRate = null;

  /**
   * dynamic saving plan text - FCDE: NDO-TDYBLFZ
   **/
  public BonusScale dynBonusSavingsText(String dynBonusSavingsText) {
    this.dynBonusSavingsText = dynBonusSavingsText;
    return this;
  }

  
  @ApiModelProperty(value = "dynamic saving plan text - FCDE: NDO-TDYBLFZ")
  @JsonProperty("dynBonusSavingsText")
  public String getDynBonusSavingsText() {
    return dynBonusSavingsText;
  }
  public void setDynBonusSavingsText(String dynBonusSavingsText) {
    this.dynBonusSavingsText = dynBonusSavingsText;
  }

  /**
   * dynamic bonus savings interest rate - FCDE: NDO-PZSBDYN
   **/
  public BonusScale dynBonusSavingsInterestRate(String dynBonusSavingsInterestRate) {
    this.dynBonusSavingsInterestRate = dynBonusSavingsInterestRate;
    return this;
  }

  
  @ApiModelProperty(value = "dynamic bonus savings interest rate - FCDE: NDO-PZSBDYN")
  @JsonProperty("dynBonusSavingsInterestRate")
  public String getDynBonusSavingsInterestRate() {
    return dynBonusSavingsInterestRate;
  }
  public void setDynBonusSavingsInterestRate(String dynBonusSavingsInterestRate) {
    this.dynBonusSavingsInterestRate = dynBonusSavingsInterestRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BonusScale bonusScale = (BonusScale) o;
    return Objects.equals(dynBonusSavingsText, bonusScale.dynBonusSavingsText) &&
        Objects.equals(dynBonusSavingsInterestRate, bonusScale.dynBonusSavingsInterestRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynBonusSavingsText, dynBonusSavingsInterestRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BonusScale {\n");
    
    sb.append("    dynBonusSavingsText: ").append(toIndentedString(dynBonusSavingsText)).append("\n");
    sb.append("    dynBonusSavingsInterestRate: ").append(toIndentedString(dynBonusSavingsInterestRate)).append("\n");
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

