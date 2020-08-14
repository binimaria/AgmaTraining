package homewoks;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHrLogin {
	public static void main(String []args) {
		
	

	WebDriverManager.iedriver().setup();
	WebDriver driver=new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//driver.get("https://google.com/");
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
			//driver.findElement(By.partialLinkText("Forgot your password?")).click();
			//driver.findElement(By.id("email")).sendKeys("abc.com");
			//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
			//driver.findElement(By.xpath("//input[@class='button']")).click();
	//driver.navigate().to("https://facebook.com/");
     driver.close();
	}
}


