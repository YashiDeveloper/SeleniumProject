package WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_FileUpload {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("test");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("program");
		Thread.sleep(3000);
		WebElement fileUpload = driver.findElement(By.name("photofile"));
		fileUpload.sendKeys("C:\\Users\\Yasmeen\\Pictures\\FA_No_Upload_A_Picture_tab.png");
		
		driver.findElement(By.id("btnEdit")).click();
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
