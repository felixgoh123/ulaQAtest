package pages;

import chromeDriver.chromeOpen;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.Random;

import static chromeDriver.chromeOpen.*;

public class amazonSignUpPage
{

    public static WebElement nameInp = null;
    public static WebElement emailInp = null;
    public static WebElement passInp = null;
    public static WebElement passCheInp = null;
    public static WebElement submitBtn = null;

    public static String nameInpXpath = "//input[@type=\"text\" and @id=\"ap_customer_name\"]";
    public static String emailInpXpath = "//input[@type=\"email\" and @id=\"ap_email\"]";
    public static String passInpXpath = "//input[@type=\"password\" and @id=\"ap_password\"]";
    public static String passCheInpXpath = "//input[@type=\"password\" and @id=\"ap_password_check\"]";
    public static String submitBtnXpath = "//input[@type=\"submit\" and @id=\"continue\"]";
    public static String errPassMmXpath = "//div[@id=\"auth-password-mismatch-alert\"]//div[@class=\"a-box-inner a-alert-container\"]//div[@class=\"a-alert-content\"]";
    public static String verEmXpath = "//div[@class=\"a-row a-spacing-small\"]//div[@class=\"a-row a-spacing-small\"]";
    public static String slvPzlXpath = "//span[@class=\"a-size-large\"]";

    public static boolean nameInpPres = true;
    public static boolean emailInpPres = true;
    public static boolean passInpPres = true;
    public static boolean passCheInpPres = true;
    public static boolean submitBtnPres = true;
    public static boolean errPassMmPres = true;
    public static boolean verEmPres = true;
    public static boolean slvPzlPres = true;

    public static void openAmazonSignUppage () throws InterruptedException
    {

        openSignUpPage();

    }

    protected static String randomString() {
        String ranUser = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder ran = new StringBuilder();
        Random rnd = new Random();
        while (ran.length() < 10)
        {
            int index = (int) (rnd.nextFloat() * ranUser.length());
            ran.append(ranUser.charAt(index));
        }
        String saltStr = ran.toString();
        return saltStr;

    }

    public static void signUp() throws InterruptedException
    {
        try{
            driver.findElement(By.xpath(nameInpXpath));
            nameInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            nameInpPres = false;
            System.out.println("Name Input element not found");
        }
        try{
            driver.findElement(By.xpath(emailInpXpath));
            emailInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            emailInpPres = false;
            System.out.println("Email Input element not found");
        }
        try{
            driver.findElement(By.xpath(passInpXpath));
            passInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            passInpPres = false;
            System.out.println("Password Input element not found");
        }
        try{
            driver.findElement(By.xpath(passCheInpXpath));
            passCheInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            passCheInpPres = false;
            System.out.println("Password Re-entry Input element not found");
        }
        try{
            driver.findElement(By.xpath(submitBtnXpath));
            submitBtnPres = true;

        }
        catch (NoSuchElementException e)
        {
            submitBtnPres = false;
            System.out.println("Submit button element not found");
        }
        if
        (
                nameInpPres == true &
                        emailInpPres == true &
                        passInpPres == true &
                        passCheInpPres == true &
                        submitBtnPres == true
        )
        {
            passInp = driver.findElement(By.xpath(passInpXpath));
            nameInp = driver.findElement(By.xpath(nameInpXpath));
            emailInp = driver.findElement(By.xpath(emailInpXpath));
            passCheInp = driver.findElement(By.xpath(passCheInpXpath));
            submitBtn = driver.findElement(By.xpath(submitBtnXpath));

            Thread.sleep(1000);
            nameInp.sendKeys(randomString());
            Thread.sleep(1000);
            emailInp.sendKeys(randomString()+"@gmail.com");
            Thread.sleep(1000);

            String locPass = randomString();
            passInp.sendKeys(locPass);
            Thread.sleep(1000);
            passCheInp.sendKeys(locPass);
            Thread.sleep(1000);
            submitBtn.click();
            Thread.sleep(1000);

            try{
                driver.findElement(By.xpath(verEmXpath));
                verEmPres = true;

            }
            catch (NoSuchElementException e)
            {
                verEmPres = false;
                System.out.println("Verify Email copy element not found");
            }
            if
            (
                    verEmPres == true
            )
            {
                System.out.println("Sign Up test is successful");
                Thread.sleep(1000);
                chromeOpen.closeBrowser();
            }
            else
            {
                try{
                    driver.findElement(By.xpath(slvPzlXpath));
                    slvPzlPres = true;

                }
                catch (NoSuchElementException e)
                {
                    slvPzlPres = false;
                    System.out.println("Solve Puzzle copy element not found");
                }
                if
                (
                    slvPzlPres == true
                )
                {
                    System.out.println("Sign Up test is successful");
                    Thread.sleep(1000);
                    chromeOpen.closeBrowser();
                }
                else
                    {

                        System.out.println("Sign Up test is unsuccessful");
                    }
            }
        }
        else
        {
            System.out.println("One or more element not found cannot perform Sign Up");
        }
    }

    public static void failSignUp() throws InterruptedException
    {
        try{
            driver.findElement(By.xpath(nameInpXpath));
            nameInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            nameInpPres = false;
            System.out.println("Name Input element not found");
        }
        try{
            driver.findElement(By.xpath(emailInpXpath));
            emailInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            emailInpPres = false;
            System.out.println("Email Input element not found");
        }
        try{
            driver.findElement(By.xpath(passInpXpath));
            passInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            passInpPres = false;
            System.out.println("Password Input element not found");
        }
        try{
            driver.findElement(By.xpath(passCheInpXpath));
            passCheInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            passCheInpPres = false;
            System.out.println("Password Re-entry Input element not found");
        }
        try{
            driver.findElement(By.xpath(submitBtnXpath));
            submitBtnPres = true;

        }
        catch (NoSuchElementException e)
        {
            submitBtnPres = false;
            System.out.println("Submit button element not found");
        }
        if
        (
            nameInpPres == true &
            emailInpPres == true &
            passInpPres == true &
            passCheInpPres == true &
            submitBtnPres == true
        )
        {
            passInp = driver.findElement(By.xpath(passInpXpath));
            nameInp = driver.findElement(By.xpath(nameInpXpath));
            emailInp = driver.findElement(By.xpath(emailInpXpath));
            passCheInp = driver.findElement(By.xpath(passCheInpXpath));
            submitBtn = driver.findElement(By.xpath(submitBtnXpath));

            Thread.sleep(1000);
            nameInp.sendKeys(randomString());
            Thread.sleep(1000);
            emailInp.sendKeys(randomString()+"@gmail.com");
            Thread.sleep(1000);
            passInp.sendKeys(randomString());
            Thread.sleep(1000);
            passCheInp.sendKeys(randomString());
            Thread.sleep(1000);
            submitBtn.click();
            Thread.sleep(1000);

            try{
                driver.findElement(By.xpath(errPassMmXpath));
                errPassMmPres = true;

            }
            catch (NoSuchElementException e)
            {
                errPassMmPres = false;
                System.out.println("Error mismatch copy element not found");
            }
            if
            (
                errPassMmPres == true
            )
            {
                System.out.println("Mismatch password test is successful");
                Thread.sleep(1000);
                chromeOpen.closeBrowser();
            }
            else
            {

                System.out.println("Mismatch password test is unsuccessful");
            }
        }
        else
        {
            System.out.println("One or more element not found cannot perform Sign Up");
        }
    }

}
