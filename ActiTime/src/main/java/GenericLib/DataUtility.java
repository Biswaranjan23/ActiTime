package GenericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
		
		
		public String getDataFromProperties(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\BISWARANJAN\\Downloads\\Drivers\\DataActi.Properties");	
		Properties p=new Properties();
	    p.load(fis);
		String s=p.getProperty(key);
		return s;	
		}



		public String getDataFromExcelSheet(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
		{
		   FileInputStream fis=new FileInputStream("C:\\Users\\BISWARANJAN\\Downloads\\Drivers\\Book1.xlsx");
		   Workbook book=WorkbookFactory.create(fis);
		   Sheet sh=book.getSheet(sheetname);
		   DataFormatter format=new DataFormatter();
		   String t= format.formatCellValue(sh.getRow(row).getCell(cell));
		   return t;
		}





		}
	


