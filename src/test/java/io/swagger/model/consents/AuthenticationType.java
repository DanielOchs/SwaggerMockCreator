package io.swagger.model.consents;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
  * Will be detailed after market consultation.
 **/
@ApiModel(description="Will be detailed after market consultation.")
public class AuthenticationType  {
  
  @ApiModelProperty(value = "")
  private String SMS_OTP = null;

  @ApiModelProperty(value = "")
  private String CHIP_OTP = null;

  @ApiModelProperty(value = "")
  private String PHOTO_OTP = null;

  @ApiModelProperty(value = "")
  private String PUSH_OTP = null;
 /**
   * Get SMS_OTP
   * @return SMS_OTP
  **/
  @JsonProperty("SMS_OTP")
  public String getSMSOTP() {
    return SMS_OTP;
  }

  public void setSMSOTP(String SMS_OTP) {
    this.SMS_OTP = SMS_OTP;
  }

  public AuthenticationType SMS_OTP(String SMS_OTP) {
    this.SMS_OTP = SMS_OTP;
    return this;
  }

 /**
   * Get CHIP_OTP
   * @return CHIP_OTP
  **/
  @JsonProperty("CHIP_OTP")
  public String getCHIPOTP() {
    return CHIP_OTP;
  }

  public void setCHIPOTP(String CHIP_OTP) {
    this.CHIP_OTP = CHIP_OTP;
  }

  public AuthenticationType CHIP_OTP(String CHIP_OTP) {
    this.CHIP_OTP = CHIP_OTP;
    return this;
  }

 /**
   * Get PHOTO_OTP
   * @return PHOTO_OTP
  **/
  @JsonProperty("PHOTO_OTP")
  public String getPHOTOOTP() {
    return PHOTO_OTP;
  }

  public void setPHOTOOTP(String PHOTO_OTP) {
    this.PHOTO_OTP = PHOTO_OTP;
  }

  public AuthenticationType PHOTO_OTP(String PHOTO_OTP) {
    this.PHOTO_OTP = PHOTO_OTP;
    return this;
  }

 /**
   * Get PUSH_OTP
   * @return PUSH_OTP
  **/
  @JsonProperty("PUSH_OTP")
  public String getPUSHOTP() {
    return PUSH_OTP;
  }

  public void setPUSHOTP(String PUSH_OTP) {
    this.PUSH_OTP = PUSH_OTP;
  }

  public AuthenticationType PUSH_OTP(String PUSH_OTP) {
    this.PUSH_OTP = PUSH_OTP;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationType {\n");
    
    sb.append("    SMS_OTP: ").append(toIndentedString(SMS_OTP)).append("\n");
    sb.append("    CHIP_OTP: ").append(toIndentedString(CHIP_OTP)).append("\n");
    sb.append("    PHOTO_OTP: ").append(toIndentedString(PHOTO_OTP)).append("\n");
    sb.append("    PUSH_OTP: ").append(toIndentedString(PUSH_OTP)).append("\n");
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

