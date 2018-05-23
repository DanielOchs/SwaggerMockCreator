package io.swagger.model.consents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Challenge  {
  
  @ApiModelProperty(value = "PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding , cp. [RFC 4648]. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method.")
 /**
   * PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding , cp. [RFC 4648]. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method.  
  **/
  private String image = null;

  @ApiModelProperty(value = "The maximal length for the OTP to be typed in by the PSU.")
 /**
   * The maximal length for the OTP to be typed in by the PSU.  
  **/
  private Integer otPMaxLength = null;

  @ApiModelProperty(value = "The format type of the OTP to be typed in. The admitted values are â€œcharactersâ€� or â€œintegerâ€�.")
 /**
   * The format type of the OTP to be typed in. The admitted values are â€œcharactersâ€� or â€œintegerâ€�.  
  **/
  private String otPFormat = null;

  @ApiModelProperty(value = "Additional explanation for the PSU to explain e.g. fallback mechanism for the chosen sca method")
 /**
   * Additional explanation for the PSU to explain e.g. fallback mechanism for the chosen sca method  
  **/
  private String additionalInformation = null;
 /**
   * PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding , cp. [RFC 4648]. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method.
   * @return image
  **/
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Challenge image(String image) {
    this.image = image;
    return this;
  }

 /**
   * The maximal length for the OTP to be typed in by the PSU.
   * @return otPMaxLength
  **/
  @JsonProperty("OTP_max_length")
  public Integer getOtPMaxLength() {
    return otPMaxLength;
  }

  public void setOtPMaxLength(Integer otPMaxLength) {
    this.otPMaxLength = otPMaxLength;
  }

  public Challenge otPMaxLength(Integer otPMaxLength) {
    this.otPMaxLength = otPMaxLength;
    return this;
  }

 /**
   * The format type of the OTP to be typed in. The admitted values are â€œcharactersâ€� or â€œintegerâ€�.
   * @return otPFormat
  **/
  @JsonProperty("OTP_format")
  public String getOtPFormat() {
    return otPFormat;
  }

  public void setOtPFormat(String otPFormat) {
    this.otPFormat = otPFormat;
  }

  public Challenge otPFormat(String otPFormat) {
    this.otPFormat = otPFormat;
    return this;
  }

 /**
   * Additional explanation for the PSU to explain e.g. fallback mechanism for the chosen sca method
   * @return additionalInformation
  **/
  @JsonProperty("additional_information")
  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public Challenge additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Challenge {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    otPMaxLength: ").append(toIndentedString(otPMaxLength)).append("\n");
    sb.append("    otPFormat: ").append(toIndentedString(otPFormat)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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

