package io.swagger.model.consents;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The transaction status is filled with value of the ISO20022 data table, where the entry from the name column is used.
 */
public enum TransactionStatus {
  
  ACCEPTEDCUSTOMERPROFILE("AcceptedCustomerProfile"),
  
  ACCEPTEDSETTLEMENTCOMPLETED("AcceptedSettlementCompleted"),
  
  ACCEPTEDSETTLEMENTINPROCESS("AcceptedSettlementInProcess"),
  
  ACCEPTEDTECHNICALVALIDATION("AcceptedTechnicalValidation"),
  
  ACCEPTEDWITHCHANGE("AcceptedWithChange"),
  
  ACCEPTEDWITHOUTPOSTING("AcceptedWithoutPosting"),
  
  RECEIVED("Received"),
  
  PENDING("Pending"),
  
  REJECTED("Rejected");

  private String value;

  TransactionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TransactionStatus fromValue(String text) {
    for (TransactionStatus b : TransactionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  
}

