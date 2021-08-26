package pages;
import chromeDriver.chromeOpen;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import chromeDriver.chromeOpen;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;

public class addComputerPage
{
    public static WebElement newCompTitleCopy = null;
    public static WebElement newCompHeadCopy = null;
    public static WebElement newCompnamelblCopy = null;
    public static WebElement newCompIntrolblCopy = null;
    public static WebElement newCompDiscolblCopy = null;
    public static WebElement newCompComplblCopy = null;
    public static WebElement newCompRecCopy = null;
    public static WebElement newCompIntroDateCopy = null;
    public static WebElement newCompDiscDateCopy = null;
    public static WebElement newCompBlankSelectCopy = null;
    public static WebElement newCompSelect = null;
    public static WebElement newCompSubmit = null;
    public static WebElement newCompCancel = null;
    public static WebElement newCompOrCopy = null;
    public static WebElement newCompNameInp = null;
    public static WebElement newCompIntroInp = null;
    public static WebElement newCompDiscoInp = null;
    public static WebElement newCompNameErr = null;
    public static WebElement newCompIntroErr = null;
    public static WebElement newCompDiscoErr = null;

    public static String newCompTitleXPath = "//h1[@class=\"fill\"]";
    public static String newCompHeadXPath = "//body//section//h1";
    public static String newCompNameXPath = "//body//section//form//label[@for=\"name\"]";
    public static String newCompIntroXPath = "//body//section//form//label[@for=\"introduced\"]";
    public static String newCompDiscoXPath = "//body//section//form//label[@for=\"discontinued\"]";
    public static String newCompCompXPath = "//body//section//form//label[@for=\"company\"]";
    public static String newCompReqXPath = "//body//section//form//div//span[text()=\"Required\"]";
    public static String newCompIntroDateXPath ="//body/section/form//div[2]//span[1]";
    public static String newCompDiscDateXPath ="//body/section/form//div[3]//span[1]";
    public static String newCompBlankSelectXPath = "//body//section//form//div[@class=\"input\"]//select[@id=\"company\"]//option[@class=\"blank\"]";
    public static String newCompSelectXPath = "//body//section//form//select[@id=\"company\"]";
    public static String newCompSubmitXPath = "//body//section//form//div[@class=\"actions\"]//input[@type=\"submit\"]";
    public static String newCompOrXPath = "//body//section//form//div[@class=\"actions\"]";
    public static String newCompCancelXPath = "//body//section//form//div[@class=\"actions\"]//a[@class=\"btn\"]";
    public static String newCompNameInpXPath = "//body//form//div[@class=\"input\"]//input[@id=\"name\"]";
    public static String newCompIntroInpXPath = "//body//form//div[@class=\"input\"]//input[@id=\"introduced\"]";
    public static String newCompDiscInpXPath = "//body//form//div[@class=\"input\"]//input[@id=\"discontinued\"]";
    public static String newCompNameErrXPath = "//body//form//fieldset//div[1]";
    public static String newCompIntroErrXPath = "//body//form//fieldset//div[2]";
    public static String newCompDiscoErrXPath = "//body//form//fieldset//div[3]";

    public static Select newCompCompDD = null;


    public static boolean copyCrt = true;
    public static boolean newCompTitlePres = true;
    public static boolean newCompHeadPres = true;
    public static boolean newCompNamePres = true;
    public static boolean newCompIntroPres = true;
    public static boolean newCompDiscoPres = true;
    public static boolean newCompCompPress = true;
    public static boolean newCompReqPress = true;
    public static boolean newCompIntroDatePres = true;
    public static boolean newCompDiscoDatePres = true;
    public static boolean newCompBlankSelectPres = true;
    public static boolean newCompSelectPres = true;
    public static boolean newCompSubmitPres = true;
    public static boolean newCompOrPres = true;
    public static boolean newCompCancelPres = true;
    public static boolean newCompNameInpPres = true;
    public static boolean newCompIntroInpPres = true;
    public static boolean newCompDiscoInpPres = true;
    public static boolean newCompNameErrPres = true;
    public static boolean newCompIntroErrPres = true;
    public static boolean newCompDiscoErrPres = true;



    public static void addNewCompCopyTest ()
    {
        copyCrt = true;

        try{
            computerListPage.driver.findElement(By.xpath(newCompTitleXPath));
            newCompTitlePres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompTitlePres = false;
            System.out.println("Add Computer Title element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompHeadXPath));
            newCompHeadPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompHeadPres = false;
            System.out.println("Add Computer Head element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompNameXPath));
            newCompNamePres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompNamePres = false;
            System.out.println("Add Computer Computer Name element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompIntroXPath));
            newCompIntroPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompIntroPres = false;
            System.out.println("Add Computer Introduced element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompDiscoXPath));
            newCompDiscoPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompDiscoPres = false;
            System.out.println("Add Computer Discontinued element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompReqXPath));
            newCompReqPress = true;

        }
        catch (NoSuchElementException e)
        {
            newCompReqPress = false;
            System.out.println("Add Computer Required element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompCompXPath));
            newCompCompPress = true;

        }
        catch (NoSuchElementException e)
        {
            newCompCompPress = false;
            System.out.println("Add Computer Company element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompIntroDateXPath));
            newCompIntroDatePres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompIntroDatePres = false;
            System.out.println("Add Computer Introduced date format element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompDiscDateXPath));
            newCompDiscoDatePres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompDiscoDatePres = false;
            System.out.println("Add Computer Discontinued date format element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompBlankSelectXPath));
            newCompBlankSelectPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompBlankSelectPres = false;
            System.out.println("Add Computer Blank Selection element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompSubmitXPath));
            newCompSubmitPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompSubmitPres = false;
            System.out.println("Add Computer Submit element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompOrXPath));
            newCompOrPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompOrPres = false;
            System.out.println("Add Computer or element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompCancelXPath));
            newCompCancelPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompCancelPres = false;
            System.out.println("Add Computer Cancel element not found");
        }

        if(
                newCompTitlePres == true &
                        newCompHeadPres == true &
                        newCompNamePres == true &
                        newCompIntroPres == true &
                        newCompDiscoPres == true &
                        newCompReqPress == true &
                        newCompCompPress == true &
                        newCompIntroDatePres == true &
                        newCompDiscoDatePres == true &
                        newCompBlankSelectPres == true &
                        newCompSubmitPres == true &
                        newCompOrPres == true &
                        newCompCancelPres == true

        ) {
            newCompTitleCopy = computerListPage.driver.findElement(By.xpath(newCompTitleXPath));
            newCompHeadCopy = computerListPage.driver.findElement(By.xpath(newCompHeadXPath));
            newCompnamelblCopy = computerListPage.driver.findElement(By.xpath(newCompNameXPath));
            newCompIntrolblCopy = computerListPage.driver.findElement(By.xpath(newCompIntroXPath));
            newCompDiscolblCopy = computerListPage.driver.findElement(By.xpath(newCompDiscoXPath));
            newCompRecCopy = computerListPage.driver.findElement(By.xpath(newCompReqXPath));
            newCompComplblCopy = computerListPage.driver.findElement(By.xpath(newCompCompXPath));
            newCompIntroDateCopy = computerListPage.driver.findElement(By.xpath(newCompIntroDateXPath));
            newCompDiscDateCopy = computerListPage.driver.findElement(By.xpath(newCompDiscDateXPath));
            newCompBlankSelectCopy = computerListPage.driver.findElement(By.xpath(newCompBlankSelectXPath));
            newCompSubmit = computerListPage.driver.findElement(By.xpath(newCompSubmitXPath));
            newCompOrCopy = computerListPage.driver.findElement(By.xpath(newCompOrXPath));
            newCompCancel = computerListPage.driver.findElement(By.xpath(newCompCancelXPath));


            if (newCompTitleCopy.getText().equals("Play sample application — Computer database")) {

            } else {
                copyCrt = false;
                System.out.println("Title copy is not correct");
            }

            if (newCompHeadCopy.getText().equals("Add a computer")) {

            } else {
                copyCrt = false;
                System.out.println("Head copy is not correct");
            }

            if (newCompnamelblCopy.getText().equals("Computer name")) {

            } else {
                copyCrt = false;
                System.out.println("Computer name copy is not correct");
            }

            if (newCompIntrolblCopy.getText().equals("Introduced date")) {

            } else {
                copyCrt = false;
                System.out.println("Introduced date copy is not correct");
            }

            if (newCompDiscolblCopy.getText().equals("Discontinued date")) {

            } else {
                copyCrt = false;
                System.out.println("Discontinued date copy is not correct");
            }

            if (newCompRecCopy.getText().equals("Required")) {

            } else {
                copyCrt = false;
                System.out.println("Required copy is not correct");
            }

            if (newCompIntroDateCopy.getText().equals("Date ('yyyy-MM-dd')")) {

            } else {
                copyCrt = false;
                System.out.println("Required Date on Introduced copy is not correct");
            }

            if (newCompDiscDateCopy.getText().equals("Date ('yyyy-MM-dd')")) {

            } else {
                copyCrt = false;
                System.out.println("Required Date on Discontinued copy is not correct");
            }
            if (newCompSubmit.getAttribute("value").equals("Create this computer")) {

            } else {
                copyCrt = false;
                System.out.println("Create new computer button copy is not correct");
            }
            if (newCompOrCopy.getText().substring(0, 3).equals("or ")) {

            } else {
                copyCrt = false;
                System.out.println("or copy is not correct");
            }
            if (newCompCancel.getText().equals("Cancel")) {

            } else {
                copyCrt = false;
                System.out.println("Cancel button copy is not correct");
            }

            if (newCompBlankSelectCopy.getText().equals("-- Choose a company --")) {

            } else {
                copyCrt = false;
                System.out.println("Select blank copy is not correct");
            }

            if (copyCrt == true) {
                System.out.println("All Copy on Add a Computer List Page is correct");
            } else {
                System.out.println("Copy on Computer List Page is not correct");
            }
        }
        else
        {
            System.out.println("One or more element not found cannot perform Add Computer Copy Test");
        }
    }

    public static void addNewCompCancelTest () throws InterruptedException {
        try{
            computerListPage.driver.findElement(By.xpath(newCompCancelXPath));
            newCompCancelPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompCancelPres = false;
            System.out.println("Add Computer Cancel element not found");
        }
        if
        (
          newCompCancelPres == true
        )
        {
            newCompCancel = computerListPage.driver.findElement(By.xpath(newCompCancelXPath));
            Thread.sleep(1000);
            newCompCancel.click();
            System.out.println("Cancel Button works");
        }
        else
        {
            System.out.println("Add Computer Cancel element not found");
        }
    }

    public static void addNewCompCheckValidation () throws InterruptedException
    {
        copyCrt = true;

        try{
            computerListPage.driver.findElement(By.xpath(newCompSubmitXPath));
            newCompSubmitPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompSubmitPres = false;
            System.out.println("Add Computer  Submit element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompIntroInpXPath));
            newCompIntroInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompIntroInpPres = false;
            System.out.println("Add Computer Introduced input element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompDiscInpXPath));
            newCompDiscoInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompDiscoInpPres = false;
            System.out.println("Add Computer  Discontinued input element not found");
        }

        if
        (
                newCompSubmitPres == true &
                        newCompIntroInpPres == true &
                        newCompDiscoInpPres == true

        )
        {

            newCompSubmit = computerListPage.driver.findElement(By.xpath(newCompSubmitXPath));
            newCompIntroInp = computerListPage.driver.findElement(By.xpath(newCompIntroInpXPath));
            newCompDiscoInp = computerListPage.driver.findElement(By.xpath(newCompDiscInpXPath));

            Thread.sleep(1000);
            newCompIntroInp.sendKeys("asfasd");
            Thread.sleep(1000);
            newCompDiscoInp.sendKeys("asdasda");
            Thread.sleep(1000);
            newCompSubmit.click();

            try {
                computerListPage.driver.findElement(By.xpath(newCompNameErrXPath));
                newCompNameErrPres = true;

            } catch (NoSuchElementException e) {
                newCompNameErrPres = false;
                System.out.println("Add Computer Computer Name Error element not found");
            }
            try {
                computerListPage.driver.findElement(By.xpath(newCompIntroErrXPath));
                newCompIntroErrPres = true;

            } catch (NoSuchElementException e) {
                newCompIntroErrPres = false;
                System.out.println("Add Computer Introduced Error element not found");
            }
            try {
                computerListPage.driver.findElement(By.xpath(newCompDiscoErrXPath));
                newCompDiscoErrPres = true;

            } catch (NoSuchElementException e) {
                newCompDiscoErrPres = false;
                System.out.println("Add Computer Discontinued Error element not found");
            }

            if
            (
                    newCompNameErrPres == true &
                            newCompIntroErrPres == true &
                            newCompDiscoErrPres == true

            ) {

                newCompNameErr = computerListPage.driver.findElement(By.xpath(newCompNameErrXPath));
                newCompIntroErr = computerListPage.driver.findElement(By.xpath(newCompIntroErrXPath));
                newCompDiscoErr = computerListPage.driver.findElement(By.xpath(newCompDiscoErrXPath));

                if (newCompNameErr.getAttribute("class").equals("clearfix error")) {

                } else {
                    copyCrt = false;
                    System.out.println("Name validation doesn't work");
                }

                if (newCompIntroErr.getAttribute("class").equals("clearfix error")) {

                } else {
                    copyCrt = false;
                    System.out.println("Introduced validation doesn't work");
                }

                if (newCompDiscoErr.getAttribute("class").equals("clearfix error")) {

                } else {
                    copyCrt = false;
                    System.out.println("Discontinued validation doesn't work");
                }

                if (copyCrt == true) {
                    System.out.println("All Validation in add computer works");
                } else {
                    System.out.println("One or more validation in add computer doesn't work");
                }
            } else {
                System.out.println("One or more element not found cannot perform Add Computer Validation Test");
            }
        }
        else
        {
            System.out.println("One or more element not found cannot perform Add Computer Validation Test");
        }

    }

    public static void addNewCompTest (String compName) throws InterruptedException
    {
        try{
            computerListPage.driver.findElement(By.xpath(newCompNameInpXPath));
            newCompNameInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompNameInpPres = false;
            System.out.println("Add Computer  Name input element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompIntroInpXPath));
            newCompIntroInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompIntroInpPres = false;
            System.out.println("Add Computer Introduced input element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompDiscInpXPath));
            newCompDiscoInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompDiscoInpPres = false;
            System.out.println("Add Computer Discontinued input element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompSelectXPath));
            newCompSelectPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompSelectPres = false;
            System.out.println("Add Computer Select element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(newCompSubmitXPath));
            newCompSubmitPres = true;

        }
        catch (NoSuchElementException e)
        {
            newCompSubmitPres = false;
            System.out.println("Add Computer Submit element not found");
        }

        if (
                newCompNameInpPres == true &
                        newCompIntroInpPres == true &
                        newCompDiscoInpPres == true &
                        newCompSelectPres == true &
                        newCompSubmitPres == true


        ) {
            newCompNameInp = computerListPage.driver.findElement(By.xpath(newCompNameInpXPath));
            newCompIntroInp = computerListPage.driver.findElement(By.xpath(newCompIntroInpXPath));
            newCompDiscoInp = computerListPage.driver.findElement(By.xpath(newCompDiscInpXPath));
            newCompSelect = computerListPage.driver.findElement(By.xpath(newCompSelectXPath));
            newCompSubmit = computerListPage.driver.findElement(By.xpath(newCompSubmitXPath));

            Thread.sleep(1000);
            newCompNameInp.sendKeys(compName);
            Thread.sleep(1000);
            newCompIntroInp.sendKeys("2021-01-03");
            Thread.sleep(1000);
            newCompDiscoInp.sendKeys("2021-12-10");
            Thread.sleep(1000);
            newCompCompDD = new Select(newCompSelect);
            newCompCompDD.selectByValue("6");
            Thread.sleep(1000);
            newCompSubmit.click();
        }
        else
        {
            System.out.println("One or more element not found cannot perform Add Computer Test");
        }
    }

}
