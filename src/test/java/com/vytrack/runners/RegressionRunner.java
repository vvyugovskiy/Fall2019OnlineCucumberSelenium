package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // allows custom Test annotations
@CucumberOptions(           /* need to know where step_definitions and features folders */
        glue = "com/vytrack/step_definitions",      /*  path from source root  */
        features = "src/test/resources/",    /*  path from content root */
        dryRun = false,
        strict = false,
        tags = "not @smoke_test",
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/default-report-for-regression",
                "json:target/cucumber_regression.json",
                "rerun:target/rerun.txt"
        }
        // will generate html cucumber report
        // JSon only has properties not methods
        // tags = "@sales_manager or @driver"  //==> when we put one tag only used to run scenarios with this tag only
        // or ==> scenarios that has one of it will run

)
public class RegressionRunner {
}
