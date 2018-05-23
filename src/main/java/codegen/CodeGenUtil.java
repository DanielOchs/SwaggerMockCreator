package codegen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.lang3.text.WordUtils;


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
	
	
	public static void writeJavaClassString(String s) {
		BufferedWriter bw = null;
		try {

			// Specify the file name and path here
			String path = new File("src/test/java/out/test.java").getAbsolutePath();
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

}
