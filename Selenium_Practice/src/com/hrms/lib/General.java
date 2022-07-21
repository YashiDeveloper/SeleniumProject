package com.hrms.lib;

import java.time.Duration;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

public class General extends Global {
	
	public void openApplication() throws Exception {
		
		FileInputStream file = new FileInputStream("D:\\Tst_book.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sh = wb.getSheet("Sheet3");
		XSSFCell un = sh.getRow(1).getCell(0);
		XSSFCell pw = sh.getRow(1).getCell(1);
		String usern = un.toString();
		String pwd = pw.toString();
		try {
		Log.info("**** Login ****");
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.findElement(By.name(txt_username)).sendKeys(usern);
		driver.findElement(By.name(txt_password)).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.name(btn_login)).click();
		}catch(Exception e) {
		System.out.println("Login success!!"+ e);
		Log.info("****Login Success!!****");}
	}
	
	public void closeApplication() {
		Log.info("****Close Application****");
		driver.close();
		System.out.println("Application Closed");
		Log.info("****Application Closed****");
		
	}
	
	public void logoutApplication() {
		Log.info("Logout Application");
		driver.findElement(By.linkText(btn_logout)).click();
		System.out.println("Logout Completed");
		Log.info("Logout Completed");
	}
	
	public void switchFrame() {
		Log.info("Switch Frame");
		driver.switchTo().frame(frame_rightmenu);
		System.out.println("Switch Frame");
		Log.info("Frame Switch Success");
	}
	
	public void switchDefault() {
		Log.info("Switch to Default");
		driver.switchTo().defaultContent();
		System.out.println("Switch to default");
		Log.info("Switch to Default Success");
	}
	
	public void addEmployee() {
		Log.info("Add Employee");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		driver.findElement(By.name(txt_empfirstname)).sendKeys(empfirstname);
		driver.findElement(By.name(txt_emplastname)).sendKeys(emplastname);
		//code = driver.findElement(By.id("txtEmployeeId")).getText();
		WebElement wb = driver.findElement(By.id("txtEmployeeId"));
		code = wb.getAttribute("value");
		Log.info("Code Captured");
		System.out.println("Code "+ code);
		WebElement fileUpload = driver.findElement(By.name(fileuploadname));
		fileUpload.sendKeys(file_upload);
		driver.findElement(By.id(btn_edit)).click();
		Log.info("Employee Added");
    }

	public void selectEmployee() {
		Log.info("Select Employee");
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[1]/td[3]/a")).click();
		Log.info("Employee");
	}
	
	public void EditEmployee() {
		Log.info("Edit Employee");
		driver.findElement(By.name("EditMain")).click();
		driver.findElement(By.name(txt_empfirstname)).clear();
		driver.findElement(By.name(txt_empfirstname)).sendKeys(empfirstname);
		driver.findElement(By.name(txt_emplastname)).clear();
		driver.findElement(By.name(txt_emplastname)).sendKeys(emplastname);		
		driver.findElement(By.xpath("//*[@id=\"btnEditPers\"]")).click();
		Log.info("Employee Edited");
	}
	
	public void deleteEmp() {
		Log.info("Delete Employee");
		System.out.println("Code : "+code);
		Select st = new Select(driver.findElement(By.name("loc_code")));
		st.selectByIndex(1);
		driver.findElement(By.name("loc_name")).sendKeys(code);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.name("chkLocID[]")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Log.info("Employee Deleted");
	}
}
