package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testcases.wrapperMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipCart {
	wrapperMethod wm;
	@BeforeTest
	public void launchApp()
	{
	
		WebDriverManager.chromedriver().setup();
		wm=new wrapperMethod();
		wm.insertapp("https://www.flipkart.com/");
	}
    @Test
   public void search()
   {
    	wm.enterbyname("q", "mobile");
    	wm.enterbyxapth("//input[@name='q']","mobile");
    	wm.clickbyxpath("");
   }
    @Test(dependsOnMethods ="search" )
    public void SelectProduct()
    {
    	//wm.clickbyxpath(val1);
    }

}