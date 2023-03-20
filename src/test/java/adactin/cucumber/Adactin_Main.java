package adactin.cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\JAVA\\Testing\\Workspace\\Sample\\CucumberProject\\features", 
glue="step.definition", tags="@loginpage or @searchpage")
//@CucumberOptions(features = "D:\\JAVA\\Testing\\Workspace\\Sample\\CucumberProject\\features", 
//glue="step.definition", tags="@loginpage or @searchpage")

public class Adactin_Main extends Adactin_Base {
	
	@BeforeClass
	public static void setUp() {
		System.out.println("Welcome to Adaction Cucumber....!");
		driverLaunch();
//		loginUrl("https://adactinhotelapp.com/");
	}
	
	@AfterClass
	public static void teardown() {
		System.out.println("........................EOD..............................!");
	}

}
