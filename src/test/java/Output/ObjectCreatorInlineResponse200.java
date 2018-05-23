package Output;

import java.util.ArrayList;

import org.joda.time.LocalDate;

import data.faker.MockUtil;
import data.faker.NameStringGenerator;
import io.swagger.model.consents.AccountReference;
import io.swagger.model.consents.InlineResponse200;
import io.swagger.model.consents.InlineResponse200.ConsentStatusEnum;
import io.swagger.model.consents.SingleAccountAccess;
import io.swagger.model.consents.TransactionStatus;

public class ObjectCreatorInlineResponse200 {
	public InlineResponse200 createInlineResponse200() {
		InlineResponse200 obj = new InlineResponse200();
		obj.setConsentStatus(ConsentStatusEnum.DELETED);
		obj.setValidUntil(createLocalDate());
		// list here for io.swagger.model.consents.InlineResponse200 -
		ArrayList<SingleAccountAccess> oList1 = new ArrayList<SingleAccountAccess>();
		for (int i = 0; i < 3; i++) {
			oList1.add(createSingleAccountAccess());
		}
		obj.setAccessAccounts(oList1);
		obj.setRecurringIndicator(MockUtil.getInstance().returnBool());
		obj.setFrequencyPerDay(MockUtil.getInstance().returnInteger(100));
		obj.setTransactionStatus(
				(TransactionStatus) MockUtil.getInstance().returnRandomEnumValue(TransactionStatus.class));
		return obj;
	}

	public LocalDate createLocalDate() {
		LocalDate obj = new LocalDate();
		return obj;
	}

	public SingleAccountAccess createSingleAccountAccess() {
		SingleAccountAccess obj = new SingleAccountAccess();
		obj.setAccount(createAccountReference());
		// list here for io.swagger.model.consents.SingleAccountAccess -
		ArrayList<String> oList2 = new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			oList2.add(NameStringGenerator.getInstance().createNameString("Access-type"));
		}
		obj.setAccessType(oList2);
		return obj;
	}

	public AccountReference createAccountReference() {
		AccountReference obj = new AccountReference();
		obj.setBban(NameStringGenerator.getInstance().createNameString("Bban"));
		obj.setIban(NameStringGenerator.getInstance().createNameString("Iban"));
		obj.setPan(NameStringGenerator.getInstance().createNameString("Pan"));
		obj.setMsisdn(NameStringGenerator.getInstance().createNameString("Msisdn"));
		return obj;
	}
}