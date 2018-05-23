package codegen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CodeGenUtil {

	public static String firstToUpper(String s) {
		s = s.substring(0, 1).toUpperCase() + s.substring(1);
		return s;
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
			String path = new File("src/test/out/test.java").getAbsolutePath();
			File file = new File(path);

			// create file if it doesnt exist
			if (!file.exists()) {
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
