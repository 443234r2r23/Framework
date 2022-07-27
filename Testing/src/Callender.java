import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Callender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.Chrome.driver", "E:\\chromedriver_win32");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://epos.telangana.gov.in");
	Thread.sleep(4000L);
	
	driver.findElement(By.linkText("Date wise ePoS Sales Summary")).click();
	Thread.sleep(4000L);
	
	Select s = new Select(driver.findElement(By.id("district")));
	s.selectByValue("936");
	Thread.sleep(4000l);
	
	driver.findElement(By.xpath("//tbody/tr[4]/td[2]/div[1]/input[1]")).click();
		
	 while(!driver.findElement(By.xpath("//div[@class=\'_720kb-datepicker-calendar-header-middle _720kb-datepicker-calendar-month ng-binding\']")).getText().contains("February"))
	 {
		 driver.findElement(By.xpath("//b[@class=\'_720kb-datepicker-default-button\']")).click();
	 }
	int count = driver.findElements(By.xpath("//a[@ng-click=\'setDatepickerDay(item)\']")).size();
		for(int i=0;i<count;i++)
	{
		String text = driver.findElements(By.xpath("//a[@ng-click=\'setDatepickerDay(item)\']")).get(i).getText();
	      if(text.equalsIgnoreCase("3"))
	      {
	    	  driver.findElements(By.xpath("//a[@ng-click=\'setDatepickerDay(item)\']")).get(i).click();
	          break; 
	      }
		}
	
	
	driver.findElement(By.xpath("//tbody/tr[4]/td[4]/div[1]/input[1]")).click();
	 int count2 = driver.findElements(By.cssSelector("a[ng-click=\'setDatepickerDay(item)\']")).size();
	for(int j=0;j<count2;j++)
	{
		String text2 = driver.findElements(By.cssSelector("a[ng-click=\'setDatepickerDay(item)\']")).get(j).getText();
		if(text2.equalsIgnoreCase("5"))
					{
			
			driver.findElements(By.cssSelector("a[ng-click=\'setDatepickerDay(item)\']")).get(j).click();
			break;
		}
	}
	
	driver.findElement(By.cssSelector("#btngetDetails")).click();
	}

	

	}

