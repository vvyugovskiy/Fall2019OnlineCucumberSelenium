package com.vytrack.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = "com/vytrack/step_definitions",      /*  path from source root  */
        features = "src/test/resources/features/activities",    /*  path from content root */
        dryRun = false,
        strict = false,  //==> when false, unimplemented steps will not be shown as exception/ error.Will only be mentioned in the console
        //==>  when true, unimplemented steps will be thrown as if there is an exception

        tags = "@view_calendar_events",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber2.json"
        }
)
public class ActivitiesTestRunner extends AbstractTestNGCucumberTests {


}
