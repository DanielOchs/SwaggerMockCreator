package io.swagger.model.constraints.costumers;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class ImmediateAuthorisation   {
  
  private String impact = null;

  /**
   * States the impact of this constraint for an immediateAuthorisation. Available values: low, high
   **/
  public ImmediateAuthorisation impact(String impact) {
    this.impact = impact;
    return this;
  }

  
  @ApiModelProperty(value = "States the impact of this constraint for an immediateAuthorisation. Available values: low, high")
  @JsonProperty("impact")
  public String getImpact() {
    return impact;
  }
  public void setImpact(String impact) {
    this.impact = impact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImmediateAuthorisation immediateAuthorisation = (ImmediateAuthorisation) o;
    return Objects.equals(impact, immediateAuthorisation.impact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImmediateAuthorisation {\n");
    
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
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

