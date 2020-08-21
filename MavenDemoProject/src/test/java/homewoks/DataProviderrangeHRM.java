package homewoks;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderrangeHRM {
	WebDriver driver;
	@Test(dataProvider="OranageHRMlogin")
	public void loginToOrangeHRM(String username,String password) throws Exception {
		WebDriverManager.chromedriver().setup();

		//System.setProperty("webdriver.chrome.driver", "E:\\Sathish Files\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();       
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	driver.findElement(By.id("txtPassword")).sendKeys(password);
	driver.findElement(By.name("Submit")).click();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@DataProvider(name="OranageHRMlogin")
	public Object[][] passData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="username1";
		data[0][1]="passwd1";
		
		data[1][0]="username2";
		data[1][1]="passwd2";
		
		data[2][0]="username3";
		data[1][1]="passwd3";
		
		return data;
				
	}

}
