package webDriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_checkbox {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Data\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println("Application Opened");
Thread.sleep(3000);
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Application Opened");
Thread.sleep(3000);
driver.switchTo().frame("rightMenu");
Select st = new Select(driver.findElement(By.name("loc_code")));
st.selectByVisibleText("Emp. ID");
driver.findElement(By.name("loc_name")).sendKeys("0001");
driver.findElement(By.xpath("//input[@value='Search']")).click();
driver.findElement(By.name("chkLocID[]")).click();
driver.findElement(By.xpath("//input[@value='Delete']")).click();
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
driver.close();



	}

}
