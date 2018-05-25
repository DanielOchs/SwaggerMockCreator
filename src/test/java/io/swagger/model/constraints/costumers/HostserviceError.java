package io.swagger.model.constraints.costumers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class HostserviceError   {
  
  private Integer status = null;
  private String message = null;
  private List<ConstraintViolationError> errors = new ArrayList<ConstraintViolationError>();
  private String returnCode = null;
  private String errorCode = null;
  private String errorMessageCode = null;

  /**
   **/
  public HostserviceError status(Integer status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   **/
  public HostserviceError message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  public HostserviceError errors(List<ConstraintViolationError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("errors")
  public List<ConstraintViolationError> getErrors() {
    return errors;
  }
  public void setErrors(List<ConstraintViolationError> errors) {
    this.errors = errors;
  }

  /**
   **/
  public HostserviceError returnCode(String returnCode) {
    this.returnCode = returnCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("returnCode")
  public String getReturnCode() {
    return returnCode;
  }
  public void setReturnCode(String returnCode) {
    this.returnCode = returnCode;
  }

  /**
   **/
  public HostserviceError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   **/
  public HostserviceError errorMessageCode(String errorMessageCode) {
    this.errorMessageCode = errorMessageCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("errorMessageCode")
  public String getErrorMessageCode() {
    return errorMessageCode;
  }
  public void setErrorMessageCode(String errorMessageCode) {
    this.errorMessageCode = errorMessageCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostserviceError hostserviceError = (HostserviceError) o;
    return Objects.equals(status, hostserviceError.status) &&
        Objects.equals(message, hostserviceError.message) &&
        Objects.equals(errors, hostserviceError.errors) &&
        Objects.equals(returnCode, hostserviceError.returnCode) &&
        Objects.equals(errorCode, hostserviceError.errorCode) &&
        Objects.equals(errorMessageCode, hostserviceError.errorMessageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, errors, returnCode, errorCode, errorMessageCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostserviceError {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessageCode: ").append(toIndentedString(errorMessageCode)).append("\n");
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

