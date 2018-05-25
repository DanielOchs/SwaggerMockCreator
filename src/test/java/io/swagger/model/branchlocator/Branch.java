package io.swagger.model.branchlocator;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Branch   {
  
  private Long id = null;
  private String importGroup = null;
  private Integer nummer = null;
  private String orgNummer = null;
  private String orgTyp = null;
  private String orgTypName = null;
  private String orgSpec = null;
  private String orgSpecName = null;
  private String land = null;
  private String bundesland = null;
  private String name = null;
  private String anschriftPostleitzahl = null;
  private String anschriftOrt = null;
  private String anschriftOrtteil = null;
  private String anschriftLand = null;
  private String anschriftStrasse = null;
  private Boolean vault = null;
  private String barriereTyp = null;
  private String naechsteFilHB = null;
  private Position position = null;
  private Boolean kasse = null;
  private NiederlassungFilial niederlassungFilial = null;

  /**
   **/
  public Branch id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public Branch importGroup(String importGroup) {
    this.importGroup = importGroup;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("importGroup")
  public String getImportGroup() {
    return importGroup;
  }
  public void setImportGroup(String importGroup) {
    this.importGroup = importGroup;
  }

  /**
   **/
  public Branch nummer(Integer nummer) {
    this.nummer = nummer;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nummer")
  public Integer getNummer() {
    return nummer;
  }
  public void setNummer(Integer nummer) {
    this.nummer = nummer;
  }

  /**
   **/
  public Branch orgNummer(String orgNummer) {
    this.orgNummer = orgNummer;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orgNummer")
  public String getOrgNummer() {
    return orgNummer;
  }
  public void setOrgNummer(String orgNummer) {
    this.orgNummer = orgNummer;
  }

  /**
   **/
  public Branch orgTyp(String orgTyp) {
    this.orgTyp = orgTyp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orgTyp")
  public String getOrgTyp() {
    return orgTyp;
  }
  public void setOrgTyp(String orgTyp) {
    this.orgTyp = orgTyp;
  }

  /**
   **/
  public Branch orgTypName(String orgTypName) {
    this.orgTypName = orgTypName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orgTypName")
  public String getOrgTypName() {
    return orgTypName;
  }
  public void setOrgTypName(String orgTypName) {
    this.orgTypName = orgTypName;
  }

  /**
   **/
  public Branch orgSpec(String orgSpec) {
    this.orgSpec = orgSpec;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orgSpec")
  public String getOrgSpec() {
    return orgSpec;
  }
  public void setOrgSpec(String orgSpec) {
    this.orgSpec = orgSpec;
  }

  /**
   **/
  public Branch orgSpecName(String orgSpecName) {
    this.orgSpecName = orgSpecName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("orgSpecName")
  public String getOrgSpecName() {
    return orgSpecName;
  }
  public void setOrgSpecName(String orgSpecName) {
    this.orgSpecName = orgSpecName;
  }

  /**
   **/
  public Branch land(String land) {
    this.land = land;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("land")
  public String getLand() {
    return land;
  }
  public void setLand(String land) {
    this.land = land;
  }

  /**
   **/
  public Branch bundesland(String bundesland) {
    this.bundesland = bundesland;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("bundesland")
  public String getBundesland() {
    return bundesland;
  }
  public void setBundesland(String bundesland) {
    this.bundesland = bundesland;
  }

  /**
   **/
  public Branch name(String name) {
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
  public Branch anschriftPostleitzahl(String anschriftPostleitzahl) {
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
  public Branch anschriftOrt(String anschriftOrt) {
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
  public Branch anschriftOrtteil(String anschriftOrtteil) {
    this.anschriftOrtteil = anschriftOrtteil;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("anschriftOrtteil")
  public String getAnschriftOrtteil() {
    return anschriftOrtteil;
  }
  public void setAnschriftOrtteil(String anschriftOrtteil) {
    this.anschriftOrtteil = anschriftOrtteil;
  }

  /**
   **/
  public Branch anschriftLand(String anschriftLand) {
    this.anschriftLand = anschriftLand;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("anschriftLand")
  public String getAnschriftLand() {
    return anschriftLand;
  }
  public void setAnschriftLand(String anschriftLand) {
    this.anschriftLand = anschriftLand;
  }

  /**
   **/
  public Branch anschriftStrasse(String anschriftStrasse) {
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
  public Branch vault(Boolean vault) {
    this.vault = vault;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("vault")
  public Boolean isVault() {
    return vault;
  }
  public void setVault(Boolean vault) {
    this.vault = vault;
  }

  /**
   **/
  public Branch barriereTyp(String barriereTyp) {
    this.barriereTyp = barriereTyp;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("barriereTyp")
  public String getBarriereTyp() {
    return barriereTyp;
  }
  public void setBarriereTyp(String barriereTyp) {
    this.barriereTyp = barriereTyp;
  }

  /**
   **/
  public Branch naechsteFilHB(String naechsteFilHB) {
    this.naechsteFilHB = naechsteFilHB;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("naechsteFilHB")
  public String getNaechsteFilHB() {
    return naechsteFilHB;
  }
  public void setNaechsteFilHB(String naechsteFilHB) {
    this.naechsteFilHB = naechsteFilHB;
  }

  /**
   **/
  public Branch position(Position position) {
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
  public Branch kasse(Boolean kasse) {
    this.kasse = kasse;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("kasse")
  public Boolean isKasse() {
    return kasse;
  }
  public void setKasse(Boolean kasse) {
    this.kasse = kasse;
  }

  /**
   **/
  public Branch niederlassungFilial(NiederlassungFilial niederlassungFilial) {
    this.niederlassungFilial = niederlassungFilial;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("niederlassungFilial")
  public NiederlassungFilial getNiederlassungFilial() {
    return niederlassungFilial;
  }
  public void setNiederlassungFilial(NiederlassungFilial niederlassungFilial) {
    this.niederlassungFilial = niederlassungFilial;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Branch branch = (Branch) o;
    return Objects.equals(id, branch.id) &&
        Objects.equals(importGroup, branch.importGroup) &&
        Objects.equals(nummer, branch.nummer) &&
        Objects.equals(orgNummer, branch.orgNummer) &&
        Objects.equals(orgTyp, branch.orgTyp) &&
        Objects.equals(orgTypName, branch.orgTypName) &&
        Objects.equals(orgSpec, branch.orgSpec) &&
        Objects.equals(orgSpecName, branch.orgSpecName) &&
        Objects.equals(land, branch.land) &&
        Objects.equals(bundesland, branch.bundesland) &&
        Objects.equals(name, branch.name) &&
        Objects.equals(anschriftPostleitzahl, branch.anschriftPostleitzahl) &&
        Objects.equals(anschriftOrt, branch.anschriftOrt) &&
        Objects.equals(anschriftOrtteil, branch.anschriftOrtteil) &&
        Objects.equals(anschriftLand, branch.anschriftLand) &&
        Objects.equals(anschriftStrasse, branch.anschriftStrasse) &&
        Objects.equals(vault, branch.vault) &&
        Objects.equals(barriereTyp, branch.barriereTyp) &&
        Objects.equals(naechsteFilHB, branch.naechsteFilHB) &&
        Objects.equals(position, branch.position) &&
        Objects.equals(kasse, branch.kasse) &&
        Objects.equals(niederlassungFilial, branch.niederlassungFilial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, importGroup, nummer, orgNummer, orgTyp, orgTypName, orgSpec, orgSpecName, land, bundesland, name, anschriftPostleitzahl, anschriftOrt, anschriftOrtteil, anschriftLand, anschriftStrasse, vault, barriereTyp, naechsteFilHB, position, kasse, niederlassungFilial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branch {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    importGroup: ").append(toIndentedString(importGroup)).append("\n");
    sb.append("    nummer: ").append(toIndentedString(nummer)).append("\n");
    sb.append("    orgNummer: ").append(toIndentedString(orgNummer)).append("\n");
    sb.append("    orgTyp: ").append(toIndentedString(orgTyp)).append("\n");
    sb.append("    orgTypName: ").append(toIndentedString(orgTypName)).append("\n");
    sb.append("    orgSpec: ").append(toIndentedString(orgSpec)).append("\n");
    sb.append("    orgSpecName: ").append(toIndentedString(orgSpecName)).append("\n");
    sb.append("    land: ").append(toIndentedString(land)).append("\n");
    sb.append("    bundesland: ").append(toIndentedString(bundesland)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    anschriftPostleitzahl: ").append(toIndentedString(anschriftPostleitzahl)).append("\n");
    sb.append("    anschriftOrt: ").append(toIndentedString(anschriftOrt)).append("\n");
    sb.append("    anschriftOrtteil: ").append(toIndentedString(anschriftOrtteil)).append("\n");
    sb.append("    anschriftLand: ").append(toIndentedString(anschriftLand)).append("\n");
    sb.append("    anschriftStrasse: ").append(toIndentedString(anschriftStrasse)).append("\n");
    sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
    sb.append("    barriereTyp: ").append(toIndentedString(barriereTyp)).append("\n");
    sb.append("    naechsteFilHB: ").append(toIndentedString(naechsteFilHB)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    kasse: ").append(toIndentedString(kasse)).append("\n");
    sb.append("    niederlassungFilial: ").append(toIndentedString(niederlassungFilial)).append("\n");
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

