import io.qameta.allure.Attachment;
import org.junit.After;
import org.junit.AssumptionViolatedException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    ChromeDriver driver;
    String BASE_URL = "https://jere237.softr.app/";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
        driver.get(BASE_URL);

    }

//    @After
    public void TearDown(){
        driver.quit();
    }

//    @Rule
//    public TestWatcher screenShotOnFailure = new TestWatcher() {
//        @Override
//        protected void failed(Throwable e, org.junit.runner.Description description) {
//            makeScreenshotOnFailure();
//            driver.close();
//            driver.quit();
//        }
//
//        @Override
//        protected void skipped(AssumptionViolatedException e, Description description) {
//            makeScreenshotOnFailure();
//            driver.close();
//            driver.quit();
//        }
//
//        @Override
//        protected void succeeded(Description description) {
//            driver.close();
//            driver.quit();
//        }
//
//        @Attachment
//        public byte[] makeScreenshotOnFailure(){
//            return  ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//        }
//    };

    String validUserEmailValue = "peter.pen@gmail.com";
    String validUSerPasswordValue = "098765";
    User validUserTeacher = new User(validUserEmailValue,validUSerPasswordValue);
    User validUserStudent = new User("malik@example.com","123456");
    User invalidUser = new User("jgsacgjfkcdsgfc", "87dfvg87iufkn");
}
