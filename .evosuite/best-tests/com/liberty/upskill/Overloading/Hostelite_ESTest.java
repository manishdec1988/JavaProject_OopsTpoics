/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 06 18:57:11 GMT 2018
 */

package com.liberty.upskill.Overloading;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liberty.upskill.Overloading.Hostelite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Hostelite_ESTest extends Hostelite_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Hostelite hostelite0 = new Hostelite();
      hostelite0.calculateFees((-1.0), (-29.652963802293));
      assertNull(hostelite0.getStudentName());
  }
}
