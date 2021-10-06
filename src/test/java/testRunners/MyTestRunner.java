package testRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C://Users//anil.kumar//IntellijWorkspace//CucumberPOMHybridNaveen//src//test//java//resourcesfeatures",
        glue ={"stepdefinations", "AppHooks"},
       // tags = "@Smoke or @Regression",
        plugin = {"pretty",
           //  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
              //  "timeline:test-output-thread/",

//                "json:target/MyReports/report.json",
//                "junit:target/MyReports/report.xml",
              "html:target/MyReports/cucumber-html-report",
//                "pretty:target/MyReports/cucumber-pretty.txt"
        }
             )


public class MyTestRunner {
}
