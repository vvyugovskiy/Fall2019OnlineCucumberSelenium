package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class) // allows custom Test annotations
@CucumberOptions(           /* need to know where step_definitions and features folders */
        glue = "com/vytrack/step_definitions",      /*  path from source root  */
        features = "src/test/resources/",    /*  path from content root */
        dryRun = false,
        strict = false,  //==> when false, unimplemented steps will not be shown as exception/ error.Will only be mentioned in the console
        //==>  when true, unimplemented steps will be thrown as if there is an exception

        tags = "@smoke_test",
        plugin = {
                "html:target/smoke_test_default-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        }
)
public class SmokeTestRunner {
}
