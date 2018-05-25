package io.swagger.model.payments;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class InlineResponse200   {
  
  private TransactionStatus transactionStatus = null;
  private List<Authentication> scaMethods = new ArrayList<Authentication>();
  private Authentication chosenScaMethod = null;
  private Challange scaChallengeData = null;
  private Links links = null;
  private String psuMessage = null;
  private List<String> tppMessages = new ArrayList<String>();

  /**
   **/
  public InlineResponse200 transactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("transaction_status")
  @NotNull
  public TransactionStatus getTransactionStatus() {
    return transactionStatus;
  }
  public void setTransactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  /**
   **/
  public InlineResponse200 scaMethods(List<Authentication> scaMethods) {
    this.scaMethods = scaMethods;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sca_methods")
  public List<Authentication> getScaMethods() {
    return scaMethods;
  }
  public void setScaMethods(List<Authentication> scaMethods) {
    this.scaMethods = scaMethods;
  }

  /**
   **/
  public InlineResponse200 chosenScaMethod(Authentication chosenScaMethod) {
    this.chosenScaMethod = chosenScaMethod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("chosen_sca_method")
  public Authentication getChosenScaMethod() {
    return chosenScaMethod;
  }
  public void setChosenScaMethod(Authentication chosenScaMethod) {
    this.chosenScaMethod = chosenScaMethod;
  }

  /**
   **/
  public InlineResponse200 scaChallengeData(Challange scaChallengeData) {
    this.scaChallengeData = scaChallengeData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sca_challenge_data")
  public Challange getScaChallengeData() {
    return scaChallengeData;
  }
  public void setScaChallengeData(Challange scaChallengeData) {
    this.scaChallengeData = scaChallengeData;
  }

  /**
   **/
  public InlineResponse200 links(Links links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("_links")
  @NotNull
  public Links getLinks() {
    return links;
  }
  public void setLinks(Links links) {
    this.links = links;
  }

  /**
   * Text to be displayed to the PSU
   **/
  public InlineResponse200 psuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
    return this;
  }

  
  @ApiModelProperty(value = "Text to be displayed to the PSU")
  @JsonProperty("psu_message")
  public String getPsuMessage() {
    return psuMessage;
  }
  public void setPsuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
  }

  /**
   **/
  public InlineResponse200 tppMessages(List<String> tppMessages) {
    this.tppMessages = tppMessages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tpp_messages")
  public List<String> getTppMessages() {
    return tppMessages;
  }
  public void setTppMessages(List<String> tppMessages) {
    this.tppMessages = tppMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(transactionStatus, inlineResponse200.transactionStatus) &&
        Objects.equals(scaMethods, inlineResponse200.scaMethods) &&
        Objects.equals(chosenScaMethod, inlineResponse200.chosenScaMethod) &&
        Objects.equals(scaChallengeData, inlineResponse200.scaChallengeData) &&
        Objects.equals(links, inlineResponse200.links) &&
        Objects.equals(psuMessage, inlineResponse200.psuMessage) &&
        Objects.equals(tppMessages, inlineResponse200.tppMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus, scaMethods, chosenScaMethod, scaChallengeData, links, psuMessage, tppMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    scaMethods: ").append(toIndentedString(scaMethods)).append("\n");
    sb.append("    chosenScaMethod: ").append(toIndentedString(chosenScaMethod)).append("\n");
    sb.append("    scaChallengeData: ").append(toIndentedString(scaChallengeData)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    psuMessage: ").append(toIndentedString(psuMessage)).append("\n");
    sb.append("    tppMessages: ").append(toIndentedString(tppMessages)).append("\n");
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

