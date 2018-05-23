package io.swagger.model.consents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountReference  {
  /*
	{
		  "access_accounts": {
		    "account": {
		      "iban": "string",
		      "bban": "string",
		      "pan": "string",
		      "msisdn": "string"
		    },
		    "access-type": [
		      "string"
		    ]
		  },
		  "recurring_indicator": true,
		  "valid_until": "2017-11-01T00:00:00.000Z",
		  "frequency_per_day": 1,
		  "combined_service_indicator": false
		}
	*/
	
	
	//Variables
	
  @ApiModelProperty(value = "This data element can be used in the body of the Consent Request Message for retrieving account access consent from this payment account.")
 /**
   * This data element can be used in the body of the Consent Request Message for retrieving account access consent from this payment account.  
  **/
  private String iban = null;

  @ApiModelProperty(value = "This data element can be used in the body of the Consent Request Message for retrieving account access consent from this account. This data elements is used for payment accounts which have no IBAN.")
 /**
   * This data element can be used in the body of the Consent Request Message for retrieving account access consent from this account. This data elements is used for payment accounts which have no IBAN.  
  **/
  private String bban = null;

  @ApiModelProperty(value = "Primary Account Number (PAN) of a card, can be tokenized by the ASPSP due to PCI DSS requirements. This data element can be used in the body of the Consent Request Message for retrieving account access consent from this card.")
 /**
   * Primary Account Number (PAN) of a card, can be tokenized by the ASPSP due to PCI DSS requirements. This data element can be used in the body of the Consent Request Message for retrieving account access consent from this card.  
  **/
  private String pan = null;

  @ApiModelProperty(value = "An alias to access a payment account via a registered mobile phone number. This alias might be needed e.g. in the payment initiation service. The support of this alias must be explicitly documented by the ASPSP for the corresponding API calls.")
 /**
   * An alias to access a payment account via a registered mobile phone number. This alias might be needed e.g. in the payment initiation service. The support of this alias must be explicitly documented by the ASPSP for the corresponding API calls.  
  **/
  private String msisdn = null;
  
  
  
  //Getter Setters
  
 /**
   * This data element can be used in the body of the Consent Request Message for retrieving account access consent from this payment account.
   * @return iban
  **/
  @JsonProperty("iban")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public AccountReference iban(String iban) {
    this.iban = iban;
    return this;
  }

 /**
   * This data element can be used in the body of the Consent Request Message for retrieving account access consent from this account. This data elements is used for payment accounts which have no IBAN.
   * @return bban
  **/
  @JsonProperty("bban")
  public String getBban() {
    return bban;
  }

  public void setBban(String bban) {
    this.bban = bban;
  }

  public AccountReference bban(String bban) {
    this.bban = bban;
    return this;
  }

 /**
   * Primary Account Number (PAN) of a card, can be tokenized by the ASPSP due to PCI DSS requirements. This data element can be used in the body of the Consent Request Message for retrieving account access consent from this card.
   * @return pan
  **/
  @JsonProperty("pan")
  public String getPan() {
    return pan;
  }

  public void setPan(String pan) {
    this.pan = pan;
  }

  public AccountReference pan(String pan) {
    this.pan = pan;
    return this;
  }

 /**
   * An alias to access a payment account via a registered mobile phone number. This alias might be needed e.g. in the payment initiation service. The support of this alias must be explicitly documented by the ASPSP for the corresponding API calls.
   * @return msisdn
  **/
  @JsonProperty("msisdn")
  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public AccountReference msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountReference {\n");
    
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bban: ").append(toIndentedString(bban)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
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

