package codegen;

import java.lang.reflect.InvocationTargetException;

import io.swagger.model.branch.Branch;
import io.swagger.model.consents.InlineResponse200;



public class CGMain {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException {

		CodeGenerator cg = new CodeGenerator();
		
		System.out.println(CodeGenUtil.underscoreToCamelCase("hi-was-geht_bei_dir_so"));
		
		
		//create new class object and write it out
		CodeGenUtil.writeJavaClassString(cg.getClassObjects(InlineResponse200.class));
			
	}
	
}
