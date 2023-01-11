package steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {

	GooglePage google = new GooglePage();
	WebDriver driver;

	@Given("^I am on the Google search page$")
	public void navigateToGoogle() {
		google.navigateToGoogle();

	}

	@When("^I enter a search criteria$")
	public void enterSearchCriteria() {
		google.enterSearchCriteria("Google");
		//driver.findElement(By.name("q")).sendKeys("selenium");

	}

	@And("^Click on the search button$")
	public void clickSearchButton() {
		google.clickGoogleSearch();
		// driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	}

	@Then("^The results match the criteria$")
	public void validateResults() {

		assertEquals("Selenium WebDriver", driver.getTitle());

	}

}
