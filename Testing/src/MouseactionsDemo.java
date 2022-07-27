import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.implementation.bytecode.ShiftLeft;

public class MouseactionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.setProperty("WebDriver.Chrome.driver", "E:\\\\chromedriver_win32");
	WebDriver driver = new ChromeDriver();
	driver.get("http://amazon.in");
	driver.manage().window().maximize();
	
	//Action class
	Actions a = new Actions(driver);
	
	//moves cursor to search & will type nike shoes in caps
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Nike shoes").doubleClick().perform();
	
	//moves to specific element & rightclick
	a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).contextClick().perform();
	
	
	
	
	}

}
