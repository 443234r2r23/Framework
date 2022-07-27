import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.Chrome.driver", "E:\\chromedriver_win32");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://epos.telangana.gov.in");
	driver.manage().window().maximize();
   driver.findElement(By.cssSelector("input#username")).sendKeys("dso_42");
 			
			driver.findElement(By.cssSelector("input#password")).sendKeys("dso");	
	
	//driver.findElement(By.cssSelector("input#txtCaptcha")).sendKeys("123");
	driver.findElement(By.cssSelector("input#btnLogin")).click();
	
	//driver.findElement(By.name("reset")).click();
	driver.findElement(By.xpath("//a[contains(text(),'FP Shop Sale Transactions')]")).click();
	
	
	driver.findElement(By.cssSelector("table.tablemain:nth-child(7) td.tdmain:nth-child(1) tbody:nth-child(2) tr:nth-child(2) td:nth-child(1) div:nth-child(1) > a.a_line_height:nth-child(4)")).click();
	
	Alert alert = driver.switchTo().alert();
	
	String alertmessage = driver.switchTo().alert().getText();
	
		System.out.println(alertmessage);
	
	Thread.sleep(3000);
	alert.accept();
	
	/* for popup alert message*/
	
	Robot robot = new Robot();
	robot.mouseMove(400, 5);
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	
	
	
	
	}

}
