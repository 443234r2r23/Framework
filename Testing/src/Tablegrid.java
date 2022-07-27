import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablegrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver", "E:\\\\chromedriver_win32");
		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/40966/indu19-vs-ausu19-super-league-semi-final-2-icc-under-19-world-cup-2022");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		// int rowcount = table.findElements(By.cssSelector("div[class='cb-col
		// cb-col-100 cb-scrd-itms']")).size();
		int columncount = table
				.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for (int i = 0; i < columncount - 2; i++) {
			System.out.println(
					table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
							.get(i).getText());
		}

		System.out.println(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		System.out.println(table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	
	
	}

}
