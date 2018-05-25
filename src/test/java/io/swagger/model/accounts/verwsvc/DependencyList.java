package io.swagger.model.accounts.verwsvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class DependencyList   {
  
  private List<Dependency> dependencyList = new ArrayList<Dependency>();

  /**
   * A list of account dependency.
   **/
  public DependencyList dependencyList(List<Dependency> dependencyList) {
    this.dependencyList = dependencyList;
    return this;
  }

  
  @ApiModelProperty(value = "A list of account dependency.")
  @JsonProperty("dependencyList")
  public List<Dependency> getDependencyList() {
    return dependencyList;
  }
  public void setDependencyList(List<Dependency> dependencyList) {
    this.dependencyList = dependencyList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependencyList dependencyList = (DependencyList) o;
    return Objects.equals(dependencyList, dependencyList.dependencyList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencyList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyList {\n");
    
    sb.append("    dependencyList: ").append(toIndentedString(dependencyList)).append("\n");
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

