package webDriverExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Login_Logout {
public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\manohar icon\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver  =new ChromeDriver();
	Thread. sleep(3000);
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Thread.sleep(3000);
	System.out.println("Application Opened");
	Thread.sleep(3000);
	System.out.println("Application closed");
	driver.close();

	
	

	}

}
