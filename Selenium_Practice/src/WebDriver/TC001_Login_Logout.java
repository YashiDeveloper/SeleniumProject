package WebDriver;
import org.openqa.selenium.WebDriver; //To access web driver classes and methods
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By; //To access Object Identification methods(8 types)

public class TC001_Login_Logout {
	public static void main(String[] args) {
		//Test Steps
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	}

}
