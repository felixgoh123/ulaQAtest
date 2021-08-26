package chromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeOpen
{

    public static WebDriver driver = null;

    public static void openBrowser()
    {
        String chromeDriverPath = null;
        if (System.getProperty("os.name").startsWith("Linux")) {
            chromeDriverPath = System.getProperty("user.dir") + "/driver/linux/chromedrive";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        }
        if (System.getProperty("os.name").startsWith("Mac")) {
            chromeDriverPath = System.getProperty("user.dir") + "/driver/mac/chromedriver";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        }
        if (System.getProperty("os.name").startsWith("Windows")) {
            chromeDriverPath = System.getProperty("user.dir") + "/driver/windows//chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        }

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get("http://computer-database.herokuapp.com/computers");
        System.out.println("Browser is Open");
    }
}



