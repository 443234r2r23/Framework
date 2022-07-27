import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Dropdown {

		@SuppressWarnings("deprecation")
		public static void main(String[] args){
		// TODO Auto-generated method stub

	System.setProperty("webdriver.Chrome.driver", "E:\\chromedriver_win32");
	  
	WebDriver driver = new ChromeDriver();
	driver.get("makeymytrip.cpm");
/*implicit wait*/
	driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	//driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).click();
	//Select s = new Select(driver.findElement(By.xpath("//*[@id=\'main-container\']")));
	
	//Div d = new Div(driver.findElement(By.xpath("//*[@id=\\'main-container\\']"));
	//s.selectByValue("2 Adult");

	//driver.findElement(By.xpath("//*[@id=\'main-container\']")).click();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id=\'main-container\'][2]")).click();
//driver.findElement(By.className("css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu")).click();

	//driver.findElement(By.id("departure")).click();
	//driver.findElement(By.className("roundTrip")).click();
	
	//JavascriptExecutor JS = (JavascriptExecutor) driver;
	
	//JS.executeScript("window.scrollby(0,400)");
	
	/* explicit wait/
	WebDriverWait w = new WebDriverWait(driver,5);
	
	
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Search')] ']")));
	
	*/
	/*fluentwait
	 
	 Wait<WebDriver> wt = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30).pollingEvery(Duration.ofSeconds(3));*/
	  
	 
	//WebElement searchIcon =driver.findElement(By.xpath("//a[contains(text(),'Search')] ']"));
	
	//driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
	
	//searchIcon.click();
	
	//driver.close();	}
	}}


