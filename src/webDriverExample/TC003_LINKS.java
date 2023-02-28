package webDriverExample;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class TC003_LINKS {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Data\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver narendra = new ChromeDriver();
		narendra.navigate().to("https://www.google.com/");
		System.out.println("OpenApplication");
		List<WebElement> links= narendra.findElements(By.tagName("a"));
		System.out.println("Total tags present "+ links.size());
		for(int i=0;i<=links.size();i++) {
		System.out.println("links on page are " +links.get(i).getText());
		} 
	}

}
