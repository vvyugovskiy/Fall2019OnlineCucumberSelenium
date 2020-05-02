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

        tags = ""
        ,plugin = {
                "html:target/default-report",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
        // will generate html cucumber report
        // JSon only has properties not methods
        // tags = "@sales_manager or @driver"  //==> when we put one tag only used to run scenarios with this tag only
                                                // or ==> scenarios that has one of it will run

) // parameterization for steps execution
public class CucumberRunner {


}
