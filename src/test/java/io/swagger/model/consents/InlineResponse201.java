package io.swagger.model.consents;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class InlineResponse201  {
  
  @ApiModelProperty(value = "")
  private List<Authentication> scaMethods = null;

  @ApiModelProperty(value = "")
  private Authentication chosenScaMethod = null;

  @ApiModelProperty(value = "")
  private Challenge scaChallengeData = null;

  @ApiModelProperty(value = "")
  private Links links = null;

  @ApiModelProperty(value = "Text to be displayed to the PSU, e.g. in a Decoupled SCA Approach")
 /**
   * Text to be displayed to the PSU, e.g. in a Decoupled SCA Approach  
  **/
  private String psuMessage = null;
 /**
   * Get scaMethods
   * @return scaMethods
  **/
  @JsonProperty("sca_methods")
  public List<Authentication> getScaMethods() {
    return scaMethods;
  }

  public void setScaMethods(List<Authentication> scaMethods) {
    this.scaMethods = scaMethods;
  }

  public InlineResponse201 scaMethods(List<Authentication> scaMethods) {
    this.scaMethods = scaMethods;
    return this;
  }

  public InlineResponse201 addScaMethodsItem(Authentication scaMethodsItem) {
    this.scaMethods.add(scaMethodsItem);
    return this;
  }

 /**
   * Get chosenScaMethod
   * @return chosenScaMethod
  **/
  @JsonProperty("chosen_sca_method")
  public Authentication getChosenScaMethod() {
    return chosenScaMethod;
  }

  public void setChosenScaMethod(Authentication chosenScaMethod) {
    this.chosenScaMethod = chosenScaMethod;
  }

  public InlineResponse201 chosenScaMethod(Authentication chosenScaMethod) {
    this.chosenScaMethod = chosenScaMethod;
    return this;
  }

 /**
   * Get scaChallengeData
   * @return scaChallengeData
  **/
  @JsonProperty("sca_challenge_data")
  public Challenge getScaChallengeData() {
    return scaChallengeData;
  }

  public void setScaChallengeData(Challenge scaChallengeData) {
    this.scaChallengeData = scaChallengeData;
  }

  public InlineResponse201 scaChallengeData(Challenge scaChallengeData) {
    this.scaChallengeData = scaChallengeData;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public InlineResponse201 links(Links links) {
    this.links = links;
    return this;
  }

 /**
   * Text to be displayed to the PSU, e.g. in a Decoupled SCA Approach
   * @return psuMessage
  **/
  @JsonProperty("psu_message")
  public String getPsuMessage() {
    return psuMessage;
  }

  public void setPsuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
  }

  public InlineResponse201 psuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201 {\n");
    
    sb.append("    scaMethods: ").append(toIndentedString(scaMethods)).append("\n");
    sb.append("    chosenScaMethod: ").append(toIndentedString(chosenScaMethod)).append("\n");
    sb.append("    scaChallengeData: ").append(toIndentedString(scaChallengeData)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    psuMessage: ").append(toIndentedString(psuMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

