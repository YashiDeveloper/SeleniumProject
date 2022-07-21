package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class TC_GmailLogin {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("fathima.yashi");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Zaiya@123");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		Thread.sleep(3000);
		
		
		
	}
}
