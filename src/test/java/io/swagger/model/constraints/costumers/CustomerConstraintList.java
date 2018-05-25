package io.swagger.model.constraints.costumers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class CustomerConstraintList   {
  
  private List<CustomerConstraint> constraintList = new ArrayList<CustomerConstraint>();

  /**
   **/
  public CustomerConstraintList constraintList(List<CustomerConstraint> constraintList) {
    this.constraintList = constraintList;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("constraintList")
  public List<CustomerConstraint> getConstraintList() {
    return constraintList;
  }
  public void setConstraintList(List<CustomerConstraint> constraintList) {
    this.constraintList = constraintList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerConstraintList customerConstraintList = (CustomerConstraintList) o;
    return Objects.equals(constraintList, customerConstraintList.constraintList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraintList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerConstraintList {\n");
    
    sb.append("    constraintList: ").append(toIndentedString(constraintList)).append("\n");
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

