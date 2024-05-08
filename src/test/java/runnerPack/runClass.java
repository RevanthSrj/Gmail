package runnerPack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import BasePack.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\mail\\feature\\gmail.feature",glue = "stepPack",dryRun = false,publish = true)
public class runClass extends BaseClass {

	@BeforeClass
	public static void start() {
		Bowserlaunch();
		toMaximize();
	}
	@AfterClass
	public static void end() {
//		driver.quit();
	}
	
}
