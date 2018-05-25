package io.swagger.model.branchlocator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Importdiff   {
  
  private String id = null;
  private String importid = null;
  private List<String> newEntry = new ArrayList<String>();
  private List<String> releasedEntry = new ArrayList<String>();

  /**
   **/
  public Importdiff id(String id) {
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
  public Importdiff importid(String importid) {
    this.importid = importid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("importid")
  public String getImportid() {
    return importid;
  }
  public void setImportid(String importid) {
    this.importid = importid;
  }

  /**
   **/
  public Importdiff newEntry(List<String> newEntry) {
    this.newEntry = newEntry;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("newEntry")
  public List<String> getNewEntry() {
    return newEntry;
  }
  public void setNewEntry(List<String> newEntry) {
    this.newEntry = newEntry;
  }

  /**
   **/
  public Importdiff releasedEntry(List<String> releasedEntry) {
    this.releasedEntry = releasedEntry;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("releasedEntry")
  public List<String> getReleasedEntry() {
    return releasedEntry;
  }
  public void setReleasedEntry(List<String> releasedEntry) {
    this.releasedEntry = releasedEntry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Importdiff importdiff = (Importdiff) o;
    return Objects.equals(id, importdiff.id) &&
        Objects.equals(importid, importdiff.importid) &&
        Objects.equals(newEntry, importdiff.newEntry) &&
        Objects.equals(releasedEntry, importdiff.releasedEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, importid, newEntry, releasedEntry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Importdiff {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importid: ").append(toIndentedString(importid)).append("\n");
    sb.append("    newEntry: ").append(toIndentedString(newEntry)).append("\n");
    sb.append("    releasedEntry: ").append(toIndentedString(releasedEntry)).append("\n");
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

