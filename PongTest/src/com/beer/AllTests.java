package com.beer;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ConsoleBoardDisplayerTest.class, BallModelTest.class,
		BoardModelTest.class })
public class AllTests {

}
