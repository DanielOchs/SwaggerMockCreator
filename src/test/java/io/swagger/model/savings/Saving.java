package io.swagger.model.savings;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Saving   {
  
  private String accountNumber = null;
  private String productName = null;
  private String subAccountName = null;
  private String depositorName1 = null;
  private String depositorName2 = null;
  private String currencyCode = null;
  private String accountState = null;
  private String balance = null;
  private String interestRate = null;
  private String passbookFlag = null;
  private String openingDate = null;
  private String typeOfInterest = null;
  private String typeOfInterestScale = null;
  private List<InterestScale> interestScales = new ArrayList<InterestScale>();
  private String cancellationPeriod = null;
  private String specialSavingKey = null;
  private String bonusType = null;
  private String bonusAmount = null;
  private String interstBonification = null;
  private String bonusValidityPeriodStart = null;
  private String bonusValidityPeriodEnd = null;
  private String bonusTotalInterestRate = null;
  private String bonusProlongationAgreement = null;
  private List<Label> administrationMarks = new ArrayList<Label>();
  private String interestToYearUltimo = null;
  private String currentInterestClaim = null;
  private String earlyWithdrawalPenalty = null;
  private List<Calcellation> cancellations = new ArrayList<Calcellation>();
  private List<Amount> elementsOfFreeAmounts = new ArrayList<Amount>();
  private String dynSavingPlanKey = null;
  private String dynSavingsInterestRate = null;
  private List<BonusScale> dynamicSavingBonusScales = new ArrayList<BonusScale>();
  private String retainageFrequency = null;
  private String dynSavingsRate = null;
  private String dynSavingDurationStart = null;
  private String dynSavingDurationEnd = null;
  private String lastAccountStatement = null;
  private String lastAccountStatementNumber = null;
  private String lastAccountStatementBalance = null;
  private String nameDivergentSendingAddress1 = null;
  private String nameDivergentSendingAddress2 = null;
  private String streetOfDivergentSendingAddress = null;
  private String townOfDivergentSendingAddress = null;
  private String individualDayLimit = null;
  private String usedLimitFromIndividualDayLimit = null;
  private String individualMonthLimit = null;
  private String usedLimitFromIndividualMonthLimit = null;
  private String activeSavingCards = null;
  private String dispatchTypeKey = null;
  private String dispatchTypeText = null;

  /**
   * account number (internal representation) - FCDE: NDO-KTONRGEN
   **/
  public Saving accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  
  @ApiModelProperty(value = "account number (internal representation) - FCDE: NDO-KTONRGEN")
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   * product name - FCDE: NDO-PRANGBEZ
   **/
  public Saving productName(String productName) {
    this.productName = productName;
    return this;
  }

  
  @ApiModelProperty(value = "product name - FCDE: NDO-PRANGBEZ")
  @JsonProperty("productName")
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * sub account name - FCDE: NDO-TTSUKTB
   **/
  public Saving subAccountName(String subAccountName) {
    this.subAccountName = subAccountName;
    return this;
  }

  
  @ApiModelProperty(value = "sub account name - FCDE: NDO-TTSUKTB")
  @JsonProperty("subAccountName")
  public String getSubAccountName() {
    return subAccountName;
  }
  public void setSubAccountName(String subAccountName) {
    this.subAccountName = subAccountName;
  }

  /**
   * depositor name 1 - FCDE: NDO-KTOINH_NAME-1
   **/
  public Saving depositorName1(String depositorName1) {
    this.depositorName1 = depositorName1;
    return this;
  }

  
  @ApiModelProperty(value = "depositor name 1 - FCDE: NDO-KTOINH_NAME-1")
  @JsonProperty("depositorName1")
  public String getDepositorName1() {
    return depositorName1;
  }
  public void setDepositorName1(String depositorName1) {
    this.depositorName1 = depositorName1;
  }

  /**
   * depositor name 2 - FCDE: NDO-KTOINH_NAME-2
   **/
  public Saving depositorName2(String depositorName2) {
    this.depositorName2 = depositorName2;
    return this;
  }

  
  @ApiModelProperty(value = "depositor name 2 - FCDE: NDO-KTOINH_NAME-2")
  @JsonProperty("depositorName2")
  public String getDepositorName2() {
    return depositorName2;
  }
  public void setDepositorName2(String depositorName2) {
    this.depositorName2 = depositorName2;
  }

  /**
   * iso currency code - FCDE: NDO-ISO
   **/
  public Saving currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  
  @ApiModelProperty(value = "iso currency code - FCDE: NDO-ISO")
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * account state (AKTIV, GESCHLOSSEN) - FCDE: NDO-KTOSTAT
   **/
  public Saving accountState(String accountState) {
    this.accountState = accountState;
    return this;
  }

  
  @ApiModelProperty(value = "account state (AKTIV, GESCHLOSSEN) - FCDE: NDO-KTOSTAT")
  @JsonProperty("accountState")
  public String getAccountState() {
    return accountState;
  }
  public void setAccountState(String accountState) {
    this.accountState = accountState;
  }

  /**
   * balance - FCDE: NDO-BTSKPS
   **/
  public Saving balance(String balance) {
    this.balance = balance;
    return this;
  }

  
  @ApiModelProperty(value = "balance - FCDE: NDO-BTSKPS")
  @JsonProperty("balance")
  public String getBalance() {
    return balance;
  }
  public void setBalance(String balance) {
    this.balance = balance;
  }

  /**
   * interest rate - FCDE: NDO-PZSKDE
   **/
  public Saving interestRate(String interestRate) {
    this.interestRate = interestRate;
    return this;
  }

  
  @ApiModelProperty(value = "interest rate - FCDE: NDO-PZSKDE")
  @JsonProperty("interestRate")
  public String getInterestRate() {
    return interestRate;
  }
  public void setInterestRate(String interestRate) {
    this.interestRate = interestRate;
  }

  /**
   * passbook flag (L&#x3D;lose Blatt, C&#x3D;Sparcard) - FCDE: NDO-KZSBUCH
   **/
  public Saving passbookFlag(String passbookFlag) {
    this.passbookFlag = passbookFlag;
    return this;
  }

  
  @ApiModelProperty(value = "passbook flag (L=lose Blatt, C=Sparcard) - FCDE: NDO-KZSBUCH")
  @JsonProperty("passbookFlag")
  public String getPassbookFlag() {
    return passbookFlag;
  }
  public void setPassbookFlag(String passbookFlag) {
    this.passbookFlag = passbookFlag;
  }

  /**
   * opening date - FCDE: DTSEROF
   **/
  public Saving openingDate(String openingDate) {
    this.openingDate = openingDate;
    return this;
  }

  
  @ApiModelProperty(value = "opening date - FCDE: DTSEROF")
  @JsonProperty("openingDate")
  public String getOpeningDate() {
    return openingDate;
  }
  public void setOpeningDate(String openingDate) {
    this.openingDate = openingDate;
  }

  /**
   * type of interest - FCDE: NDO-ZSART
   **/
  public Saving typeOfInterest(String typeOfInterest) {
    this.typeOfInterest = typeOfInterest;
    return this;
  }

  
  @ApiModelProperty(value = "type of interest - FCDE: NDO-ZSART")
  @JsonProperty("typeOfInterest")
  public String getTypeOfInterest() {
    return typeOfInterest;
  }
  public void setTypeOfInterest(String typeOfInterest) {
    this.typeOfInterest = typeOfInterest;
  }

  /**
   * type of interest scale - FCDE: NDO-SFLTYP
   **/
  public Saving typeOfInterestScale(String typeOfInterestScale) {
    this.typeOfInterestScale = typeOfInterestScale;
    return this;
  }

  
  @ApiModelProperty(value = "type of interest scale - FCDE: NDO-SFLTYP")
  @JsonProperty("typeOfInterestScale")
  public String getTypeOfInterestScale() {
    return typeOfInterestScale;
  }
  public void setTypeOfInterestScale(String typeOfInterestScale) {
    this.typeOfInterestScale = typeOfInterestScale;
  }

  /**
   * interest scales - FCDE: NDO-TAB-ZINSSFL
   **/
  public Saving interestScales(List<InterestScale> interestScales) {
    this.interestScales = interestScales;
    return this;
  }

  
  @ApiModelProperty(value = "interest scales - FCDE: NDO-TAB-ZINSSFL")
  @JsonProperty("interestScales")
  public List<InterestScale> getInterestScales() {
    return interestScales;
  }
  public void setInterestScales(List<InterestScale> interestScales) {
    this.interestScales = interestScales;
  }

  /**
   * cancellation period - FCDE: NDO-SDSKDG
   **/
  public Saving cancellationPeriod(String cancellationPeriod) {
    this.cancellationPeriod = cancellationPeriod;
    return this;
  }

  
  @ApiModelProperty(value = "cancellation period - FCDE: NDO-SDSKDG")
  @JsonProperty("cancellationPeriod")
  public String getCancellationPeriod() {
    return cancellationPeriod;
  }
  public void setCancellationPeriod(String cancellationPeriod) {
    this.cancellationPeriod = cancellationPeriod;
  }

  /**
   * special saving key - FCDE: NDO-SDSSON
   **/
  public Saving specialSavingKey(String specialSavingKey) {
    this.specialSavingKey = specialSavingKey;
    return this;
  }

  
  @ApiModelProperty(value = "special saving key - FCDE: NDO-SDSSON")
  @JsonProperty("specialSavingKey")
  public String getSpecialSavingKey() {
    return specialSavingKey;
  }
  public void setSpecialSavingKey(String specialSavingKey) {
    this.specialSavingKey = specialSavingKey;
  }

  /**
   * bonus type (A, B, F) - FCDE: NDO-SDSBON
   **/
  public Saving bonusType(String bonusType) {
    this.bonusType = bonusType;
    return this;
  }

  
  @ApiModelProperty(value = "bonus type (A, B, F) - FCDE: NDO-SDSBON")
  @JsonProperty("bonusType")
  public String getBonusType() {
    return bonusType;
  }
  public void setBonusType(String bonusType) {
    this.bonusType = bonusType;
  }

  /**
   * bonus amount - FCDE: NDO-BTSBBET
   **/
  public Saving bonusAmount(String bonusAmount) {
    this.bonusAmount = bonusAmount;
    return this;
  }

  
  @ApiModelProperty(value = "bonus amount - FCDE: NDO-BTSBBET")
  @JsonProperty("bonusAmount")
  public String getBonusAmount() {
    return bonusAmount;
  }
  public void setBonusAmount(String bonusAmount) {
    this.bonusAmount = bonusAmount;
  }

  /**
   * interst bonification - FCDE: NDO-BTSBZS
   **/
  public Saving interstBonification(String interstBonification) {
    this.interstBonification = interstBonification;
    return this;
  }

  
  @ApiModelProperty(value = "interst bonification - FCDE: NDO-BTSBZS")
  @JsonProperty("interstBonification")
  public String getInterstBonification() {
    return interstBonification;
  }
  public void setInterstBonification(String interstBonification) {
    this.interstBonification = interstBonification;
  }

  /**
   * bonus validity period start - FCDE: NDO-DTSBBEG
   **/
  public Saving bonusValidityPeriodStart(String bonusValidityPeriodStart) {
    this.bonusValidityPeriodStart = bonusValidityPeriodStart;
    return this;
  }

  
  @ApiModelProperty(value = "bonus validity period start - FCDE: NDO-DTSBBEG")
  @JsonProperty("bonusValidityPeriodStart")
  public String getBonusValidityPeriodStart() {
    return bonusValidityPeriodStart;
  }
  public void setBonusValidityPeriodStart(String bonusValidityPeriodStart) {
    this.bonusValidityPeriodStart = bonusValidityPeriodStart;
  }

  /**
   * bonus validity period end - FCDE: NDO-DTSBEND
   **/
  public Saving bonusValidityPeriodEnd(String bonusValidityPeriodEnd) {
    this.bonusValidityPeriodEnd = bonusValidityPeriodEnd;
    return this;
  }

  
  @ApiModelProperty(value = "bonus validity period end - FCDE: NDO-DTSBEND")
  @JsonProperty("bonusValidityPeriodEnd")
  public String getBonusValidityPeriodEnd() {
    return bonusValidityPeriodEnd;
  }
  public void setBonusValidityPeriodEnd(String bonusValidityPeriodEnd) {
    this.bonusValidityPeriodEnd = bonusValidityPeriodEnd;
  }

  /**
   * bonus total interest rate - FCDE: NDO-PZSBGZS
   **/
  public Saving bonusTotalInterestRate(String bonusTotalInterestRate) {
    this.bonusTotalInterestRate = bonusTotalInterestRate;
    return this;
  }

  
  @ApiModelProperty(value = "bonus total interest rate - FCDE: NDO-PZSBGZS")
  @JsonProperty("bonusTotalInterestRate")
  public String getBonusTotalInterestRate() {
    return bonusTotalInterestRate;
  }
  public void setBonusTotalInterestRate(String bonusTotalInterestRate) {
    this.bonusTotalInterestRate = bonusTotalInterestRate;
  }

  /**
   * bonus prolongation agreement - FCDE: NDO-TBPROLV
   **/
  public Saving bonusProlongationAgreement(String bonusProlongationAgreement) {
    this.bonusProlongationAgreement = bonusProlongationAgreement;
    return this;
  }

  
  @ApiModelProperty(value = "bonus prolongation agreement - FCDE: NDO-TBPROLV")
  @JsonProperty("bonusProlongationAgreement")
  public String getBonusProlongationAgreement() {
    return bonusProlongationAgreement;
  }
  public void setBonusProlongationAgreement(String bonusProlongationAgreement) {
    this.bonusProlongationAgreement = bonusProlongationAgreement;
  }

  /**
   * administration marks - FCDE: NDO-TAB_VKZ
   **/
  public Saving administrationMarks(List<Label> administrationMarks) {
    this.administrationMarks = administrationMarks;
    return this;
  }

  
  @ApiModelProperty(value = "administration marks - FCDE: NDO-TAB_VKZ")
  @JsonProperty("administrationMarks")
  public List<Label> getAdministrationMarks() {
    return administrationMarks;
  }
  public void setAdministrationMarks(List<Label> administrationMarks) {
    this.administrationMarks = administrationMarks;
  }

  /**
   * interst to year ultimo - FCDE: NDO-BTSZSS
   **/
  public Saving interestToYearUltimo(String interestToYearUltimo) {
    this.interestToYearUltimo = interestToYearUltimo;
    return this;
  }

  
  @ApiModelProperty(value = "interst to year ultimo - FCDE: NDO-BTSZSS")
  @JsonProperty("interestToYearUltimo")
  public String getInterestToYearUltimo() {
    return interestToYearUltimo;
  }
  public void setInterestToYearUltimo(String interestToYearUltimo) {
    this.interestToYearUltimo = interestToYearUltimo;
  }

  /**
   * current interest claim - FCDE: NDO-AKT_BTZSS
   **/
  public Saving currentInterestClaim(String currentInterestClaim) {
    this.currentInterestClaim = currentInterestClaim;
    return this;
  }

  
  @ApiModelProperty(value = "current interest claim - FCDE: NDO-AKT_BTZSS")
  @JsonProperty("currentInterestClaim")
  public String getCurrentInterestClaim() {
    return currentInterestClaim;
  }
  public void setCurrentInterestClaim(String currentInterestClaim) {
    this.currentInterestClaim = currentInterestClaim;
  }

  /**
   * early withdrawal penalty - FCDE: NDO-VZ
   **/
  public Saving earlyWithdrawalPenalty(String earlyWithdrawalPenalty) {
    this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
    return this;
  }

  
  @ApiModelProperty(value = "early withdrawal penalty - FCDE: NDO-VZ")
  @JsonProperty("earlyWithdrawalPenalty")
  public String getEarlyWithdrawalPenalty() {
    return earlyWithdrawalPenalty;
  }
  public void setEarlyWithdrawalPenalty(String earlyWithdrawalPenalty) {
    this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
  }

  /**
   * list of cancellations - FCDE: NDO-TAB-KDG
   **/
  public Saving cancellations(List<Calcellation> cancellations) {
    this.cancellations = cancellations;
    return this;
  }

  
  @ApiModelProperty(value = "list of cancellations - FCDE: NDO-TAB-KDG")
  @JsonProperty("cancellations")
  public List<Calcellation> getCancellations() {
    return cancellations;
  }
  public void setCancellations(List<Calcellation> cancellations) {
    this.cancellations = cancellations;
  }

  /**
   * list of free amounts - FCDE: NDO-TAB-FREI
   **/
  public Saving elementsOfFreeAmounts(List<Amount> elementsOfFreeAmounts) {
    this.elementsOfFreeAmounts = elementsOfFreeAmounts;
    return this;
  }

  
  @ApiModelProperty(value = "list of free amounts - FCDE: NDO-TAB-FREI")
  @JsonProperty("elementsOfFreeAmounts")
  public List<Amount> getElementsOfFreeAmounts() {
    return elementsOfFreeAmounts;
  }
  public void setElementsOfFreeAmounts(List<Amount> elementsOfFreeAmounts) {
    this.elementsOfFreeAmounts = elementsOfFreeAmounts;
  }

  /**
   * dynamic saving plan key - FCDE: NDO-KZSDYN
   **/
  public Saving dynSavingPlanKey(String dynSavingPlanKey) {
    this.dynSavingPlanKey = dynSavingPlanKey;
    return this;
  }

  
  @ApiModelProperty(value = "dynamic saving plan key - FCDE: NDO-KZSDYN")
  @JsonProperty("dynSavingPlanKey")
  public String getDynSavingPlanKey() {
    return dynSavingPlanKey;
  }
  public void setDynSavingPlanKey(String dynSavingPlanKey) {
    this.dynSavingPlanKey = dynSavingPlanKey;
  }

  /**
   * dynamic savings interest rate - FCDE: NDO-PZSKDYN
   **/
  public Saving dynSavingsInterestRate(String dynSavingsInterestRate) {
    this.dynSavingsInterestRate = dynSavingsInterestRate;
    return this;
  }

  
  @ApiModelProperty(value = "dynamic savings interest rate - FCDE: NDO-PZSKDYN")
  @JsonProperty("dynSavingsInterestRate")
  public String getDynSavingsInterestRate() {
    return dynSavingsInterestRate;
  }
  public void setDynSavingsInterestRate(String dynSavingsInterestRate) {
    this.dynSavingsInterestRate = dynSavingsInterestRate;
  }

  /**
   * list of dynamic saving bonus scale - FCDE: NDO-TAB-BDYN
   **/
  public Saving dynamicSavingBonusScales(List<BonusScale> dynamicSavingBonusScales) {
    this.dynamicSavingBonusScales = dynamicSavingBonusScales;
    return this;
  }

  
  @ApiModelProperty(value = "list of dynamic saving bonus scale - FCDE: NDO-TAB-BDYN")
  @JsonProperty("dynamicSavingBonusScales")
  public List<BonusScale> getDynamicSavingBonusScales() {
    return dynamicSavingBonusScales;
  }
  public void setDynamicSavingBonusScales(List<BonusScale> dynamicSavingBonusScales) {
    this.dynamicSavingBonusScales = dynamicSavingBonusScales;
  }

  /**
   * retainage frequency - FCDE: NDO-SDSDYART
   **/
  public Saving retainageFrequency(String retainageFrequency) {
    this.retainageFrequency = retainageFrequency;
    return this;
  }

  
  @ApiModelProperty(value = "retainage frequency - FCDE: NDO-SDSDYART")
  @JsonProperty("retainageFrequency")
  public String getRetainageFrequency() {
    return retainageFrequency;
  }
  public void setRetainageFrequency(String retainageFrequency) {
    this.retainageFrequency = retainageFrequency;
  }

  /**
   * dynamic saving plan rate - FCDE: NDO-BTSDYRAT
   **/
  public Saving dynSavingsRate(String dynSavingsRate) {
    this.dynSavingsRate = dynSavingsRate;
    return this;
  }

  
  @ApiModelProperty(value = "dynamic saving plan rate - FCDE: NDO-BTSDYRAT")
  @JsonProperty("dynSavingsRate")
  public String getDynSavingsRate() {
    return dynSavingsRate;
  }
  public void setDynSavingsRate(String dynSavingsRate) {
    this.dynSavingsRate = dynSavingsRate;
  }

  /**
   * dynamic saving duration start- FCDE: NDO-DTSDYBEG
   **/
  public Saving dynSavingDurationStart(String dynSavingDurationStart) {
    this.dynSavingDurationStart = dynSavingDurationStart;
    return this;
  }

  
  @ApiModelProperty(value = "dynamic saving duration start- FCDE: NDO-DTSDYBEG")
  @JsonProperty("dynSavingDurationStart")
  public String getDynSavingDurationStart() {
    return dynSavingDurationStart;
  }
  public void setDynSavingDurationStart(String dynSavingDurationStart) {
    this.dynSavingDurationStart = dynSavingDurationStart;
  }

  /**
   * dynamic saving duration end - FCDE: NDO-DTSDYEND
   **/
  public Saving dynSavingDurationEnd(String dynSavingDurationEnd) {
    this.dynSavingDurationEnd = dynSavingDurationEnd;
    return this;
  }

  
  @ApiModelProperty(value = "dynamic saving duration end - FCDE: NDO-DTSDYEND")
  @JsonProperty("dynSavingDurationEnd")
  public String getDynSavingDurationEnd() {
    return dynSavingDurationEnd;
  }
  public void setDynSavingDurationEnd(String dynSavingDurationEnd) {
    this.dynSavingDurationEnd = dynSavingDurationEnd;
  }

  /**
   * last account statement - FCDE: NDO-DTSPLAUS
   **/
  public Saving lastAccountStatement(String lastAccountStatement) {
    this.lastAccountStatement = lastAccountStatement;
    return this;
  }

  
  @ApiModelProperty(value = "last account statement - FCDE: NDO-DTSPLAUS")
  @JsonProperty("lastAccountStatement")
  public String getLastAccountStatement() {
    return lastAccountStatement;
  }
  public void setLastAccountStatement(String lastAccountStatement) {
    this.lastAccountStatement = lastAccountStatement;
  }

  /**
   * last account statement number- FCDE: NDO-AZSAUSZ
   **/
  public Saving lastAccountStatementNumber(String lastAccountStatementNumber) {
    this.lastAccountStatementNumber = lastAccountStatementNumber;
    return this;
  }

  
  @ApiModelProperty(value = "last account statement number- FCDE: NDO-AZSAUSZ")
  @JsonProperty("lastAccountStatementNumber")
  public String getLastAccountStatementNumber() {
    return lastAccountStatementNumber;
  }
  public void setLastAccountStatementNumber(String lastAccountStatementNumber) {
    this.lastAccountStatementNumber = lastAccountStatementNumber;
  }

  /**
   * last account statement balance - FCDE: NDO-BTSBSAL
   **/
  public Saving lastAccountStatementBalance(String lastAccountStatementBalance) {
    this.lastAccountStatementBalance = lastAccountStatementBalance;
    return this;
  }

  
  @ApiModelProperty(value = "last account statement balance - FCDE: NDO-BTSBSAL")
  @JsonProperty("lastAccountStatementBalance")
  public String getLastAccountStatementBalance() {
    return lastAccountStatementBalance;
  }
  public void setLastAccountStatementBalance(String lastAccountStatementBalance) {
    this.lastAccountStatementBalance = lastAccountStatementBalance;
  }

  /**
   * name of divergent sending address 1 - FCDE: NDO-VSA-NAME-1
   **/
  public Saving nameDivergentSendingAddress1(String nameDivergentSendingAddress1) {
    this.nameDivergentSendingAddress1 = nameDivergentSendingAddress1;
    return this;
  }

  
  @ApiModelProperty(value = "name of divergent sending address 1 - FCDE: NDO-VSA-NAME-1")
  @JsonProperty("nameDivergentSendingAddress1")
  public String getNameDivergentSendingAddress1() {
    return nameDivergentSendingAddress1;
  }
  public void setNameDivergentSendingAddress1(String nameDivergentSendingAddress1) {
    this.nameDivergentSendingAddress1 = nameDivergentSendingAddress1;
  }

  /**
   * name of divergent sending address 2- FCDE: NDO-VSA-NAME-2
   **/
  public Saving nameDivergentSendingAddress2(String nameDivergentSendingAddress2) {
    this.nameDivergentSendingAddress2 = nameDivergentSendingAddress2;
    return this;
  }

  
  @ApiModelProperty(value = "name of divergent sending address 2- FCDE: NDO-VSA-NAME-2")
  @JsonProperty("nameDivergentSendingAddress2")
  public String getNameDivergentSendingAddress2() {
    return nameDivergentSendingAddress2;
  }
  public void setNameDivergentSendingAddress2(String nameDivergentSendingAddress2) {
    this.nameDivergentSendingAddress2 = nameDivergentSendingAddress2;
  }

  /**
   * street of divergent sending address - FCDE: NDO-VSA-STRASSE
   **/
  public Saving streetOfDivergentSendingAddress(String streetOfDivergentSendingAddress) {
    this.streetOfDivergentSendingAddress = streetOfDivergentSendingAddress;
    return this;
  }

  
  @ApiModelProperty(value = "street of divergent sending address - FCDE: NDO-VSA-STRASSE")
  @JsonProperty("streetOfDivergentSendingAddress")
  public String getStreetOfDivergentSendingAddress() {
    return streetOfDivergentSendingAddress;
  }
  public void setStreetOfDivergentSendingAddress(String streetOfDivergentSendingAddress) {
    this.streetOfDivergentSendingAddress = streetOfDivergentSendingAddress;
  }

  /**
   * town  of divergent sending address - FCDE: NDO-VSA-ORT
   **/
  public Saving townOfDivergentSendingAddress(String townOfDivergentSendingAddress) {
    this.townOfDivergentSendingAddress = townOfDivergentSendingAddress;
    return this;
  }

  
  @ApiModelProperty(value = "town  of divergent sending address - FCDE: NDO-VSA-ORT")
  @JsonProperty("townOfDivergentSendingAddress")
  public String getTownOfDivergentSendingAddress() {
    return townOfDivergentSendingAddress;
  }
  public void setTownOfDivergentSendingAddress(String townOfDivergentSendingAddress) {
    this.townOfDivergentSendingAddress = townOfDivergentSendingAddress;
  }

  /**
   * individual limit of the day - FCDE: NDO-TLIMIT
   **/
  public Saving individualDayLimit(String individualDayLimit) {
    this.individualDayLimit = individualDayLimit;
    return this;
  }

  
  @ApiModelProperty(value = "individual limit of the day - FCDE: NDO-TLIMIT")
  @JsonProperty("individualDayLimit")
  public String getIndividualDayLimit() {
    return individualDayLimit;
  }
  public void setIndividualDayLimit(String individualDayLimit) {
    this.individualDayLimit = individualDayLimit;
  }

  /**
   * used limit from individual day limit - FCDE: NDO-BTTGVERF
   **/
  public Saving usedLimitFromIndividualDayLimit(String usedLimitFromIndividualDayLimit) {
    this.usedLimitFromIndividualDayLimit = usedLimitFromIndividualDayLimit;
    return this;
  }

  
  @ApiModelProperty(value = "used limit from individual day limit - FCDE: NDO-BTTGVERF")
  @JsonProperty("usedLimitFromIndividualDayLimit")
  public String getUsedLimitFromIndividualDayLimit() {
    return usedLimitFromIndividualDayLimit;
  }
  public void setUsedLimitFromIndividualDayLimit(String usedLimitFromIndividualDayLimit) {
    this.usedLimitFromIndividualDayLimit = usedLimitFromIndividualDayLimit;
  }

  /**
   * individual limit of the month - FCDE: NDO-MLIMIT
   **/
  public Saving individualMonthLimit(String individualMonthLimit) {
    this.individualMonthLimit = individualMonthLimit;
    return this;
  }

  
  @ApiModelProperty(value = "individual limit of the month - FCDE: NDO-MLIMIT")
  @JsonProperty("individualMonthLimit")
  public String getIndividualMonthLimit() {
    return individualMonthLimit;
  }
  public void setIndividualMonthLimit(String individualMonthLimit) {
    this.individualMonthLimit = individualMonthLimit;
  }

  /**
   * used limit from individual month limit - FCDE: NDO-BTMTVERF
   **/
  public Saving usedLimitFromIndividualMonthLimit(String usedLimitFromIndividualMonthLimit) {
    this.usedLimitFromIndividualMonthLimit = usedLimitFromIndividualMonthLimit;
    return this;
  }

  
  @ApiModelProperty(value = "used limit from individual month limit - FCDE: NDO-BTMTVERF")
  @JsonProperty("usedLimitFromIndividualMonthLimit")
  public String getUsedLimitFromIndividualMonthLimit() {
    return usedLimitFromIndividualMonthLimit;
  }
  public void setUsedLimitFromIndividualMonthLimit(String usedLimitFromIndividualMonthLimit) {
    this.usedLimitFromIndividualMonthLimit = usedLimitFromIndividualMonthLimit;
  }

  /**
   * active saving cards - FCDE: NDO-CARDANZ
   **/
  public Saving activeSavingCards(String activeSavingCards) {
    this.activeSavingCards = activeSavingCards;
    return this;
  }

  
  @ApiModelProperty(value = "active saving cards - FCDE: NDO-CARDANZ")
  @JsonProperty("activeSavingCards")
  public String getActiveSavingCards() {
    return activeSavingCards;
  }
  public void setActiveSavingCards(String activeSavingCards) {
    this.activeSavingCards = activeSavingCards;
  }

  /**
   * dispatch type key - FCDE: NDO-VSA
   **/
  public Saving dispatchTypeKey(String dispatchTypeKey) {
    this.dispatchTypeKey = dispatchTypeKey;
    return this;
  }

  
  @ApiModelProperty(value = "dispatch type key - FCDE: NDO-VSA")
  @JsonProperty("dispatchTypeKey")
  public String getDispatchTypeKey() {
    return dispatchTypeKey;
  }
  public void setDispatchTypeKey(String dispatchTypeKey) {
    this.dispatchTypeKey = dispatchTypeKey;
  }

  /**
   * text for the dispatch key - FCDE: NDO-TVSA
   **/
  public Saving dispatchTypeText(String dispatchTypeText) {
    this.dispatchTypeText = dispatchTypeText;
    return this;
  }

  
  @ApiModelProperty(value = "text for the dispatch key - FCDE: NDO-TVSA")
  @JsonProperty("dispatchTypeText")
  public String getDispatchTypeText() {
    return dispatchTypeText;
  }
  public void setDispatchTypeText(String dispatchTypeText) {
    this.dispatchTypeText = dispatchTypeText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Saving saving = (Saving) o;
    return Objects.equals(accountNumber, saving.accountNumber) &&
        Objects.equals(productName, saving.productName) &&
        Objects.equals(subAccountName, saving.subAccountName) &&
        Objects.equals(depositorName1, saving.depositorName1) &&
        Objects.equals(depositorName2, saving.depositorName2) &&
        Objects.equals(currencyCode, saving.currencyCode) &&
        Objects.equals(accountState, saving.accountState) &&
        Objects.equals(balance, saving.balance) &&
        Objects.equals(interestRate, saving.interestRate) &&
        Objects.equals(passbookFlag, saving.passbookFlag) &&
        Objects.equals(openingDate, saving.openingDate) &&
        Objects.equals(typeOfInterest, saving.typeOfInterest) &&
        Objects.equals(typeOfInterestScale, saving.typeOfInterestScale) &&
        Objects.equals(interestScales, saving.interestScales) &&
        Objects.equals(cancellationPeriod, saving.cancellationPeriod) &&
        Objects.equals(specialSavingKey, saving.specialSavingKey) &&
        Objects.equals(bonusType, saving.bonusType) &&
        Objects.equals(bonusAmount, saving.bonusAmount) &&
        Objects.equals(interstBonification, saving.interstBonification) &&
        Objects.equals(bonusValidityPeriodStart, saving.bonusValidityPeriodStart) &&
        Objects.equals(bonusValidityPeriodEnd, saving.bonusValidityPeriodEnd) &&
        Objects.equals(bonusTotalInterestRate, saving.bonusTotalInterestRate) &&
        Objects.equals(bonusProlongationAgreement, saving.bonusProlongationAgreement) &&
        Objects.equals(administrationMarks, saving.administrationMarks) &&
        Objects.equals(interestToYearUltimo, saving.interestToYearUltimo) &&
        Objects.equals(currentInterestClaim, saving.currentInterestClaim) &&
        Objects.equals(earlyWithdrawalPenalty, saving.earlyWithdrawalPenalty) &&
        Objects.equals(cancellations, saving.cancellations) &&
        Objects.equals(elementsOfFreeAmounts, saving.elementsOfFreeAmounts) &&
        Objects.equals(dynSavingPlanKey, saving.dynSavingPlanKey) &&
        Objects.equals(dynSavingsInterestRate, saving.dynSavingsInterestRate) &&
        Objects.equals(dynamicSavingBonusScales, saving.dynamicSavingBonusScales) &&
        Objects.equals(retainageFrequency, saving.retainageFrequency) &&
        Objects.equals(dynSavingsRate, saving.dynSavingsRate) &&
        Objects.equals(dynSavingDurationStart, saving.dynSavingDurationStart) &&
        Objects.equals(dynSavingDurationEnd, saving.dynSavingDurationEnd) &&
        Objects.equals(lastAccountStatement, saving.lastAccountStatement) &&
        Objects.equals(lastAccountStatementNumber, saving.lastAccountStatementNumber) &&
        Objects.equals(lastAccountStatementBalance, saving.lastAccountStatementBalance) &&
        Objects.equals(nameDivergentSendingAddress1, saving.nameDivergentSendingAddress1) &&
        Objects.equals(nameDivergentSendingAddress2, saving.nameDivergentSendingAddress2) &&
        Objects.equals(streetOfDivergentSendingAddress, saving.streetOfDivergentSendingAddress) &&
        Objects.equals(townOfDivergentSendingAddress, saving.townOfDivergentSendingAddress) &&
        Objects.equals(individualDayLimit, saving.individualDayLimit) &&
        Objects.equals(usedLimitFromIndividualDayLimit, saving.usedLimitFromIndividualDayLimit) &&
        Objects.equals(individualMonthLimit, saving.individualMonthLimit) &&
        Objects.equals(usedLimitFromIndividualMonthLimit, saving.usedLimitFromIndividualMonthLimit) &&
        Objects.equals(activeSavingCards, saving.activeSavingCards) &&
        Objects.equals(dispatchTypeKey, saving.dispatchTypeKey) &&
        Objects.equals(dispatchTypeText, saving.dispatchTypeText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, productName, subAccountName, depositorName1, depositorName2, currencyCode, accountState, balance, interestRate, passbookFlag, openingDate, typeOfInterest, typeOfInterestScale, interestScales, cancellationPeriod, specialSavingKey, bonusType, bonusAmount, interstBonification, bonusValidityPeriodStart, bonusValidityPeriodEnd, bonusTotalInterestRate, bonusProlongationAgreement, administrationMarks, interestToYearUltimo, currentInterestClaim, earlyWithdrawalPenalty, cancellations, elementsOfFreeAmounts, dynSavingPlanKey, dynSavingsInterestRate, dynamicSavingBonusScales, retainageFrequency, dynSavingsRate, dynSavingDurationStart, dynSavingDurationEnd, lastAccountStatement, lastAccountStatementNumber, lastAccountStatementBalance, nameDivergentSendingAddress1, nameDivergentSendingAddress2, streetOfDivergentSendingAddress, townOfDivergentSendingAddress, individualDayLimit, usedLimitFromIndividualDayLimit, individualMonthLimit, usedLimitFromIndividualMonthLimit, activeSavingCards, dispatchTypeKey, dispatchTypeText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Saving {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    subAccountName: ").append(toIndentedString(subAccountName)).append("\n");
    sb.append("    depositorName1: ").append(toIndentedString(depositorName1)).append("\n");
    sb.append("    depositorName2: ").append(toIndentedString(depositorName2)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    accountState: ").append(toIndentedString(accountState)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    passbookFlag: ").append(toIndentedString(passbookFlag)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    typeOfInterest: ").append(toIndentedString(typeOfInterest)).append("\n");
    sb.append("    typeOfInterestScale: ").append(toIndentedString(typeOfInterestScale)).append("\n");
    sb.append("    interestScales: ").append(toIndentedString(interestScales)).append("\n");
    sb.append("    cancellationPeriod: ").append(toIndentedString(cancellationPeriod)).append("\n");
    sb.append("    specialSavingKey: ").append(toIndentedString(specialSavingKey)).append("\n");
    sb.append("    bonusType: ").append(toIndentedString(bonusType)).append("\n");
    sb.append("    bonusAmount: ").append(toIndentedString(bonusAmount)).append("\n");
    sb.append("    interstBonification: ").append(toIndentedString(interstBonification)).append("\n");
    sb.append("    bonusValidityPeriodStart: ").append(toIndentedString(bonusValidityPeriodStart)).append("\n");
    sb.append("    bonusValidityPeriodEnd: ").append(toIndentedString(bonusValidityPeriodEnd)).append("\n");
    sb.append("    bonusTotalInterestRate: ").append(toIndentedString(bonusTotalInterestRate)).append("\n");
    sb.append("    bonusProlongationAgreement: ").append(toIndentedString(bonusProlongationAgreement)).append("\n");
    sb.append("    administrationMarks: ").append(toIndentedString(administrationMarks)).append("\n");
    sb.append("    interestToYearUltimo: ").append(toIndentedString(interestToYearUltimo)).append("\n");
    sb.append("    currentInterestClaim: ").append(toIndentedString(currentInterestClaim)).append("\n");
    sb.append("    earlyWithdrawalPenalty: ").append(toIndentedString(earlyWithdrawalPenalty)).append("\n");
    sb.append("    cancellations: ").append(toIndentedString(cancellations)).append("\n");
    sb.append("    elementsOfFreeAmounts: ").append(toIndentedString(elementsOfFreeAmounts)).append("\n");
    sb.append("    dynSavingPlanKey: ").append(toIndentedString(dynSavingPlanKey)).append("\n");
    sb.append("    dynSavingsInterestRate: ").append(toIndentedString(dynSavingsInterestRate)).append("\n");
    sb.append("    dynamicSavingBonusScales: ").append(toIndentedString(dynamicSavingBonusScales)).append("\n");
    sb.append("    retainageFrequency: ").append(toIndentedString(retainageFrequency)).append("\n");
    sb.append("    dynSavingsRate: ").append(toIndentedString(dynSavingsRate)).append("\n");
    sb.append("    dynSavingDurationStart: ").append(toIndentedString(dynSavingDurationStart)).append("\n");
    sb.append("    dynSavingDurationEnd: ").append(toIndentedString(dynSavingDurationEnd)).append("\n");
    sb.append("    lastAccountStatement: ").append(toIndentedString(lastAccountStatement)).append("\n");
    sb.append("    lastAccountStatementNumber: ").append(toIndentedString(lastAccountStatementNumber)).append("\n");
    sb.append("    lastAccountStatementBalance: ").append(toIndentedString(lastAccountStatementBalance)).append("\n");
    sb.append("    nameDivergentSendingAddress1: ").append(toIndentedString(nameDivergentSendingAddress1)).append("\n");
    sb.append("    nameDivergentSendingAddress2: ").append(toIndentedString(nameDivergentSendingAddress2)).append("\n");
    sb.append("    streetOfDivergentSendingAddress: ").append(toIndentedString(streetOfDivergentSendingAddress)).append("\n");
    sb.append("    townOfDivergentSendingAddress: ").append(toIndentedString(townOfDivergentSendingAddress)).append("\n");
    sb.append("    individualDayLimit: ").append(toIndentedString(individualDayLimit)).append("\n");
    sb.append("    usedLimitFromIndividualDayLimit: ").append(toIndentedString(usedLimitFromIndividualDayLimit)).append("\n");
    sb.append("    individualMonthLimit: ").append(toIndentedString(individualMonthLimit)).append("\n");
    sb.append("    usedLimitFromIndividualMonthLimit: ").append(toIndentedString(usedLimitFromIndividualMonthLimit)).append("\n");
    sb.append("    activeSavingCards: ").append(toIndentedString(activeSavingCards)).append("\n");
    sb.append("    dispatchTypeKey: ").append(toIndentedString(dispatchTypeKey)).append("\n");
    sb.append("    dispatchTypeText: ").append(toIndentedString(dispatchTypeText)).append("\n");
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

