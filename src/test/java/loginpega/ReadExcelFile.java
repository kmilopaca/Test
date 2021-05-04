package loginpega;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadExcelFile {
	public ReadExcelFile() {
		// TODO auto-generated constructor stub
	}
	
	public void readExcel( String filepath, String sheetName) throws Exception {
		
		File file = new File(filepath); 
		
		FileInputStream imputStream = new FileInputStream(file);
		
	
		
	}

}
