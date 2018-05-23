package io.swagger.model.consents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class Authentication  {
  
  @ApiModelProperty(value = "")
  @JsonIgnoreProperties(ignoreUnknown = true)
  private AuthenticationType authenticationType = null;

  @ApiModelProperty(value = "An identification provided by the ASPSP for the later identification of the authentication method selection.")
 /**
   * An identification provided by the ASPSP for the later identification of the authentication method selection.  
  **/
  private String authenticationMethodId = null;

  @ApiModelProperty(value = "This is the name of the authentication method defined by the PSU in the Online Banking frontend of the ASPSP. Alternatively this could be a description provided by the ASPSP like â€œSMS OTP on phone +49160 xxxxx 28â€�. This name shall be used by the TPP when presenting a list of authentication methods to the PSU, if available.")
 /**
   * This is the name of the authentication method defined by the PSU in the Online Banking frontend of the ASPSP. Alternatively this could be a description provided by the ASPSP like â€œSMS OTP on phone +49160 xxxxx 28â€�. This name shall be used by the TPP when presenting a list of authentication methods to the PSU, if available.  
  **/
  private String name = null;

  @ApiModelProperty(value = "detailed information about the sca method for the PSU.")
 /**
   * detailed information about the sca method for the PSU.  
  **/
  private String explanation = null;
 /**
   * Get authenticationType
   * @return authenticationType
  **/
  @JsonProperty("authentication_type")
  public AuthenticationType getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
  }

  public Authentication authenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

 /**
   * An identification provided by the ASPSP for the later identification of the authentication method selection.
   * @return authenticationMethodId
  **/
  @JsonProperty("authentication_method_id")
  public String getAuthenticationMethodId() {
    return authenticationMethodId;
  }

  public void setAuthenticationMethodId(String authenticationMethodId) {
    this.authenticationMethodId = authenticationMethodId;
  }

  public Authentication authenticationMethodId(String authenticationMethodId) {
    this.authenticationMethodId = authenticationMethodId;
    return this;
  }

 /**
   * This is the name of the authentication method defined by the PSU in the Online Banking frontend of the ASPSP. Alternatively this could be a description provided by the ASPSP like â€œSMS OTP on phone +49160 xxxxx 28â€�. This name shall be used by the TPP when presenting a list of authentication methods to the PSU, if available.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Authentication name(String name) {
    this.name = name;
    return this;
  }

 /**
   * detailed information about the sca method for the PSU.
   * @return explanation
  **/
  @JsonProperty("explanation")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public Authentication explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authentication {\n");
    
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    authenticationMethodId: ").append(toIndentedString(authenticationMethodId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
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

