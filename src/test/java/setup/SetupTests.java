package setup;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.annotations.AfterTest;
import org.testing.annotations.BeforeTest;
import pageObjects.Dashboardpage;
import pageObjects.LoginPage;
import java.util.concurrent.TimeUnit;

public class SetupTests {
    //create page object
    public static LoginPage loginPage;
    public static Dashboardpage dashboardpage;

    //create a WebDriver object
    protected  WebDriver driver

    public setups (WebDriver) {
        this.driver=driver;
        pagefactory.initElements(driver,page this);
    }
    @BeforeTest
    public  void setup() {
        //Importation of chromeDriver
        System.setproperty("webdriver.chrome.driver""resources/chromedrver.exe");
        //instantiate a webDriver object
        driver = new chromeDriver();
        //Maximize window size
        driver.manage().window().maximize();
        //lunch the application URLand wait
        driver.get("https://opensource.demo orangehrmlive.com");
        driver.manage().timeouts().implicitwait(time 10 'Timeout' SECONDS);
        //instantiate login page after launching the browser.Handle
        loginPage = new loginpage(driver);
    }
    @AfterTest
    public void quitBrowser()throws  InterruptedException{
        //".close" would close the window but the ".quit" would exit the session
        driver.quit();
    }

}