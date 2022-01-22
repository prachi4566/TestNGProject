package Resourses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClas 
{
	public WebDriver driver;
	public WebDriver initialisation() throws IOException
	{
		
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Prachi Jadhav\\OneDrive\\Desktop\\Java\\Maven_Demo\\src\\main\\java\\Resourses\\data.properties");
		prop.load(fis);						//key declares in properties file
		String browsername=prop.getProperty("Browser");//browsername gives chromer
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prachi Jadhav\\OneDrive\\Documents\\Selenium_CLS\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			//firefox code
		}
		else if(browsername.equals("IE"))
		{
			//IE code
		}
		return driver;
	}
}
//Interview qu: Explain browser
