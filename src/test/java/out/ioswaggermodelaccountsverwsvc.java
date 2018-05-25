package out;

import java.util.ArrayList;

import data.faker.MockUtil;
import data.faker.NameStringGenerator;
import io.swagger.model.accounts.verwsvc.Dependency;
import io.swagger.model.accounts.verwsvc.DependencyList;
import io.swagger.model.accounts.verwsvc.Error;

public class ioswaggermodelaccountsverwsvc {
	public Dependency createDependency() {
		Dependency obj = new Dependency();
		obj.setDependencyType(NameStringGenerator.getInstance().createNameString("DependencyType"));
		obj.setDependencyContractBusinessCategory(
				NameStringGenerator.getInstance().createNameString("DependencyContractBusinessCategory"));
		obj.setDependencyTypeLabel(NameStringGenerator.getInstance().createNameString("DependencyTypeLabel"));
		obj.setDependencySeverity(NameStringGenerator.getInstance().createNameString("DependencySeverity"));
		obj.setDependencyContractId(NameStringGenerator.getInstance().createNameString("DependencyContractId"));
		obj.setDependencyContractIdType(NameStringGenerator.getInstance().createNameString("DependencyContractIdType"));
		obj.setDependencyRelationType(NameStringGenerator.getInstance().createNameString("DependencyRelationType"));
		obj.setDependencyAccountId(NameStringGenerator.getInstance().createNameString("DependencyAccountId"));
		return obj;
	}

	public DependencyList createDependencyList() {
		DependencyList obj = new DependencyList();
		// list here
		ArrayList<Dependency> oList1 = new ArrayList<Dependency>();
		for (int i = 0; i < 2; i++) {
			oList1.add(createDependency());
		}
		obj.setDependencyList(oList1);
		return obj;
	}

	public Error createError() {
		Error obj = new Error();
		obj.setMessage(NameStringGenerator.getInstance().createNameString("Message"));
		obj.setStatus(MockUtil.getInstance().returnInteger(100));
		return obj;
	}
}