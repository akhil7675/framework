package StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunnerHooks {
	
	WebDriver driver= null;
	@Before
	public void setup()
	{
		System.out.println("Inside: Setup");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.get("https://example.testproject.io/web/");
	}
	@After
	public void teardown()
	{
		System.out.println("Inside: teardown");
		driver.close();
		driver.quit();
	}
	@Given("I want to write a step with precondition")
	public void I_want_to_write_a_step_with_precondition()
	{
		System.out.println("Inside: I want to write a step with precondition");
	}
	@And("some other precondition")
	public void some_other_precondition()
	{
		System.out.println("Inside: some other precondition");
	}
	@When("I complete action")
	public void I_complete_action()
	{
		System.out.println("Inside: I complete action");
	}

}

