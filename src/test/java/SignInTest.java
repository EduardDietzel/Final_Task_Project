import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SignInTest extends BaseTest{

//    ChromeDriver driver;
//    String BASE_URL = "https://jere237.softr.app/";
//
//    @Before
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
////        driver.get(BASE_URL + "sign-in");
//        driver.get(BASE_URL);
//
//    }
//
//    @After
//    public void TearDown(){
//        driver.quit();
//    }

    @Test@DisplayName("Success Login")
    @Description("Login with valid data")
    public void signInWithValidData() {

//        WebElement headerSignInButton = driver.findElement(By.xpath("(//span[@class='MuiTouchRipple-root css-w0pj6f'])[1]"));
//        headerSignInButton.click();
//        WebElement emailInputField = driver.findElement(By.id("sw-form-capture-email-input"));
//        emailInputField.sendKeys("peter.pen@gmail.com");
//        WebElement passwordInputField = driver.findElement(By.name("password"));
//        passwordInputField.sendKeys("098765");
//        WebElement signInButton = driver.findElement(By.id("sw-sign-in-submit-btn"));
//        signInButton.click();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickOnHeaderSignInButton();
        signInPage.enterValueToEmailField(validUserTeacher);
        signInPage.enterValueToPasswordField(validUserTeacher);
        signInPage.clickOnSignInButton();

    }
}
