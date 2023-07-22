package jul22nd;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\003 Live Tech\\softwares\\xyz.xlsx");
		
		  System.out.println(f.createNewFile());
		  
		  System.out.println("End of Program");

	}

}
