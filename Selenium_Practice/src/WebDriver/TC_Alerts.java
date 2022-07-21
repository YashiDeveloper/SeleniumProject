package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;

public class TC_Alerts {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		//driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());		
		a.accept();
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		
		System.out.println("Login Completed");
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout COmpleted");
		Thread.sleep(3000);
		driver.close();
		
		
		
	}
}
