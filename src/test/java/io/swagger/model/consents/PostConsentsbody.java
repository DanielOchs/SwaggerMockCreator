package io.swagger.model.consents;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostConsentsbody  {
  
  @ApiModelProperty(required = true, value = "")
  private SingleAccountAccess accessAccounts = null;

  @ApiModelProperty(example = "true", required = true, value = "â€œtrueâ€œ, if the consent is for recurring access to the account data â€œfalseâ€œ, if the consent is for one access to the account data")
 /**
   * â€œtrueâ€œ, if the consent is for recurring access to the account data â€œfalseâ€œ, if the consent is for one access to the account data  
  **/
  private Boolean recurringIndicator = null;

  @ApiModelProperty(example = "2017-11-01T00:00:00.000Z", required = true, value = "This parameter is requesting a valid until date for the requested consent. The content is the local ASPSP date in ISODate Format, e.g. 2017-10-30")
 /**
   * This parameter is requesting a valid until date for the requested consent. The content is the local ASPSP date in ISODate Format, e.g. 2017-10-30  
  **/
  private String validUntil = null;

  @ApiModelProperty(example = "1", required = true, value = "This field indicates the requested maximum frequency for an access per day. For a once-off access, this attribute is set to â€œ1â€�.")
 /**
   * This field indicates the requested maximum frequency for an access per day. For a once-off access, this attribute is set to â€œ1â€�.  
  **/
  private Integer frequencyPerDay = null;

  @ApiModelProperty(example = "false", required = true, value = "If â€œtrueâ€œ indicates that a payment initiation service will be addressed in the same â€œsessionâ€œ.")
 /**
   * If â€œtrueâ€œ indicates that a payment initiation service will be addressed in the same â€œsessionâ€œ.  
  **/
  private Boolean combinedServiceIndicator = null;
 /**
   * Get accessAccounts
   * @return accessAccounts
  **/
  @JsonProperty("access_accounts")
  @NotNull
  public SingleAccountAccess getAccessAccounts() {
    return accessAccounts;
  }

  public void setAccessAccounts(SingleAccountAccess accessAccounts) {
    this.accessAccounts = accessAccounts;
  }

  public PostConsentsbody accessAccounts(SingleAccountAccess accessAccounts) {
    this.accessAccounts = accessAccounts;
    return this;
  }

 /**
   * â€œtrueâ€œ, if the consent is for recurring access to the account data â€œfalseâ€œ, if the consent is for one access to the account data
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

  public PostConsentsbody recurringIndicator(Boolean recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
    return this;
  }

 /**
   * This parameter is requesting a valid until date for the requested consent. The content is the local ASPSP date in ISODate Format, e.g. 2017-10-30
   * @return validUntil
  **/
  @JsonProperty("valid_until")
  @NotNull
  public String getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(String validUntil) {
    this.validUntil = validUntil;
  }

  public PostConsentsbody validUntil(String validUntil) {
    this.validUntil = validUntil;
    return this;
  }

 /**
   * This field indicates the requested maximum frequency for an access per day. For a once-off access, this attribute is set to â€œ1â€�.
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

  public PostConsentsbody frequencyPerDay(Integer frequencyPerDay) {
    this.frequencyPerDay = frequencyPerDay;
    return this;
  }

 /**
   * If â€œtrueâ€œ indicates that a payment initiation service will be addressed in the same â€œsessionâ€œ.
   * @return combinedServiceIndicator
  **/
  @JsonProperty("combined_service_indicator")
  @NotNull
  public Boolean isCombinedServiceIndicator() {
    return combinedServiceIndicator;
  }

  public void setCombinedServiceIndicator(Boolean combinedServiceIndicator) {
    this.combinedServiceIndicator = combinedServiceIndicator;
  }

  public PostConsentsbody combinedServiceIndicator(Boolean combinedServiceIndicator) {
    this.combinedServiceIndicator = combinedServiceIndicator;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append('\"').append("accessAccounts").append('"').append(": ").append(toIndentedString(accessAccounts)).append(",\n");
    sb.append('\"').append("recurringIndicator").append('"').append(": ").append(toIndentedString(recurringIndicator)).append(",\n");
    sb.append('\"').append("validUntil").append('"').append(": ").append(toIndentedString(validUntil)).append(",\n");
    sb.append('\"').append("frequencyPerDay").append('"').append(": ").append(toIndentedString(frequencyPerDay)).append(",\n");
    sb.append('\"').append("combinedServiceIndicator").append('"').append(": ").append(toIndentedString(combinedServiceIndicator)).append("\n");
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

