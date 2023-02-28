package webDriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class TC002_Dropdown {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Data\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Opened Application");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().frame("rightMenu");
	
		Select dropdown = new Select (driver.findElement(By.name("loc_code")));
		 List <WebElement> List = dropdown.getOptions();
		 int size= List.size();
		 System.out.println(size);
		 
		 
	
for(int i= 0; i<size;i++) {
	String value = List.get(i).getText();
	System.out.println(value);
}
	
}		
		
		
		
		
	}


