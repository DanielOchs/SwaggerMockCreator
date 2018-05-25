package io.swagger.model.payments;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@SuppressWarnings("restriction")
public class Challange  {
  
  @ApiModelProperty(value = "PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method.")
 /**
   * PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method.  
  **/
  private String image = null;

  @ApiModelProperty(value = "The maximal length for the OTP to be typed in by the PSU.")
 /**
   * The maximal length for the OTP to be typed in by the PSU.  
  **/
  private Integer opTMaxLength = null;


@XmlType(name="OtPFormatEnum")
@XmlEnum(String.class)
public enum OtPFormatEnum {

@XmlEnumValue("characters") CHARACTERS(String.valueOf("characters")), @XmlEnumValue("integer") INTEGER(String.valueOf("integer"));


    private String value;

    OtPFormatEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OtPFormatEnum fromValue(String v) {
        for (OtPFormatEnum b : OtPFormatEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "The format type of the OTP to be typed in. The admitted values are “characters” or “integer”.")
 /**
   * The format type of the OTP to be typed in. The admitted values are “characters” or “integer”.  
  **/
  private OtPFormatEnum otPFormat = null;

  @ApiModelProperty(value = "Additional explanation for the PSU to explain e.g. fallback mechanism for the chosen sca method")
 /**
   * Additional explanation for the PSU to explain e.g. fallback mechanism for the chosen sca method  
  **/
  private String additionalInformation = null;
 /**
   * PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method.
   * @return image
  **/
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Challange image(String image) {
    this.image = image;
    return this;
  }

 /**
   * The maximal length for the OTP to be typed in by the PSU.
   * @return opTMaxLength
  **/
  @JsonProperty("OPT_max_length")
  public Integer getOpTMaxLength() {
    return opTMaxLength;
  }

  public void setOpTMaxLength(Integer opTMaxLength) {
    this.opTMaxLength = opTMaxLength;
  }

  public Challange opTMaxLength(Integer opTMaxLength) {
    this.opTMaxLength = opTMaxLength;
    return this;
  }

 /**
   * The format type of the OTP to be typed in. The admitted values are “characters” or “integer”.
   * @return otPFormat
  **/
  @JsonProperty("OTP_format")
  public String getOtPFormat() {
    if (otPFormat == null) {
      return null;
    }
    return otPFormat.value();
  }

  public void setOtPFormat(OtPFormatEnum otPFormat) {
    this.otPFormat = otPFormat;
  }

  public Challange otPFormat(OtPFormatEnum otPFormat) {
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

  public Challange additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Challange {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    opTMaxLength: ").append(toIndentedString(opTMaxLength)).append("\n");
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

