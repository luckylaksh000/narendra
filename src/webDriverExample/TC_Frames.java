package webDriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class TC_Frames  {

	public static void main(String[] args)throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\Users\\manohar icon\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver  driver  = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
System.out.println(driver.getTitle());
driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
driver.findElement(By.name("Submit")).click();
System.out.println("Login Completed");
Thread.sleep(4000);
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
Thread.sleep(3000);
driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
driver.findElement(By.name("txtEmpLastName")).sendKeys("narendra");
driver.findElement(By.id("btnEdit")).click();
Thread.sleep(3000);
System.out.println("New Employee Added");
driver.switchTo().defaultContent();
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout Completed");
driver.close();





	}

}
