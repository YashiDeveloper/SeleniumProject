package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WT {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Yasmeen/Downloads/WebTable.html");
		
		int row = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
		int row_col = driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
		System.out.println(row);
		System.out.println(col);
		System.out.println(row_col);
		
		
		String celldata = driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[7]/td[4]")).getText();
		System.out.println(celldata);
		
		for (int i =1; i<row; i++) {
			for (int j=1; j<col ;j++) {
				String tabdata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
				System.out.println(tabdata);
			}
		}
		
		
		driver.close();
	}

}
