package codegen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;



public class CodeGenUtil {

	public static String underscoreToCamelCase(String s) {
		
		for (int i = 1; i < s.length(); i++)
		{
			if (s.charAt(i) == '-' || s.charAt(i) == '_')
			{			
				s = s.substring(0, i) + s.substring(i+1,i+2).toUpperCase() + s.substring(i+2) ;
				
			}
		}
		
		
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

	public static String createSpaces(int depth) {
		String s = "";
		for (int i = 0; i < depth; i++) {
			s = s + "   ";
		}
		return s;
	}
	
	
	public static void writeJavaClassString(String s, String fileName) {
		BufferedWriter bw = null;
		try {

			// Specify the file name and path here
			String path = new File("src/test/java/out/"+fileName+".java").getAbsolutePath();
			File file = new File(path);

			System.out.println("works");
			// create file if it doesnt exist
			if (!file.exists()) {
				System.out.println(file.getAbsolutePath());
				file.createNewFile();
			}


			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(s);
			System.out.println("File written Successfully");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error in closing the BufferedWriter" + ex);
			}
		}
	}
	
	
	
	
	@SuppressWarnings("rawtypes")
	public static Class[] getPackageObjects(String packageName) throws ClassNotFoundException, IOException
	{

		 ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		    assert classLoader != null;
		    String path = packageName.replace('.', '/');
		    Enumeration<URL> resources = classLoader.getResources(path);
		    List<File> dirs = new ArrayList<File>();
		    while (resources.hasMoreElements()) {
		        URL resource = resources.nextElement();
		        dirs.add(new File(resource.getFile()));
		    }
		    ArrayList<Class> classes = new ArrayList<Class>();
		    for (File directory : dirs) {
		        classes.addAll(findClasses(directory, packageName));
		    }
		    return classes.toArray(new Class[classes.size()]);
		
		
	}
	
	
	
	@SuppressWarnings("rawtypes")
	private static  List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
	    List<Class> classes = new ArrayList<Class>();
	    if (!directory.exists()) {
	        return classes;
	    }
	    File[] files = directory.listFiles();
	    for (File file : files) {
	        if (file.isDirectory()) {
	            assert !file.getName().contains(".");
	            classes.addAll(findClasses(file, packageName + "." + file.getName()));
	        } else if (file.getName().endsWith(".class")) {
	            classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
	        }
	    }
	    return classes;
	}

}
