package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {
	public WebDriver driver;
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@id='Login']");
	
	
	public LoginPage1(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement enterusername()
	{
		return driver.findElement(username);
	}
	public WebElement enterpassword()
	{
		return driver.findElement(password);
	}
	public WebElement submitbutton()
	{
		return driver.findElement(login);
	}
}

