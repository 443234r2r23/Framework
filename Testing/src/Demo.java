 import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;
import java.util.concurrent.*;
public class Demo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver", "E:\\chromedriver_win32");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().newWindow(WindowType.TAB);//switches gmail tab to new empty tab
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it= handles.iterator();
		String parenttab  = it.next();
		String childtab = it.next();
		driver.switchTo().window(childtab);
		
		driver.get("http://yahoo.com");
		driver.switchTo().window(parenttab);
		
		
		
		
		//System.out.println(driver.getTitle());

		//driver.manage().deleteAllCookies();
		// driver.manage().deleteCookieNamed("some");

		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());

		// driver.navigate().to("http://yahoo.com"); //navigates gmail to yahoo.com
		// webpage
		// driver.navigate().back();//navigates yahoo back to gmail

		/*takes screenshot of the webpage & saves in E drive*/
		//File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(source, new File("E://screenshot.png"));

		WebElement submit = driver.findElement(By.xpath("//span[contains(text(),'Create account')]"));
		submit.click();
		File sr = submit.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr, new File("E://webelement.png"));
		
		// driver.navigate().forward();

		// driver.close();//closes current browser
		// driver.quit();//closes all browsers which opened

	//height & width of webelement
		System.out.println(submit.getRect().getDimension().getHeight());
		System.out.println(submit.getRect().getDimension().getWidth());
		
	}

}
