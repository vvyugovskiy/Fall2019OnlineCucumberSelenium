package com.vytrack.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(           /* need to know where step_definitions and features folders */
        glue = "com/vytrack/step_definitions",      /*  path from source root  */
        features = "src/test/resources/",    /*  path from content root */
        dryRun = false,
        strict = false,  //==> when false, unimplemented steps will not be shown as exception/ error.Will only be mentioned in the console
        //==>  when true, unimplemented steps will be thrown as if there is an exception

        tags = "@scenario_outline_2\n",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json"
        }
)
public class SmokeTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
