package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abcmail.com");
        Actions action=new Actions(driver);
        Thread.sleep(3000);
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys("password").perform();
        action.sendKeys(Keys.ENTER).perform();
	}

}
