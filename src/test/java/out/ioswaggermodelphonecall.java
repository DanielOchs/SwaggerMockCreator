package out;

import java.util.ArrayList;

import data.faker.MockUtil;
import data.faker.NameStringGenerator;
import io.swagger.model.phonecall.CBCSPActivityDocCorrelation;
import io.swagger.model.phonecall.CBCSPActivityDocError;
import io.swagger.model.phonecall.CBCSPActivityDocParticipant;
import io.swagger.model.phonecall.CBCSPActivityDocPhonecall;
import io.swagger.model.phonecall.CBCSPActivityDocReference;
import io.swagger.model.phonecall.CBCSPActivityDocResponsible;
import io.swagger.model.phonecall.CBCSPActivityInterfacePhonecallErrorResponse;
import io.swagger.model.phonecall.CBCSPActivityInterfaceV1PhonecallGetResponse;
import io.swagger.model.phonecall.CBCSPActivityInterfaceV1PhonecallPutBodyParameters;

public class ioswaggermodelphonecall {
	public CBCSPActivityDocCorrelation createCBCSPActivityDocCorrelation() {
		CBCSPActivityDocCorrelation obj = new CBCSPActivityDocCorrelation();
		obj.setSystem(NameStringGenerator.getInstance().createNameString("System"));
		obj.setUniqueId(NameStringGenerator.getInstance().createNameString("UniqueId"));
		return obj;
	}

	public CBCSPActivityDocError createCBCSPActivityDocError() {
		CBCSPActivityDocError obj = new CBCSPActivityDocError();
		obj.setDescription(NameStringGenerator.getInstance().createNameString("Description"));
		obj.setCode(NameStringGenerator.getInstance().createNameString("Code"));
		return obj;
	}

	public CBCSPActivityDocParticipant createCBCSPActivityDocParticipant() {
		CBCSPActivityDocParticipant obj = new CBCSPActivityDocParticipant();
		obj.setForeignKeyType((io.swagger.model.phonecall.CBCSPActivityDocParticipant.ForeignKeyTypeEnum) MockUtil
				.getInstance().returnRandomEnumValue(
						io.swagger.model.phonecall.CBCSPActivityDocParticipant.ForeignKeyTypeEnum.class));
		obj.setForeignKey(NameStringGenerator.getInstance().createNameString("ForeignKey"));
		return obj;
	}

	public CBCSPActivityDocPhonecall createCBCSPActivityDocPhonecall() {
		CBCSPActivityDocPhonecall obj = new CBCSPActivityDocPhonecall();
		obj.setCategory(NameStringGenerator.getInstance().createNameString("Category"));
		obj.setDescription(NameStringGenerator.getInstance().createNameString("Description"));
		obj.setActualStartTime(NameStringGenerator.getInstance().createNameString("ActualStartTime"));
		obj.setActualDuration(MockUtil.getInstance().returnInteger(100));
		obj.setCorrelation(createCBCSPActivityDocCorrelation());
		obj.setRegarding(createCBCSPActivityDocReference());
		obj.setCustomerId(NameStringGenerator.getInstance().createNameString("CustomerId"));
		obj.setResponsible(createCBCSPActivityDocResponsible());
		obj.setPhonenumber(NameStringGenerator.getInstance().createNameString("Phonenumber"));
		// list here
		ArrayList<CBCSPActivityDocParticipant> oList1 = new ArrayList<CBCSPActivityDocParticipant>();
		for (int i = 0; i < 2; i++) {
			oList1.add(createCBCSPActivityDocParticipant());
		}
		obj.setFrom(oList1);
		// list here
		ArrayList<CBCSPActivityDocParticipant> oList2 = new ArrayList<CBCSPActivityDocParticipant>();
		for (int i = 0; i < 2; i++) {
			oList2.add(createCBCSPActivityDocParticipant());
		}
		obj.setTo(oList2);
		obj.setDoddfrank(MockUtil.getInstance().returnBool());
		obj.setEmir(MockUtil.getInstance().returnBool());
		obj.setMifid(MockUtil.getInstance().returnBool());
		obj.setStateCode((io.swagger.model.phonecall.CBCSPActivityDocPhonecall.StateCodeEnum) MockUtil.getInstance()
				.returnRandomEnumValue(io.swagger.model.phonecall.CBCSPActivityDocPhonecall.StateCodeEnum.class));
		obj.setStatusCode((io.swagger.model.phonecall.CBCSPActivityDocPhonecall.StatusCodeEnum) MockUtil.getInstance()
				.returnRandomEnumValue(io.swagger.model.phonecall.CBCSPActivityDocPhonecall.StatusCodeEnum.class));
		return obj;
	}

	public CBCSPActivityDocReference createCBCSPActivityDocReference() {
		CBCSPActivityDocReference obj = new CBCSPActivityDocReference();
		obj.setForeignKeyType((io.swagger.model.phonecall.CBCSPActivityDocReference.ForeignKeyTypeEnum) MockUtil
				.getInstance()
				.returnRandomEnumValue(io.swagger.model.phonecall.CBCSPActivityDocReference.ForeignKeyTypeEnum.class));
		obj.setForeignKey(NameStringGenerator.getInstance().createNameString("ForeignKey"));
		return obj;
	}

	public CBCSPActivityDocResponsible createCBCSPActivityDocResponsible() {
		CBCSPActivityDocResponsible obj = new CBCSPActivityDocResponsible();
		obj.setForeignKeyType((io.swagger.model.phonecall.CBCSPActivityDocResponsible.ForeignKeyTypeEnum) MockUtil
				.getInstance().returnRandomEnumValue(
						io.swagger.model.phonecall.CBCSPActivityDocResponsible.ForeignKeyTypeEnum.class));
		obj.setForeignKey(NameStringGenerator.getInstance().createNameString("ForeignKey"));
		return obj;
	}

	public CBCSPActivityInterfacePhonecallErrorResponse createCBCSPActivityInterfacePhonecallErrorResponse() {
		CBCSPActivityInterfacePhonecallErrorResponse obj = new CBCSPActivityInterfacePhonecallErrorResponse();
		// list here
		ArrayList<CBCSPActivityDocError> oList3 = new ArrayList<CBCSPActivityDocError>();
		for (int i = 0; i < 2; i++) {
			oList3.add(createCBCSPActivityDocError());
		}
		obj.setErrors(oList3);
		return obj;
	}

	public CBCSPActivityInterfaceV1PhonecallGetResponse createCBCSPActivityInterfaceV1PhonecallGetResponse() {
		CBCSPActivityInterfaceV1PhonecallGetResponse obj = new CBCSPActivityInterfaceV1PhonecallGetResponse();
		obj.setPhonecall(createCBCSPActivityDocPhonecall());
		return obj;
	}

	public CBCSPActivityInterfaceV1PhonecallPutBodyParameters createCBCSPActivityInterfaceV1PhonecallPutBodyParameters() {
		CBCSPActivityInterfaceV1PhonecallPutBodyParameters obj = new CBCSPActivityInterfaceV1PhonecallPutBodyParameters();
		obj.setPhonecall(createCBCSPActivityDocPhonecall());
		return obj;
	}
}