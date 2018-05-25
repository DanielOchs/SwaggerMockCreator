package io.swagger.model.phonecall;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



@SuppressWarnings("restriction")
public class CBCSPActivityDocResponsible   {
  

@XmlType(name="ForeignKeyTypeEnum")
@XmlEnum(String.class)
public enum ForeignKeyTypeEnum {

    @XmlEnumValue("ComsiId") COMSIID(String.valueOf("ComsiId")),
    @XmlEnumValue("PersonalId") PERSONALID(String.valueOf("PersonalId")), 
    @XmlEnumValue("AdvisorId") ADVISORID(String.valueOf("AdvisorId")),
    @XmlEnumValue("AdvisorRole") ADVISORROLE(String.valueOf("AdvisorRole")),
    @XmlEnumValue("Advisor") ADVISOR(String.valueOf("Advisor")),
    @XmlEnumValue("FilHb") FILHB(String.valueOf("FilHb")),
    @XmlEnumValue("Branch") BRANCH(String.valueOf("Branch"));


    private String value;

    ForeignKeyTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ForeignKeyTypeEnum fromValue(String v) {
        for (ForeignKeyTypeEnum b : ForeignKeyTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private ForeignKeyTypeEnum foreignKeyType = ForeignKeyTypeEnum.ADVISOR;
  private String foreignKey = null;

  /**
   * For FK: either &#39;ComsiId&#39;, &#39;PersonalId&#39;, &#39;AdvisorId&#39;, &#39;Advisor&#39; or &#39;AdvisorRole&#39;.  PK has additional options: &#39;FilHb&#39; or &#39;Branch&#39;.  Advisor and Branch are without foreignKey, it is determined from the customer
   **/
  public CBCSPActivityDocResponsible foreignKeyType(ForeignKeyTypeEnum foreignKeyType) {
    this.foreignKeyType = foreignKeyType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "For FK: either 'ComsiId', 'PersonalId', 'AdvisorId', 'Advisor' or 'AdvisorRole'.  PK has additional options: 'FilHb' or 'Branch'.  Advisor and Branch are without foreignKey, it is determined from the customer")
  @JsonProperty("foreignKeyType")
  @NotNull
  public ForeignKeyTypeEnum getForeignKeyType() {
    return foreignKeyType;
  }
  public void setForeignKeyType(ForeignKeyTypeEnum foreignKeyType) {
    this.foreignKeyType = foreignKeyType;
  }

  /**
   *  The identifier of the responsible advisor or group of advisors
   **/
  public CBCSPActivityDocResponsible foreignKey(String foreignKey) {
    this.foreignKey = foreignKey;
    return this;
  }

  
  @ApiModelProperty(value = " The identifier of the responsible advisor or group of advisors")
  @JsonProperty("foreignKey")
  public String getForeignKey() {
    return foreignKey;
  }
  public void setForeignKey(String foreignKey) {
    this.foreignKey = foreignKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CBCSPActivityDocResponsible cbCSPActivityDocResponsible = (CBCSPActivityDocResponsible) o;
    return Objects.equals(foreignKeyType, cbCSPActivityDocResponsible.foreignKeyType) &&
        Objects.equals(foreignKey, cbCSPActivityDocResponsible.foreignKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foreignKeyType, foreignKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CBCSPActivityDocResponsible {\n");
    
    sb.append("    foreignKeyType: ").append(toIndentedString(foreignKeyType)).append("\n");
    sb.append("    foreignKey: ").append(toIndentedString(foreignKey)).append("\n");
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

