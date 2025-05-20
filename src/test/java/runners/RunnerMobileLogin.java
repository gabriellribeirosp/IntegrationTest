package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/mobileLogin.feature",
    glue = "br.com.outseara.steps",
    plugin = {"pretty", "html:target/mobile-cucumber-report.html"},
    tags = "@mobile",
    monochrome = true
)
public class RunnerMobileLogin {
}