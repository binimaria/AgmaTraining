package homewoks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbusKeyboardHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriverManager.chromedriver().setup();
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.redbus.in/");
 driver.findElement(By.id("src")).sendKeys("chen");
 Thread.sleep(3000);
 //Select source= new Select(driver.findElement(By.id("src")));
 //source.selectByValue("Tambaram, Chen");
// while(source=="Tambaram")
 /*
  * //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//wait for 30 seconds.
		driver.get("https://www.redbus.in");
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("che");
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.DOWN).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).perform();
	}
	

  */
 /*
  * driver.findElement(By.xpath("//*[@id=\'src\']")).sendKeys("che");
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.DOWN).perform();
		
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[1]/td[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[2]")).click();
		
		TakesScreenshot ts =(TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source,new File(("src/test/resources/ScreenShot/redbusin.png")));

  */
Actions action=new Actions(driver);
Thread.sleep(3000);
action.sendKeys(Keys.DOWN).perform();
action.sendKeys(Keys.DOWN).perform();
action.sendKeys(Keys.DOWN).perform();
//action.sendKeys(Keys.DOWN).perform();

action.sendKeys(Keys.ENTER).perform();
Thread.sleep(3000);
action.sendKeys(Keys.TAB).perform();
	}

}
