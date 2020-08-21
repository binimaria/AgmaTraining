package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication {
	@Test
	public void ActionOn()
	{	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	//driver.get("http://the-internet.herokuapp.com/basic_auth");

	//driver.get("https://jqueryui.com/droppable/");
	//driver.findElement(By.xpath("//*[@id=\'draggable\']/p")).isDisplayed();
	//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

}
}
