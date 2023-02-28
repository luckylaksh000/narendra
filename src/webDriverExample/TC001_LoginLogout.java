package webDriverExample;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class TC001_LoginLogout {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\manohar icon\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver  driver  = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/index.php");
		System.out.println("Application Opened");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		Thread.sleep(3000);
		driver.close();
		System.out.println("Application Close");
		
	
		

	}

}
