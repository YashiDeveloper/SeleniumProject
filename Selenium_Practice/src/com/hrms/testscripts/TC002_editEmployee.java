package com.hrms.testscripts;


import org.testng.annotations.Test;

import com.hrms.lib.General;
import org.apache.log4j.xml.DOMConfigurator;
public class TC002_editEmployee {
//public static void main(String args[]) throws Exception{
	@Test
	public void tc002() throws Exception {
		DOMConfigurator.configure("log4j.xml");
	General obj = new General();
	obj.openApplication();
	Thread.sleep(3000);
	obj.switchFrame();
	Thread.sleep(3000);
	obj.selectEmployee();
	Thread.sleep(3000);
	obj.EditEmployee();
	Thread.sleep(3000);
	obj.switchDefault();
	Thread.sleep(3000);
	obj.logoutApplication();
	Thread.sleep(3000);
	obj.closeApplication();
}
}
