package jul24th;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\003 Live Tech\\softwares\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		
		//case 1 : modifying an existing cell
		
		//ws.getRow(0).getCell(1).setCellValue("Sai");
		
		//case 2: creating a new cell in existing row
		
		//ws.getRow(1).createCell(3).setCellValue("Passed");
		
		//case 3: creating a new row and cell in it
		
		ws.createRow(3).createCell(0).setCellValue(false);
		
		
		FileOutputStream fos=new FileOutputStream("D:\\003 Live Tech\\softwares\\Book1.xlsx");
		
		wb.write(fos);
		
		wb.close();

	}

}
