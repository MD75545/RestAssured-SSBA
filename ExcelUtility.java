package generic_Utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{

	/**
	 *   its used to read the data from Excel-Workbook based on below 
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @return String data
	 * @throws Throwable 

	 * @throws Throwable
	 */
    public String GetExcelData(String sheetName,int rowNum,int cellNum) throws Throwable 
    {
    		FileInputStream fis= new FileInputStream(Iconstants.ExcelfilePath);
    	Workbook wb = WorkbookFactory.create(fis);
    	Sheet sh = wb.getSheet(sheetName);
    	Row row = sh.getRow(rowNum);
    	Cell cel = row.getCell(cellNum);
    	String value = cel.getStringCellValue();
		return value;
    
    }
}
