package out;

import data.faker.MockUtil;
import data.faker.NameStringGenerator;
import io.swagger.model.actimize.cdd.CDDRiskfactors;
import io.swagger.model.actimize.cdd.CDDRiskfactors1;
import io.swagger.model.actimize.cdd.Customer;
import io.swagger.model.actimize.cdd.Model200;
import io.swagger.model.actimize.cdd.RiskFactors;
import io.swagger.model.actimize.cdd.RiskFactorsBearerShares;
import io.swagger.model.actimize.cdd.RiskFactorsUBO;

public class ioswaggermodelactimizecdd {
	public CDDRiskfactors createCDDRiskfactors() {
		CDDRiskfactors obj = new CDDRiskfactors();
		obj.setSourceID(NameStringGenerator.getInstance().createNameString("SourceID"));
		obj.setCustomer(createCustomer());
		obj.setRiskFactors(createRiskFactors());
		obj.setEvaluationOnly(NameStringGenerator.getInstance().createNameString("EvaluationOnly"));
		obj.setManualRiskOverwriteTo(NameStringGenerator.getInstance().createNameString("ManualRiskOverwriteTo"));
		return obj;
	}

	public Customer createCustomer() {
		Customer obj = new Customer();
		obj.setCustomerID(NameStringGenerator.getInstance().createNameString("CustomerID"));
		obj.setCustomerIDType(NameStringGenerator.getInstance().createNameString("CustomerIDType"));
		obj.setCoreTenantID(NameStringGenerator.getInstance().createNameString("CoreTenantID"));
		return obj;
	}

	public RiskFactors createRiskFactors() {
		RiskFactors obj = new RiskFactors();
		obj.setIntransparentOwnershipStructure(
				NameStringGenerator.getInstance().createNameString("IntransparentOwnershipStructure"));
		obj.setCountryOfOperations(NameStringGenerator.getInstance().createNameString("CountryOfOperations"));
		obj.setLengthOfRelationship(NameStringGenerator.getInstance().createNameString("LengthOfRelationship"));
		obj.setDeliveryChannel(NameStringGenerator.getInstance().createNameString("DeliveryChannel"));
		obj.setCashTransactionAmount(NameStringGenerator.getInstance().createNameString("CashTransactionAmount"));
		obj.setWireTransactionAmount(NameStringGenerator.getInstance().createNameString("WireTransactionAmount"));
		obj.setCompanyHasPEP(NameStringGenerator.getInstance().createNameString("CompanyHasPEP"));
		obj.setNegativeNews(NameStringGenerator.getInstance().createNameString("NegativeNews"));
		obj.setBearerShares(createRiskFactorsBearerShares());
		obj.setCustomerType(NameStringGenerator.getInstance().createNameString("CustomerType"));
		obj.setIndustry(NameStringGenerator.getInstance().createNameString("Industry"));
		obj.setLegalForm(NameStringGenerator.getInstance().createNameString("LegalForm"));
		obj.setUBO(createRiskFactorsUBO());
		obj.setProducts(NameStringGenerator.getInstance().createNameString("Products"));
		obj.setTop5countries(NameStringGenerator.getInstance().createNameString("Top5countries"));
		obj.setSantionsandEmbargos(NameStringGenerator.getInstance().createNameString("SantionsandEmbargos"));
		obj.setSuspiciousSourceOfFunds(NameStringGenerator.getInstance().createNameString("SuspiciousSourceOfFunds"));
		obj.setUnusualClientBehavior(NameStringGenerator.getInstance().createNameString("UnusualClientBehavior"));
		obj.setSpecialRiskIndustries(NameStringGenerator.getInstance().createNameString("SpecialRiskIndustries"));
		obj.setCountryOfResidence(NameStringGenerator.getInstance().createNameString("CountryOfResidence"));
		obj.setCountryOfIncorporation(NameStringGenerator.getInstance().createNameString("CountryOfIncorporation"));
		return obj;
	}

	public RiskFactorsBearerShares createRiskFactorsBearerShares() {
		RiskFactorsBearerShares obj = new RiskFactorsBearerShares();
		obj.setIssuedBearerShares(NameStringGenerator.getInstance().createNameString("IssuedBearerShares"));
		obj.setPubliclyTraded(NameStringGenerator.getInstance().createNameString("PubliclyTraded"));
		return obj;
	}

	public RiskFactorsUBO createRiskFactorsUBO() {
		RiskFactorsUBO obj = new RiskFactorsUBO();
		obj.setUbOAvailable(MockUtil.getInstance().returnBool());
		obj.ubOCountries(NameStringGenerator.getInstance().createNameString("UBOCountries"));
		return obj;
	}

	public CDDRiskfactors1 createCDDRiskfactors1() {
		CDDRiskfactors1 obj = new CDDRiskfactors1();
		obj.setRiskFactors(createRiskFactors());
		obj.setUser(NameStringGenerator.getInstance().createNameString("User"));
		obj.setSourceId(NameStringGenerator.getInstance().createNameString("SourceId"));
		obj.setEvaluationOnly(NameStringGenerator.getInstance().createNameString("EvaluationOnly"));
		return obj;
	}

	public Model200 createModel200() {
		Model200 obj = new Model200();
		obj.setGlobalRiskLevel(NameStringGenerator.getInstance().createNameString("GlobalRiskLevel"));
		obj.setGlobalRiskScore(MockUtil.getInstance().returnFloat(100));
		obj.setCrRGlobalScoreVersion(MockUtil.getInstance().returnFloat(100));
		obj.setCalculationDate(NameStringGenerator.getInstance().createNameString("CalculationDate"));
		obj.setAutoHighReason(NameStringGenerator.getInstance().createNameString("AutoHighReason"));
		return obj;
	}
}