package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

    public static WebDriver launch() {
        String browser = System.getProperty("browser"); // System.getenv("browser");
        if(browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver","C://webdrivers//geckodriver.exe");
            return new FirefoxDriver();
        } else if(browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C://webdrivers//chromedriver.exe");
            return new ChromeDriver();
        } else if(browser.equals("msie")) {
            System.setProperty("webdriver.ie.driver","C://webdrivers//IEDriverServer.exe");
            return new InternetExplorerDriver();
        } else {
            throw new RuntimeException("Unrecognized system property 'browser': " + browser);
        }
    }
}
