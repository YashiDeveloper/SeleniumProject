package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;

public class TC_Waits {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		//wait until login button is available  -- explicit wait -- wait till condition is met
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.
						elementToBeClickable(driver.findElement(By.name("Submit"))));
		driver.findElement(By.name("Submit")).click();
		
		//wait until emp info page is available -- implicit wait -- wait till page loads
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		System.out.println("Login completed");
		
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(3000);
		System.out.println("Logout completed");
		driver.close();
		
		
	}

}
