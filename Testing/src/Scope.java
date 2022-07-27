 import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.Chrome.driver", "E:\\chromedriver_win32");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://amazon.in");
	    System.out.println(driver.findElements(By.tagName("a")).size());
	   
	    WebElement footersection = driver.findElement(By.cssSelector("#navFooter"));
	    System.out.println(footersection.findElements(By.tagName("a")).size());
	    
	    WebElement footersubpart = footersection.findElement(By.xpath("//body/div[@id='a-page']/div[@id='navFooter']/div[1]/div[1]/div[1]"));
	    System.out.println(footersubpart.findElements(By.tagName("a")).size());
	
	   //displays each tab(link) of the leftside of the footer
	    for(int i=0;i<footersubpart.findElements(By.tagName("a")).size();i++)
          {
            String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
            footersubpart.findElements(By.tagName("a")).get(i).sendKeys(tab);
            Thread.sleep(8000);
           }
	
	   //prints the title of each webpage
	    Set<String> abc = driver.getWindowHandles();
	    Iterator<String> it = abc.iterator();
	    while(it.hasNext())
	    {
	    	driver.switchTo().window(it.next());
	    	System.out.println(driver.getTitle());
	    }
	}

}
