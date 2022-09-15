package StepDefs;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(plugin = {"pretty" }, tags = "",
        features = "/Users/autodoc/IdeaProjects/AutoDoc Cucumber/src/test/java/resources/features/QC_5775.feature",
        glue = {"StepDefs" })
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

    @Before
    public void init() {
        Configuration.browser = (Browsers.CHROME);
//        Configuration.browserVersion = ();
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "1x1";
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 5000;
        Configuration.pageLoadTimeout = 300000;
    }
}
