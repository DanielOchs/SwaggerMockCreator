package io.swagger.model.payments;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class InlineResponse201  {
  
  @ApiModelProperty(required = true, value = "")
  private TransactionStatus transactionStatus = null;

  @ApiModelProperty(value = "")
  private String psuMessage = null;
 /**
   * Get transactionStatus
   * @return transactionStatus
  **/
  @JsonProperty("transaction_status")
  @NotNull
  public TransactionStatus getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public InlineResponse201 transactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

 /**
   * Get psuMessage
   * @return psuMessage
  **/
  @JsonProperty("psu_message")
  public String getPsuMessage() {
    return psuMessage;
  }

  public void setPsuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
  }

  public InlineResponse201 psuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201 {\n");
    
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    psuMessage: ").append(toIndentedString(psuMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

