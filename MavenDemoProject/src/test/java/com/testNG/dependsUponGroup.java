package com.testNG;

import org.testng.annotations.Test;

public class dependsUponGroup {
	public class PriorityTestCase {
	     @Test(groups={"smoke","Regression Testing"})
	     public void testcase1() {
	    	 System.out.println("test case 1");
	     }
	     @Test(groups= {"smoke","Sanity"})
	     public void testcase2() {
	    	 System.out.println("test case 2");
	     }
	     @Test(groups= {"Functional testing","Retesting"})
	     public void testcase3() {
	    	 System.out.println("test case 3");
	     }

	}
}
