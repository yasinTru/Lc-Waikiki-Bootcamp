package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Framework.ElementHelper;

public class LoginPage{

    //Page Elements

    By loginAvatar=By.cssSelector("#user_1_");
    By waitLoginText=By.cssSelector(".login-form .login-form__title");
    By radioButton=By.cssSelector("[value=\"Email\"]");
    By loginTitle=By.cssSelector(".login-form .login-form__title");
    By homeSlider= By.cssSelector(".brands-slider .mini-slider.container");
    By phoneButton=By.cssSelector("[value=\"Phone\"]");
    By emailText=By.cssSelector("[name=\"email\"]");
    By passwordText=By.cssSelector("[name=\"password\"]");
    By passwordIcon=By.cssSelector(".login-form__show-password-icon .login-form__show-password-icon--img");
    By rememberMe=By.cssSelector(".checkbox-span");
    By forgotPassword= By.cssSelector(".login-form__remember-me .login-form__forgot-password-link");
    By loginButton= By.cssSelector(".login-form__button.login-form__button--bg-blue");
    By mailError= By.xpath("//div[contains(text(),' e-posta adresinizi giriniz.')]");
    By loginError= By.cssSelector(".login-form__header-errors .login-form__header-errors--p");


    //Driver Setups
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    //Constructor
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);


    }

    //Page Functions

    public void isInHomePage()
    {
        elementHelper.checkElementVisible(homeSlider);

    }

    public void isInLoginPage()
    {
        elementHelper.checkElementVisible(loginTitle);
    }

    public void clickLoginAvatar()
    {
        elementHelper.findElement(loginAvatar).click();

    }

    public void waitLogin()
    {
        elementHelper.getText(waitLoginText);
        elementHelper.checkElementVisible(waitLoginText);
        System.out.println(elementHelper.getText(waitLoginText));
    }


    //Scenario 2

    public void goToLoginPage()
    {
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/giris");
    }

    public void clickRadioBtn()
    {
        elementHelper.click(radioButton);
    }
    public void getLoginTitle()
    {
        elementHelper.checkElementVisible(loginTitle);
    }

    public void isRadioBtnVisable()
    {
        elementHelper.checkElementVisible(radioButton);
    }

    public void isPhoneBtnVisable()
    {
        elementHelper.checkElementVisible(phoneButton);
    }

    public void isEmailTextVisible()
    {
        elementHelper.checkElementVisible(emailText);
    }

    public void isPasswordVisible()
    {
        elementHelper.checkElementVisible(passwordText);
    }

    public void isPasswordIconVisible()
    {
        elementHelper.checkElementVisible(passwordIcon);
    }

    public void isRememberMeVisible()
    {
        elementHelper.checkElementVisible(rememberMe);
    }

    public void isForgotPasswordVisible()
    {
        elementHelper.checkElementVisible(forgotPassword);
    }
    public void isLoginButtonVisible()
    {
        elementHelper.checkElementVisible(loginButton);
    }

    //Scenario 3

    public void clickLogin()
    {
        elementHelper.click(loginButton);
    }

    public void emailEmpty()
    {
        elementHelper.checkElementVisible(mailError);
    }


    //Scenario 4

    public void enterEmail()
    {
        elementHelper.sendKey(emailText, "yasin@mail.com");
    }

    public void shouldNotSeeEmail() {

        //elementHelper.checkElementVisible(mailError);

    }

    //Scenario 5

     public void enterPassword()
     {
         elementHelper.sendKey(passwordText,"1234567890");
     }

    //SC 6-7

    public void getWrongLoginError()
    {
        elementHelper.getText(loginError);
        System.out.println(loginError);;
    }


}
