package io.swagger.model.consents;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@SuppressWarnings("restriction")
public class InlineResponse200  {
  
  @ApiModelProperty(required = true, value = "")
  private List<SingleAccountAccess> accessAccounts = new ArrayList<SingleAccountAccess>();

  @ApiModelProperty(required = true, value = "TRUE, if the consent is for recurring access to the account data FALSE, if the consent is for one access to the account data")
 /**
   * TRUE, if the consent is for recurring access to the account data FALSE, if the consent is for one access to the account data  
  **/
  private Boolean recurringIndicator = null;

  @ApiModelProperty(required = true, value = "This parameter is requesting a valid until date for the requested consent. The content is the local ASPSP date in ISODate Format, e.g. 2017-10-30")
 /**
   * This parameter is requesting a valid until date for the requested consent. The content is the local ASPSP date in ISODate Format, e.g. 2017-10-30  
  **/
  private LocalDate validUntil = null;

  @ApiModelProperty(required = true, value = "This field indicates the requested maximum frequency for an access per day. For a once-off access, this attribute is set to “1”.")
 /**
   * This field indicates the requested maximum frequency for an access per day. For a once-off access, this attribute is set to “1”.  
  **/
  private Integer frequencyPerDay = null;

  @ApiModelProperty(required = true, value = "")
  private TransactionStatus transactionStatus = null;


@XmlType(name="ConsentStatusEnum")
@XmlEnum(String.class)
public enum ConsentStatusEnum {

@XmlEnumValue("empty") EMPTY(String.valueOf("empty")), @XmlEnumValue("valid") VALID(String.valueOf("valid")), @XmlEnumValue("blocked") BLOCKED(String.valueOf("blocked")), @XmlEnumValue("expired") EXPIRED(String.valueOf("expired")), @XmlEnumValue("deleted") DELETED(String.valueOf("deleted"));


    private String value;

    ConsentStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConsentStatusEnum fromValue(String v) {
        for (ConsentStatusEnum b : ConsentStatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "The following code values are permitted \"empty\", \"valid\", \"blocked\", \"expired\", \"deleted\". These values might be extended by ASPSP by more values.")
 /**
   * The following code values are permitted \"empty\", \"valid\", \"blocked\", \"expired\", \"deleted\". These values might be extended by ASPSP by more values.  
  **/
  private ConsentStatusEnum consentStatus = null;
 /**
   * Get accessAccounts
   * @return accessAccounts
  **/
  @JsonProperty("access_accounts")
  @NotNull
  public List<SingleAccountAccess> getAccessAccounts() {
    return accessAccounts;
  }

  public void setAccessAccounts(List<SingleAccountAccess> accessAccounts) {
    this.accessAccounts = accessAccounts;
  }

  public InlineResponse200 accessAccounts(List<SingleAccountAccess> accessAccounts) {
    this.accessAccounts = accessAccounts;
    return this;
  }

  public InlineResponse200 addAccessAccountsItem(SingleAccountAccess accessAccountsItem) {
    this.accessAccounts.add(accessAccountsItem);
    return this;
  }

 /**
   * TRUE, if the consent is for recurring access to the account data FALSE, if the consent is for one access to the account data
   * @return recurringIndicator
  **/
  @JsonProperty("recurring_indicator")
  @NotNull
  public Boolean isRecurringIndicator() {
    return recurringIndicator;
  }

  public void setRecurringIndicator(Boolean recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
  }

  public InlineResponse200 recurringIndicator(Boolean recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
    return this;
  }

 /**
   * This parameter is requesting a valid until date for the requested consent. The content is the local ASPSP date in ISODate Format, e.g. 2017-10-30
   * @return validUntil
  **/
  @JsonProperty("valid_until")
  @NotNull
  public LocalDate getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
  }

  public InlineResponse200 validUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
    return this;
  }

 /**
   * This field indicates the requested maximum frequency for an access per day. For a once-off access, this attribute is set to “1”.
   * @return frequencyPerDay
  **/
  @JsonProperty("frequency_per_day")
  @NotNull
  public Integer getFrequencyPerDay() {
    return frequencyPerDay;
  }

  public void setFrequencyPerDay(Integer frequencyPerDay) {
    this.frequencyPerDay = frequencyPerDay;
  }

  public InlineResponse200 frequencyPerDay(Integer frequencyPerDay) {
    this.frequencyPerDay = frequencyPerDay;
    return this;
  }

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

  public InlineResponse200 transactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

 /**
   * The following code values are permitted \&quot;empty\&quot;, \&quot;valid\&quot;, \&quot;blocked\&quot;, \&quot;expired\&quot;, \&quot;deleted\&quot;. These values might be extended by ASPSP by more values.
   * @return consentStatus
  **/
  @JsonProperty("consent_status")
  @NotNull
  public String getConsentStatus() {
    if (consentStatus == null) {
      return null;
    }
    return consentStatus.value();
  }

  public void setConsentStatus(ConsentStatusEnum consentStatus) {
    this.consentStatus = consentStatus;
  }

  public InlineResponse200 consentStatus(ConsentStatusEnum consentStatus) {
    this.consentStatus = consentStatus;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    accessAccounts: ").append(toIndentedString(accessAccounts)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    frequencyPerDay: ").append(toIndentedString(frequencyPerDay)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    consentStatus: ").append(toIndentedString(consentStatus)).append("\n");
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

