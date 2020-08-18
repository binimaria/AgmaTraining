package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		//driver.findElement(By.partialLinkText("Forgot your password?")).click();
		//driver.findElement(By.id("email")).sendKeys("abc.com");
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
driver.findElement(By.xpath("//input[@class='button']")).click();
driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b")).click();
driver.findElement(By.xpath("//*[@id=\'menu_admin_UserManagement\']")).click();
Select userRole= new Select(driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userType\"]")));
userRole.selectByVisibleText("ESS");
Select status= new Select(driver.findElement(By.xpath("//*[@id=\"searchSystemUser_status\"]")));
status.selectByIndex(1);
//status.selectByValue("Enabled');
//driver.close();
//to remove the interruption
/*Thread.sleep(3000);
Actions action= new Actions(driver);
action.sendKeys(Keys.ESCAPE).build().perform(); */



	}

}
