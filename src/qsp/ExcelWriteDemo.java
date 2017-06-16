package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWriteDemo {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
 FileInputStream fis=new FileInputStream("./data/Data.xlsx");
 Workbook wb=WorkbookFactory.create(fis);
 Cell c=wb.getSheet("Sheet1").getRow(0).getCell(0);
 c.setCellValue("Ram Ram");
 FileOutputStream fos=new FileOutputStream("./data/Data.xlsx");
 wb.write(fos);
	}

}
