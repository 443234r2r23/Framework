import java.util.NoSuchElementException;

import javax.lang.model.element.UnknownElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver", "E:\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");

		Thread.sleep(3000);

		/*
		 * try{
		 * 
		 * driver.findElement(By.id("fakewebelement")).click();
		 * 
		 * }catch (NoSuchElementException e){
		 * 
		 * System.out.println("element given was fake"); System.out.println("hi");
		 * //throw(e); } System.out.println("hello"); //driver.quit();
		 */

		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {

			e.printStackTrace();
		}
		driver.close();
	}

}
