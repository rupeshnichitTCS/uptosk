package paramererization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Numeric_data {
	public static void main(String[] args) throws Throwable {
		// crate object of fileinputs class
		FileInputStream fir=new FileInputStream("C:\\Users\\DELL\\Documents\\Automation 2.xlsx");
		//used crate method to used excal sheet
		 double value = WorkbookFactory.create(fir).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(value);
		
	}

}
