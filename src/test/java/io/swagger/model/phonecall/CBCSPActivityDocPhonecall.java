package io.swagger.model.phonecall;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



@SuppressWarnings("restriction")
public class CBCSPActivityDocPhonecall   {
  
  private CBCSPActivityDocCorrelation correlation = null;
  private CBCSPActivityDocReference regarding = null;
  private String customerId = null;
  private CBCSPActivityDocResponsible responsible = null;
  private String actualStartTime = null;
  private Integer actualDuration = null;
  private String description = null;
  private String phonenumber = null;
  private List<CBCSPActivityDocParticipant> from = new ArrayList<CBCSPActivityDocParticipant>();
  private List<CBCSPActivityDocParticipant> to = new ArrayList<CBCSPActivityDocParticipant>();
  private String category = null;
  private Boolean doddfrank = null;
  private Boolean emir = null;
  private Boolean mifid = null;

@XmlType(name="StateCodeEnum")
@XmlEnum(String.class)
public enum StateCodeEnum {

    @XmlEnumValue("0") _0(String.valueOf("0")), @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("2") _2(String.valueOf("2"));


    private String value;

    StateCodeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StateCodeEnum fromValue(String v) {
        for (StateCodeEnum b : StateCodeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private StateCodeEnum stateCode = null;

@XmlType(name="StatusCodeEnum")
@XmlEnum(String.class)
public enum StatusCodeEnum {

    @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("2") _2(String.valueOf("2")), @XmlEnumValue("3") _3(String.valueOf("3")), @XmlEnumValue("4") _4(String.valueOf("4"));


    private String value;

    StatusCodeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusCodeEnum fromValue(String v) {
        for (StatusCodeEnum b : StatusCodeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private StatusCodeEnum statusCode = null;

  /**
   **/
  public CBCSPActivityDocPhonecall correlation(CBCSPActivityDocCorrelation correlation) {
    this.correlation = correlation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("correlation")
  @NotNull
  public CBCSPActivityDocCorrelation getCorrelation() {
    return correlation;
  }
  public void setCorrelation(CBCSPActivityDocCorrelation correlation) {
    this.correlation = correlation;
  }

  /**
   **/
  public CBCSPActivityDocPhonecall regarding(CBCSPActivityDocReference regarding) {
    this.regarding = regarding;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("regarding")
  @NotNull
  public CBCSPActivityDocReference getRegarding() {
    return regarding;
  }
  public void setRegarding(CBCSPActivityDocReference regarding) {
    this.regarding = regarding;
  }

  /**
   **/
  public CBCSPActivityDocPhonecall customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   **/
  public CBCSPActivityDocPhonecall responsible(CBCSPActivityDocResponsible responsible) {
    this.responsible = responsible;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("responsible")
  public CBCSPActivityDocResponsible getResponsible() {
    return responsible;
  }
  public void setResponsible(CBCSPActivityDocResponsible responsible) {
    this.responsible = responsible;
  }

  /**
   * Format according to ISO-8601: yyyy-MM-dd&#39;T&#39;HH:mm:ss[Z|[+-]HHmm]
   **/
  public CBCSPActivityDocPhonecall actualStartTime(String actualStartTime) {
    this.actualStartTime = actualStartTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Format according to ISO-8601: yyyy-MM-dd'T'HH:mm:ss[Z|[+-]HHmm]")
  @JsonProperty("actualStartTime")
  @NotNull
  public String getActualStartTime() {
    return actualStartTime;
  }
  public void setActualStartTime(String actualStartTime) {
    this.actualStartTime = actualStartTime;
  }

  /**
   * Duration in minutes
   **/
  public CBCSPActivityDocPhonecall actualDuration(Integer actualDuration) {
    this.actualDuration = actualDuration;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Duration in minutes")
  @JsonProperty("actualDuration")
  @NotNull
  public Integer getActualDuration() {
    return actualDuration;
  }
  public void setActualDuration(Integer actualDuration) {
    this.actualDuration = actualDuration;
  }

  /**
   * Detailed description (up to 100,000 characters)
   **/
  public CBCSPActivityDocPhonecall description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Detailed description (up to 100,000 characters)")
  @JsonProperty("description")
  @NotNull
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Phonenumber of the customer (e.g. &#39;+(49) 069 12345678&#39;)
   **/
  public CBCSPActivityDocPhonecall phonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Phonenumber of the customer (e.g. '+(49) 069 12345678')")
  @JsonProperty("phonenumber")
  @NotNull
  public String getPhonenumber() {
    return phonenumber;
  }
  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }

  /**
   **/
  public CBCSPActivityDocPhonecall from(List<CBCSPActivityDocParticipant> from) {
    this.from = from;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("from")
  @NotNull
  public List<CBCSPActivityDocParticipant> getFrom() {
    return from;
  }
  public void setFrom(List<CBCSPActivityDocParticipant> from) {
    this.from = from;
  }

  /**
   **/
  public CBCSPActivityDocPhonecall to(List<CBCSPActivityDocParticipant> to) {
    this.to = to;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("to")
  @NotNull
  public List<CBCSPActivityDocParticipant> getTo() {
    return to;
  }
  public void setTo(List<CBCSPActivityDocParticipant> to) {
    this.to = to;
  }

  /**
   * Categorizes the phonecall; e.g. &#39;0604&#39;
   **/
  public CBCSPActivityDocPhonecall category(String category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Categorizes the phonecall; e.g. '0604'")
  @JsonProperty("category")
  @NotNull
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Flag if this Phone Call is relevant for Dodd-Frank
   **/
  public CBCSPActivityDocPhonecall doddfrank(Boolean doddfrank) {
    this.doddfrank = doddfrank;
    return this;
  }

  
  @ApiModelProperty(value = "Flag if this Phone Call is relevant for Dodd-Frank")
  @JsonProperty("doddfrank")
  public Boolean isDoddfrank() {
    return doddfrank;
  }
  public void setDoddfrank(Boolean doddfrank) {
    this.doddfrank = doddfrank;
  }

  /**
   * Flag if this Phone Call is relevant for Emir
   **/
  public CBCSPActivityDocPhonecall emir(Boolean emir) {
    this.emir = emir;
    return this;
  }

  
  @ApiModelProperty(value = "Flag if this Phone Call is relevant for Emir")
  @JsonProperty("emir")
  public Boolean isEmir() {
    return emir;
  }
  public void setEmir(Boolean emir) {
    this.emir = emir;
  }

  /**
   * Flag if this Phone Call is relevant for Mifid
   **/
  public CBCSPActivityDocPhonecall mifid(Boolean mifid) {
    this.mifid = mifid;
    return this;
  }

  
  @ApiModelProperty(value = "Flag if this Phone Call is relevant for Mifid")
  @JsonProperty("mifid")
  public Boolean isMifid() {
    return mifid;
  }
  public void setMifid(Boolean mifid) {
    this.mifid = mifid;
  }

  /**
   * Status:  0: open  1: completed  2: cancelled
   **/
  public CBCSPActivityDocPhonecall stateCode(StateCodeEnum stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Status:  0: open  1: completed  2: cancelled")
  @JsonProperty("stateCode")
  @NotNull
  public StateCodeEnum getStateCode() {
    return stateCode;
  }
  public void setStateCode(StateCodeEnum stateCode) {
    this.stateCode = stateCode;
  }

  /**
   * Status reason:  1: open  2: made  3: cancelled  4: received
   **/
  public CBCSPActivityDocPhonecall statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Status reason:  1: open  2: made  3: cancelled  4: received")
  @JsonProperty("statusCode")
  @NotNull
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CBCSPActivityDocPhonecall cbCSPActivityDocPhonecall = (CBCSPActivityDocPhonecall) o;
    return Objects.equals(correlation, cbCSPActivityDocPhonecall.correlation) &&
        Objects.equals(regarding, cbCSPActivityDocPhonecall.regarding) &&
        Objects.equals(customerId, cbCSPActivityDocPhonecall.customerId) &&
        Objects.equals(responsible, cbCSPActivityDocPhonecall.responsible) &&
        Objects.equals(actualStartTime, cbCSPActivityDocPhonecall.actualStartTime) &&
        Objects.equals(actualDuration, cbCSPActivityDocPhonecall.actualDuration) &&
        Objects.equals(description, cbCSPActivityDocPhonecall.description) &&
        Objects.equals(phonenumber, cbCSPActivityDocPhonecall.phonenumber) &&
        Objects.equals(from, cbCSPActivityDocPhonecall.from) &&
        Objects.equals(to, cbCSPActivityDocPhonecall.to) &&
        Objects.equals(category, cbCSPActivityDocPhonecall.category) &&
        Objects.equals(doddfrank, cbCSPActivityDocPhonecall.doddfrank) &&
        Objects.equals(emir, cbCSPActivityDocPhonecall.emir) &&
        Objects.equals(mifid, cbCSPActivityDocPhonecall.mifid) &&
        Objects.equals(stateCode, cbCSPActivityDocPhonecall.stateCode) &&
        Objects.equals(statusCode, cbCSPActivityDocPhonecall.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlation, regarding, customerId, responsible, actualStartTime, actualDuration, description, phonenumber, from, to, category, doddfrank, emir, mifid, stateCode, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CBCSPActivityDocPhonecall {\n");
    
    sb.append("    correlation: ").append(toIndentedString(correlation)).append("\n");
    sb.append("    regarding: ").append(toIndentedString(regarding)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    responsible: ").append(toIndentedString(responsible)).append("\n");
    sb.append("    actualStartTime: ").append(toIndentedString(actualStartTime)).append("\n");
    sb.append("    actualDuration: ").append(toIndentedString(actualDuration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    phonenumber: ").append(toIndentedString(phonenumber)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    doddfrank: ").append(toIndentedString(doddfrank)).append("\n");
    sb.append("    emir: ").append(toIndentedString(emir)).append("\n");
    sb.append("    mifid: ").append(toIndentedString(mifid)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

