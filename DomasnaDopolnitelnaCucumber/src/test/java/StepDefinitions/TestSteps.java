package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateAccountPage;

public class TestSteps {

	public static WebDriver driver;
	CreateAccountPage objCreate;
	
	
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objCreate = PageFactory.initElements(driver, pages.CreateAccountPage.class);
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	
	@Given("Navigate to automationpractice")
	public void navigate_to_automationpractice() {
		
		SetUp();
				
	}
	
	@Then("automation practice home page should be displayed")
	public void automation_practice_home_page_should_be_displayed() {

		objCreate.assertionHomePage();
		
	}
	
	@When("user clicks SignIn link button")
	public void user_clicks_sign_in_link_button() {
	
		objCreate.clickSignIn();
		
	}
	
	@And("enter new valid email address")
	public void enter_new_valid_email_address() {
	
		objCreate.enterRandomEmail();
		
	}
	
	@And("click Create An Account BTN")
	public void click_create_an_account_btn() {
	
		objCreate.clickSubmit();
		
	}
	
	@Then("account creation page should be displayed")
	public void account_creation_page_should_be_displayed() {
		
		objCreate.assertionCreateAccountPage();
		
	}
	
	@When("populate all mandatory fields")
	public void populate_all_mandatory_fields() {

		objCreate.populateMandatory();
		
	}
	
	@And("click on Register buton")
	public void click_on_register_buton() {
		
		objCreate.clickRegisterButton();
		
	}
	
	@Then("My account page should be dipslayed")
	public void my_account_page_should_be_dipslayed() throws InterruptedException {

		objCreate.assertionAccountCreated();
		Thread.sleep(3000);
		driver.close();
		
	}



	
}
