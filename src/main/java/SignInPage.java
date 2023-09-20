import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//span[@class='MuiTouchRipple-root css-w0pj6f'])[1]")
    private WebElement headerSignInButton;

    @FindBy(id = "sw-form-capture-email-input")
    private WebElement emailInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(id = "sw-sign-in-submit-btn")
    private WebElement signInButton;

    @Step("Push the Sign in button in header")
    public void clickOnHeaderSignInButton(){
        headerSignInButton.click();
    }

    @Step("Enter value to email Field")
    public void enterValueToEmailField(User user){
        emailInputField.sendKeys(user.getUserEmail());
    }

    @Step("Enter value to password Field")
    public void enterValueToPasswordField(User user){
        passwordInputField.sendKeys(user.getPassword());
    }

    @Step("Push the Sign in button")
    public void clickOnSignInButton(){
        signInButton.click();
    }

}
