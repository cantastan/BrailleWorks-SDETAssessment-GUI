package brailleWorks.gui.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt", // will let the runner know where to read rerun.txt files from
        glue = "brailleWorks/gui/step_definitions" //after reading rerun if any failed tests will compare and execute from step_definitions class
)

public class FailedTestRunner {
}