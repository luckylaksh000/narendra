package webDriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouseover2 {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Selenium Data\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/index.php");
Thread.sleep(3000);
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login Completed");
Thread.sleep(3000);
Actions ac = new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
driver.findElement(By.linkText("Add Employee")).click();
System.out.println("Employee Added");
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
System.out.println("LogOut Completed");
Thread.sleep(3000);
driver.close();
	
	}

}
