package StepDev;

import Pages.WebPage;
import Pages.apiPage;
import helper.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Test;

public class webStepDev extends Utility {

    WebPage webPage;


    public webStepDev() {
        webPage = new WebPage();
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        webPage.userIsOnLoginPage();
    }

    //For Login
    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        webPage.userInputUsernameWith(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        webPage.userInputPasswordWith(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        webPage.userClickLoginButton();
    }

    @Then("user able to see error message {string}")
    public void userAbleToSeeErrorMessage(String errorMessage) {
        webPage.userAbleToSeeErrorMessage(errorMessage);
    }

    //For HomePage
    @Then("user is on homepage")
    public void userIsOnHomepage() {
        webPage.userIsOnHomepage();

    }
    //For All List
    @And("user click open menu button")
    public void userClickOpenMenuButton() {
        webPage.userClickOpenMenuButton();

    }

    @When("user click all items")
    public void userClickAllItems() {
        webPage.userClickAllItems();

    }

    @Then("user is on All List Item")
    public void userIsOnAllListItem() {
        webPage.userIsOnAllListItem();
    }

    //Item Selection
    @When("user click item selection")
    public void userClickItemSelection() {
        webPage.userClickItemSelection();

    }
    //For Detail
    @Then("user is on page of item selection")
    public void userIsOnPageOfItemSelection() {
        webPage.userIsOnPageOfItemSelection();

    }

    //For Add Items
    @Then("user click Add to chart")
    public void userItemOnPageChart() {
        webPage.userItemOnPageChart();
    }
    //For Chart
    @And("user inspec item on Page Chart")
    public void userInspecItemOnPageChart() {
        webPage.userInspecItemOnPageChart();
    }

    @And("USer on Page Chart")
    public void userOnPageChart() {
        webPage.userOnPageChart();
    }

    @And("user click Checkout")
    public void userClickCheckout() {
        webPage.userClickCheckout();
    }

    //For Checkout
    @And("user is on Page checkot")
    public void userIsOnPageCheckot() {
        webPage.userIsOnPageCheckot();
    }

    @And("user input Frist Name with {string}")
    public void userInputFristNameWith(String NamaPertama) {
        webPage.userInputFristNameWith(NamaPertama);
    }

    @And("user input Last Name  with {string}")
    public void userInputLastNameWith(String NamaTerakhir) {
        webPage.userInputLastNameWith(NamaTerakhir);
    }


    @And("user input Zip\\/Code with {string}")
    public void userInputZipCodeWith(String ZipCode) {
        webPage.userInputZipCodeWith(ZipCode);
    }

    @And("user click item Continue")
    public void userClickItemContinue() {
        webPage.userClickItemContinue();
    }

    @And("user is on Page Checkout Overview")
    public void userIsOnPageCheckoutOverview() {
        webPage.userIsOnPageCheckoutOverview();
    }

    @When("user click Finish")
    public void userClickFinish() {
        webPage.userClickFinish();
    }

    @Then("user is on Page Checkout Complete")
    public void userIsOnPageCheckoutComplete() {
        webPage.userIsOnPageCheckoutComplete();
    }

}
