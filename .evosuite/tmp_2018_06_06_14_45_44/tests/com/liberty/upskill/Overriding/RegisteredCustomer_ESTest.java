/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 06 18:56:57 GMT 2018
 */

package com.liberty.upskill.Overriding;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liberty.upskill.Overriding.RegisteredCustomer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegisteredCustomer_ESTest extends RegisteredCustomer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegisteredCustomer registeredCustomer0 = new RegisteredCustomer();
      registeredCustomer0.setDiscount((-797.790509));
      registeredCustomer0.setPurchaseAmount(100.0);
      registeredCustomer0.calculateBill();
      assertEquals(0, registeredCustomer0.getCustomerNo());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegisteredCustomer registeredCustomer0 = new RegisteredCustomer();
      registeredCustomer0.setDiscount(242.02975);
      double double0 = registeredCustomer0.getDiscount();
      assertEquals(242.02975, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegisteredCustomer registeredCustomer0 = new RegisteredCustomer();
      registeredCustomer0.discount = (-3628.86);
      double double0 = registeredCustomer0.getDiscount();
      assertEquals((-3628.86), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegisteredCustomer registeredCustomer0 = new RegisteredCustomer();
      double double0 = registeredCustomer0.getDiscount();
      assertEquals(0.0, double0, 0.01);
  }
}
