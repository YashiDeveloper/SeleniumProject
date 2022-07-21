package com.hrms.testscripts;


import org.testng.annotations.Test;

import com.hrms.lib.General;
import org.apache.log4j.xml.DOMConfigurator;
public class TC001 {
	//public static void main(String args[])throws Exception {
	@Test
	public void tc001() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General tq = new General();
		
		tq.openApplication();
		tq.switchFrame();
		tq.addEmployee();
		tq.switchDefault();
		tq.logoutApplication();
		tq.closeApplication();
	}

}
