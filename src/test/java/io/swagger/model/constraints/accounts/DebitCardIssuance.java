package io.swagger.model.constraints.accounts;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class DebitCardIssuance   {
  
  private Boolean relevance = null;

  /**
   * States if this constraint is relevant within the process of issuing a debit card.
   **/
  public DebitCardIssuance relevance(Boolean relevance) {
    this.relevance = relevance;
    return this;
  }

  
  @ApiModelProperty(value = "States if this constraint is relevant within the process of issuing a debit card.")
  @JsonProperty("relevance")
  public Boolean isRelevance() {
    return relevance;
  }
  public void setRelevance(Boolean relevance) {
    this.relevance = relevance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebitCardIssuance debitCardIssuance = (DebitCardIssuance) o;
    return Objects.equals(relevance, debitCardIssuance.relevance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relevance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebitCardIssuance {\n");
    
    sb.append("    relevance: ").append(toIndentedString(relevance)).append("\n");
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

