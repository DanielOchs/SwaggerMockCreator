package Output;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import com.github.javafaker.Faker;

import data.faker.NameStringGenerator;
import io.swagger.model.branch.Branch;
import io.swagger.model.branch.BranchOffice;
import io.swagger.model.branch.Status;
import io.swagger.model.branch.StatusPrincipalIdentity;
import io.swagger.model.branch.StatusPrincipalIdentityAuthorities;
import io.swagger.model.branch.StatusPrincipalIdentityPrincipal;

public class MockCreator {
	Faker faker;
	Boolean bool;
	
	public MockCreator()
	{
		faker = new Faker(new Locale("de"));
		bool = true;
	}
	
	public Status createStatusObject()
	{
		Status status = new Status();
		status.setApiVersion("V1");
		status.setApplicationName(NameStringGenerator.getInstance().createNameString("Application"));
		status.setBuildVersion("0.1");
		status.setHostname("www.example.de");
		status.setPrincipalIdentity(createStatusPrincipalIdentityObject());
		
		return status;
	}
	
	public StatusPrincipalIdentity createStatusPrincipalIdentityObject()
	{
		StatusPrincipalIdentity principalIdentity = new StatusPrincipalIdentity();
		
		
		//object references
		principalIdentity.setAuthorities(createStatusPrincipalIdentityAuthoritiesList());
		principalIdentity.setPrincipal(createStatusPrincipalIdentityPrincipalObject());

		//plain variables
		principalIdentity.setAuthenticated(returnBool());
		principalIdentity.setCredentialsNonExpired(returnBool());
		principalIdentity.setEnabled(returnBool());
		
		principalIdentity.setCredentials(NameStringGenerator.getInstance().createNameString("credential"));
		
		principalIdentity.setName(faker.name().fullName());
		principalIdentity.setPassword(NameStringGenerator.getInstance().createNameString("passwort"));
		principalIdentity.setUsername(faker.name().username());
		
		//StringList
		principalIdentity.setDetails(randomDetails());
		
		
		return principalIdentity;
	}
	public StatusPrincipalIdentityPrincipal createStatusPrincipalIdentityPrincipalObject()
	{
		StatusPrincipalIdentityPrincipal principal = new StatusPrincipalIdentityPrincipal();
		principal.setAccountNonExpired(returnBool());
		principal.setAccountNonlocken(returnBool());
		principal.setAuthorities(createStatusPrincipalIdentityAuthoritiesList());
		
		return principal;
	}
	
	public List<StatusPrincipalIdentityAuthorities> createStatusPrincipalIdentityAuthoritiesList()
	{
		List<StatusPrincipalIdentityAuthorities> list = new LinkedList<StatusPrincipalIdentityAuthorities>();
		
		StatusPrincipalIdentityAuthorities aut = new StatusPrincipalIdentityAuthorities();

		for (int i = Math.max((int)(Math.random()*10) -6,1); i > 0; i--)
		{
			aut.setId(NameStringGenerator.getInstance().createNameString("id"));
			list.add(aut);
		}
		
		return list;
	}
	
	
	public Branch createBranchObject()
	{
		Branch b = new Branch();
		
		//object references
		BranchOffice bo = createBranchOfficeObject();
		b.setBranchOffice(bo );
		
		//plain variables
		
		b.setBarriereTyp(NameStringGenerator.getInstance().createNameString("BarriereTyp"));
    	b.setId(NameStringGenerator.getInstance().createNameString("Id"));
    	b.setImportGroup(NameStringGenerator.getInstance().createNameString("ImportGroup"));
    	b.setNaechsteFilHB(NameStringGenerator.getInstance().createNameString("NaechsteFilHB"));
    	b.setNumber(NameStringGenerator.getInstance().createNameString(""));
    	b.setOrgNumber(NameStringGenerator.getInstance().createNameString("OrgNumber"));
    	b.setOrgSpec(NameStringGenerator.getInstance().createNameString("OrgSpec"));
    	b.setOrgSpecName(NameStringGenerator.getInstance().createNameString("OrgSpecName"));
    	b.setOrgType(NameStringGenerator.getInstance().createNameString("OrgType"));
    	b.setOrgTypeName(NameStringGenerator.getInstance().createNameString("OrgTypeName"));
    	
    	b.setName(faker.name().fullName());
    	b.setCity(faker.address().cityName());
    	b.setCountry(faker.address().country());
    	b.setPostalCity(faker.address().city());
    	b.setPostalCountry(faker.address().countryCode());
    	b.setPostalStreet(faker.address().streetName());
    	b.setSate(faker.address().state());
    	b.setZip(faker.address().zipCode());
    	
    	b.setKasse(returnBool());
    	b.setVault(returnBool());
    	
    	b.setPosition(randomFloatNumbers());
		return b;
	}
	
	public BranchOffice createBranchOfficeObject()
	{
		BranchOffice bo = new BranchOffice();
		
		
		bo.setCity(faker.address().cityName());
		bo.setFax(faker.phoneNumber().phoneNumber());
		bo.setName(faker.name().fullName());
		bo.setPhone(faker.phoneNumber().phoneNumber());
		bo.setPostalCity(faker.address().city());
		bo.setPostalZip(faker.address().zipCode());
		bo.setStreet(faker.address().streetName());
		bo.setZip(faker.address().zipCode());
		
		bo.setPosition(randomFloatNumbers());

		
		bo.setOrgNumber(NameStringGenerator.getInstance().createNameString("OrgNumber"));
		bo.setNumber(NameStringGenerator.getInstance().createNameString(""));
		bo.setPostbox(NameStringGenerator.getInstance().createNameString("PostBox"));

		return bo;
	}
	
	
	public  List<Float>  randomFloatNumbers()
	{
		List<Float> fList = new LinkedList<Float>();
		
		for (int i = Math.max((int)(Math.random()*10) -4,2); i > 0; i--)
		{
			fList.add((float) (Math.random()*100));
		}
		return fList;
	}
	public  List<String>  randomDetails()
	{
		List<String> dList = new LinkedList<String>();
		
		for (int i = Math.max((int)(Math.random()*10) -6,0); i > 0; i--)
		{
			dList.add(NameStringGenerator.getInstance().createNameString("detail"));
		}
		return dList;
	}	
	
	public Boolean returnBool()
	{
		bool = !bool;
		return !bool;
	}
	
	
}
