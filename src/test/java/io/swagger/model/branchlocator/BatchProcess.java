package io.swagger.model.branchlocator;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class BatchProcess   {
  
  private String name = null;
  private String description = null;
  private String callbackUri = null;
  private String createdBy = null;

  /**
   **/
  public BatchProcess name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public BatchProcess description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public BatchProcess callbackUri(String callbackUri) {
    this.callbackUri = callbackUri;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("callbackUri")
  public String getCallbackUri() {
    return callbackUri;
  }
  public void setCallbackUri(String callbackUri) {
    this.callbackUri = callbackUri;
  }

  /**
   **/
  public BatchProcess createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchProcess batchProcess = (BatchProcess) o;
    return Objects.equals(name, batchProcess.name) &&
        Objects.equals(description, batchProcess.description) &&
        Objects.equals(callbackUri, batchProcess.callbackUri) &&
        Objects.equals(createdBy, batchProcess.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, callbackUri, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchProcess {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    callbackUri: ").append(toIndentedString(callbackUri)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

