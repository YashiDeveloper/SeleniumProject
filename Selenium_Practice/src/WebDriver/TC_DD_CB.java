package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TC_DD_CB {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		System.out.println("Login Completed");
		driver.switchTo().frame("rightMenu");
		Thread.sleep(3000);
		
		System.out.println("Login Completed");
		Select st = new Select(driver.findElement(By.name("loc_code")));
		//st.selectByVisibleText("Emp. ID");
		//st.selectByIndex(1);
		st.selectByValue("0");
		Thread.sleep(3000);
		
		System.out.println("select emp id");
		driver.findElement(By.name("loc_name")).sendKeys("0468");
		Thread.sleep(3000);
		
		System.out.println("enter emp id");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		
		System.out.println("click search");
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(3000);
		
		System.out.println("checkbox selected");
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(3000);
		
		System.out.println("Emp deleted");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		System.out.println("switch to default");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		System.out.println("Logout Completed");
		driver.close();
		
		
	}
}
