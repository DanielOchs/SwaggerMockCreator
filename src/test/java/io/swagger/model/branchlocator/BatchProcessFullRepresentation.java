package io.swagger.model.branchlocator;

import java.util.Objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



@SuppressWarnings("restriction")
public class BatchProcessFullRepresentation   {
  
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
  private Long startProcessAt = null;
  private Long endProcessAt = null;
  private String callbackUri = null;

  /**
   **/
  public BatchProcessFullRepresentation id(String id) {
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
  public BatchProcessFullRepresentation name(String name) {
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
  public BatchProcessFullRepresentation description(String description) {
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
  public BatchProcessFullRepresentation state(StateEnum state) {
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
  public BatchProcessFullRepresentation totalEntries(Integer totalEntries) {
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
  public BatchProcessFullRepresentation processedEntries(Integer processedEntries) {
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
  public BatchProcessFullRepresentation createdBy(String createdBy) {
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
  public BatchProcessFullRepresentation startProcessAt(Long startProcessAt) {
    this.startProcessAt = startProcessAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startProcessAt")
  public Long getStartProcessAt() {
    return startProcessAt;
  }
  public void setStartProcessAt(Long startProcessAt) {
    this.startProcessAt = startProcessAt;
  }

  /**
   **/
  public BatchProcessFullRepresentation endProcessAt(Long endProcessAt) {
    this.endProcessAt = endProcessAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("endProcessAt")
  public Long getEndProcessAt() {
    return endProcessAt;
  }
  public void setEndProcessAt(Long endProcessAt) {
    this.endProcessAt = endProcessAt;
  }

  /**
   **/
  public BatchProcessFullRepresentation callbackUri(String callbackUri) {
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
    BatchProcessFullRepresentation batchProcessFullRepresentation = (BatchProcessFullRepresentation) o;
    return Objects.equals(id, batchProcessFullRepresentation.id) &&
        Objects.equals(name, batchProcessFullRepresentation.name) &&
        Objects.equals(description, batchProcessFullRepresentation.description) &&
        Objects.equals(state, batchProcessFullRepresentation.state) &&
        Objects.equals(totalEntries, batchProcessFullRepresentation.totalEntries) &&
        Objects.equals(processedEntries, batchProcessFullRepresentation.processedEntries) &&
        Objects.equals(createdBy, batchProcessFullRepresentation.createdBy) &&
        Objects.equals(startProcessAt, batchProcessFullRepresentation.startProcessAt) &&
        Objects.equals(endProcessAt, batchProcessFullRepresentation.endProcessAt) &&
        Objects.equals(callbackUri, batchProcessFullRepresentation.callbackUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, state, totalEntries, processedEntries, createdBy, startProcessAt, endProcessAt, callbackUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchProcessFullRepresentation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
    sb.append("    processedEntries: ").append(toIndentedString(processedEntries)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    startProcessAt: ").append(toIndentedString(startProcessAt)).append("\n");
    sb.append("    endProcessAt: ").append(toIndentedString(endProcessAt)).append("\n");
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

