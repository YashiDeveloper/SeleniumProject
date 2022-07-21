package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TC_keyboardactions{
	public static void main(String args[])throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	System.out.println("KeyBoard TAB");
	Thread.sleep(3000);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	System.out.println("Press Enter");
	Thread.sleep(3000);
	
	System.out.println("Login successfull");
	
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println("LOgout");
	
	Thread.sleep(3000);
	driver.close();
	
	
	
	
	}
}
