package io.swagger.model.phonecall;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Regarding customer (may be a company, where the person in the call is one of its contacts)
 **/
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@SuppressWarnings("restriction")
@ApiModel(description = "Regarding customer (may be a company, where the person in the call is one of its contacts)")

public class CBCSPActivityDocReference   {
  

@XmlType(name="ForeignKeyTypeEnum")
@XmlEnum(String.class)
public enum ForeignKeyTypeEnum {

    @XmlEnumValue("GpKenn") GPKENN(String.valueOf("GpKenn")), @XmlEnumValue("BpKenn") BPKENN(String.valueOf("BpKenn"));


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

  private ForeignKeyTypeEnum foreignKeyType = null;
  private String foreignKey = null;

  /**
   * Type of identifier of the customer either &#39;GpKenn&#39; or &#39;BpKenn&#39;
   **/
  public CBCSPActivityDocReference foreignKeyType(ForeignKeyTypeEnum foreignKeyType) {
    this.foreignKeyType = foreignKeyType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Type of identifier of the customer either 'GpKenn' or 'BpKenn'")
  @JsonProperty("foreignKeyType")
  @NotNull
  public ForeignKeyTypeEnum getForeignKeyType() {
    return foreignKeyType;
  }
  public void setForeignKeyType(ForeignKeyTypeEnum foreignKeyType) {
    this.foreignKeyType = foreignKeyType;
  }

  /**
   *  The identifier of the customer
   **/
  public CBCSPActivityDocReference foreignKey(String foreignKey) {
    this.foreignKey = foreignKey;
    return this;
  }

  
  @ApiModelProperty(required = true, value = " The identifier of the customer")
  @JsonProperty("foreignKey")
  @NotNull
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
    CBCSPActivityDocReference cbCSPActivityDocReference = (CBCSPActivityDocReference) o;
    return Objects.equals(foreignKeyType, cbCSPActivityDocReference.foreignKeyType) &&
        Objects.equals(foreignKey, cbCSPActivityDocReference.foreignKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foreignKeyType, foreignKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CBCSPActivityDocReference {\n");
    
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

