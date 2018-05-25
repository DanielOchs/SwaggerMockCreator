package out;

import java.util.ArrayList;

import data.faker.MockUtil;
import data.faker.NameStringGenerator;
import io.swagger.model.constraints.accounts.AccountTermination;
import io.swagger.model.constraints.accounts.Constraint;
import io.swagger.model.constraints.accounts.Constraint2;
import io.swagger.model.constraints.accounts.ConstraintList;
import io.swagger.model.constraints.accounts.DebitCardIssuance;
import io.swagger.model.constraints.accounts.Error;
import io.swagger.model.constraints.accounts.HostserviceError;
import io.swagger.model.constraints.accounts.ImmediateAuthorisation;

public class ioswaggermodelconstraintsaccounts {
	public AccountTermination createAccountTermination() {
		AccountTermination obj = new AccountTermination();
		obj.setProcessingDirective(NameStringGenerator.getInstance().createNameString("ProcessingDirective"));
		return obj;
	}

	public Constraint createConstraint() {
		Constraint obj = new Constraint();
		obj.setField(NameStringGenerator.getInstance().createNameString("Field"));
		obj.setMessage(NameStringGenerator.getInstance().createNameString("Message"));
		return obj;
	}

	public Constraint2 createConstraint2() {
		Constraint2 obj = new Constraint2();
		obj.setType(NameStringGenerator.getInstance().createNameString("Type"));
		obj.setCategory(NameStringGenerator.getInstance().createNameString("Category"));
		obj.setImmediateAuthorisation(createImmediateAuthorisation());
		obj.setAccountTermination(createAccountTermination());
		obj.setEndDate(NameStringGenerator.getInstance().createNameString("EndDate"));
		obj.setTypeLabel(NameStringGenerator.getInstance().createNameString("TypeLabel"));
		obj.setStartDate(NameStringGenerator.getInstance().createNameString("StartDate"));
		obj.setTypeLabelShort(NameStringGenerator.getInstance().createNameString("TypeLabelShort"));
		obj.setDebitCardIssuance(createDebitCardIssuance());
		return obj;
	}

	public ImmediateAuthorisation createImmediateAuthorisation() {
		ImmediateAuthorisation obj = new ImmediateAuthorisation();
		obj.setImpact(NameStringGenerator.getInstance().createNameString("Impact"));
		return obj;
	}

	public DebitCardIssuance createDebitCardIssuance() {
		DebitCardIssuance obj = new DebitCardIssuance();
		obj.setRelevance(MockUtil.getInstance().returnBool());
		return obj;
	}

	public ConstraintList createConstraintList() {
		ConstraintList obj = new ConstraintList();
		// list here
		ArrayList<Constraint> oList1 = new ArrayList<Constraint>();
		for (int i = 0; i < 2; i++) {
			oList1.add(createConstraint());
		}
		obj.setConstraintList(oList1);
		return obj;
	}

	public Error createError() {
		Error obj = new Error();
		obj.setMessage(NameStringGenerator.getInstance().createNameString("Message"));
		obj.setStatus(MockUtil.getInstance().returnInteger(100));
		return obj;
	}

	public HostserviceError createHostserviceError() {
		HostserviceError obj = new HostserviceError();
		obj.setMessage(NameStringGenerator.getInstance().createNameString("Message"));
		obj.setStatus(MockUtil.getInstance().returnInteger(100));
		obj.setErrorMessageCode(NameStringGenerator.getInstance().createNameString("ErrorMessageCode"));
		obj.setReturnCode(NameStringGenerator.getInstance().createNameString("ReturnCode"));
		// list here
		ArrayList<Constraint> oList2 = new ArrayList<Constraint>();
		for (int i = 0; i < 2; i++) {
			oList2.add(createConstraint());
		}
		obj.setErrors(oList2);
		obj.setErrorCode(NameStringGenerator.getInstance().createNameString("ErrorCode"));
		return obj;
	}
}