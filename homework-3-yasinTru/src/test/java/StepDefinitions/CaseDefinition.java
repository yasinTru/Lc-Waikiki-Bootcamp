package StepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import util.DriverFactory;

public class CaseDefinition {

    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    //Scenario 1  @Check



    @Given("Yasin is on Home page")
    public void yasin_is_on_home_page() {
        loginPage.isInHomePage();

    }

    @When("click {string} card in the top right")
    public void click_card_in_the_top_right(String string) {
        loginPage.clickLoginAvatar();


    }

    @Then("should see Login Page")
    public void should_see_login_page() {

        loginPage.waitLogin();

    }

    //Scenario 2 @Email @Components

    @Given("Yasin is on Login Page")
    public void yasin_is_on_login_page() {
        loginPage.goToLoginPage();
        loginPage.isInLoginPage();
    }
    @When("click {string} radio button")
    public void click_radio_button(String string) {
        loginPage.clickRadioBtn();

    }
    @Then("should see {string} title")
    public void should_see_title(String string) {
        loginPage.getLoginTitle();
    }
    @Then("should see {string} radio button")
    public void should_see_radio_button(String string) {
        loginPage.isRadioBtnVisable();
        loginPage.isPhoneBtnVisable();

    }


    @Then("should see {string} text on Email")
    public void should_see_text_on_email(String string) {
        loginPage.isEmailTextVisible();
    }
    @Then("should see {string} text on Password")
    public void should_see_text_on_password(String string) {
        loginPage.isPasswordVisible();
    }
    @Then("should see Show Password icon")
    public void should_see_show_password_icon() {
        loginPage.isPasswordIconVisible();

    }
    @Then("should see {string} remember me")
    public void should_see_remember_me(String string) {
        loginPage.isRememberMeVisible();

    }
    @Then("should see {string} forgot password")
    public void should_see_forgot_password(String string) {
        loginPage.isForgotPasswordVisible();

    }
    @Then("should see {string} login button")
    public void should_see_login_button(String string) {
        loginPage.isLoginButtonVisible();

    }

    //Scenario 3, @Empty

    @When("click login button")
    public void click_login_button() {

        loginPage.clickLogin();

    }

    @Then("should see {string} Email Empty message")
    public void should_see_email_empty_message(String string) {

        loginPage.emailEmpty();

    }



    //Scenario 4, @Empty @Password

    @When("type Email {string}")
    public void type_email(String string) {
        loginPage.enterEmail();

    }



    @Then("should not see Email Empty message")
    public void should_not_see_email_empty_message() {
        loginPage.shouldNotSeeEmail();

    }

    //Scenario 5, @Empty @Email

    @When("type Password {string}")
    public void type_password(String string) {
        loginPage.enterPassword();
    }


    //Scenario 6, @False @Password
    @When("type Email {string} and click login")
    public void type_email_and_click_login(String string) {
        loginPage.enterEmail();
        loginPage.clickLogin();
    }

    @Then("should see {string} Email False message")
    public void should_see_email_false_message(String string) {

      //  loginPage.emailEmpty();
    }

    //Scenario 7, @FalseLogin

    @When("type Email {string}, Password {string} and click login")
    public void type_email_password_and_click_login(String string, String string2) {
        loginPage.enterEmail();
        loginPage.enterPassword();

    }

    @Then("should see {string} Login Error message")
    public void should_see_login_error_message(String string) {
        loginPage.getWrongLoginError();

    }


}