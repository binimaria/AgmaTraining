package com.testNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethods {
	
	     @Test
	     public void login() {
	    	 System.out.println("test case login");
	     }
	     @Test(dependsOnMethods="login")
	     public void search() {
	    	 System.out.println("test case search");
	    	 Assert.assertEquals("xyz", "abc");
	     }
	     @Test(dependsOnMethods="search",alwaysRun = true)
	     public void logout() {
	    	 System.out.println("test case logout");
	     }

}
