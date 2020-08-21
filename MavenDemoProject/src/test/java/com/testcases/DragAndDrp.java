package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrp {
	@Test
	public void ActionClass()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		//driver.findElement(By.xpath("//*[@id=\'draggable\']/p")).isDisplayed();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	    WebElement drag= driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
	    WebElement drop= driver.findElement(By.id("droppable"));
	    Actions action=new Actions(driver);
	    action.dragAndDrop(drag, drop).build().perform();

	
	
	}

}
