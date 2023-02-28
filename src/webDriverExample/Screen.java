package webDriverExample;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screen {
	private static final String File = null;

	public static void main(String args [])throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Data\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application Opened");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.linkText("PIM"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee123")).click();
		Thread.sleep(3000);
		System.out.println("Clicked on Sub Menu");
		driver.findElement(By.linkText("Logout")).click();
		
	}
	catch (Exception e) {

File f1 =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f1, new File("C:\\Users\\manohar icon\\Downloads\\New folder\\image.png"));
	}

}
}