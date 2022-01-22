package finaldemo;

import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import Resourses.BaseClas;
import page_object_model.LoginPage1;

public class LoginTestCase extends BaseClas{
	@Test(dataProvider="getdata")
	public void launch(String username,String password) throws IOException
	{
		driver=initialisation();
		driver.get("https://login.salesforce.com/?locale=in");
		LoginPage1 page=new LoginPage1(driver);
		//page.enterusername().sendKeys("prachi");
		//page.enterpassword().sendKeys("password123");
		page.enterusername().sendKeys(username);
		page.enterpassword().sendKeys(password);
		page.submitbutton().click();
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="test";
		obj[0][1]="Password123";
		obj[1][0]="test1";
		obj[1][1]="Password456";
		return obj;
	}
}
//Page object model :it is design pattern
//Practice -verify signup-do not click on start for free trial
//Interview question :
//Dataprovider
//Maven framework -New Project-Template quick start
//Maven : It provides structure/architure to project->It provides pom.xml project which includes 
//