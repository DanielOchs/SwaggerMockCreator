package codegen;

import java.lang.reflect.InvocationTargetException;

import io.swagger.model.branch.Branch;

public class CGMain {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException {

		CodeGenerator cg = new CodeGenerator();
		
		//create new class object and write it out
		CodeGenUtil.writeJavaClassString(cg.getClassObjects(Branch.class));
			
	}
	
}
