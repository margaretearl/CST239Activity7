package test;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.CalculatorTest;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class })
public class AllTests {

}