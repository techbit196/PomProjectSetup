package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class DefinitionSteps {
    WebDriver driver = null;
    LoginPage loginPage = new LoginPage(driver);

    @Given("User is on homepage")
    public void user_is_on_homepage()throws Throwable {
        loginPage.openBrowser();
    }
    @And("Login as admin")
    public void login_as_admin() {
    }
    @Then("User navigate to dashboard")
    public void user_navigate_to_dashboard() {
    }


}
