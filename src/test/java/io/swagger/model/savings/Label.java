package io.swagger.model.savings;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Label   {
  
  private String administrationKey = null;
  private String administrationText = null;
  private String processingCode = null;

  /**
   * administration key - FCDE: NDO-VWKZ
   **/
  public Label administrationKey(String administrationKey) {
    this.administrationKey = administrationKey;
    return this;
  }

  
  @ApiModelProperty(value = "administration key - FCDE: NDO-VWKZ")
  @JsonProperty("administrationKey")
  public String getAdministrationKey() {
    return administrationKey;
  }
  public void setAdministrationKey(String administrationKey) {
    this.administrationKey = administrationKey;
  }

  /**
   * administration text - FCDE: NDO-TVWKZ
   **/
  public Label administrationText(String administrationText) {
    this.administrationText = administrationText;
    return this;
  }

  
  @ApiModelProperty(value = "administration text - FCDE: NDO-TVWKZ")
  @JsonProperty("administrationText")
  public String getAdministrationText() {
    return administrationText;
  }
  public void setAdministrationText(String administrationText) {
    this.administrationText = administrationText;
  }

  /**
   * processing code - FCDE: NDO-VCDEVWKZ
   **/
  public Label processingCode(String processingCode) {
    this.processingCode = processingCode;
    return this;
  }

  
  @ApiModelProperty(value = "processing code - FCDE: NDO-VCDEVWKZ")
  @JsonProperty("processingCode")
  public String getProcessingCode() {
    return processingCode;
  }
  public void setProcessingCode(String processingCode) {
    this.processingCode = processingCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Label label = (Label) o;
    return Objects.equals(administrationKey, label.administrationKey) &&
        Objects.equals(administrationText, label.administrationText) &&
        Objects.equals(processingCode, label.processingCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(administrationKey, administrationText, processingCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    
    sb.append("    administrationKey: ").append(toIndentedString(administrationKey)).append("\n");
    sb.append("    administrationText: ").append(toIndentedString(administrationText)).append("\n");
    sb.append("    processingCode: ").append(toIndentedString(processingCode)).append("\n");
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

