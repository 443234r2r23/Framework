import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.ie.driver", "C:\\Users\\sahitya\\Downloads\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
	WebDriver driver = new  InternetExplorerDriver();
	driver.get("http://google.com");
	System.out.println(driver.getTitle());
	}

}
