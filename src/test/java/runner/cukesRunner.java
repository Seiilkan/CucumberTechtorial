package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com.cucumber.features/WebOrderLogin.feature"}, // --> when you use the list, you need to provide with curly braces
  //you can give the path of each file under resources or give the path until "src/test/resources/" it will run all files under the resources
        glue = "StepDefinitions",
        dryRun = false, //it will not execute
        monochrome = true// it will make yr console more readable, if you are getting more default selenium message
     //   tags = "@negative" //it will test specific kind or samely named test
)

public class cukesRunner {




}
