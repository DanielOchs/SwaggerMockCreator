public class ObjectCreatorBranch {
	public Branch createBranch() {
		Branch obj = new Branch();
		obj.setName(NameStringGenerator.getInstance().createNameString("Name"));
		obj.setId(NameStringGenerator.getInstance().createNameString("Id"));
		obj.setNumber(NameStringGenerator.getInstance().createNameString("Number"));
		obj.setCountry(NameStringGenerator.getInstance().createNameString("Country"));
		obj.setSate(NameStringGenerator.getInstance().createNameString("Sate"));
		obj.setZip(NameStringGenerator.getInstance().createNameString("Zip"));
		obj.setCity(NameStringGenerator.getInstance().createNameString("City"));
		obj.setPostalCity(NameStringGenerator.getInstance().createNameString("PostalCity"));
		obj.setPostalCountry(NameStringGenerator.getInstance().createNameString("PostalCountry"));
		obj.setPostalStreet(NameStringGenerator.getInstance().createNameString("PostalStreet"));
		obj.setVault(MockUtil.getInstance().returnBool());
		obj.setBarriereTyp(NameStringGenerator.getInstance().createNameString("BarriereTyp"));
		obj.setNaechsteFilHB(NameStringGenerator.getInstance().createNameString("NaechsteFilHB"));
		// list here
		ArrayList<Float> oList1 = new ArrayList<Float>();
		for (int i = 0; i < 3; i++) {
			oList1.add(MockUtil.getInstance().returnFloat(100));
		}
		obj.setPosition(oList1);
		obj.setKasse(MockUtil.getInstance().returnBool());
		obj.setBranchOffice(createBranchOffice());
		obj.setImportGroup(NameStringGenerator.getInstance().createNameString("ImportGroup"));
		obj.setOrgNumber(NameStringGenerator.getInstance().createNameString("OrgNumber"));
		obj.setOrgType(NameStringGenerator.getInstance().createNameString("OrgType"));
		obj.setOrgTypeName(NameStringGenerator.getInstance().createNameString("OrgTypeName"));
		obj.setOrgSpec(NameStringGenerator.getInstance().createNameString("OrgSpec"));
		obj.setOrgSpecName(NameStringGenerator.getInstance().createNameString("OrgSpecName"));
		return obj;
	}

	public BranchOffice createBranchOffice() {
		BranchOffice obj = new BranchOffice();
		obj.setName(NameStringGenerator.getInstance().createNameString("Name"));
		obj.setNumber(NameStringGenerator.getInstance().createNameString("Number"));
		obj.setZip(NameStringGenerator.getInstance().createNameString("Zip"));
		obj.setCity(NameStringGenerator.getInstance().createNameString("City"));
		obj.setPostalCity(NameStringGenerator.getInstance().createNameString("PostalCity"));
		// list here
		ArrayList<Float> oList2 = new ArrayList<Float>();
		for (int i = 0; i < 3; i++) {
			oList2.add(MockUtil.getInstance().returnFloat(100));
		}
		obj.setPosition(oList2);
		obj.setOrgNumber(NameStringGenerator.getInstance().createNameString("OrgNumber"));
		obj.setStreet(NameStringGenerator.getInstance().createNameString("Street"));
		obj.setPostbox(NameStringGenerator.getInstance().createNameString("Postbox"));
		obj.setPostalZip(NameStringGenerator.getInstance().createNameString("PostalZip"));
		obj.setFax(NameStringGenerator.getInstance().createNameString("Fax"));
		obj.setPhone(NameStringGenerator.getInstance().createNameString("Phone"));
		return obj;
	}
}