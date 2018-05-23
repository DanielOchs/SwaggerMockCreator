package io.swagger.model.branch;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class StatusPrincipalIdentityPrincipal   {
  
  private Boolean accountNonExpired = null;
  private Boolean accountNonlocken = null;
  private List<StatusPrincipalIdentityAuthorities> authorities = new ArrayList<StatusPrincipalIdentityAuthorities>();

  /**
   **/
  public StatusPrincipalIdentityPrincipal accountNonExpired(Boolean accountNonExpired) {
    this.accountNonExpired = accountNonExpired;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("accountNonExpired")
  public Boolean isAccountNonExpired() {
    return accountNonExpired;
  }
  public void setAccountNonExpired(Boolean accountNonExpired) {
    this.accountNonExpired = accountNonExpired;
  }

  /**
   **/
  public StatusPrincipalIdentityPrincipal accountNonlocken(Boolean accountNonlocken) {
    this.accountNonlocken = accountNonlocken;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("accountNonlocken")
  public Boolean isAccountNonlocken() {
    return accountNonlocken;
  }
  public void setAccountNonlocken(Boolean accountNonlocken) {
    this.accountNonlocken = accountNonlocken;
  }

  /**
   **/
  public StatusPrincipalIdentityPrincipal authorities(List<StatusPrincipalIdentityAuthorities> authorities) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusPrincipalIdentityPrincipal statusPrincipalIdentityPrincipal = (StatusPrincipalIdentityPrincipal) o;
    return Objects.equals(accountNonExpired, statusPrincipalIdentityPrincipal.accountNonExpired) &&
        Objects.equals(accountNonlocken, statusPrincipalIdentityPrincipal.accountNonlocken) &&
        Objects.equals(authorities, statusPrincipalIdentityPrincipal.authorities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNonExpired, accountNonlocken, authorities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPrincipalIdentityPrincipal {\n");
    
    sb.append("    accountNonExpired: ").append(toIndentedString(accountNonExpired)).append("\n");
    sb.append("    accountNonlocken: ").append(toIndentedString(accountNonlocken)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
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

