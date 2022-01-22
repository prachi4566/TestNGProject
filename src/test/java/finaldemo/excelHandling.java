package finaldemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import page_object_model.LoginPage1;

public class excelHandling {
	public static void main(String[] args) throws IOException
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\Prachi Jadhav\\OneDrive\\Documents\\Apache_POI\\Test.xlsx");
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet1 = wb.getSheetAt(0);
		Row row = sheet1.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(sheet1.getRow(0).getCell(0));
		Cell cell1 = row.getCell(1);
		System.out.println(sheet1.getRow(0).getCell(1));

		
		String username=sheet1.getRow(0).getCell(0).toString();
		String password=sheet1.getRow(0).getCell(1).toString();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prachi Jadhav\\OneDrive\\Documents\\Selenium_CLS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pw")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		
		
		
	
	}

}
//link :https://www.browserstack.com/guide/read-data-from-excel-using-selenium
//apche poi download :https://www.apache.org/dyn/closer.lua/poi/release/bin/poi-bin-5.2.0-20220106.zip