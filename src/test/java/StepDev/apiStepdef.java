package StepDev;

import Pages.apiPage;
import helper.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

//import static helper.Utility.driver;

public class apiStepdef {

    apiPage apiurl;
//
    public apiStepdef(){
       this. apiurl = new apiPage();
    }

    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiurl.prepareUrlFor(url);
    }

    @And("hit api get list users")
    public void hitApiGetListUsers() {
        apiurl.hitApiGetListUsers();
    }

    @Then("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int status_code) {
        apiurl.validationStatusCodeIsEquals(status_code);
    }

    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiurl.validationResponseBodyGetListUsers();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiurl.validationResponseJsonWithJSONSchema(filename);
    }

    @And("hit api post create new users")
    public void hitApiPostCreateNewUsers() {
        apiurl.hitApiPostCreateNewUsers();

    }

    @Then("validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser() {
        apiurl.validationResponseBodyPostCreateNewUser();
    }

    @And("hit api delete new")
    public void hitApiDeleteNew() {
        apiurl.hitApiDeleteNew();

    }

    @And("hit api put")
    public void hitApiPut() {
        apiurl.hitApiPut();
    }

    @When("validation response body put edit  user")
    public void validationResponseBodyPutEditUser() {
        apiurl.validationResponseBodyPutEditUser();
    }
}
