package webDriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class TC_Mouseover {
	public static void main(String args[])throws Exception {
		//test steps
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Data\\chromedriver_win32//chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	    driver.findElement(By.name("Submit")).click();
		Actions a =  new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Add Employee");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		driver.close();
		
		
		
		
		
		
	}

}
