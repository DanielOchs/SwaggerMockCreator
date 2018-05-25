package io.swagger.model.savings;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Amount   {
  
  private String freeAmountType = null;
  private String freeAmount = null;
  private String freeAmountUsedLimit = null;
  private String freeAmountLastDispositionDate = null;

  /**
   * free amount type - FCDE: NDO-FRART
   **/
  public Amount freeAmountType(String freeAmountType) {
    this.freeAmountType = freeAmountType;
    return this;
  }

  
  @ApiModelProperty(value = "free amount type - FCDE: NDO-FRART")
  @JsonProperty("freeAmountType")
  public String getFreeAmountType() {
    return freeAmountType;
  }
  public void setFreeAmountType(String freeAmountType) {
    this.freeAmountType = freeAmountType;
  }

  /**
   * free amount - FCDE: NDO-BTSFRBTR
   **/
  public Amount freeAmount(String freeAmount) {
    this.freeAmount = freeAmount;
    return this;
  }

  
  @ApiModelProperty(value = "free amount - FCDE: NDO-BTSFRBTR")
  @JsonProperty("freeAmount")
  public String getFreeAmount() {
    return freeAmount;
  }
  public void setFreeAmount(String freeAmount) {
    this.freeAmount = freeAmount;
  }

  /**
   * free amount used limit - FCDE: NDO-BTSFRVER
   **/
  public Amount freeAmountUsedLimit(String freeAmountUsedLimit) {
    this.freeAmountUsedLimit = freeAmountUsedLimit;
    return this;
  }

  
  @ApiModelProperty(value = "free amount used limit - FCDE: NDO-BTSFRVER")
  @JsonProperty("freeAmountUsedLimit")
  public String getFreeAmountUsedLimit() {
    return freeAmountUsedLimit;
  }
  public void setFreeAmountUsedLimit(String freeAmountUsedLimit) {
    this.freeAmountUsedLimit = freeAmountUsedLimit;
  }

  /**
   * free amount last disposition date - FCDE: NDO-DTSFREND
   **/
  public Amount freeAmountLastDispositionDate(String freeAmountLastDispositionDate) {
    this.freeAmountLastDispositionDate = freeAmountLastDispositionDate;
    return this;
  }

  
  @ApiModelProperty(value = "free amount last disposition date - FCDE: NDO-DTSFREND")
  @JsonProperty("freeAmountLastDispositionDate")
  public String getFreeAmountLastDispositionDate() {
    return freeAmountLastDispositionDate;
  }
  public void setFreeAmountLastDispositionDate(String freeAmountLastDispositionDate) {
    this.freeAmountLastDispositionDate = freeAmountLastDispositionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(freeAmountType, amount.freeAmountType) &&
        Objects.equals(freeAmount, amount.freeAmount) &&
        Objects.equals(freeAmountUsedLimit, amount.freeAmountUsedLimit) &&
        Objects.equals(freeAmountLastDispositionDate, amount.freeAmountLastDispositionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeAmountType, freeAmount, freeAmountUsedLimit, freeAmountLastDispositionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    
    sb.append("    freeAmountType: ").append(toIndentedString(freeAmountType)).append("\n");
    sb.append("    freeAmount: ").append(toIndentedString(freeAmount)).append("\n");
    sb.append("    freeAmountUsedLimit: ").append(toIndentedString(freeAmountUsedLimit)).append("\n");
    sb.append("    freeAmountLastDispositionDate: ").append(toIndentedString(freeAmountLastDispositionDate)).append("\n");
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

