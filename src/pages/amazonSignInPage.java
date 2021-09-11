package pages;

import chromeDriver.chromeOpen;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static chromeDriver.chromeOpen.driver;
import static chromeDriver.chromeOpen.*;

public class amazonSignInPage
{

    public static WebElement emailInp = null;
    public static WebElement ContBtn = null;
    public static WebElement passInp = null;
    public static WebElement signInBtn = null;


    public static String emailInpXpath = "//input[@type=\"email\" and @id=\"ap_email\" and @name=\"email\"]";
    public static String ContBtnXpath = "//input[@id=\"continue\" and @type=\"submit\"]";
    public static String passInpXpath = "//input[@type=\"password\" and @id=\"ap_password\"]";
    public static String signInBtnXpath = "//input[@id=\"signInSubmit\" and @type=\"submit\"]";
    public static String failMsgSignInXpath = "//div[@class=\"a-alert-content\"]//ul[@class=\"a-unordered-list a-nostyle a-vertical a-spacing-none\"]";
    public static String succSignInXpath = "//span[@class=\"nav-line-2 \"]";



    public static boolean emailInpPres = true;
    public static boolean contBtnPres= true;
    public static boolean passInpPres = true;
    public static boolean signInBtnPres = true;
    public static boolean failMsgSignInPres = true;
    public static boolean succSignInPres = true;




    public static void openAmazonSignInpage () throws InterruptedException
    {

        openSignInPage();

    }

    public static void signIn (String userN, String uPass) throws InterruptedException
    {
        try{
            driver.findElement(By.xpath(emailInpXpath));
            emailInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            emailInpPres = false;
            System.out.println("Email input element not found");
        }
        try{
            driver.findElement(By.xpath(ContBtnXpath));
            contBtnPres = true;

        }
        catch (NoSuchElementException e)
        {
            contBtnPres = false;
            System.out.println("Continue Button element not found");
        }



        if
        (
                emailInpPres == true &
                        contBtnPres == true

        ) {
            emailInp = driver.findElement(By.xpath(emailInpXpath));
            ContBtn = driver.findElement(By.xpath(ContBtnXpath));

            Thread.sleep(1000);
            emailInp.sendKeys(userN);
            Thread.sleep(1000);
            ContBtn.click();
            Thread.sleep(1000);


            try {
                driver.findElement(By.xpath(passInpXpath));
                passInpPres = true;

            } catch (NoSuchElementException e) {
                passInpPres = false;
                System.out.println("Password input element not found");
            }
            try {
                driver.findElement(By.xpath(signInBtnXpath));
                signInBtnPres = true;

            } catch (NoSuchElementException e) {
                signInBtnPres = false;
                System.out.println("Sign in Button element not found");
            }
            if
            (
                    passInpPres == true &
                            signInBtnPres == true
            )
            {
                passInp = driver.findElement(By.xpath(passInpXpath));
                signInBtn = driver.findElement(By.xpath(signInBtnXpath));

                Thread.sleep(1000);
                passInp.sendKeys(uPass);
                Thread.sleep(1000);
                signInBtn.click();

                try {
                    driver.findElement(By.xpath(succSignInXpath));
                    succSignInPres = true;

                } catch (NoSuchElementException e) {
                    succSignInPres = false;
                    System.out.println("Account element not found");
                }
                if
                (
                    succSignInPres == true
                )
                {
                    System.out.println("Sign in test is successful");
                    Thread.sleep(1000);
                    chromeOpen.closeBrowser();
                }
                else
                {
                    System.out.println("Sign in test is unsuccessful");
                }

            }
            else
                {
                    System.out.println("One or more element not found cannot perform Sign In");

            }
        }
        else
        {
            System.out.println("One or more element not found cannot perform Sign In");
        }
    }

    public static void failedSignIn (String userN, String uPass) throws InterruptedException
    {
        try{
            driver.findElement(By.xpath(emailInpXpath));
            emailInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            emailInpPres = false;
            System.out.println("Email input element not found");
        }
        try{
            driver.findElement(By.xpath(ContBtnXpath));
            contBtnPres = true;

        }
        catch (NoSuchElementException e)
        {
            contBtnPres = false;
            System.out.println("Continue Button element not found");
        }



        if
        (
                emailInpPres == true &
                        contBtnPres == true

        ) {
            emailInp = driver.findElement(By.xpath(emailInpXpath));
            ContBtn = driver.findElement(By.xpath(ContBtnXpath));

            Thread.sleep(1000);
            emailInp.sendKeys(userN);
            Thread.sleep(1000);
            ContBtn.click();
            Thread.sleep(1000);


            try {
                driver.findElement(By.xpath(passInpXpath));
                passInpPres = true;

            } catch (NoSuchElementException e) {
                passInpPres = false;
                System.out.println("Password input element not found");
            }
            try {
                driver.findElement(By.xpath(signInBtnXpath));
                signInBtnPres = true;

            } catch (NoSuchElementException e) {
                signInBtnPres = false;
                System.out.println("Sign in Button element not found");
            }
            if
            (
                    passInpPres == true &
                            signInBtnPres == true
            )
            {
                passInp = driver.findElement(By.xpath(passInpXpath));
                signInBtn = driver.findElement(By.xpath(signInBtnXpath));

                Thread.sleep(1000);
                passInp.sendKeys(uPass);
                Thread.sleep(1000);
                signInBtn.click();
                Thread.sleep(1000);

                try {
                    driver.findElement(By.xpath(failMsgSignInXpath));
                    failMsgSignInPres = true;

                } catch (NoSuchElementException e) {
                    failMsgSignInPres = false;
                    System.out.println("Fail Message element not found");
                }

                if
                (
                      failMsgSignInPres == true
                )
                {
                    System.out.println("Failed Sign in test is successful");
                    Thread.sleep(1000);
                    chromeOpen.closeBrowser();
                }
                else
                {
                    System.out.println("Failed Sign in test is unsuccessful");
                }


            }
            else
            {
                System.out.println("One or more element not found cannot perform Sign In");

            }
        }
        else
        {
            System.out.println("One or more element not found cannot perform Sign In");
        }
    }





}
