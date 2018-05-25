package io.swagger.model.savings;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class InterestScale   {
  
  private String sizeOfLowerLimit = null;
  private String sizeOfUpperLimit = null;
  private String interestRateofScale = null;

  /**
   * size of lower limit - FCDE: NDO-BTSSFLV
   **/
  public InterestScale sizeOfLowerLimit(String sizeOfLowerLimit) {
    this.sizeOfLowerLimit = sizeOfLowerLimit;
    return this;
  }

  
  @ApiModelProperty(value = "size of lower limit - FCDE: NDO-BTSSFLV")
  @JsonProperty("sizeOfLowerLimit")
  public String getSizeOfLowerLimit() {
    return sizeOfLowerLimit;
  }
  public void setSizeOfLowerLimit(String sizeOfLowerLimit) {
    this.sizeOfLowerLimit = sizeOfLowerLimit;
  }

  /**
   * size of uper limit - FCDE: NDO-BTSSFLB
   **/
  public InterestScale sizeOfUpperLimit(String sizeOfUpperLimit) {
    this.sizeOfUpperLimit = sizeOfUpperLimit;
    return this;
  }

  
  @ApiModelProperty(value = "size of uper limit - FCDE: NDO-BTSSFLB")
  @JsonProperty("sizeOfUpperLimit")
  public String getSizeOfUpperLimit() {
    return sizeOfUpperLimit;
  }
  public void setSizeOfUpperLimit(String sizeOfUpperLimit) {
    this.sizeOfUpperLimit = sizeOfUpperLimit;
  }

  /**
   * interest rate of scale - FCDE: NDO-PZSSFL
   **/
  public InterestScale interestRateofScale(String interestRateofScale) {
    this.interestRateofScale = interestRateofScale;
    return this;
  }

  
  @ApiModelProperty(value = "interest rate of scale - FCDE: NDO-PZSSFL")
  @JsonProperty("interestRateofScale")
  public String getInterestRateofScale() {
    return interestRateofScale;
  }
  public void setInterestRateofScale(String interestRateofScale) {
    this.interestRateofScale = interestRateofScale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterestScale interestScale = (InterestScale) o;
    return Objects.equals(sizeOfLowerLimit, interestScale.sizeOfLowerLimit) &&
        Objects.equals(sizeOfUpperLimit, interestScale.sizeOfUpperLimit) &&
        Objects.equals(interestRateofScale, interestScale.interestRateofScale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sizeOfLowerLimit, sizeOfUpperLimit, interestRateofScale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterestScale {\n");
    
    sb.append("    sizeOfLowerLimit: ").append(toIndentedString(sizeOfLowerLimit)).append("\n");
    sb.append("    sizeOfUpperLimit: ").append(toIndentedString(sizeOfUpperLimit)).append("\n");
    sb.append("    interestRateofScale: ").append(toIndentedString(interestRateofScale)).append("\n");
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

