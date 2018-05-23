package Output;

import java.util.ArrayList;

import data.faker.MockUtil;
import data.faker.NameStringGenerator;
import io.swagger.model.branch.Status;
import io.swagger.model.branch.StatusPrincipalIdentity;
import io.swagger.model.branch.StatusPrincipalIdentityAuthorities;
import io.swagger.model.branch.StatusPrincipalIdentityPrincipal;

public class ObjectCreatorStatus {
	public Status createStatus() {
		Status obj = new Status();
		obj.setApplicationName(NameStringGenerator.getInstance().createNameString("ApplicationName"));
		obj.setPrincipalIdentity(createStatusPrincipalIdentity());
		obj.setApiVersion(NameStringGenerator.getInstance().createNameString("ApiVersion"));
		obj.setHostname(NameStringGenerator.getInstance().createNameString("Hostname"));
		obj.setBuildVersion(NameStringGenerator.getInstance().createNameString("BuildVersion"));
		return obj;
	}

	public StatusPrincipalIdentity createStatusPrincipalIdentity() {
		StatusPrincipalIdentity obj = new StatusPrincipalIdentity();
		obj.setName(NameStringGenerator.getInstance().createNameString("Name"));
		obj.setCredentialsNonExpired(MockUtil.getInstance().returnBool());
		obj.setAuthenticated(MockUtil.getInstance().returnBool());
		// list here for io.swagger.model.branch.StatusPrincipalIdentity -
		ArrayList<StatusPrincipalIdentityAuthorities> oList1 = new ArrayList<StatusPrincipalIdentityAuthorities>();
		for (int i = 0; i < 3; i++) {
			oList1.add(createStatusPrincipalIdentityAuthorities());
		}
		obj.setAuthorities(oList1);
		obj.setCredentials(NameStringGenerator.getInstance().createNameString("Credentials"));
		// list here for io.swagger.model.branch.StatusPrincipalIdentity -
		ArrayList<String> oList2 = new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			oList2.add(NameStringGenerator.getInstance().createNameString("Details"));
		}
		obj.setDetails(oList2);
		obj.setPrincipal(createStatusPrincipalIdentityPrincipal());
		obj.setEnabled(MockUtil.getInstance().returnBool());
		obj.setPassword(NameStringGenerator.getInstance().createNameString("Password"));
		obj.setUsername(NameStringGenerator.getInstance().createNameString("Username"));
		return obj;
	}

	public StatusPrincipalIdentityAuthorities createStatusPrincipalIdentityAuthorities() {
		StatusPrincipalIdentityAuthorities obj = new StatusPrincipalIdentityAuthorities();
		obj.setId(NameStringGenerator.getInstance().createNameString("Id"));
		return obj;
	}

	public StatusPrincipalIdentityPrincipal createStatusPrincipalIdentityPrincipal() {
		StatusPrincipalIdentityPrincipal obj = new StatusPrincipalIdentityPrincipal();
		// list here for io.swagger.model.branch.StatusPrincipalIdentityPrincipal -
		ArrayList<StatusPrincipalIdentityAuthorities> oList3 = new ArrayList<StatusPrincipalIdentityAuthorities>();
		for (int i = 0; i < 3; i++) {
			oList3.add(createStatusPrincipalIdentityAuthorities());
		}
		obj.setAuthorities(oList3);
		obj.setAccountNonExpired(MockUtil.getInstance().returnBool());
		obj.setAccountNonlocken(MockUtil.getInstance().returnBool());
		return obj;
	}
}
