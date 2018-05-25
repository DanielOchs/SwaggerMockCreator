package io.swagger.model.branchlocator;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class NiederlassungFilial   {
  
  private String anschriftOrt = null;
  private String anschriftPostleitzahl = null;
  private String anschriftStrasse = null;
  private String name = null;
  private Long nummer = null;
  private Long orgNummer = null;
  private Position position = null;
  private String postanschriftOrt = null;
  private String postanschriftPostfach = null;
  private String postanschriftPostleitzahl = null;
  private String telefax = null;
  private String telefon = null;

  /**
   **/
  public NiederlassungFilial anschriftOrt(String anschriftOrt) {
    this.anschriftOrt = anschriftOrt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("anschriftOrt")
  public String getAnschriftOrt() {
    return anschriftOrt;
  }
  public void setAnschriftOrt(String anschriftOrt) {
    this.anschriftOrt = anschriftOrt;
  }

  /**
   **/
  public NiederlassungFilial anschriftPostleitzahl(String anschriftPostleitzahl) {
    this.anschriftPostleitzahl = anschriftPostleitzahl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("anschriftPostleitzahl")
  public String getAnschriftPostleitzahl() {
    return anschriftPostleitzahl;
  }
  public void setAnschriftPostleitzahl(String anschriftPostleitzahl) {
    this.anschriftPostleitzahl = anschriftPostleitzahl;
  }

  /**
   **/
  public NiederlassungFilial anschriftStrasse(String anschriftStrasse) {
    this.anschriftStrasse = anschriftStrasse;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("anschriftStrasse")
  public String getAnschriftStrasse() {
    return anschriftStrasse;
  }
  public void setAnschriftStrasse(String anschriftStrasse) {
    this.anschriftStrasse = anschriftStrasse;
  }

  /**
   **/
  public NiederlassungFilial name(String name) {
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
  public NiederlassungFilial nummer(Long nummer) {
    this.nummer = nummer;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nummer")
  public Long getNummer() {
    return nummer;
  }
  public void setNummer(Long nummer) {
    this.nummer = nummer;
  }

  /**
   **/
  public NiederlassungFilial orgNummer(Long orgNummer) {
    this.orgNummer = orgNummer;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orgNummer")
  public Long getOrgNummer() {
    return orgNummer;
  }
  public void setOrgNummer(Long orgNummer) {
    this.orgNummer = orgNummer;
  }

  /**
   **/
  public NiederlassungFilial position(Position position) {
    this.position = position;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("position")
  public Position getPosition() {
    return position;
  }
  public void setPosition(Position position) {
    this.position = position;
  }

  /**
   **/
  public NiederlassungFilial postanschriftOrt(String postanschriftOrt) {
    this.postanschriftOrt = postanschriftOrt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postanschriftOrt")
  public String getPostanschriftOrt() {
    return postanschriftOrt;
  }
  public void setPostanschriftOrt(String postanschriftOrt) {
    this.postanschriftOrt = postanschriftOrt;
  }

  /**
   **/
  public NiederlassungFilial postanschriftPostfach(String postanschriftPostfach) {
    this.postanschriftPostfach = postanschriftPostfach;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postanschriftPostfach")
  public String getPostanschriftPostfach() {
    return postanschriftPostfach;
  }
  public void setPostanschriftPostfach(String postanschriftPostfach) {
    this.postanschriftPostfach = postanschriftPostfach;
  }

  /**
   **/
  public NiederlassungFilial postanschriftPostleitzahl(String postanschriftPostleitzahl) {
    this.postanschriftPostleitzahl = postanschriftPostleitzahl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("postanschriftPostleitzahl")
  public String getPostanschriftPostleitzahl() {
    return postanschriftPostleitzahl;
  }
  public void setPostanschriftPostleitzahl(String postanschriftPostleitzahl) {
    this.postanschriftPostleitzahl = postanschriftPostleitzahl;
  }

  /**
   **/
  public NiederlassungFilial telefax(String telefax) {
    this.telefax = telefax;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("telefax")
  public String getTelefax() {
    return telefax;
  }
  public void setTelefax(String telefax) {
    this.telefax = telefax;
  }

  /**
   **/
  public NiederlassungFilial telefon(String telefon) {
    this.telefon = telefon;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("telefon")
  public String getTelefon() {
    return telefon;
  }
  public void setTelefon(String telefon) {
    this.telefon = telefon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NiederlassungFilial niederlassungFilial = (NiederlassungFilial) o;
    return Objects.equals(anschriftOrt, niederlassungFilial.anschriftOrt) &&
        Objects.equals(anschriftPostleitzahl, niederlassungFilial.anschriftPostleitzahl) &&
        Objects.equals(anschriftStrasse, niederlassungFilial.anschriftStrasse) &&
        Objects.equals(name, niederlassungFilial.name) &&
        Objects.equals(nummer, niederlassungFilial.nummer) &&
        Objects.equals(orgNummer, niederlassungFilial.orgNummer) &&
        Objects.equals(position, niederlassungFilial.position) &&
        Objects.equals(postanschriftOrt, niederlassungFilial.postanschriftOrt) &&
        Objects.equals(postanschriftPostfach, niederlassungFilial.postanschriftPostfach) &&
        Objects.equals(postanschriftPostleitzahl, niederlassungFilial.postanschriftPostleitzahl) &&
        Objects.equals(telefax, niederlassungFilial.telefax) &&
        Objects.equals(telefon, niederlassungFilial.telefon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anschriftOrt, anschriftPostleitzahl, anschriftStrasse, name, nummer, orgNummer, position, postanschriftOrt, postanschriftPostfach, postanschriftPostleitzahl, telefax, telefon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NiederlassungFilial {\n");
    
    sb.append("    anschriftOrt: ").append(toIndentedString(anschriftOrt)).append("\n");
    sb.append("    anschriftPostleitzahl: ").append(toIndentedString(anschriftPostleitzahl)).append("\n");
    sb.append("    anschriftStrasse: ").append(toIndentedString(anschriftStrasse)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nummer: ").append(toIndentedString(nummer)).append("\n");
    sb.append("    orgNummer: ").append(toIndentedString(orgNummer)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    postanschriftOrt: ").append(toIndentedString(postanschriftOrt)).append("\n");
    sb.append("    postanschriftPostfach: ").append(toIndentedString(postanschriftPostfach)).append("\n");
    sb.append("    postanschriftPostleitzahl: ").append(toIndentedString(postanschriftPostleitzahl)).append("\n");
    sb.append("    telefax: ").append(toIndentedString(telefax)).append("\n");
    sb.append("    telefon: ").append(toIndentedString(telefon)).append("\n");
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

