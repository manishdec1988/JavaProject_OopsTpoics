/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 06 18:56:10 GMT 2018
 */

package com.liberty.upskill.Overriding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liberty.upskill.Overriding.Customer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Customer_ESTest extends Customer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Customer customer0 = new Customer();
      customer0.setPurchaseAmount((-2463.9038083884));
      double double0 = customer0.getPurchaseAmount();
      assertEquals((-2463.9038083884), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Customer customer0 = new Customer();
      customer0.setCustomerNo((-612));
      int int0 = customer0.getCustomerNo();
      assertEquals((-612), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Customer customer0 = new Customer();
      customer0.setCustomerName("Calculation of Bill");
      String string0 = customer0.getCustomerName();
      assertEquals("Calculation of Bill", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Customer customer0 = new Customer();
      customer0.customerName = "";
      String string0 = customer0.getCustomerName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Customer customer0 = new Customer();
      // Undeclared exception!
      try { 
        customer0.setCustomerNo((Customer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liberty.upskill.Overriding.Customer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Customer customer0 = new Customer();
      String string0 = customer0.getCustomerName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Customer customer0 = new Customer();
      customer0.setPurchaseAmount(1953.0657296704328);
      double double0 = customer0.getPurchaseAmount();
      assertEquals(1953.0657296704328, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Customer customer0 = new Customer();
      customer0.setCustomerNo(1);
      int int0 = customer0.getCustomerNo();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Customer customer0 = new Customer();
      double double0 = customer0.getPurchaseAmount();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Customer customer0 = new Customer();
      int int0 = customer0.getCustomerNo();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Customer customer0 = new Customer();
      customer0.calculateBill();
      assertEquals(0, customer0.getCustomerNo());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Customer customer0 = new Customer();
      customer0.setCustomerNo(customer0);
      assertEquals(2300, customer0.getCustomerNo());
  }
}
