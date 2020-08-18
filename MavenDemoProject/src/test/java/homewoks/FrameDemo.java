package homewoks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get("https://www.makemytrip.com/flights/");
				//driver.findElement(By.id("fromCity")).click();
			    //driver.findElement(By.xpath("//input[@id='fromCity']")).click();
				//Thread.sleep(2000);
				// select from city
				WebElement selectMyElement = driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
				selectMyElement.sendKeys("Pune");
				Actions action = new Actions(driver);
				Thread.sleep(3000);
				action.sendKeys(Keys.ARROW_DOWN).perform();
				action.sendKeys(Keys.ENTER).perform();
				//select to city
				WebElement toCity = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
				toCity.sendKeys("benga");
				Actions action1 = new Actions(driver);
				Thread.sleep(3000);
				action1.sendKeys(Keys.ARROW_DOWN).perform();
				action1.sendKeys(Keys.ENTER).perform();
				Thread.sleep(3000);
				//eliminating the unwanted pop up
				//Actions action1= new Actions(driver);
				action.sendKeys(Keys.ESCAPE).build().perform();
				//clicking on departure date selector
				//driver.findElement(By.id("departure")).click();
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span")).click();
				//selecting the date
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[5]/div/p[1]")).click();
				// //*[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[5]/div/p[1]
				//clicking on return date selector
				//Thread.sleep(3000);
				action.sendKeys(Keys.ESCAPE).build().perform();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[4]/div/label/p")).click();
				//driver.findElement(By.id("return")).click();
				//*[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[4]/label/span
				//driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[4]/label/span")).click();
				//selecting the date
				driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[2]/div/p")).click();
                //clicking on search button
				driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/p/a")).click();
				//selecting the radio button of the first flight
				//driver.findElement(By.xpath("//*[@id=\"ow-domrt-jrny\"]/div/div[2]/label/div[1]/span[1]/span")).click();
				//to take the screenshot
				Thread.sleep(3000);
				 TakesScreenshot ts =(TakesScreenshot)driver;
			       File source = ts.getScreenshotAs(OutputType.FILE);
			       FileUtils.copyFile(source,new File(("src/test/resources/screenshot/makemytrip2.png")));

	}

}
