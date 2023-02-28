package webDriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\manohar icon\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println("Application Opened");
Thread.sleep(3000);
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("login Completed");
if(driver.getTitle().equals("OrangeHRM")) {
	System.out.println("title Matched");
}
else {
	System.out.println("title not matched");
	System.out.println(driver.getTitle());
}
driver.findElement(By.linkText("Logout")).click();
System.out.println("logout Completed");
Thread.sleep(3000);
driver.close();


	
	}
}
