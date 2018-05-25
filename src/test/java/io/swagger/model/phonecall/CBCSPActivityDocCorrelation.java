package io.swagger.model.phonecall;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class CBCSPActivityDocCorrelation   {
  
  private String system = null;
  private String uniqueId = null;

  /**
   * CoriaID of the source system, e.g. &#39;02-03-15&#39;
   **/
  public CBCSPActivityDocCorrelation system(String system) {
    this.system = system;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "CoriaID of the source system, e.g. '02-03-15'")
  @JsonProperty("system")
  @NotNull
  public String getSystem() {
    return system;
  }
  public void setSystem(String system) {
    this.system = system;
  }

  /**
   * Uniquely identifies the phonecall in the source system
   **/
  public CBCSPActivityDocCorrelation uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Uniquely identifies the phonecall in the source system")
  @JsonProperty("uniqueId")
  @NotNull
  public String getUniqueId() {
    return uniqueId;
  }
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CBCSPActivityDocCorrelation cbCSPActivityDocCorrelation = (CBCSPActivityDocCorrelation) o;
    return Objects.equals(system, cbCSPActivityDocCorrelation.system) &&
        Objects.equals(uniqueId, cbCSPActivityDocCorrelation.uniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(system, uniqueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CBCSPActivityDocCorrelation {\n");
    
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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

