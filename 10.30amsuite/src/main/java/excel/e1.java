package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class e1 {
	
	// apache poi, apache poiooxml, apchae poo ooxml scheme
	
	@Test
	public void t1() throws IOException
	{
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		
		// count number of rows
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows "+ row);
		
		//count number of columns: be sepecific about the row number
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println(col);
		
		// read the cell: know the row index and column index
		//1,1
		XSSFCell data = sheet.getRow(1).getCell(1);
		System.out.println(data);
		
		//write: should not be op3n
		// 67,5
		sheet.getRow(67).createCell(5).setCellValue("10.30");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
	}

}
