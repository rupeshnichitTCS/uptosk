package paramererization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Num_as_string {
	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fir= new FileInputStream("C:\\Users\\DELL\\Documents\\Automation 2.xlsx");
		String vlaue = WorkbookFactory.create(fir).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(vlaue);
	
		
	}

}
