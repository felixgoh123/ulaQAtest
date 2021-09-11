package chromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeOpen
{

    public static WebDriver driver = null;

    public static void openSignInPage()
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
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        System.out.println("Browser is Open");
    }

    public static void openSignUpPage()
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
        driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1&prevRID=TTVNMZVYP5D7AW8MFWNX&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

    }

    public static void closeBrowser()
    {
        driver.close();
    }
}



