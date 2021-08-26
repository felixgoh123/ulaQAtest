package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class updateComputerPage
{
    public static WebElement updCompTitleCopy = null;
    public static WebElement updCompHeadCopy = null;
    public static WebElement updCompnamelblCopy = null;
    public static WebElement updCompIntrolblCopy = null;
    public static WebElement updCompDiscolblCopy = null;
    public static WebElement updCompComplblCopy = null;
    public static WebElement updCompRecCopy = null;
    public static WebElement updCompIntroDateCopy = null;
    public static WebElement updCompDiscDateCopy = null;
    public static WebElement updCompBlankSelectCopy = null;
    public static WebElement updCompSelect = null;
    public static WebElement updCompSubmit = null;
    public static WebElement updCompCancel = null;
    public static WebElement updCompOrCopy = null;
    public static WebElement updCompDel = null;
    public static WebElement updCompNameInp = null;
    public static WebElement updCompIntroInp = null;
    public static WebElement updCompDiscoInp = null;
    public static WebElement updCompNameErr = null;
    public static WebElement updCompIntroErr = null;
    public static WebElement updCompDiscoErr = null;

    public static String updCompTitleXPath = "//h1[@class=\"fill\"]";
    public static String updCompHeadXPath = "//body//section//h1";
    public static String updCompNameXPath = "//body//section//form//label[@for=\"name\"]";
    public static String updCompIntroXPath = "//body//section//form//label[@for=\"introduced\"]";
    public static String updCompDiscoXPath = "//body//section//form//label[@for=\"discontinued\"]";
    public static String updCompCompXPath = "//body//section//form//label[@for=\"company\"]";
    public static String updCompReqXPath = "//body//section//form//div//span[text()=\"Required\"]";
    public static String updCompIntroDateXPath ="//body/section/form//div[2]//span[1]";
    public static String updCompDiscDateXPath ="//body/section/form//div[3]//span[1]";
    public static String updCompBlankSelectXPath = "//body//section//form//div[@class=\"input\"]//select[@id=\"company\"]//option[@class=\"blank\"]";
    public static String updCompSelectXPath = "//body//section//form//select[@id=\"company\"]";
    public static String updCompSubmitXPath = "//body//section//form//div[@class=\"actions\"]//input[@type=\"submit\"]";
    public static String updCompOrXPath = "//body//section//form//div[@class=\"actions\"]";
    public static String updCompCancelXPath = "//body//section//form//div[@class=\"actions\"]//a[@class=\"btn\"]";
    public static String updCompDelXPath = "//body//form[@method=\"POST\" and @class=\"topRight\"]//input[@type=\"submit\"]";
    public static String updCompNameInpXPath = "//body//form//div[@class=\"input\"]//input[@id=\"name\"]";
    public static String updCompIntroInpXPath = "//body//form//div[@class=\"input\"]//input[@id=\"introduced\"]";
    public static String updCompDiscInpXPath = "//body//form//div[@class=\"input\"]//input[@id=\"discontinued\"]";
    public static String updCompNameErrXPath = "//body//form//fieldset//div[1]";
    public static String updCompIntroErrXPath = "//body//form//fieldset//div[2]";
    public static String updCompDiscoErrXPath = "//body//form//fieldset//div[3]";

    public static Select updCompCompDD = null;


    public static boolean copyCrt = true;
    public static boolean updCompTitlePres = true;
    public static boolean updCompHeadPres = true;
    public static boolean updCompNamePres = true;
    public static boolean updCompIntroPres = true;
    public static boolean updCompDiscoPres = true;
    public static boolean updCompCompPress = true;
    public static boolean updCompReqPress = true;
    public static boolean updCompIntroDatePres = true;
    public static boolean updCompDiscoDatePres = true;
    public static boolean updCompBlankSelectPres = true;
    public static boolean updCompSelectPres = true;
    public static boolean updCompSubmitPres = true;
    public static boolean updCompOrPres = true;
    public static boolean updCompCancelPres = true;
    public static boolean updCompDelPres = true;
    public static boolean updCompNameInpPres = true;
    public static boolean updCompIntroInpPres = true;
    public static boolean updCompDiscoInpPres = true;
    public static boolean updCompNameErrPres = true;
    public static boolean updCompIntroErrPres = true;
    public static boolean updCompDiscoErrPres = true;

    public static void updCompCopyTest ()
    {
        try{
            computerListPage.driver.findElement(By.xpath(updCompTitleXPath));
            updCompTitlePres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompTitlePres = false;
            System.out.println("Edit Computer Title element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompHeadXPath));
            updCompHeadPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompHeadPres = false;
            System.out.println("Edit Computer Head element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompNameXPath));
            updCompNamePres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompNamePres = false;
            System.out.println("Edit Computer Computer Name element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompIntroXPath));
            updCompIntroPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompIntroPres = false;
            System.out.println("Edit Computer Introduced element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompDiscoXPath));
            updCompDiscoPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompDiscoPres = false;
            System.out.println("Edit Computer Discontinued element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompReqXPath));
            updCompReqPress = true;

        }
        catch (NoSuchElementException e)
        {
            updCompReqPress = false;
            System.out.println("Edit Computer Required element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompCompXPath));
            updCompCompPress = true;

        }
        catch (NoSuchElementException e)
        {
            updCompCompPress = false;
            System.out.println("Edit Computer Company element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompIntroDateXPath));
            updCompIntroDatePres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompIntroDatePres = false;
            System.out.println("Edit Computer Introduced date format element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompDiscDateXPath));
            updCompDiscoDatePres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompDiscoDatePres = false;
            System.out.println("Edit Computer Discontinued date format element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompBlankSelectXPath));
            updCompBlankSelectPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompBlankSelectPres = false;
            System.out.println("Edit Computer Blank Selection element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompSubmitXPath));
            updCompSubmitPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompSubmitPres = false;
            System.out.println("Edit Computer Submit element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompOrXPath));
            updCompOrPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompOrPres = false;
            System.out.println("Edit Computer or element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompCancelXPath));
            updCompCancelPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompCancelPres = false;
            System.out.println("Edit Computer Cancel element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompDelXPath));
            updCompDelPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompDelPres = false;
            System.out.println("Edit Computer Delete element not found");
        }

        if
        (
                updCompTitlePres == true &
                        updCompHeadPres == true &
                        updCompNamePres == true &
                        updCompIntroPres == true &
                        updCompDiscoPres == true &
                        updCompReqPress == true &
                        updCompCompPress == true &
                        updCompIntroDatePres == true &
                        updCompDiscoDatePres == true &
                        updCompBlankSelectPres == true &
                        updCompSubmitPres == true &
                        updCompOrPres == true &
                        updCompCancelPres == true &
                        updCompDelPres == true

        ) {

            updCompTitleCopy = computerListPage.driver.findElement(By.xpath(updCompTitleXPath));
            updCompHeadCopy = computerListPage.driver.findElement(By.xpath(updCompHeadXPath));
            updCompnamelblCopy = computerListPage.driver.findElement(By.xpath(updCompNameXPath));
            updCompIntrolblCopy = computerListPage.driver.findElement(By.xpath(updCompIntroXPath));
            updCompDiscolblCopy = computerListPage.driver.findElement(By.xpath(updCompDiscoXPath));
            updCompRecCopy = computerListPage.driver.findElement(By.xpath(updCompReqXPath));
            updCompComplblCopy = computerListPage.driver.findElement(By.xpath(updCompCompXPath));
            updCompIntroDateCopy = computerListPage.driver.findElement(By.xpath(updCompIntroDateXPath));
            updCompDiscDateCopy = computerListPage.driver.findElement(By.xpath(updCompDiscDateXPath));
            updCompBlankSelectCopy = computerListPage.driver.findElement(By.xpath(updCompBlankSelectXPath));
            updCompSubmit = computerListPage.driver.findElement(By.xpath(updCompSubmitXPath));
            updCompOrCopy = computerListPage.driver.findElement(By.xpath(updCompOrXPath));
            updCompCancel = computerListPage.driver.findElement(By.xpath(updCompCancelXPath));
            updCompDel = computerListPage.driver.findElement(By.xpath(updCompDelXPath));


            if (updCompTitleCopy.getText().equals("Play sample application — Computer database")) {

            } else {
                copyCrt = false;
                System.out.println("Title copy is not correct");
            }

            if (updCompHeadCopy.getText().equals("Edit computer")) {

            } else {
                copyCrt = false;
                System.out.println("Head copy is not correct");
            }

            if (updCompnamelblCopy.getText().equals("Computer name")) {

            } else {
                copyCrt = false;
                System.out.println("Computer name copy is not correct");
            }

            if (updCompIntrolblCopy.getText().equals("Introduced date")) {

            } else {
                copyCrt = false;
                System.out.println("Introduced date copy is not correct");
            }

            if (updCompDiscolblCopy.getText().equals("Discontinued date")) {

            } else {
                copyCrt = false;
                System.out.println("Discontinued date copy is not correct");
            }

            if (updCompRecCopy.getText().equals("Required")) {

            } else {
                copyCrt = false;
                System.out.println("Required copy is not correct");
            }

            if (updCompIntroDateCopy.getText().equals("Date ('yyyy-MM-dd')")) {

            } else {
                copyCrt = false;
                System.out.println("Required Date on Introduced copy is not correct");
            }

            if (updCompDiscDateCopy.getText().equals("Date ('yyyy-MM-dd')")) {

            } else {
                copyCrt = false;
                System.out.println("Required Date on Discontinued copy is not correct");
            }
            if (updCompSubmit.getAttribute("value").equals("Save this computer")) {

            } else {
                copyCrt = false;
                System.out.println("Save this computer button copy is not correct");
            }
            if (updCompOrCopy.getText().substring(0, 3).equals("or ")) {

            } else {
                copyCrt = false;
                System.out.println("or copy is not correct");
            }
            if (updCompCancel.getText().equals("Cancel")) {

            } else {
                copyCrt = false;
                System.out.println("Cancel button copy is not correct");
            }
            if (updCompDel.getAttribute("value").equals("Delete this computer")) {

            } else {
                copyCrt = false;
                System.out.println("Delete this computer button copy is not correct");
            }


            if (copyCrt == true) {
                System.out.println("All Copy on Edit a Computer List Page is correct");
            } else {
                System.out.println("Copy on Computer List Page is not correct");
            }
        }
        else
        {

        }
    }

    public static void updCompCancelTest () throws InterruptedException {
        try{
            computerListPage.driver.findElement(By.xpath(updCompCancelXPath));
            updCompCancelPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompCancelPres = false;
            System.out.println("Edit Computer Cancel element not found");
        }
        if
        (
                updCompCancelPres == true
        )
        {
            updCompCancel = computerListPage.driver.findElement(By.xpath(updCompCancelXPath));
            Thread.sleep(1000);
            updCompCancel.click();
            System.out.println("Cancel Button works");
        }
        else
        {
            System.out.println("Edit Computer Cancel element not found cannot cancel on updating computer ");
        }
    }

    public static void updCompCheckValidation () throws InterruptedException
    {
        copyCrt = true;

        try{
            computerListPage.driver.findElement(By.xpath(updCompSubmitXPath));
            updCompSubmitPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompSubmitPres = false;
            System.out.println("Edit Computer Submit element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompIntroInpXPath));
            updCompIntroInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompIntroInpPres = false;
            System.out.println("Edit Computer Introduced input element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompDiscInpXPath));
            updCompDiscoInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompDiscoInpPres = false;
            System.out.println("Edit Computer Discontinued input element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompNameInpXPath));
            updCompNameInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompNameInpPres = false;
            System.out.println("Edit Computer Name input element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompSelectXPath));
            updCompSelectPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompSelectPres = false;
            System.out.println("Edit Computer Select element not found");
        }

        if
        (
                updCompSubmitPres == true &
                        updCompIntroInpPres == true &
                        updCompDiscoInpPres == true &
                        updCompNameInpPres == true &
                        updCompSelectPres == true

        )
        {

            updCompSubmit = computerListPage.driver.findElement(By.xpath(updCompSubmitXPath));
            updCompIntroInp = computerListPage.driver.findElement(By.xpath(updCompIntroInpXPath));
            updCompDiscoInp = computerListPage.driver.findElement(By.xpath(updCompDiscInpXPath));
            updCompNameInp = computerListPage.driver.findElement(By.xpath(updCompNameInpXPath));
            updCompSelect = computerListPage.driver.findElement(By.xpath(updCompSelectXPath));

            Thread.sleep(1000);
            updCompNameInp.clear();
            updCompNameInp.sendKeys("");
            Thread.sleep(1000);
            updCompIntroInp.clear();
            updCompIntroInp.sendKeys("asfasd");
            Thread.sleep(1000);
            updCompDiscoInp.clear();
            updCompDiscoInp.sendKeys("asdasda");
            Thread.sleep(1000);
            updCompCompDD = new Select(updCompSelect);
            updCompCompDD.selectByVisibleText("-- Choose a company --");
            Thread.sleep(1000);
            updCompSubmit.click();

            try {
                computerListPage.driver.findElement(By.xpath(updCompNameErrXPath));
                updCompNameErrPres = true;

            } catch (NoSuchElementException e) {
                updCompNameErrPres = false;
                System.out.println("Edit Computer  Name Error element not found");
            }
            try {
                computerListPage.driver.findElement(By.xpath(updCompIntroErrXPath));
                updCompIntroErrPres = true;

            } catch (NoSuchElementException e) {
                updCompIntroErrPres = false;
                System.out.println("Edit Computer Introduced Error element not found");
            }
            try {
                computerListPage.driver.findElement(By.xpath(updCompDiscoErrXPath));
                updCompDiscoErrPres = true;

            } catch (NoSuchElementException e) {
                updCompDiscoErrPres = false;
                System.out.println("Edit Computer Discontinued Error element not found");
            }

            if
            (
                    updCompNameErrPres == true &
                            updCompIntroErrPres == true &
                            updCompDiscoErrPres == true

            ) {

                updCompNameErr = computerListPage.driver.findElement(By.xpath(updCompNameErrXPath));
                updCompIntroErr = computerListPage.driver.findElement(By.xpath(updCompIntroErrXPath));
                updCompDiscoErr = computerListPage.driver.findElement(By.xpath(updCompDiscoErrXPath));


                if (updCompNameErr.getAttribute("class").equals("clearfix error")) {

                } else {
                    copyCrt = false;
                    System.out.println("Name validation doesn't work");
                }

                if (updCompIntroErr.getAttribute("class").equals("clearfix error")) {

                } else {
                    copyCrt = false;
                    System.out.println("Introduced validation doesn't work");
                }

                if (updCompDiscoErr.getAttribute("class").equals("clearfix error")) {

                } else {
                    copyCrt = false;
                    System.out.println("Discontinued validation doesn't work");
                }

                if (copyCrt == true) {
                    System.out.println("All Validation in Edit computer works");
                } else {
                    System.out.println("One or more validation in Edit computer doesn't work");
                }
            } else {
                System.out.println("One or more element not found cannot perform Edit Computer Validation Test");
            }
        }
        else
        {
            System.out.println("One or more element not found cannot perform Edit Computer Validation Test");
        }

    }

    public static void updCompTest (String uCompName) throws InterruptedException
    {
        try{
            computerListPage.driver.findElement(By.xpath(updCompNameInpXPath));
            updCompNameInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompNameInpPres = false;
            System.out.println("Edit Computer  Name input element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompIntroInpXPath));
            updCompIntroInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompIntroInpPres = false;
            System.out.println("Edit Computer Introduced input element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompDiscInpXPath));
            updCompDiscoInpPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompDiscoInpPres = false;
            System.out.println("Edit Computer Discontinued input element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompSelectXPath));
            updCompSelectPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompSelectPres = false;
            System.out.println("Edit Computer Select element not found");
        }
        try{
            computerListPage.driver.findElement(By.xpath(updCompSubmitXPath));
            updCompSubmitPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompSubmitPres = false;
            System.out.println("Edit Computer Submit element not found");
        }

        if (
                updCompNameInpPres == true &
                        updCompIntroInpPres == true &
                        updCompDiscoInpPres == true &
                        updCompSelectPres == true &
                        updCompSubmitPres == true


        ) {
            updCompNameInp = computerListPage.driver.findElement(By.xpath(updCompNameInpXPath));
            updCompIntroInp = computerListPage.driver.findElement(By.xpath(updCompIntroInpXPath));
            updCompDiscoInp = computerListPage.driver.findElement(By.xpath(updCompDiscInpXPath));
            updCompSelect = computerListPage.driver.findElement(By.xpath(updCompSelectXPath));
            updCompSubmit = computerListPage.driver.findElement(By.xpath(updCompSubmitXPath));

            Thread.sleep(1000);
            updCompNameInp.clear();
            updCompNameInp.sendKeys(uCompName);
            Thread.sleep(1000);
            updCompIntroInp.clear();
            updCompIntroInp.sendKeys("2020-02-04");
            Thread.sleep(1000);
            updCompDiscoInp.clear();
            updCompDiscoInp.sendKeys("2022-11-21");
            Thread.sleep(1000);
            updCompCompDD = new Select(updCompSelect);
            updCompCompDD.selectByValue("10");
            Thread.sleep(1000);
            updCompSubmit.click();
        }
        else
        {
            System.out.println("One or more element not found cannot perform Edit Computer Test");
        }
    }

    public static void delCompTest () throws InterruptedException {

        try{
            computerListPage.driver.findElement(By.xpath(updCompDelXPath));
            updCompDelPres = true;

        }
        catch (NoSuchElementException e)
        {
            updCompDelPres = false;
            System.out.println("Edit Computer Delete element not found");
        }
        if (
                updCompDelPres == true
        )
        {
            updCompDel = computerListPage.driver.findElement(By.xpath(updCompDelXPath));
            Thread.sleep(1000);
            updCompDel.click();
            System.out.println("Delete Button Works");
        }
        else
        {
            System.out.println("Edit Computer Delete element not found cannot perform Delete Test");
        }
    }

}

