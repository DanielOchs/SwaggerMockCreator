package out;

import java.util.ArrayList;

import data.faker.MockUtil;
import data.faker.NameStringGenerator;
import io.swagger.model.actimize.wlf.Address;
import io.swagger.model.actimize.wlf.Hits;
import io.swagger.model.actimize.wlf.HitsAdditionalInfo;
import io.swagger.model.actimize.wlf.HitsAddresses;
import io.swagger.model.actimize.wlf.HitsAliases;
import io.swagger.model.actimize.wlf.HitsCategories;
import io.swagger.model.actimize.wlf.HitsCountriesOfBirth;
import io.swagger.model.actimize.wlf.HitsDatesOfBirth;
import io.swagger.model.actimize.wlf.HitsIds;
import io.swagger.model.actimize.wlf.HitsKeywords;
import io.swagger.model.actimize.wlf.HitsNationalityCountries;
import io.swagger.model.actimize.wlf.HitsScoreFactors;
import io.swagger.model.actimize.wlf.Id;
import io.swagger.model.actimize.wlf.InlineResponse200;
import io.swagger.model.actimize.wlf.Person;
import io.swagger.model.actimize.wlf.PersonBlackListQuery;
import io.swagger.model.actimize.wlf.PersonPersonData;

public class ioswaggermodelactimizewlf {
	public Address createAddress() {
		Address obj = new Address();
		obj.setCountry(NameStringGenerator.getInstance().createNameString("Country"));
		obj.setCity(NameStringGenerator.getInstance().createNameString("City"));
		obj.setPostalcode(MockUtil.getInstance().returnInteger(100));
		obj.setStateProvince(NameStringGenerator.getInstance().createNameString("StateProvince"));
		obj.setStreet1(NameStringGenerator.getInstance().createNameString("Street1"));
		obj.setStreet2(NameStringGenerator.getInstance().createNameString("Street2"));
		return obj;
	}

	public Hits createHits() {
		Hits obj = new Hits();
		obj.setType(NameStringGenerator.getInstance().createNameString("Type"));
		// list here
		ArrayList<HitsAliases> oList1 = new ArrayList<HitsAliases>();
		for (int i = 0; i < 2; i++) {
			oList1.add(createHitsAliases());
		}
		obj.setAliases(oList1);
		// list here
		ArrayList<HitsAdditionalInfo> oList2 = new ArrayList<HitsAdditionalInfo>();
		for (int i = 0; i < 2; i++) {
			oList2.add(createHitsAdditionalInfo());
		}
		obj.setAdditionalInfo(oList2);
		// list here
		ArrayList<HitsCountriesOfBirth> oList3 = new ArrayList<HitsCountriesOfBirth>();
		for (int i = 0; i < 2; i++) {
			oList3.add(createHitsCountriesOfBirth());
		}
		obj.setCountriesOfBirth(oList3);
		obj.setEntryCreatedDate(NameStringGenerator.getInstance().createNameString("EntryCreatedDate"));
		obj.setEntryUpdateDate(NameStringGenerator.getInstance().createNameString("EntryUpdateDate"));
		obj.setListUpdateDate(NameStringGenerator.getInstance().createNameString("ListUpdateDate"));
		// list here
		ArrayList<HitsNationalityCountries> oList4 = new ArrayList<HitsNationalityCountries>();
		for (int i = 0; i < 2; i++) {
			oList4.add(createHitsNationalityCountries());
		}
		obj.setNationalityCountries(oList4);
		// list here
		ArrayList<HitsAddresses> oList5 = new ArrayList<HitsAddresses>();
		for (int i = 0; i < 2; i++) {
			oList5.add(createHitsAddresses());
		}
		obj.setAddresses(oList5);
		// list here
		ArrayList<HitsCategories> oList6 = new ArrayList<HitsCategories>();
		for (int i = 0; i < 2; i++) {
			oList6.add(createHitsCategories());
		}
		obj.setCategories(oList6);
		// list here
		ArrayList<HitsDatesOfBirth> oList7 = new ArrayList<HitsDatesOfBirth>();
		for (int i = 0; i < 2; i++) {
			oList7.add(createHitsDatesOfBirth());
		}
		obj.setDatesOfBirth(oList7);
		obj.setDeceasedDate(NameStringGenerator.getInstance().createNameString("DeceasedDate"));
		obj.setGender(NameStringGenerator.getInstance().createNameString("Gender"));
		// list here
		ArrayList<HitsKeywords> oList8 = new ArrayList<HitsKeywords>();
		for (int i = 0; i < 2; i++) {
			oList8.add(createHitsKeywords());
		}
		obj.setKeywords(oList8);
		obj.setListEntryKey(NameStringGenerator.getInstance().createNameString("ListEntryKey"));
		obj.setListId(NameStringGenerator.getInstance().createNameString("ListId"));
		// list here
		ArrayList<HitsIds> oList9 = new ArrayList<HitsIds>();
		for (int i = 0; i < 2; i++) {
			oList9.add(createHitsIds());
		}
		obj.setIds(oList9);
		obj.setMatchType(NameStringGenerator.getInstance().createNameString("MatchType"));
		// list here
		ArrayList<HitsAliases> oList10 = new ArrayList<HitsAliases>();
		for (int i = 0; i < 2; i++) {
			oList10.add(createHitsAliases());
		}
		obj.setNames(oList10);
		obj.setPosition(NameStringGenerator.getInstance().createNameString("Position"));
		obj.setScore(MockUtil.getInstance().returnInteger(100));
		// list here
		ArrayList<HitsScoreFactors> oList11 = new ArrayList<HitsScoreFactors>();
		for (int i = 0; i < 2; i++) {
			oList11.add(createHitsScoreFactors());
		}
		obj.setScoreFactors(oList11);
		obj.setTitle(NameStringGenerator.getInstance().createNameString("Title"));
		return obj;
	}

	public HitsAliases createHitsAliases() {
		HitsAliases obj = new HitsAliases();
		obj.setMaidenName(NameStringGenerator.getInstance().createNameString("MaidenName"));
		obj.setLastName(NameStringGenerator.getInstance().createNameString("LastName"));
		obj.setFullName(NameStringGenerator.getInstance().createNameString("FullName"));
		obj.setMiddleName(NameStringGenerator.getInstance().createNameString("MiddleName"));
		obj.setFirstName(NameStringGenerator.getInstance().createNameString("FirstName"));
		return obj;
	}

	public HitsAdditionalInfo createHitsAdditionalInfo() {
		HitsAdditionalInfo obj = new HitsAdditionalInfo();
		obj.setName(NameStringGenerator.getInstance().createNameString("Name"));
		obj.setValue(NameStringGenerator.getInstance().createNameString("Value"));
		return obj;
	}

	public HitsCountriesOfBirth createHitsCountriesOfBirth() {
		HitsCountriesOfBirth obj = new HitsCountriesOfBirth();
		obj.setCountry(NameStringGenerator.getInstance().createNameString("Country"));
		return obj;
	}

	public HitsNationalityCountries createHitsNationalityCountries() {
		HitsNationalityCountries obj = new HitsNationalityCountries();
		obj.setCountry2(NameStringGenerator.getInstance().createNameString("Country2"));
		obj.setCountry1(NameStringGenerator.getInstance().createNameString("Country1"));
		return obj;
	}

	public HitsAddresses createHitsAddresses() {
		HitsAddresses obj = new HitsAddresses();
		obj.setCountry(NameStringGenerator.getInstance().createNameString("Country"));
		obj.setCity(NameStringGenerator.getInstance().createNameString("City"));
		obj.setPostalcode(MockUtil.getInstance().returnInteger(100));
		obj.setStateProvince(NameStringGenerator.getInstance().createNameString("StateProvince"));
		obj.setStreet1(NameStringGenerator.getInstance().createNameString("Street1"));
		obj.setStreet2(NameStringGenerator.getInstance().createNameString("Street2"));
		return obj;
	}

	public HitsCategories createHitsCategories() {
		HitsCategories obj = new HitsCategories();
		obj.setCategory(NameStringGenerator.getInstance().createNameString("Category"));
		return obj;
	}

	public HitsDatesOfBirth createHitsDatesOfBirth() {
		HitsDatesOfBirth obj = new HitsDatesOfBirth();
		obj.setDateOfBirth(MockUtil.getInstance().returnInteger(100));
		return obj;
	}

	public HitsKeywords createHitsKeywords() {
		HitsKeywords obj = new HitsKeywords();
		obj.setKeyword(NameStringGenerator.getInstance().createNameString("Keyword"));
		return obj;
	}

	public HitsIds createHitsIds() {
		HitsIds obj = new HitsIds();
		obj.setIdValue(NameStringGenerator.getInstance().createNameString("IdValue"));
		obj.setIdType(NameStringGenerator.getInstance().createNameString("IdType"));
		obj.setIdCountry(NameStringGenerator.getInstance().createNameString("IdCountry"));
		return obj;
	}

	public HitsScoreFactors createHitsScoreFactors() {
		HitsScoreFactors obj = new HitsScoreFactors();
		obj.setFactorId(NameStringGenerator.getInstance().createNameString("FactorId"));
		obj.setFactorDesc(NameStringGenerator.getInstance().createNameString("FactorDesc"));
		obj.setFactorImpact(NameStringGenerator.getInstance().createNameString("FactorImpact"));
		obj.setFactorScore(NameStringGenerator.getInstance().createNameString("FactorScore"));
		obj.setFactorValue(NameStringGenerator.getInstance().createNameString("FactorValue"));
		return obj;
	}

	public Id createId() {
		Id obj = new Id();
		obj.setType(NameStringGenerator.getInstance().createNameString("Type"));
		obj.setCountry(NameStringGenerator.getInstance().createNameString("Country"));
		obj.setIdValue(NameStringGenerator.getInstance().createNameString("IdValue"));
		return obj;
	}

	public InlineResponse200 createInlineResponse200() {
		InlineResponse200 obj = new InlineResponse200();
		obj.setHits(createHits());
		obj.setHasHit(MockUtil.getInstance().returnBool());
		return obj;
	}

	public Person createPerson() {
		Person obj = new Person();
		// list here
		ArrayList<Address> oList12 = new ArrayList<Address>();
		for (int i = 0; i < 2; i++) {
			oList12.add(createAddress());
		}
		obj.setAddresses(oList12);
		// list here
		ArrayList<Id> oList13 = new ArrayList<Id>();
		for (int i = 0; i < 2; i++) {
			oList13.add(createId());
		}
		obj.setIds(oList13);
		obj.setNames(createHitsAliases());
		obj.setSearchDefinitionId(NameStringGenerator.getInstance().createNameString("SearchDefinitionId"));
		obj.setPersonData(createPersonPersonData());
		obj.setRequestId(NameStringGenerator.getInstance().createNameString("RequestId"));
		return obj;
	}

	public PersonPersonData createPersonPersonData() {
		PersonPersonData obj = new PersonPersonData();
		obj.setDateOfBirth(NameStringGenerator.getInstance().createNameString("DateOfBirth"));
		obj.setGender(NameStringGenerator.getInstance().createNameString("Gender"));
		obj.setTitle(NameStringGenerator.getInstance().createNameString("Title"));
		obj.setLocationOfBirth(NameStringGenerator.getInstance().createNameString("LocationOfBirth"));
		obj.setCountryOfBirth(NameStringGenerator.getInstance().createNameString("CountryOfBirth"));
		obj.setYearOfBirth(MockUtil.getInstance().returnInteger(100));
		// list here
		ArrayList<String> oList14 = new ArrayList<String>();
		for (int i = 0; i < 2; i++) {
			oList14.add(NameStringGenerator.getInstance().createNameString("Nationalities"));
		}
		obj.setNationalities(oList14);
		return obj;
	}

	public PersonBlackListQuery createPersonBlackListQuery() {
		PersonBlackListQuery obj = new PersonBlackListQuery();
		obj.setPerson(createPerson());
		return obj;
	}
}