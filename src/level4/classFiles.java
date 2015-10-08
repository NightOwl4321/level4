package level4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class classFiles {
	
	public static void main(String[] args) {
		File file = new File("qazwsxedcrfvtgbyhnujmik");
		System.out.println(file.getAbsolutePath());
		try {
			FileWriter fWriter = new FileWriter(file, false);
			fWriter.write("WSXCDERFVBGTYHN ");
			fWriter.write("eeeeeeeeeeeeeeeeeee");
			fWriter.write("thytghyt");
			fWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 
		
	}

}
