package helper;


import data.Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class InitialSteps {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\user.inv5357-pc\\Desktop\\Dymskij\\ChromeDriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("-incognito");
            options.addArguments("start-maximized");
            options.addArguments("dom.webnotification.enabled");
            //  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            //   capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            driver = new ChromeDriver(options);

        }
        return driver;
    }

    @BeforeTest
    public void openBrouser() throws Throwable {
        driver = getDriver();
        driver.get(Options.url);
    }

    @AfterTest
    public void closeBrowser() throws Throwable {
        driver.quit();
        driver = null;
    }

}
