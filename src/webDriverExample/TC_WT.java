package webDriverExample;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class TC_WT {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Data\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/manohar%20icon/Downloads/WebTable.html");
		int row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
		int row_col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
		System.out.println(row);
		System.out.println(col);
		System.out.println(row_col);
		
		//Data from cell
		String cell = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
		System.out.println(cell);
		//WholeTable
		for(int i=1; i<=row; i++) {
			String Data= driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
			System.out.println(Data);
		}
		
		driver.close();		
		
		
	}

}
