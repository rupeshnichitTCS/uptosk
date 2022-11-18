package paramererization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_data_faching {
	public static void main(String[] args) throws Throwable {
		//crate object of Fileinputstrem class
		FileInputStream fir=new FileInputStream("C:\\Users\\DELL\\Documents\\fechdata.xlsx");
		//used crate method to used excal sheet
		String value = WorkbookFactory.create(fir).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(value);
		
		
	}

}
