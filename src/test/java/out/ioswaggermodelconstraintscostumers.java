package out;

import java.util.ArrayList;

import data.faker.MockUtil;
import data.faker.NameStringGenerator;
import io.swagger.model.constraints.costumers.AccountTermination;
import io.swagger.model.constraints.costumers.ConstraintViolationError;
import io.swagger.model.constraints.costumers.CustomerConstraint;
import io.swagger.model.constraints.costumers.CustomerConstraintList;
import io.swagger.model.constraints.costumers.DebitCardIssuance;
import io.swagger.model.constraints.costumers.Error;
import io.swagger.model.constraints.costumers.HostserviceError;
import io.swagger.model.constraints.costumers.ImmediateAuthorisation;

public class ioswaggermodelconstraintscostumers {
	public AccountTermination createAccountTermination() {
		AccountTermination obj = new AccountTermination();
		obj.setProcessingDirective(NameStringGenerator.getInstance().createNameString("ProcessingDirective"));
		return obj;
	}

	public ConstraintViolationError createConstraintViolationError() {
		ConstraintViolationError obj = new ConstraintViolationError();
		obj.setField(NameStringGenerator.getInstance().createNameString("Field"));
		obj.setMessage(NameStringGenerator.getInstance().createNameString("Message"));
		return obj;
	}

	public CustomerConstraint createCustomerConstraint() {
		CustomerConstraint obj = new CustomerConstraint();
		obj.setType(NameStringGenerator.getInstance().createNameString("Type"));
		obj.setAccountHolderNo(NameStringGenerator.getInstance().createNameString("AccountHolderNo"));
		obj.setCategory(NameStringGenerator.getInstance().createNameString("Category"));
		obj.setStartDate(NameStringGenerator.getInstance().createNameString("StartDate"));
		obj.setEndDate(NameStringGenerator.getInstance().createNameString("EndDate"));
		obj.setTypeLabelShort(NameStringGenerator.getInstance().createNameString("TypeLabelShort"));
		obj.setDebitCardIssuance(createDebitCardIssuance());
		obj.setImmediateAuthorisation(createImmediateAuthorisation());
		obj.setAccountTermination(createAccountTermination());
		return obj;
	}

	public DebitCardIssuance createDebitCardIssuance() {
		DebitCardIssuance obj = new DebitCardIssuance();
		obj.setRelevance(MockUtil.getInstance().returnBool());
		return obj;
	}

	public ImmediateAuthorisation createImmediateAuthorisation() {
		ImmediateAuthorisation obj = new ImmediateAuthorisation();
		obj.setImpact(NameStringGenerator.getInstance().createNameString("Impact"));
		return obj;
	}

	public CustomerConstraintList createCustomerConstraintList() {
		CustomerConstraintList obj = new CustomerConstraintList();
		// list here
		ArrayList<CustomerConstraint> oList1 = new ArrayList<CustomerConstraint>();
		for (int i = 0; i < 2; i++) {
			oList1.add(createCustomerConstraint());
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
		// list here
		ArrayList<ConstraintViolationError> oList2 = new ArrayList<ConstraintViolationError>();
		for (int i = 0; i < 2; i++) {
			oList2.add(createConstraintViolationError());
		}
		obj.setErrors(oList2);
		obj.setReturnCode(NameStringGenerator.getInstance().createNameString("ReturnCode"));
		obj.setStatus(MockUtil.getInstance().returnInteger(100));
		obj.setErrorCode(NameStringGenerator.getInstance().createNameString("ErrorCode"));
		obj.setErrorMessageCode(NameStringGenerator.getInstance().createNameString("ErrorMessageCode"));
		return obj;
	}
}