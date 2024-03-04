package selenium_first;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class InputFromExternalFile {

public static void main(String[] args) throws BiffException, IOException {
File file = new File("\\C:\\Users\\UMANAT\\Documents\\Eclipse Workspace\\Files\\Book2.xls");    
FileInputStream fis = new FileInputStream(file);
Workbook wb = Workbook.getWorkbook(fis);
Sheet sheet = wb.getSheet(0);
// String value = sheet.getCell(0,2).getContents();
// System.out.println(value);
int rowcount = sheet.getRows();
int colcount = sheet.getColumns();
for (int c = 0 ; c<colcount; c++)
{
  for(int i=0;i<rowcount;i++)
           System.out.println(sheet.getCell(c,i).getContents());
 
}
       }

}