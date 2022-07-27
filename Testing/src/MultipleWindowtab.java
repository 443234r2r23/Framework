import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver", "E:\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
		System.out.println(driver.getTitle());
		
		
		
	}

}
