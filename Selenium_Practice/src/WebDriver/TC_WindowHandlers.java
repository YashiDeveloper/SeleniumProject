package WebDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WindowHandlers {
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Yasmeen/Downloads/multiplewindows.html");
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		//to retrieve one window information
				//String Winhandle = driver.getWindowHandle();
				//System.out.println(Winhandle);
		
		//to retrieve all the windows information
		//Thread.sleep(3000);
		ArrayList<String> windinfo = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(4000);
		driver.switchTo().window(windinfo.get(0));
		Thread.sleep(4000);
		driver.switchTo().window(windinfo.get(1));
		Thread.sleep(4000);
		driver.switchTo().window(windinfo.get(2));
		Thread.sleep(4000);
		driver.switchTo().window(windinfo.get(3));
		Thread.sleep(4000);
		driver.close(); //close only current window
		Thread.sleep(4000);
		driver.quit();//closes all the indows
		
		
		
		
	}
}
