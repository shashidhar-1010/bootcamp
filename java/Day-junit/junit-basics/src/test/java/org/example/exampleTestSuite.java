package org.example;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ExampleTest.class, MathTest.class, SquareTest.class})
//@IncludeTags("unit test")
//@IncludeTags("IntregrationTest")
//@SelectPackages("org.example") here you can give the package names which u want to run
public class exampleTestSuite {
}
