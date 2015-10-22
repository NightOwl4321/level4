package level4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Copywriter {
	public static void main(String[] args) {
		try {
			String currentDir= new File("files").getCanonicalPath();
			System.out.println("Dir: " + currentDir);
			File file = new File(currentDir);
			for(File f: file.listFiles()) {
				FileWriter fw = new FileWriter(f, true);
				Calendar now = Calendar.getInstance();
				String year = String.valueOf(now.get(Calendar.YEAR));
				fw.append("Copywrited: Kendra Kleber " + year);
				fw.close();
			}
				//-
			FileReader fr = new FileReader(file);
			String line = "";
			boolean copy = false;
			for(File f: file.listFiles()) {
				BufferedReader reader = new BufferedReader(fr);
				while((line = reader.readLine()) != null) {
					if(line.contains("Copywrited: Kendra Kleber 2k15")) {
						copy = true;
						break;
					} 
				}
				if(copy = false) {
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
