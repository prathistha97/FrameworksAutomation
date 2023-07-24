package jul24th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
	
		
		FileInputStream fis=new FileInputStream("D:\\003 Live Tech\\softwares\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		System.out.println("LastRowNum   "+ws.getLastRowNum());
		
		System.out.println("PhysicalNumberOfRows   "+ws.getPhysicalNumberOfRows());
		
		System.out.println("LastCellNum   "+ws.getRow(1).getLastCellNum());
		
		System.out.println("PhysicalNumberOfCells   "+ws.getRow(1).getPhysicalNumberOfCells());
		
		Row row=null;
		
		for(int i=0;i<=ws.getLastRowNum();i++)
		{
			
			row=ws.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++)
			{
				if(row.getCell(j).getCellType()==CellType.STRING)
				{
					System.out.println(row.getCell(j).getStringCellValue()+" is a String");
				}
				else if(row.getCell(j).getCellType()==CellType.NUMERIC)
				{
					System.out.println(row.getCell(j).getNumericCellValue()+" is a Number");
				}
				else if(row.getCell(j).getCellType()==CellType.BOOLEAN)
				{
					System.out.println(row.getCell(j).getBooleanCellValue()+" is a Boolean");
				}
			}
			
		}
		
		System.out.println("End of program");

	}

}
