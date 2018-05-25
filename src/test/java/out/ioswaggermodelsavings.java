package out;

import java.util.ArrayList;

import data.faker.MockUtil;
import data.faker.NameStringGenerator;
import io.swagger.model.savings.Amount;
import io.swagger.model.savings.Block;
import io.swagger.model.savings.BonusScale;
import io.swagger.model.savings.Calcellation;
import io.swagger.model.savings.Error;
import io.swagger.model.savings.InterestScale;
import io.swagger.model.savings.Label;
import io.swagger.model.savings.Saving;

public class ioswaggermodelsavings {
	public Amount createAmount() {
		Amount obj = new Amount();
		obj.setFreeAmountType(NameStringGenerator.getInstance().createNameString("FreeAmountType"));
		obj.setFreeAmountUsedLimit(NameStringGenerator.getInstance().createNameString("FreeAmountUsedLimit"));
		obj.setFreeAmount(NameStringGenerator.getInstance().createNameString("FreeAmount"));
		obj.setFreeAmountLastDispositionDate(
				NameStringGenerator.getInstance().createNameString("FreeAmountLastDispositionDate"));
		return obj;
	}

	public Block createBlock() {
		Block obj = new Block();
		obj.setType(NameStringGenerator.getInstance().createNameString("Type"));
		return obj;
	}

	public BonusScale createBonusScale() {
		BonusScale obj = new BonusScale();
		obj.setDynBonusSavingsText(NameStringGenerator.getInstance().createNameString("DynBonusSavingsText"));
		obj.setDynBonusSavingsInterestRate(
				NameStringGenerator.getInstance().createNameString("DynBonusSavingsInterestRate"));
		return obj;
	}

	public Calcellation createCalcellation() {
		Calcellation obj = new Calcellation();
		obj.setCanceledAmount(NameStringGenerator.getInstance().createNameString("CanceledAmount"));
		obj.setCancellationAmountUsedLimit(
				NameStringGenerator.getInstance().createNameString("CancellationAmountUsedLimit"));
		obj.setCancellationDepositFirst(NameStringGenerator.getInstance().createNameString("CancellationDepositFirst"));
		obj.setCancellationDepositLast(NameStringGenerator.getInstance().createNameString("CancellationDepositLast"));
		return obj;
	}

	public Error createError() {
		Error obj = new Error();
		obj.setMessage(NameStringGenerator.getInstance().createNameString("Message"));
		obj.setStatus(MockUtil.getInstance().returnInteger(100));
		return obj;
	}

	public InterestScale createInterestScale() {
		InterestScale obj = new InterestScale();
		obj.setSizeOfLowerLimit(NameStringGenerator.getInstance().createNameString("SizeOfLowerLimit"));
		obj.setSizeOfUpperLimit(NameStringGenerator.getInstance().createNameString("SizeOfUpperLimit"));
		obj.setInterestRateofScale(NameStringGenerator.getInstance().createNameString("InterestRateofScale"));
		return obj;
	}

	public Label createLabel() {
		Label obj = new Label();
		obj.setAdministrationKey(NameStringGenerator.getInstance().createNameString("AdministrationKey"));
		obj.setAdministrationText(NameStringGenerator.getInstance().createNameString("AdministrationText"));
		obj.setProcessingCode(NameStringGenerator.getInstance().createNameString("ProcessingCode"));
		return obj;
	}

	public Saving createSaving() {
		Saving obj = new Saving();
		obj.setAccountNumber(NameStringGenerator.getInstance().createNameString("AccountNumber"));
		obj.setProductName(NameStringGenerator.getInstance().createNameString("ProductName"));
		obj.setCurrencyCode(NameStringGenerator.getInstance().createNameString("CurrencyCode"));
		obj.setAccountState(NameStringGenerator.getInstance().createNameString("AccountState"));
		obj.setBalance(NameStringGenerator.getInstance().createNameString("Balance"));
		obj.setInterestRate(NameStringGenerator.getInstance().createNameString("InterestRate"));
		obj.setPassbookFlag(NameStringGenerator.getInstance().createNameString("PassbookFlag"));
		obj.setOpeningDate(NameStringGenerator.getInstance().createNameString("OpeningDate"));
		obj.setBonusType(NameStringGenerator.getInstance().createNameString("BonusType"));
		obj.setBonusAmount(NameStringGenerator.getInstance().createNameString("BonusAmount"));
		// list here
		ArrayList<Calcellation> oList1 = new ArrayList<Calcellation>();
		for (int i = 0; i < 2; i++) {
			oList1.add(createCalcellation());
		}
		obj.setCancellations(oList1);
		obj.setSubAccountName(NameStringGenerator.getInstance().createNameString("SubAccountName"));
		obj.setDepositorName1(NameStringGenerator.getInstance().createNameString("DepositorName1"));
		obj.setDepositorName2(NameStringGenerator.getInstance().createNameString("DepositorName2"));
		obj.setTypeOfInterest(NameStringGenerator.getInstance().createNameString("TypeOfInterest"));
		obj.setTypeOfInterestScale(NameStringGenerator.getInstance().createNameString("TypeOfInterestScale"));
		// list here
		ArrayList<InterestScale> oList2 = new ArrayList<InterestScale>();
		for (int i = 0; i < 2; i++) {
			oList2.add(createInterestScale());
		}
		obj.setInterestScales(oList2);
		obj.setCancellationPeriod(NameStringGenerator.getInstance().createNameString("CancellationPeriod"));
		obj.setSpecialSavingKey(NameStringGenerator.getInstance().createNameString("SpecialSavingKey"));
		obj.setInterstBonification(NameStringGenerator.getInstance().createNameString("InterstBonification"));
		obj.setBonusValidityPeriodStart(NameStringGenerator.getInstance().createNameString("BonusValidityPeriodStart"));
		obj.setBonusValidityPeriodEnd(NameStringGenerator.getInstance().createNameString("BonusValidityPeriodEnd"));
		obj.setBonusTotalInterestRate(NameStringGenerator.getInstance().createNameString("BonusTotalInterestRate"));
		obj.setBonusProlongationAgreement(
				NameStringGenerator.getInstance().createNameString("BonusProlongationAgreement"));
		// list here
		ArrayList<Label> oList3 = new ArrayList<Label>();
		for (int i = 0; i < 2; i++) {
			oList3.add(createLabel());
		}
		obj.setAdministrationMarks(oList3);
		obj.setInterestToYearUltimo(NameStringGenerator.getInstance().createNameString("InterestToYearUltimo"));
		obj.setCurrentInterestClaim(NameStringGenerator.getInstance().createNameString("CurrentInterestClaim"));
		obj.setEarlyWithdrawalPenalty(NameStringGenerator.getInstance().createNameString("EarlyWithdrawalPenalty"));
		// list here
		ArrayList<Amount> oList4 = new ArrayList<Amount>();
		for (int i = 0; i < 2; i++) {
			oList4.add(createAmount());
		}
		obj.setElementsOfFreeAmounts(oList4);
		obj.setDynSavingPlanKey(NameStringGenerator.getInstance().createNameString("DynSavingPlanKey"));
		obj.setDynSavingsInterestRate(NameStringGenerator.getInstance().createNameString("DynSavingsInterestRate"));
		// list here
		ArrayList<BonusScale> oList5 = new ArrayList<BonusScale>();
		for (int i = 0; i < 2; i++) {
			oList5.add(createBonusScale());
		}
		obj.setDynamicSavingBonusScales(oList5);
		obj.setRetainageFrequency(NameStringGenerator.getInstance().createNameString("RetainageFrequency"));
		obj.setDynSavingsRate(NameStringGenerator.getInstance().createNameString("DynSavingsRate"));
		obj.setDynSavingDurationStart(NameStringGenerator.getInstance().createNameString("DynSavingDurationStart"));
		obj.setDynSavingDurationEnd(NameStringGenerator.getInstance().createNameString("DynSavingDurationEnd"));
		obj.setLastAccountStatement(NameStringGenerator.getInstance().createNameString("LastAccountStatement"));
		obj.setLastAccountStatementNumber(
				NameStringGenerator.getInstance().createNameString("LastAccountStatementNumber"));
		obj.setLastAccountStatementBalance(
				NameStringGenerator.getInstance().createNameString("LastAccountStatementBalance"));
		obj.setNameDivergentSendingAddress1(
				NameStringGenerator.getInstance().createNameString("NameDivergentSendingAddress1"));
		obj.setNameDivergentSendingAddress2(
				NameStringGenerator.getInstance().createNameString("NameDivergentSendingAddress2"));
		obj.setTownOfDivergentSendingAddress(
				NameStringGenerator.getInstance().createNameString("TownOfDivergentSendingAddress"));
		obj.setIndividualDayLimit(NameStringGenerator.getInstance().createNameString("IndividualDayLimit"));
		obj.setIndividualMonthLimit(NameStringGenerator.getInstance().createNameString("IndividualMonthLimit"));
		obj.setActiveSavingCards(NameStringGenerator.getInstance().createNameString("ActiveSavingCards"));
		obj.setDispatchTypeKey(NameStringGenerator.getInstance().createNameString("DispatchTypeKey"));
		obj.setDispatchTypeText(NameStringGenerator.getInstance().createNameString("DispatchTypeText"));
		obj.setStreetOfDivergentSendingAddress(
				NameStringGenerator.getInstance().createNameString("StreetOfDivergentSendingAddress"));
		obj.setUsedLimitFromIndividualDayLimit(
				NameStringGenerator.getInstance().createNameString("UsedLimitFromIndividualDayLimit"));
		obj.setUsedLimitFromIndividualMonthLimit(
				NameStringGenerator.getInstance().createNameString("UsedLimitFromIndividualMonthLimit"));
		return obj;
	}
}