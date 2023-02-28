package webDriverExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Google {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Data\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.google.com/");
Thread.sleep(3000);
int count = driver.findElements(By.tagName("a")).size();
System.out.println(count);
List<WebElement>links= driver.findElements(By.tagName("a"));
for(WebElement li: links) {
	System.out.println(li.getText());
}
driver.close();
	}

}
