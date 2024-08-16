package brailleWorks.gui.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "brailleWorks/gui/step_definitions",
        dryRun = false, // will only run to make sure all the step definitions are created if "true"
        tags = "@smoke", //will only execute whatever has the @regression tag can be used to execute any tag like @developer or @brailleWorks
        // tags = "@brailleWorks or @admin" will run all tags that are either of these --> or is keyword here
        // tags = "@smoke and @developer" will ONLY run tags that have both --> and is keyword here
        // tags = "@smoke and not @developer" will run all @smoke unless there is @developer with it
        publish = true // will create a report link if true
)

public class CukesRunner {
}
