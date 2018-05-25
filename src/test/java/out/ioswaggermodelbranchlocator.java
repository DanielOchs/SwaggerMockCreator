package out;

import java.util.ArrayList;

import data.faker.MockUtil;
import data.faker.NameStringGenerator;
import io.swagger.model.branchlocator.BatchProcess;
import io.swagger.model.branchlocator.BatchProcessFullRepresentation;
import io.swagger.model.branchlocator.BatchProcessObjectAfterCreation;
import io.swagger.model.branchlocator.Branch;
import io.swagger.model.branchlocator.Customer;
import io.swagger.model.branchlocator.Importdiff;
import io.swagger.model.branchlocator.ModelImport;
import io.swagger.model.branchlocator.NiederlassungFilial;
import io.swagger.model.branchlocator.Position;
import io.swagger.model.branchlocator.Status;
import io.swagger.model.branchlocator.StatusPrincipalIdentity;
import io.swagger.model.branchlocator.StatusPrincipalIdentityAuthorities;
import io.swagger.model.branchlocator.StatusPrincipalIdentityPrincipal;

public class ioswaggermodelbranchlocator {
	public BatchProcess createBatchProcess() {
		BatchProcess obj = new BatchProcess();
		obj.setName(NameStringGenerator.getInstance().createNameString("Name"));
		obj.setDescription(NameStringGenerator.getInstance().createNameString("Description"));
		obj.setCallbackUri(NameStringGenerator.getInstance().createNameString("CallbackUri"));
		obj.setCreatedBy(NameStringGenerator.getInstance().createNameString("CreatedBy"));
		return obj;
	}

	public BatchProcessFullRepresentation createBatchProcessFullRepresentation() {
		BatchProcessFullRepresentation obj = new BatchProcessFullRepresentation();
		obj.setName(NameStringGenerator.getInstance().createNameString("Name"));
		obj.setId(NameStringGenerator.getInstance().createNameString("Id"));
		obj.setState((io.swagger.model.branchlocator.BatchProcessFullRepresentation.StateEnum) MockUtil.getInstance()
				.returnRandomEnumValue(io.swagger.model.branchlocator.BatchProcessFullRepresentation.StateEnum.class));
		obj.setProcessedEntries(MockUtil.getInstance().returnInteger(100));
		obj.setStartProcessAt(MockUtil.getInstance().returnLong(100));
		obj.setDescription(NameStringGenerator.getInstance().createNameString("Description"));
		obj.setCallbackUri(NameStringGenerator.getInstance().createNameString("CallbackUri"));
		obj.setCreatedBy(NameStringGenerator.getInstance().createNameString("CreatedBy"));
		obj.setTotalEntries(MockUtil.getInstance().returnInteger(100));
		obj.setEndProcessAt(MockUtil.getInstance().returnLong(100));
		return obj;
	}

	public BatchProcessObjectAfterCreation createBatchProcessObjectAfterCreation() {
		BatchProcessObjectAfterCreation obj = new BatchProcessObjectAfterCreation();
		obj.setName(NameStringGenerator.getInstance().createNameString("Name"));
		obj.setId(NameStringGenerator.getInstance().createNameString("Id"));
		obj.setState((io.swagger.model.branchlocator.BatchProcessObjectAfterCreation.StateEnum) MockUtil.getInstance()
				.returnRandomEnumValue(io.swagger.model.branchlocator.BatchProcessObjectAfterCreation.StateEnum.class));
		obj.setProcessedEntries(MockUtil.getInstance().returnInteger(100));
		obj.setDescription(NameStringGenerator.getInstance().createNameString("Description"));
		obj.setCallbackUri(NameStringGenerator.getInstance().createNameString("CallbackUri"));
		obj.setCreatedBy(NameStringGenerator.getInstance().createNameString("CreatedBy"));
		obj.setTotalEntries(MockUtil.getInstance().returnInteger(100));
		return obj;
	}

	public Branch createBranch() {
		Branch obj = new Branch();
		obj.setName(NameStringGenerator.getInstance().createNameString("Name"));
		obj.setId(MockUtil.getInstance().returnLong(100));
		obj.setPosition(createPosition());
		obj.setAnschriftPostleitzahl(NameStringGenerator.getInstance().createNameString("AnschriftPostleitzahl"));
		obj.setAnschriftOrtteil(NameStringGenerator.getInstance().createNameString("AnschriftOrtteil"));
		obj.setAnschriftStrasse(NameStringGenerator.getInstance().createNameString("AnschriftStrasse"));
		obj.setNiederlassungFilial(createNiederlassungFilial());
		obj.setImportGroup(NameStringGenerator.getInstance().createNameString("ImportGroup"));
		obj.setNummer(MockUtil.getInstance().returnInteger(100));
		obj.setOrgNummer(NameStringGenerator.getInstance().createNameString("OrgNummer"));
		obj.setOrgTyp(NameStringGenerator.getInstance().createNameString("OrgTyp"));
		obj.setOrgTypName(NameStringGenerator.getInstance().createNameString("OrgTypName"));
		obj.setOrgSpec(NameStringGenerator.getInstance().createNameString("OrgSpec"));
		obj.setOrgSpecName(NameStringGenerator.getInstance().createNameString("OrgSpecName"));
		obj.setLand(NameStringGenerator.getInstance().createNameString("Land"));
		obj.setBundesland(NameStringGenerator.getInstance().createNameString("Bundesland"));
		obj.setAnschriftOrt(NameStringGenerator.getInstance().createNameString("AnschriftOrt"));
		obj.setAnschriftLand(NameStringGenerator.getInstance().createNameString("AnschriftLand"));
		obj.setVault(MockUtil.getInstance().returnBool());
		obj.setBarriereTyp(NameStringGenerator.getInstance().createNameString("BarriereTyp"));
		obj.setNaechsteFilHB(NameStringGenerator.getInstance().createNameString("NaechsteFilHB"));
		obj.setKasse(MockUtil.getInstance().returnBool());
		return obj;
	}

	public Position createPosition() {
		Position obj = new Position();
		obj.setLat(MockUtil.getInstance().returnFloat(100));
		obj.setLon(MockUtil.getInstance().returnFloat(100));
		return obj;
	}

	public NiederlassungFilial createNiederlassungFilial() {
		NiederlassungFilial obj = new NiederlassungFilial();
		obj.setName(NameStringGenerator.getInstance().createNameString("Name"));
		obj.setPosition(createPosition());
		obj.setAnschriftPostleitzahl(NameStringGenerator.getInstance().createNameString("AnschriftPostleitzahl"));
		obj.setAnschriftStrasse(NameStringGenerator.getInstance().createNameString("AnschriftStrasse"));
		obj.setPostanschriftOrt(NameStringGenerator.getInstance().createNameString("PostanschriftOrt"));
		obj.setPostanschriftPostfach(NameStringGenerator.getInstance().createNameString("PostanschriftPostfach"));
		obj.setPostanschriftPostleitzahl(
				NameStringGenerator.getInstance().createNameString("PostanschriftPostleitzahl"));
		obj.setNummer(MockUtil.getInstance().returnLong(100));
		obj.setOrgNummer(MockUtil.getInstance().returnLong(100));
		obj.setAnschriftOrt(NameStringGenerator.getInstance().createNameString("AnschriftOrt"));
		obj.setTelefon(NameStringGenerator.getInstance().createNameString("Telefon"));
		obj.setTelefax(NameStringGenerator.getInstance().createNameString("Telefax"));
		return obj;
	}

	public Customer createCustomer() {
		Customer obj = new Customer();
		obj.setType((io.swagger.model.branchlocator.Customer.TypeEnum) MockUtil.getInstance()
				.returnRandomEnumValue(io.swagger.model.branchlocator.Customer.TypeEnum.class));
		obj.setCity(NameStringGenerator.getInstance().createNameString("City"));
		obj.setRequestId(NameStringGenerator.getInstance().createNameString("RequestId"));
		obj.setStreet(NameStringGenerator.getInstance().createNameString("Street"));
		obj.setHouseNumber(NameStringGenerator.getInstance().createNameString("HouseNumber"));
		obj.setLineId(NameStringGenerator.getInstance().createNameString("LineId"));
		obj.setZip(NameStringGenerator.getInstance().createNameString("Zip"));
		return obj;
	}

	public Importdiff createImportdiff() {
		Importdiff obj = new Importdiff();
		obj.setId(NameStringGenerator.getInstance().createNameString("Id"));
		// list here
		ArrayList<String> oList1 = new ArrayList<String>();
		for (int i = 0; i < 2; i++) {
			oList1.add(NameStringGenerator.getInstance().createNameString("ReleasedEntry"));
		}
		obj.setReleasedEntry(oList1);
		// list here
		ArrayList<String> oList2 = new ArrayList<String>();
		for (int i = 0; i < 2; i++) {
			oList2.add(NameStringGenerator.getInstance().createNameString("NewEntry"));
		}
		obj.setNewEntry(oList2);
		obj.setImportid(NameStringGenerator.getInstance().createNameString("Importid"));
		return obj;
	}

	public ModelImport createModelImport() {
		ModelImport obj = new ModelImport();
		obj.setObject(MockUtil.getInstance().returnLong(100));
		obj.setId(NameStringGenerator.getInstance().createNameString("Id"));
		obj.setType(NameStringGenerator.getInstance().createNameString("Type"));
		obj.setDescription(NameStringGenerator.getInstance().createNameString("Description"));
		obj.setCreatedBy(NameStringGenerator.getInstance().createNameString("CreatedBy"));
		obj.setGroup((io.swagger.model.branchlocator.ModelImport.GroupEnum) MockUtil.getInstance()
				.returnRandomEnumValue(io.swagger.model.branchlocator.ModelImport.GroupEnum.class));
		obj.setCreatedAt(NameStringGenerator.getInstance().createNameString("CreatedAt"));
		return obj;
	}

	public Status createStatus() {
		Status obj = new Status();
		obj.setBuildVersion(NameStringGenerator.getInstance().createNameString("BuildVersion"));
		obj.setApiVersion(NameStringGenerator.getInstance().createNameString("ApiVersion"));
		obj.setHostname(NameStringGenerator.getInstance().createNameString("Hostname"));
		obj.setApplicationName(NameStringGenerator.getInstance().createNameString("ApplicationName"));
		obj.setPrincipalIdentity(createStatusPrincipalIdentity());
		return obj;
	}

	public StatusPrincipalIdentity createStatusPrincipalIdentity() {
		StatusPrincipalIdentity obj = new StatusPrincipalIdentity();
		obj.setName(NameStringGenerator.getInstance().createNameString("Name"));
		obj.setAuthenticated(MockUtil.getInstance().returnBool());
		// list here
		ArrayList<StatusPrincipalIdentityAuthorities> oList3 = new ArrayList<StatusPrincipalIdentityAuthorities>();
		for (int i = 0; i < 2; i++) {
			oList3.add(createStatusPrincipalIdentityAuthorities());
		}
		obj.setAuthorities(oList3);
		obj.setCredentials(NameStringGenerator.getInstance().createNameString("Credentials"));
		// list here
		ArrayList<String> oList4 = new ArrayList<String>();
		for (int i = 0; i < 2; i++) {
			oList4.add(NameStringGenerator.getInstance().createNameString("Details"));
		}
		obj.setDetails(oList4);
		obj.setPrincipal(createStatusPrincipalIdentityPrincipal());
		obj.setEnabled(MockUtil.getInstance().returnBool());
		obj.setPassword(NameStringGenerator.getInstance().createNameString("Password"));
		obj.setUsername(NameStringGenerator.getInstance().createNameString("Username"));
		obj.setCredentialsNonExpired(MockUtil.getInstance().returnBool());
		return obj;
	}

	public StatusPrincipalIdentityAuthorities createStatusPrincipalIdentityAuthorities() {
		StatusPrincipalIdentityAuthorities obj = new StatusPrincipalIdentityAuthorities();
		obj.setId(NameStringGenerator.getInstance().createNameString("Id"));
		return obj;
	}

	public StatusPrincipalIdentityPrincipal createStatusPrincipalIdentityPrincipal() {
		StatusPrincipalIdentityPrincipal obj = new StatusPrincipalIdentityPrincipal();
		// list here
		ArrayList<StatusPrincipalIdentityAuthorities> oList5 = new ArrayList<StatusPrincipalIdentityAuthorities>();
		for (int i = 0; i < 2; i++) {
			oList5.add(createStatusPrincipalIdentityAuthorities());
		}
		obj.setAuthorities(oList5);
		obj.setAccountNonExpired(MockUtil.getInstance().returnBool());
		obj.setAccountNonlocken(MockUtil.getInstance().returnBool());
		return obj;
	}
}