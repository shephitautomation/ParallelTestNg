import java.net.MalformedURLException;
import java.net.URL;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    //Declare ThreadLocal Driver (ThreadLocalMap) for ThreadSafe Tests
//    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static WebDriver driver;
    public CapabilityFactory capabilityFactory = new CapabilityFactory();

    @BeforeMethod
    @Parameters(value={"browser"})
    public void setup (String browser) throws MalformedURLException {
        //Set Browser to ThreadLocalMap
//        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilityFactory.getCapabilities(browser)));
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

//    public WebDriver getDriver() {
//        //Get driver from ThreadLocalMap
//        return driver.get();
//    }

//    @AfterMethod
//    public void tearDown() {
//        getDriver().quit();
//    }

    @AfterClass void terminate () {
        //Remove the ThreadLocalMap element
        driver.close();
    }
}
