/*
 * This file was automatically generated by EvoSuite
 * Wed Jun 06 18:53:03 GMT 2018
 */

package com.liberty.upskill.VectorVsArrayList;

import org.junit.Test;
import static org.junit.Assert.*;
import com.liberty.upskill.VectorVsArrayList.TreeSetExample;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TreeSetExample_ESTest extends TreeSetExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeSetExample.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TreeSetExample treeSetExample0 = new TreeSetExample();
  }
}
