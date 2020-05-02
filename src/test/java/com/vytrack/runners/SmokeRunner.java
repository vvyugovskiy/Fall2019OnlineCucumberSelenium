package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/",    /*  path from content root */
        dryRun = false,
        strict = false,
        tags = "@smoke_test",
        plugin = {
                "html:target/default-report-for-smoke",
                "json:target/cucumber_smoke.json",
                "rerun:target/rerun.txt"
        }
)
public class SmokeRunner {
}
