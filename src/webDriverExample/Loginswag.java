package webDriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginswag {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\Users\\manohar icon\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe ");
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.saucedemo.com/");
Thread.sleep(3000);
driver.findElement(By.name("user-name")).sendKeys("standard_user");
driver.findElement(By.name("password")).sendKeys("secret_sauce");
driver.findElement(By.name("login-button")).click();
System.out.println("Application Opened");
Thread.sleep(3000);
if(driver.getTitle().equals("Swag Labs")) {
	System.out.println("Title Matched");
}
else {
	System.out.println("Title Not Matched");
	System.out.println(driver.getTitle());
}
driver.findElement(By.id("react-burger-menu-btn")).click();
Thread.sleep(3000);
driver.findElement(By.id("logout_sidebar_link")).click();
System.out.println("LogOut Completed");
Thread.sleep(3000);
driver.close();




	}

}
