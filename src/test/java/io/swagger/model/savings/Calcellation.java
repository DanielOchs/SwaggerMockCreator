package io.swagger.model.savings;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Calcellation   {
  
  private String canceledAmount = null;
  private String cancellationAmountUsedLimit = null;
  private String cancellationDepositFirst = null;
  private String cancellationDepositLast = null;

  /**
   * canceled amount - FCDE: NDO-BTSKDBTR
   **/
  public Calcellation canceledAmount(String canceledAmount) {
    this.canceledAmount = canceledAmount;
    return this;
  }

  
  @ApiModelProperty(value = "canceled amount - FCDE: NDO-BTSKDBTR")
  @JsonProperty("canceledAmount")
  public String getCanceledAmount() {
    return canceledAmount;
  }
  public void setCanceledAmount(String canceledAmount) {
    this.canceledAmount = canceledAmount;
  }

  /**
   * cancellation amount of used limit - FCDE: NDO-BTSKDVER
   **/
  public Calcellation cancellationAmountUsedLimit(String cancellationAmountUsedLimit) {
    this.cancellationAmountUsedLimit = cancellationAmountUsedLimit;
    return this;
  }

  
  @ApiModelProperty(value = "cancellation amount of used limit - FCDE: NDO-BTSKDVER")
  @JsonProperty("cancellationAmountUsedLimit")
  public String getCancellationAmountUsedLimit() {
    return cancellationAmountUsedLimit;
  }
  public void setCancellationAmountUsedLimit(String cancellationAmountUsedLimit) {
    this.cancellationAmountUsedLimit = cancellationAmountUsedLimit;
  }

  /**
   * cancellation deposit first - FCDE: NDO-DTSKDBEG
   **/
  public Calcellation cancellationDepositFirst(String cancellationDepositFirst) {
    this.cancellationDepositFirst = cancellationDepositFirst;
    return this;
  }

  
  @ApiModelProperty(value = "cancellation deposit first - FCDE: NDO-DTSKDBEG")
  @JsonProperty("cancellationDepositFirst")
  public String getCancellationDepositFirst() {
    return cancellationDepositFirst;
  }
  public void setCancellationDepositFirst(String cancellationDepositFirst) {
    this.cancellationDepositFirst = cancellationDepositFirst;
  }

  /**
   * cancellation deposit last - FCDE: NDO-DTSKDEND
   **/
  public Calcellation cancellationDepositLast(String cancellationDepositLast) {
    this.cancellationDepositLast = cancellationDepositLast;
    return this;
  }

  
  @ApiModelProperty(value = "cancellation deposit last - FCDE: NDO-DTSKDEND")
  @JsonProperty("cancellationDepositLast")
  public String getCancellationDepositLast() {
    return cancellationDepositLast;
  }
  public void setCancellationDepositLast(String cancellationDepositLast) {
    this.cancellationDepositLast = cancellationDepositLast;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Calcellation calcellation = (Calcellation) o;
    return Objects.equals(canceledAmount, calcellation.canceledAmount) &&
        Objects.equals(cancellationAmountUsedLimit, calcellation.cancellationAmountUsedLimit) &&
        Objects.equals(cancellationDepositFirst, calcellation.cancellationDepositFirst) &&
        Objects.equals(cancellationDepositLast, calcellation.cancellationDepositLast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canceledAmount, cancellationAmountUsedLimit, cancellationDepositFirst, cancellationDepositLast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calcellation {\n");
    
    sb.append("    canceledAmount: ").append(toIndentedString(canceledAmount)).append("\n");
    sb.append("    cancellationAmountUsedLimit: ").append(toIndentedString(cancellationAmountUsedLimit)).append("\n");
    sb.append("    cancellationDepositFirst: ").append(toIndentedString(cancellationDepositFirst)).append("\n");
    sb.append("    cancellationDepositLast: ").append(toIndentedString(cancellationDepositLast)).append("\n");
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

