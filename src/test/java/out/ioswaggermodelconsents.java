package out;

import java.util.ArrayList;

import org.joda.time.LocalDate;

import data.faker.MockUtil;
import data.faker.NameStringGenerator;
import io.swagger.model.consents.AccountReference;
import io.swagger.model.consents.Authentication;
import io.swagger.model.consents.AuthenticationType;
import io.swagger.model.consents.Challenge;
import io.swagger.model.consents.ErrorModel;
import io.swagger.model.consents.InlineResponse200;
import io.swagger.model.consents.InlineResponse200.ConsentStatusEnum;
import io.swagger.model.consents.InlineResponse2001;
import io.swagger.model.consents.InlineResponse201;
import io.swagger.model.consents.InlineResponse2011;
import io.swagger.model.consents.Links;
import io.swagger.model.consents.PostConsentAccountListBody;
import io.swagger.model.consents.PostConsentsbody;
import io.swagger.model.consents.SingleAccountAccess;

public class ioswaggermodelconsents {
	public AccountReference createAccountReference() {
		AccountReference obj = new AccountReference();
		obj.setIban(NameStringGenerator.getInstance().createNameString("Iban"));
		obj.setBban(NameStringGenerator.getInstance().createNameString("Bban"));
		obj.setPan(NameStringGenerator.getInstance().createNameString("Pan"));
		obj.setMsisdn(NameStringGenerator.getInstance().createNameString("Msisdn"));
		return obj;
	}

	public Authentication createAuthentication() {
		Authentication obj = new Authentication();
		obj.setName(NameStringGenerator.getInstance().createNameString("Name"));
		obj.setExplanation(NameStringGenerator.getInstance().createNameString("Explanation"));
		obj.setAuthenticationType(createAuthenticationType());
		obj.setAuthenticationMethodId(NameStringGenerator.getInstance().createNameString("AuthenticationMethodId"));
		return obj;
	}

	public AuthenticationType createAuthenticationType() {
		AuthenticationType obj = new AuthenticationType();
		obj.setSMSOTP(NameStringGenerator.getInstance().createNameString("SMSOTP"));
		obj.setCHIPOTP(NameStringGenerator.getInstance().createNameString("CHIPOTP"));
		obj.setPHOTOOTP(NameStringGenerator.getInstance().createNameString("PHOTOOTP"));
		obj.setPUSHOTP(NameStringGenerator.getInstance().createNameString("PUSHOTP"));
		return obj;
	}

	public Challenge createChallenge() {
		Challenge obj = new Challenge();
		obj.setOtPMaxLength(MockUtil.getInstance().returnInteger(100));
		obj.setImage(NameStringGenerator.getInstance().createNameString("Image"));
		obj.setOtPFormat(NameStringGenerator.getInstance().createNameString("OTPFormat"));
		obj.setAdditionalInformation(NameStringGenerator.getInstance().createNameString("AdditionalInformation"));
		return obj;
	}

	public ErrorModel createErrorModel() {
		ErrorModel obj = new ErrorModel();
		obj.setMessage(NameStringGenerator.getInstance().createNameString("Message"));
		obj.setCode(MockUtil.getInstance().returnInteger(100));
		return obj;
	}

	public InlineResponse200 createInlineResponse200() {
		InlineResponse200 obj = new InlineResponse200();
		obj.setValidUntil(createLocalDate());
		obj.setConsentStatus(ConsentStatusEnum.EMPTY);
		// list here
		ArrayList<SingleAccountAccess> oList1 = new ArrayList<SingleAccountAccess>();
		for (int i = 0; i < 2; i++) {
			oList1.add(createSingleAccountAccess());
		}
		obj.setAccessAccounts(oList1);
		obj.setRecurringIndicator(MockUtil.getInstance().returnBool());
		obj.setFrequencyPerDay(MockUtil.getInstance().returnInteger(100));
		obj.setTransactionStatus((io.swagger.model.consents.TransactionStatus) MockUtil.getInstance()
				.returnRandomEnumValue(io.swagger.model.consents.TransactionStatus.class));
		return obj;
	}

	public LocalDate createLocalDate() {
		LocalDate obj = new LocalDate();
		return obj;
	}

	public SingleAccountAccess createSingleAccountAccess() {
		SingleAccountAccess obj = new SingleAccountAccess();
		obj.setAccount(createAccountReference());
		// list here
		ArrayList<String> oList2 = new ArrayList<String>();
		for (int i = 0; i < 2; i++) {
			oList2.add(NameStringGenerator.getInstance().createNameString("AccessType"));
		}
		obj.setAccessType(oList2);
		return obj;
	}

	public InlineResponse2001 createInlineResponse2001() {
		InlineResponse2001 obj = new InlineResponse2001();
		obj.setTransactionStatus((io.swagger.model.consents.TransactionStatus) MockUtil.getInstance()
				.returnRandomEnumValue(io.swagger.model.consents.TransactionStatus.class));
		return obj;
	}

	public InlineResponse201 createInlineResponse201() {
		InlineResponse201 obj = new InlineResponse201();
		// list here
		ArrayList<Authentication> oList3 = new ArrayList<Authentication>();
		for (int i = 0; i < 2; i++) {
			oList3.add(createAuthentication());
		}
		obj.setScaMethods(oList3);
		obj.setLinks(createLinks());
		obj.setPsuMessage(NameStringGenerator.getInstance().createNameString("PsuMessage"));
		obj.setChosenScaMethod(createAuthentication());
		obj.setScaChallengeData(createChallenge());
		return obj;
	}

public Links createLinks() 
{
Links obj = new Links();
obj.setStatus(NameStringGenerator.getInstance().createNameString("Status"));
obj.setRedirect(NameStringGenerator.getInstance().createNameString("Redirect"));
obj.setSelf(NameStringGenerator.getInstance().createNameString("Self"));
obj.setAccountLink(NameStringGenerator.getInstance().createNameString("AccountLink"));
obj.setBalances(NameStringGenerator.getInstance().createNameString("Balances"));
obj.setTransactions(NameStringGenerator.getInstance().createNameString("Transactions"));
obj.setFirstPageLink(NameStringGenerator.getInstance().createNameString("FirstPageLink"));
obj.setLastPageLink(NameStringGenerator.getInstance().createNameString("LastPageLink"));
obj.setUpdatePsuIdentification(NameStringGenerator.getInstance().createNameString("UpdatePsuIdentification"));
obj.setUpdatePsuAuthentication(NameStringGenerator.getInstance().createNameString("UpdatePsuAuthentication"));
obj.setSelectAuthenticationMethod(NameStringGenerator.getInstance().createNameString("SelectAuthenticationMethod"));
obj.setAuthoriseTransaction(NameStringGenerator.getInstance().createNameString("Authorise transaction"));
obj.setSecondPageLink(NameStringGenerator.getInstance().createNameString("SecondPageLink"));
obj.setCurrentPageLink(NameStringGenerator.getInstance().createNameString("CurrentPageLink"));
return obj;
}

	public InlineResponse2011 createInlineResponse2011() {
		InlineResponse2011 obj = new InlineResponse2011();
		obj.setTransactionStatus((io.swagger.model.consents.TransactionStatus) MockUtil.getInstance()
				.returnRandomEnumValue(io.swagger.model.consents.TransactionStatus.class));
		obj.setPsuMessage(NameStringGenerator.getInstance().createNameString("PsuMessage"));
		return obj;
	}

	public PostConsentAccountListBody createPostConsentAccountListBody() {
		PostConsentAccountListBody obj = new PostConsentAccountListBody();
		obj.setWithBalance(MockUtil.getInstance().returnBool());
		return obj;
	}

	public PostConsentsbody createPostConsentsbody() {
		PostConsentsbody obj = new PostConsentsbody();
		obj.setValidUntil(NameStringGenerator.getInstance().createNameString("ValidUntil"));
		obj.setAccessAccounts(createSingleAccountAccess());
		obj.setRecurringIndicator(MockUtil.getInstance().returnBool());
		obj.setFrequencyPerDay(MockUtil.getInstance().returnInteger(100));
		obj.setCombinedServiceIndicator(MockUtil.getInstance().returnBool());
		return obj;
	}
}