package io.swagger.model.branch;

import java.util.Objects;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;


@XmlRootElement
public class Status   {
  
  private String apiVersion = null;
  private String applicationName = null;
  private String buildVersion = null;
  private String hostname = null;
  private StatusPrincipalIdentity principalIdentity = null;

  /**
   **/
  public Status apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   **/
  public Status applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("applicationName")
  public String getApplicationName() {
    return applicationName;
  }
  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  /**
   **/
  public Status buildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("buildVersion")
  public String getBuildVersion() {
    return buildVersion;
  }
  public void setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
  }

  /**
   **/
  public Status hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  /**
   **/
  public Status principalIdentity(StatusPrincipalIdentity principalIdentity) {
    this.principalIdentity = principalIdentity;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("PrincipalIdentity")
  public StatusPrincipalIdentity getPrincipalIdentity() {
    return principalIdentity;
  }
  public void setPrincipalIdentity(StatusPrincipalIdentity principalIdentity) {
    this.principalIdentity = principalIdentity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(apiVersion, status.apiVersion) &&
        Objects.equals(applicationName, status.applicationName) &&
        Objects.equals(buildVersion, status.buildVersion) &&
        Objects.equals(hostname, status.hostname) &&
        Objects.equals(principalIdentity, status.principalIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, applicationName, buildVersion, hostname, principalIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    buildVersion: ").append(toIndentedString(buildVersion)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    principalIdentity: ").append(toIndentedString(principalIdentity)).append("\n");
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

