package codegen;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;

@SuppressWarnings({ "rawtypes", "restriction" })
public class CodeGenerator {

	private static ArrayList<Class> classList;
	private static int listObjectCounter;


	@SuppressWarnings("unused")
	public String getClassObjectsFromPackage(String packageName, String className)
	{
		
		StringBuilder sb = new StringBuilder();

		classList = new ArrayList<Class>();
		listObjectCounter = 1;
		
			// public class <className> { <<Methods>> }
			sb.append("public class "+className+" \n {\n");
			
			//loop trough all classes in the package
			try {
				for (Class clazz: CodeGenUtil.getPackageObjects(packageName))
				{
					try {
						if (!classList.contains(clazz) && !clazz.isEnum() ) {
							classList.add(clazz);
							sb.append((getClassObjects(clazz,0 )));
						}
						else {System.out.println("ist drin");}

					} catch (Exception e) {
						e.printStackTrace();}
				}
			
		//Catch	
		} catch (Exception e) {	e.printStackTrace();	}	

		
			sb.append("}");

			System.out.println("JavaClass was created");
			
			return sb.toString();

	}
	
	
	public String getClassObjects(Class clazz){

		StringBuilder sb = new StringBuilder();

		classList = new ArrayList<Class>();
		listObjectCounter = 1;

		// public class <className> { <<Methods>> }
		sb.append("public class ObjectCreator" + clazz.getSimpleName() + " \n {\n");
		
		try {
			sb.append(getClassObjects(clazz, 0));
		} catch (Exception e)
		{	e.printStackTrace();}
		
		sb.append("}");

		System.out.println("JavaClass was created");
		return sb.toString();
	}

	
	//recursive help method
	private static String getClassObjects(Class clazz, int depth)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		
		StringBuilder sb = new StringBuilder();

		String currentClassName = clazz.getSimpleName();

		// public <className> create<className>(){
		sb.append("public " + currentClassName + " create" + currentClassName + "() \n{\n");
		// <className> classname = new <className>();
		sb.append(currentClassName + " obj = new " + currentClassName + "();\n");

		ArrayList<String> sList = new ArrayList<String>();// ArrayList for submethods
		Method[] methods = clazz.getDeclaredMethods(); // for method Filtering

		// get properties from all gettermethods
		for (Method method : methods) {

			// Annotations for data type
			// Annotation[] newClass = method.getAnnotations();
			Annotation[] newClass = method.getDeclaredAnnotations();
			for (Annotation annotation : newClass) {
				if (annotation instanceof com.fasterxml.jackson.annotation.JsonProperty) {
					if (method.getReturnType() instanceof Class) {

						Class<?> claz = (Class<?>) method.getReturnType();

						
						// write setters

						// ...case of lists/collections
						if (sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl.class
								.isAssignableFrom(method.getGenericReturnType().getClass())) {

							sb.append("//list here \n");

							// recursive call
							String s = method.getGenericReturnType().getTypeName();
							s = s.split("[\\<\\>]")[1];

							// primitive list elements

							Class<?> methodReturnTypeClass = Thread.currentThread().getContextClassLoader()
									.loadClass(s);
							
							String methodReturnTypeClassName = methodReturnTypeClass.getSimpleName();
							int listLength = 2;

							if (isPrimitiveOrPrimitiveWrapperOrStringOrEnum(methodReturnTypeClass)) {

								

								
								// instantiate new list
								sb.append("ArrayList<").append(methodReturnTypeClassName)
										.append("> oList" + listObjectCounter + " = new ArrayList<")
										.append(methodReturnTypeClassName).append(">();\n");

								sb.append("for (int i=0; i < " + listLength + "; i++){\n")
										.append("oList" + listObjectCounter + ".add(")
										.append(createPrimitiveDataString(methodReturnTypeClass,
												CodeGenUtil.underscoreToCamelCase(
														((com.fasterxml.jackson.annotation.JsonProperty) annotation)
																.value()))
												+ ");\n");

								sb.append("} ");

								// call setter
								sb.append("obj.set"
										+ CodeGenUtil.underscoreToCamelCase(
												((com.fasterxml.jackson.annotation.JsonProperty) annotation).value())
										+ "(oList" + listObjectCounter + ");\n");

								// increment the counter
								listObjectCounter++;

							} // case of class in list
							else {

								// isntantiate new list
								sb.append("ArrayList<").append(methodReturnTypeClassName)
										.append("> oList" + listObjectCounter + " = new ArrayList<")
										.append(methodReturnTypeClassName).append(">();\n");

								sb.append("for (int i=0; i < " + listLength + "; i++){\n")
										.append("oList" + listObjectCounter + ".add(")
										.append("create" + methodReturnTypeClassName + "());\n");

								sb.append("} ");

								// call setter
								sb.append("obj.set"
										+ CodeGenUtil.underscoreToCamelCase(
												((com.fasterxml.jackson.annotation.JsonProperty) annotation).value())
										+ "(oList" + listObjectCounter + ");\n");

								// increment counter
								listObjectCounter++;

								// recursive call
								if (!classList.contains(methodReturnTypeClass)) {
									classList.add(methodReturnTypeClass);
									sList.add(getClassObjects(methodReturnTypeClass, depth + 1));
								}
							}

						}
						// ... case of primitive property
						else if (isPrimitiveOrPrimitiveWrapperOrStringOrEnum(claz)) {

							// call setter
							sb.append("obj.set" + CodeGenUtil
									.underscoreToCamelCase(((com.fasterxml.jackson.annotation.JsonProperty) annotation).value())
									+ "("
									+ createPrimitiveDataString(claz, CodeGenUtil.underscoreToCamelCase(
											((com.fasterxml.jackson.annotation.JsonProperty) annotation).value()))
									+ ");\n");

						} // case of class
						else {

							// call setter
							sb.append("obj.set"
									+ CodeGenUtil.underscoreToCamelCase(
											((com.fasterxml.jackson.annotation.JsonProperty) annotation).value())
									+ "( create" + claz.getSimpleName() + "());\n");

							// recursive call if not already called above
							if (!classList.contains(claz)) {
								classList.add(claz);
								sList.add(getClassObjects(claz, depth + 1));
							}
						}

					}
				}
			}
		}

		sb.append("return obj;\n");
		sb.append("}\n");

		// add sub methods to class
		for (String s : sList) {
			sb.append(s);
		}

		// return methods
		return sb.toString();
	}


	private static boolean isPrimitiveOrPrimitiveWrapperOrStringOrEnum(Class<?> type) {
		return (type.isPrimitive() && type != void.class) || type == Double.class || type == Float.class
				|| type == Long.class || type == Integer.class || type == Short.class || type == Character.class
				|| type == Byte.class || type == Boolean.class || type == String.class || type.isEnum();
	}

	private static boolean isPrimitiveNumOrPrimitiveWrapperNum(Class<?> type) {
		return (type == Double.class || type == Float.class || type == Byte.class || type == Long.class
				|| type == Integer.class || type == Short.class);
	}

	private static String createPrimitiveDataString(Class<?> clazz, String name) {
		// String
		if (clazz.equals(String.class)) {
			StringBuilder sb = new StringBuilder();
			sb.append("NameStringGenerator.getInstance().createNameString(").append('"').append(name).append('"')
					.append(")");
			return sb.toString();
			// Number
		} else if (isPrimitiveNumOrPrimitiveWrapperNum(clazz)) {
			StringBuilder sb = new StringBuilder();
			sb.append("MockUtil.getInstance().return" + clazz.getSimpleName() + "(100)");
			return sb.toString();
			// Boolean
		} else if (clazz.equals(Boolean.class)) {
			StringBuilder sb = new StringBuilder();
			sb.append("MockUtil.getInstance().returnBool()");
			return sb.toString();
			// Enum
		} else if (clazz.isEnum()) {
			


			StringBuilder sb = new StringBuilder();
			sb.append("(" + clazz.getCanonicalName() + ")MockUtil.getInstance().returnRandomEnumValue("
					+ clazz.getCanonicalName() + ".class)");
			return sb.toString();
			// Sonst
		} else {
			return "";
		}
	}

}
