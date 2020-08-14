package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@class='button']")).click();
		WebElement admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));;
		WebElement qualification=driver.findElement(By.id("menu_admin_Qualifications"));
		WebElement language=driver.findElement(By.id("menu_admin_viewLanguages"));
		Actions actions=new Actions(driver);
		actions.moveToElement(admin).perform();
		Thread.sleep(3000);
		actions.moveToElement(qualification).perform();
		actions.moveToElement(language).click().build().perform();
	}

}
