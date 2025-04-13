package test.java.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D:/Testing_web_2/src/test/resources/features",
        glue = "test.java.stepdefinitions",
        plugin = {"pretty"}
)
public class TestRunner {
    // Không cần nội dung
}