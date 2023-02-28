package webDriverExample;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;


public class JSE {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Data\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//test steps
		driver.manage().window().maximize();
		driver.get("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		//using javascript executor to click on login button
		WebElement loginbutn  = driver.findElement(By.name("Submit"));
		JavascriptExecutor executor  = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",loginbutn);
	Thread.sleep(3000);	
	System.out.println("Login Completed");
	WebElement logout  = driver.findElement(By.linkText("Logout"));
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	
	executor1.executeScript("arguments[0].click();",logout);
	System.out.println("Logout Completed");
	driver.close();
	
		
		
	}
	

}
