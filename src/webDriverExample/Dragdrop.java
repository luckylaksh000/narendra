package webDriverExample;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Data\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		assertEquals(driver.getTitle(),"Droppable | jQuery UI");
		System.out.println("Title Matched");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Actions obj = new Actions(driver);
		obj.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		System.out.println("drag n drop");
		Thread.sleep(3000);
		driver.close();
	}

}
