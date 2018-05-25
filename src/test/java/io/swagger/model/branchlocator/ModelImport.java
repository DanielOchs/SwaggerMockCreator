package io.swagger.model.branchlocator;

import java.util.Objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



@SuppressWarnings("restriction")
public class ModelImport   {
  
  private String id = null;
  private String type = null;

@XmlType(name="GroupEnum")
@XmlEnum(String.class)
public enum GroupEnum {

    @XmlEnumValue("BRANCHES_CORPORATE") BRANCHES_CORPORATE(String.valueOf("BRANCHES_CORPORATE")), @XmlEnumValue("BRANCHES_PRIVATE") BRANCHES_PRIVATE(String.valueOf("BRANCHES_PRIVATE")), @XmlEnumValue("BRANCHES") BRANCHES(String.valueOf("BRANCHES")), @XmlEnumValue("CASHGROUP") CASHGROUP(String.valueOf("CASHGROUP"));


    private String value;

    GroupEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GroupEnum fromValue(String v) {
        for (GroupEnum b : GroupEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private GroupEnum group = null;
  private Long object = null;
  private String createdAt = null;
  private String createdBy = null;
  private String description = null;

  /**
   **/
  public ModelImport id(String id) {
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
  public ModelImport type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public ModelImport group(GroupEnum group) {
    this.group = group;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group")
  public GroupEnum getGroup() {
    return group;
  }
  public void setGroup(GroupEnum group) {
    this.group = group;
  }

  /**
   **/
  public ModelImport object(Long object) {
    this.object = object;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("object")
  public Long getObject() {
    return object;
  }
  public void setObject(Long object) {
    this.object = object;
  }

  /**
   **/
  public ModelImport createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("createdAt")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public ModelImport createdBy(String createdBy) {
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
  public ModelImport description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelImport _import = (ModelImport) o;
    return Objects.equals(id, _import.id) &&
        Objects.equals(type, _import.type) &&
        Objects.equals(group, _import.group) &&
        Objects.equals(object, _import.object) &&
        Objects.equals(createdAt, _import.createdAt) &&
        Objects.equals(createdBy, _import.createdBy) &&
        Objects.equals(description, _import.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, group, object, createdAt, createdBy, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelImport {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

