import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver","C:\\Users\\sahitya\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe"); 
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://gmail.com");
	System.out.println(driver.getTitle());
	
	}

}
