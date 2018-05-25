package out;

import java.util.ArrayList;

import data.faker.MockUtil;
import data.faker.NameStringGenerator;
import io.swagger.model.payments.Authentication;
import io.swagger.model.payments.AuthenticationType;
import io.swagger.model.payments.Challange;
import io.swagger.model.payments.ErrorModel;
import io.swagger.model.payments.InlineResponse200;
import io.swagger.model.payments.InlineResponse2001;
import io.swagger.model.payments.InlineResponse201;
import io.swagger.model.payments.Links;

public class ioswaggermodelpayments {
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

	public Challange createChallange() {
		Challange obj = new Challange();
		obj.setImage(NameStringGenerator.getInstance().createNameString("Image"));
		obj.setOtPFormat(Challange.OtPFormatEnum.INTEGER);
		obj.setAdditionalInformation(NameStringGenerator.getInstance().createNameString("AdditionalInformation"));
		obj.setOpTMaxLength(MockUtil.getInstance().returnInteger(100));
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
		obj.setTransactionStatus((io.swagger.model.payments.TransactionStatus) MockUtil.getInstance()
				.returnRandomEnumValue(io.swagger.model.payments.TransactionStatus.class));
		// list here
		ArrayList<Authentication> oList1 = new ArrayList<Authentication>();
		for (int i = 0; i < 2; i++) {
			oList1.add(createAuthentication());
		}
		obj.setScaMethods(oList1);
		obj.setLinks(createLinks());
		obj.setPsuMessage(NameStringGenerator.getInstance().createNameString("PsuMessage"));
		obj.setChosenScaMethod(createAuthentication());
		obj.setScaChallengeData(createChallange());
		// list here
		ArrayList<String> oList2 = new ArrayList<String>();
		for (int i = 0; i < 2; i++) {
			oList2.add(NameStringGenerator.getInstance().createNameString("TppMessages"));
		}
		obj.setTppMessages(oList2);
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

	public InlineResponse2001 createInlineResponse2001() {
		InlineResponse2001 obj = new InlineResponse2001();
		obj.setTransactionStatus((io.swagger.model.payments.TransactionStatus) MockUtil.getInstance()
				.returnRandomEnumValue(io.swagger.model.payments.TransactionStatus.class));
		return obj;
	}

	public InlineResponse201 createInlineResponse201() {
		InlineResponse201 obj = new InlineResponse201();
		obj.setTransactionStatus((io.swagger.model.payments.TransactionStatus) MockUtil.getInstance()
				.returnRandomEnumValue(io.swagger.model.payments.TransactionStatus.class));
		obj.setPsuMessage(NameStringGenerator.getInstance().createNameString("PsuMessage"));
		return obj;
	}
}