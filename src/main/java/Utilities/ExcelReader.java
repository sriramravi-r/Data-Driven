package Utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    public static String dataReader(int row_no,int cell_no){
        String path="C:\\Users\\LENOVO\\Downloads\\Automation notes\\contact_list_app\\src\\main\\java\\Data\\data.xlsx";
        FileInputStream fileInputStream;
        try {
            fileInputStream=new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        String value=sheet.getRow(row_no).getCell(cell_no).getStringCellValue();
        return value;
    }
}
