package DataDrivenframe;

 
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingdatafromExcel 
{
	public static  void main(String args[]) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\padma\\eclipse-workspace\\sairamselenium\\actomation\\src\\test\\resources\\testdata\\datareading.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("data"); //providing sheet name
						
		//XSSFSheet sheet=workbook.getSheetAt(0); //providing index number of sheet
		
		int rowcount = sheet.getLastRowNum(); //returns the row count
		
		int coloumncount = sheet.getRow(0).getLastCellNum(); //return column / cell count
		
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow = sheet.getRow(i); //focus on current row
			
			for(int j=0;j<coloumncount;j++)
			{
				String value = currentrow.getCell(j).toString(); //read the values from a cell
				System.out.print("  "+value);
			}
			System.out.println();
		}
		
	}

}
