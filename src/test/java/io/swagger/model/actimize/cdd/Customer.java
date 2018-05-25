package io.swagger.model.actimize.cdd;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Customer   {
  
  private String customerID = null;
  private String customerIDType = null;
  private String coreTenantID = null;

  /**
   **/
  public Customer customerID(String customerID) {
    this.customerID = customerID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CustomerID")
  public String getCustomerID() {
    return customerID;
  }
  public void setCustomerID(String customerID) {
    this.customerID = customerID;
  }

  /**
   **/
  public Customer customerIDType(String customerIDType) {
    this.customerIDType = customerIDType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CustomerIDType")
  public String getCustomerIDType() {
    return customerIDType;
  }
  public void setCustomerIDType(String customerIDType) {
    this.customerIDType = customerIDType;
  }

  /**
   **/
  public Customer coreTenantID(String coreTenantID) {
    this.coreTenantID = coreTenantID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("CoreTenantID")
  public String getCoreTenantID() {
    return coreTenantID;
  }
  public void setCoreTenantID(String coreTenantID) {
    this.coreTenantID = coreTenantID;
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
    return Objects.equals(customerID, customer.customerID) &&
        Objects.equals(customerIDType, customer.customerIDType) &&
        Objects.equals(coreTenantID, customer.coreTenantID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerID, customerIDType, coreTenantID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    customerID: ").append(toIndentedString(customerID)).append("\n");
    sb.append("    customerIDType: ").append(toIndentedString(customerIDType)).append("\n");
    sb.append("    coreTenantID: ").append(toIndentedString(coreTenantID)).append("\n");
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

