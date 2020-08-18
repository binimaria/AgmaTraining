package com.testNG;

import org.testng.annotations.Test;

public class PriorityTestCase {
     @Test(priority=3)
     public void testcase1() {
    	 System.out.println("test case 1");
     }
     @Test(priority=1)
     public void testcase2() {
    	 System.out.println("test case 2");
     }
     @Test(priority=2)
     public void testcase3() {
    	 System.out.println("test case 3");
     }
}
