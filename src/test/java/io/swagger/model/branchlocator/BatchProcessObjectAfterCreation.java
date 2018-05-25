package io.swagger.model.branchlocator;

import java.util.Objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



@SuppressWarnings("restriction")
public class BatchProcessObjectAfterCreation   {
  
  private String id = null;
  private String name = null;
  private String description = null;

@XmlType(name="StateEnum")
@XmlEnum(String.class)
public enum StateEnum {

    @XmlEnumValue("INITIATED") INITIATED(String.valueOf("INITIATED")), @XmlEnumValue("READY") READY(String.valueOf("READY")), @XmlEnumValue("RUNNING") RUNNING(String.valueOf("RUNNING")), @XmlEnumValue("DONE") DONE(String.valueOf("DONE"));


    private String value;

    StateEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StateEnum fromValue(String v) {
        for (StateEnum b : StateEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private StateEnum state = null;
  private Integer totalEntries = null;
  private Integer processedEntries = null;
  private String createdBy = null;
  private String callbackUri = null;

  /**
   **/
  public BatchProcessObjectAfterCreation id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public BatchProcessObjectAfterCreation name(String name) {
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
  public BatchProcessObjectAfterCreation description(String description) {
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
  public BatchProcessObjectAfterCreation state(StateEnum state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   **/
  public BatchProcessObjectAfterCreation totalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("totalEntries")
  public Integer getTotalEntries() {
    return totalEntries;
  }
  public void setTotalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
  }

  /**
   **/
  public BatchProcessObjectAfterCreation processedEntries(Integer processedEntries) {
    this.processedEntries = processedEntries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("processedEntries")
  public Integer getProcessedEntries() {
    return processedEntries;
  }
  public void setProcessedEntries(Integer processedEntries) {
    this.processedEntries = processedEntries;
  }

  /**
   **/
  public BatchProcessObjectAfterCreation createdBy(String createdBy) {
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

  /**
   **/
  public BatchProcessObjectAfterCreation callbackUri(String callbackUri) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchProcessObjectAfterCreation batchProcessObjectAfterCreation = (BatchProcessObjectAfterCreation) o;
    return Objects.equals(id, batchProcessObjectAfterCreation.id) &&
        Objects.equals(name, batchProcessObjectAfterCreation.name) &&
        Objects.equals(description, batchProcessObjectAfterCreation.description) &&
        Objects.equals(state, batchProcessObjectAfterCreation.state) &&
        Objects.equals(totalEntries, batchProcessObjectAfterCreation.totalEntries) &&
        Objects.equals(processedEntries, batchProcessObjectAfterCreation.processedEntries) &&
        Objects.equals(createdBy, batchProcessObjectAfterCreation.createdBy) &&
        Objects.equals(callbackUri, batchProcessObjectAfterCreation.callbackUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, state, totalEntries, processedEntries, createdBy, callbackUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchProcessObjectAfterCreation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
    sb.append("    processedEntries: ").append(toIndentedString(processedEntries)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    callbackUri: ").append(toIndentedString(callbackUri)).append("\n");
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

