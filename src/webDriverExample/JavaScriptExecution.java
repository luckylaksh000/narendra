package webDriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;


public class JavaScriptExecution {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Data\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//test case steps
		driver.manage().window().maximize();
		driver.get("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		//using Java script Executor to click on login button
		WebElement loginbtn =driver.findElement(By.name("Submit"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",loginbtn);
		Thread.sleep(3000);
		System.out.println("Login Completed");
		WebElement Logout = driver.findElement(By.linkText("Logout"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",Logout);
		driver.close();
		
		
		
		
		
		
	}

}
