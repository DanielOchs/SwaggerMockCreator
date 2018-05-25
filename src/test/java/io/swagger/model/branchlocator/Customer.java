package io.swagger.model.branchlocator;

import java.util.Objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



@SuppressWarnings("restriction")
public class Customer   {
  

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

    @XmlEnumValue("NEAREST_BRANCH") BRANCH(String.valueOf("NEAREST_BRANCH"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private TypeEnum type = null;
  private String requestId = null;
  private String lineId = null;
  private String zip = null;
  private String city = null;
  private String street = null;
  private String houseNumber = null;

  /**
   **/
  public Customer type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public Customer requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   **/
  public Customer lineId(String lineId) {
    this.lineId = lineId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lineId")
  public String getLineId() {
    return lineId;
  }
  public void setLineId(String lineId) {
    this.lineId = lineId;
  }

  /**
   **/
  public Customer zip(String zip) {
    this.zip = zip;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("zip")
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }

  /**
   **/
  public Customer city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   **/
  public Customer street(String street) {
    this.street = street;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   **/
  public Customer houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("houseNumber")
  public String getHouseNumber() {
    return houseNumber;
  }
  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(type, customer.type) &&
        Objects.equals(requestId, customer.requestId) &&
        Objects.equals(lineId, customer.lineId) &&
        Objects.equals(zip, customer.zip) &&
        Objects.equals(city, customer.city) &&
        Objects.equals(street, customer.street) &&
        Objects.equals(houseNumber, customer.houseNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, requestId, lineId, zip, city, street, houseNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
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

