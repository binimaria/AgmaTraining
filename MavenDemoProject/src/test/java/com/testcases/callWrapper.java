package com.testcases;

import java.io.IOException;

public class callWrapper {
	public static void main(String[] args) throws IOException  {
		  wrapperMethod wm = new wrapperMethod();
		  wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		  wm.enterbyid("txtUsername", "Admin");
		  wm.enterbyid("txtPassword", "admin123");
		  wm.clickbyxpath("//*[@id=\"btnLogin\"]");
		  wm.takesnap("src/test/resources/screenshot/screenshotfile2.png");
		  wm.closeapp();
			}

}
