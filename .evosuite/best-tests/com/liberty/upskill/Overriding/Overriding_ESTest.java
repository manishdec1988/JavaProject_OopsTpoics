/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 06 18:55:38 GMT 2018
 */

package com.liberty.upskill.Overriding;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liberty.upskill.Overriding.Overriding;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Overriding_ESTest extends Overriding_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Overriding overriding0 = new Overriding();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Overriding.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }
}
