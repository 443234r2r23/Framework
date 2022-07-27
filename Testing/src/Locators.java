import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.Chrome.driver", "E:\\chromedriver_win32");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://facebook.com");
	//driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("sahitya.satya@gmail.com");
	//driver.findElement(By.className("inputtext ")).sendKeys("4567");
	//driver.close();
	//driver.findElement(By.name("pass")).sendKeys("123");
	//driver.findElement(By.name("login")).click();
	//driver.findElement(By.linkText("Forgotten password?")).click();
	driver.findElement(By.linkText("Create New Account")).click();
	//driver.findElement(By.xpath("//*[@id='u_0_d_4V']")).click();
	//driver.findElement(By.cssSelector("#u_0_2_T2")).click();
	driver.navigate().to("http://amazon.in");
	Thread.sleep(4000);
	driver.navigate().back();
	driver.quit();
	
	}

}
