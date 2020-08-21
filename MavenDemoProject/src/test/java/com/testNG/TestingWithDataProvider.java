package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingWithDataProvider {
	WebDriver driver;
	@Test(dataProvider="facebooklogin")
	public void loginTofacebook(String username,String password) throws Exception {
		WebDriverManager.chromedriver().setup();

		//System.setProperty("webdriver.chrome.driver", "E:\\Sathish Files\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();       
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	//Assert.assertEquals("https://www.facebook.com/",driver.getCurrentUrl());
	//System.out.println(driver.getCurrentUrl());
	//System.out.println("User is able to login sucessfully");
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

	@DataProvider(name="facebooklogin")
	public Object[][] passData() {

	Object[][] data=new Object[3][2];
	 		//username
			data[0][0]="frank";
			//password
			data[0][1]="demo1";

			data[1][0]="joshi";
			data[1][1]="demo123";

			data[2][0]="sathya";
			data[2][1]="demo1234";

			return data;
		}

}
