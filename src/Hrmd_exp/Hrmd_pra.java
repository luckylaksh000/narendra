package Hrmd_exp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Hrmd_pra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Data\\chromedriver_mac64\\chromedriver.exe");
		WebDriver  driver  = new ChromeDriver();
		driver.navigate().to("https://google.com/");

	}

}
