package io.swagger.model.branchlocator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class StatusPrincipalIdentity   {
  
  private Boolean authenticated = null;
  private List<StatusPrincipalIdentityAuthorities> authorities = new ArrayList<StatusPrincipalIdentityAuthorities>();
  private String credentials = null;
  private List<String> details = new ArrayList<String>();
  private String name = null;
  private StatusPrincipalIdentityPrincipal principal = null;
  private Boolean credentialsNonExpired = null;
  private Boolean enabled = null;
  private String password = null;
  private String username = null;

  /**
   **/
  public StatusPrincipalIdentity authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("authenticated")
  public Boolean isAuthenticated() {
    return authenticated;
  }
  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }

  /**
   **/
  public StatusPrincipalIdentity authorities(List<StatusPrincipalIdentityAuthorities> authorities) {
    this.authorities = authorities;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("authorities")
  public List<StatusPrincipalIdentityAuthorities> getAuthorities() {
    return authorities;
  }
  public void setAuthorities(List<StatusPrincipalIdentityAuthorities> authorities) {
    this.authorities = authorities;
  }

  /**
   **/
  public StatusPrincipalIdentity credentials(String credentials) {
    this.credentials = credentials;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("credentials")
  public String getCredentials() {
    return credentials;
  }
  public void setCredentials(String credentials) {
    this.credentials = credentials;
  }

  /**
   **/
  public StatusPrincipalIdentity details(List<String> details) {
    this.details = details;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("details")
  public List<String> getDetails() {
    return details;
  }
  public void setDetails(List<String> details) {
    this.details = details;
  }

  /**
   **/
  public StatusPrincipalIdentity name(String name) {
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
  public StatusPrincipalIdentity principal(StatusPrincipalIdentityPrincipal principal) {
    this.principal = principal;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("principal")
  public StatusPrincipalIdentityPrincipal getPrincipal() {
    return principal;
  }
  public void setPrincipal(StatusPrincipalIdentityPrincipal principal) {
    this.principal = principal;
  }

  /**
   **/
  public StatusPrincipalIdentity credentialsNonExpired(Boolean credentialsNonExpired) {
    this.credentialsNonExpired = credentialsNonExpired;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("credentialsNonExpired")
  public Boolean isCredentialsNonExpired() {
    return credentialsNonExpired;
  }
  public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
    this.credentialsNonExpired = credentialsNonExpired;
  }

  /**
   **/
  public StatusPrincipalIdentity enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public Boolean isEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  public StatusPrincipalIdentity password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   **/
  public StatusPrincipalIdentity username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusPrincipalIdentity statusPrincipalIdentity = (StatusPrincipalIdentity) o;
    return Objects.equals(authenticated, statusPrincipalIdentity.authenticated) &&
        Objects.equals(authorities, statusPrincipalIdentity.authorities) &&
        Objects.equals(credentials, statusPrincipalIdentity.credentials) &&
        Objects.equals(details, statusPrincipalIdentity.details) &&
        Objects.equals(name, statusPrincipalIdentity.name) &&
        Objects.equals(principal, statusPrincipalIdentity.principal) &&
        Objects.equals(credentialsNonExpired, statusPrincipalIdentity.credentialsNonExpired) &&
        Objects.equals(enabled, statusPrincipalIdentity.enabled) &&
        Objects.equals(password, statusPrincipalIdentity.password) &&
        Objects.equals(username, statusPrincipalIdentity.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticated, authorities, credentials, details, name, principal, credentialsNonExpired, enabled, password, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPrincipalIdentity {\n");
    
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    credentialsNonExpired: ").append(toIndentedString(credentialsNonExpired)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

