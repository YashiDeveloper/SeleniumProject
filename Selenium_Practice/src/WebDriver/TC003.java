package WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
public class TC003 {
	static String username = "nareshit";
	static String password = "nareshit";
	public static void main(String args[])throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		//verify title
		if(driver.getTitle().equals("HRMS")) {
			System.out.println("Title Match");
	}else {
		System.out.println("Title not match");
		System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Successfull");
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title Not Matched");
			System.out.println(driver.getTitle());
		}
		//Mouse over functionality.................
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("Mouse Over Done");
		
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Click on submenu");
		Thread.sleep(8000);
				
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Successfull");
		
		Thread.sleep(3000);
		driver.close();
	}

}
