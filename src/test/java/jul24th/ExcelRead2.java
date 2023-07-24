package jul24th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
	
		
		FileInputStream fis=new FileInputStream("D:\\003 Live Tech\\softwares\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		System.out.println("LastRowNum   "+ws.getLastRowNum());
		
		System.out.println("PhysicalNumberOfRows   "+ws.getPhysicalNumberOfRows());
		
		System.out.println("LastCellNum   "+ws.getRow(1).getLastCellNum());
		
		System.out.println("PhysicalNumberOfCells   "+ws.getRow(1).getPhysicalNumberOfCells());
		
		Row row=null;
		Cell cell=null;
		
		Iterator<Row> rows=ws.rowIterator();
		
		while(rows.hasNext())
		{
			
			row=rows.next();
			
			Iterator<Cell>  cells=row.cellIterator();
			
			while(cells.hasNext())
			{
				cell=cells.next();
				
				if(cell.getCellType()==CellType.STRING)
				{
					System.out.println(cell.getStringCellValue()+" is a String");
				}
				else if(cell.getCellType()==CellType.NUMERIC)
				{
					System.out.println(cell.getNumericCellValue()+" is a Number");
				}
				else if(cell.getCellType()==CellType.BOOLEAN)
				{
					System.out.println(cell.getBooleanCellValue()+" is a Boolean");
				}
			}
		}
		
		System.out.println("End of program");

	}

}
