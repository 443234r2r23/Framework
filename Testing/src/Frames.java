import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.Chrome.driver", "E:\\chromedriver_win32");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://epds.telangana.gov.in");
	    //driver switches to frame 0
		driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
	    Actions a = new Actions(driver);
	    
	    WebElement source = driver.findElement(By.id("draggable"));
	    WebElement target = driver.findElement(By.id("droppable"));
	    a.dragAndDrop(source, target).build().perform();
	    
	    driver.switchTo().defaultContent();
	    
	    
	    
	    
	    
	    
	    		}

}
