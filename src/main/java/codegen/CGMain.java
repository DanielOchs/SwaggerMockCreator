package codegen;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import io.swagger.model.actimize.wlf.InlineResponse200;

public class CGMain {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, InstantiationException, ClassNotFoundException {

		CodeGenerator cg = new CodeGenerator();

		 //1. create new class object and write it out
		 CodeGenUtil.writeJavaClassString(cg.getClassObjects(InlineResponse200.class),"");

		ArrayList<String> sList = new ArrayList<String>();

		sList.add("io.swagger.model.accounts.verwsvc");
		sList.add("io.swagger.model.actimize.cdd");
		sList.add("io.swagger.model.actimize.wlf");
		sList.add("io.swagger.model.branchlocator");
		sList.add("io.swagger.model.consents");
		sList.add("io.swagger.model.constraints.accounts");
		sList.add("io.swagger.model.constraints.costumers");
		sList.add("io.swagger.model.payments");
		sList.add("io.swagger.model.phonecall");
		sList.add("io.swagger.model.savings");
		
		//2. generate a mockCreatorClass for all classes in a given package
		for (String s: sList)//or alle the packages above
		{
			CodeGenUtil.writeJavaClassString(
					cg.getClassObjectsFromPackage(s, s.replace(".", "")),s.replace(".", "") );
		}
		
	}

}
