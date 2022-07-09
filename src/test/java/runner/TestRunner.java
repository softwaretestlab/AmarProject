package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(


        features= {"C:\\Users\\etikalaj\\eclipse-workspace\\AmarProject\\src\\test\\java\\FeatureFile"},
        glue= {"StepDefinations"},
        plugin={"pretty:STDOUT","html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "rerun:target/rerun.txt"},
        tags ="@amar"


)





public class TestRunner {


}