package io.swagger.model.actimize.wlf;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class InlineResponse200   {
  
  private Boolean hasHit = null;
  private Hits hits = null;

  /**
   **/
  public InlineResponse200 hasHit(Boolean hasHit) {
    this.hasHit = hasHit;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hasHit")
  @NotNull
  public Boolean isHasHit() {
    return hasHit;
  }
  public void setHasHit(Boolean hasHit) {
    this.hasHit = hasHit;
  }

  /**
   **/
  public InlineResponse200 hits(Hits hits) {
    this.hits = hits;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hits")
  public Hits getHits() {
    return hits;
  }
  public void setHits(Hits hits) {
    this.hits = hits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(hasHit, inlineResponse200.hasHit) &&
        Objects.equals(hits, inlineResponse200.hits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasHit, hits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    hasHit: ").append(toIndentedString(hasHit)).append("\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
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

