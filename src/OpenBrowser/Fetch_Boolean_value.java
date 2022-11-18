package OpenBrowser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Boolean_value {
	public static void main(String[] args) throws Throwable {
		FileInputStream fir=new FileInputStream("C:\\Users\\DELL\\Documents\\Automation 2.xlsx");
		boolean value = WorkbookFactory.create(fir).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
		System.out.println(value);
	}

}
