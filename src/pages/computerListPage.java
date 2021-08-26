package pages;

import chromeDriver.chromeOpen;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class computerListPage extends chromeOpen
{
    public static WebElement computerListTitleCopy = null;
    public static WebElement resultCopy = null;
    public static WebElement addBtn = null;
    public static WebElement computerSearchInput = null;
    public static WebElement computerSearchSubmit = null;
    public static WebElement comNameHeader = null;
    public static WebElement introHeader = null;
    public static WebElement discHeader = null;
    public static WebElement compHeader = null;
    public static WebElement prevPagi = null;
    public static WebElement currPagi = null;
    public static WebElement nextPagi = null;
    public static WebElement createDone = null;
    public static WebElement searchResult = null;
    public static WebElement emptyResult = null;
    public static WebElement emptyState = null;


    public static String titleXPath = "//h1[@class=\"fill\"]";
    public static String addButtonXPath = "//div[@id=\"actions\"]//a[@id=\"add\"]";
    public static String resultXPath = "//section[@id=\"main\"]";
//    public static String testXPath = "//table//tbody//a[text()=\"TestQA123789\"]";
    public static String searchBoxXPath = "//div[@id=\"actions\"]//input[@id=\"searchbox\"]";
    public static String searchBtnXPath = "//div[@id=\"actions\"]//input[@id=\"searchsubmit\"]";
    public static String comNameHeaderXPath = "//table//thead//th[1]";
    public static String introHeaderXPath = "//table//thead//tr//th[2]";
    public static String discHeaderXPath = "//table//thead//tr//th[3]";
    public static String compHeaderXPath = "//table//thead//tr//th[4]";
    public static String prevPagiXPath = "//body//section//div[@id=\"pagination\"]//li[1]";
    public static String currPagiXPath = "//body//section//div[@id=\"pagination\"]//li[2]";
    public static String nextPagiXPath = "//body//section//div[@id=\"pagination\"]//li[3]";
    public static String createDoneXPath = "//body//div[@class=\"alert-message warning\"]";
    public static String emptyResultXPath = "//body//section//h1";
    public static String emptyStateXPath = "//body//section//div[@class=\"well\"]";


    public static boolean copyCrt = true;
    public static boolean titlePres = true;
    public static boolean addPres = true;
    public static boolean resultPres = true;
    public static boolean testPres = true;
    public static boolean searchBoxPres = true;
    public static boolean searchBtnPres = true;
    public static boolean comNameHeadPres = true;
    public static boolean introHeadPres = true;
    public static boolean discHeadPres = true;
    public static boolean compHeadPres = true;
    public static boolean prevPagiPres = true;
    public static boolean currPagiPres = true;
    public static boolean nextPagiPres = true;
    public static boolean createDonePres = true;
    public static boolean emptyResultPres = true;
    public static boolean emptyStatePres = true;




    public static void computerListCopyTest () throws InterruptedException
    {
        copyCrt = true;

        openBrowser();

        try{
            driver.findElement(By.xpath(titleXPath));
            titlePres = true;

        }
        catch (NoSuchElementException e)
        {
            titlePres = false;
            System.out.println("Title element not found");
        }
        try{
            driver.findElement(By.xpath(resultXPath));
            resultPres = true;

        }
        catch (NoSuchElementException e)
        {
            resultPres = false;
            System.out.println("Result element not found");
        }
        try{
            driver.findElement(By.xpath(addButtonXPath));
            addPres = true;

        }
        catch (NoSuchElementException e)
        {
            addPres = false;
            System.out.println("Add Computer Button element not found");
        }
        try{
            driver.findElement(By.xpath(searchBoxXPath));
            searchBoxPres = true;

        }
        catch (NoSuchElementException e)
        {
            searchBoxPres = false;
            System.out.println("Search Box element not found");
        }
        try{
            driver.findElement(By.xpath(searchBtnXPath));
            searchBtnPres = true;

        }
        catch (NoSuchElementException e)
        {
            searchBtnPres = false;
            System.out.println("Search Button element not found");
        }
        try{
            driver.findElement(By.xpath(comNameHeaderXPath));
            comNameHeadPres = true;

        }
        catch (NoSuchElementException e)
        {
            comNameHeadPres = false;
            System.out.println("Computer name Table Header element not found");
        }
        try{
            driver.findElement(By.xpath(introHeaderXPath));
            introHeadPres = true;

        }
        catch (NoSuchElementException e)
        {
            introHeadPres = false;
            System.out.println("Intro Table Header element not found");
        }
        try{
            driver.findElement(By.xpath(discHeaderXPath));
            discHeadPres = true;

        }
        catch (NoSuchElementException e)
        {
            discHeadPres = false;
            System.out.println("Discontinue Table Header element not found");
        }
        try{
            driver.findElement(By.xpath(compHeaderXPath));
            compHeadPres = true;

        }
        catch (NoSuchElementException e)
        {
            compHeadPres = false;
            System.out.println("Company Table Header element not found");
        }
        try{
            driver.findElement(By.xpath(prevPagiXPath));
            prevPagiPres = true;

        }
        catch (NoSuchElementException e)
        {
            prevPagiPres = false;
            System.out.println("Previous Pagination element not found");
        }
        try{
            driver.findElement(By.xpath(currPagiXPath));
            currPagiPres = true;

        }
        catch (NoSuchElementException e)
        {
            currPagiPres = false;
            System.out.println("Current Pagination element not found");
        }
        try{
            driver.findElement(By.xpath(nextPagiXPath));
            nextPagiPres = true;

        }
        catch (NoSuchElementException e)
        {
            nextPagiPres = false;
            System.out.println("Next Pagination element not found");
        }

        if (
                titlePres == true &
                        resultPres == true &
                        addPres == true &
                        searchBoxPres == true &
                        searchBtnPres == true &
                        comNameHeadPres == true &
                        introHeadPres == true &
                        discHeadPres == true &
                        compHeadPres == true &
                        prevPagiPres == true &
                        currPagiPres == true &
                        nextPagiPres == true

        ) {

            computerListTitleCopy = driver.findElement(By.xpath(titleXPath));
            resultCopy = driver.findElement(By.xpath(resultXPath));
            addBtn = driver.findElement(By.xpath(addButtonXPath));
            computerSearchInput = driver.findElement(By.xpath(searchBoxXPath));
            computerSearchSubmit = driver.findElement(By.xpath(searchBtnXPath));
            comNameHeader = driver.findElement(By.xpath(comNameHeaderXPath));
            introHeader = driver.findElement(By.xpath(introHeaderXPath));
            discHeader = driver.findElement(By.xpath(discHeaderXPath));
            compHeader = driver.findElement(By.xpath(compHeaderXPath));
            prevPagi = driver.findElement(By.xpath(prevPagiXPath));
            currPagi = driver.findElement(By.xpath(currPagiXPath));
            nextPagi = driver.findElement(By.xpath(nextPagiXPath));

            if (computerListTitleCopy.getText().equals("Play sample application — Computer database")) {


            } else {
                System.out.println(computerListTitleCopy.getText());
                System.out.println("Title copy is not correct");

            }

            if (resultCopy.getText().contains("computers found")) {

            } else {
                copyCrt = false;
                System.out.println("Result copy is not correct");
            }


            if (addBtn.getText().equals("Add a new computer")) {

            } else {
                copyCrt = false;
                System.out.println("Add new computer button copy is not correct");
            }

            if (computerSearchInput.getAttribute("placeholder").equals("Filter by computer name...")) {

            } else {
                copyCrt = false;
                System.out.println("Search computer placeholder copy is not correct");
            }

            if (computerSearchSubmit.getAttribute("value").equals("Filter by name")) {

            } else {
                copyCrt = false;
                System.out.println("Filter by computer button copy is not correct");
            }

            if (comNameHeader.getText().equals("Computer name")) {

            } else {
                copyCrt = false;
                System.out.println("Computer name header copy is not correct");
            }

            if (introHeader.getText().equals("Introduced")) {

            } else {
                copyCrt = false;
                System.out.println("Introduced header copy is not correct");
            }

            if (discHeader.getText().equals("Discontinued")) {

            } else {
                copyCrt = false;
                System.out.println("Discontinued header copy is not correct");
            }

            if (compHeader.getText().equals("Company")) {

            } else {
                copyCrt = false;
                System.out.println("Company header copy is not correct");
            }

            if (prevPagi.getText().equals("← Previous")) {

            } else {
                copyCrt = false;
                System.out.println("Prev Pagination copy is not correct");
            }

            if (currPagi.getText().contains("Displaying")) {

            } else {
                copyCrt = false;
                System.out.println("Current Pagination copy is not correct");
            }

            if (nextPagi.getText().equals("Next →")) {

            } else {
                copyCrt = false;
                System.out.println("Next Pagination copy is not correct");
            }


            if (copyCrt == true) {
                System.out.println("All Copy on Computer List Page is correct");
            } else {
                System.out.println("Copy on Computer List Page is not correct");
            }
        }
        else
        {
            System.out.println("One or more element not found cannot perform Computer List Copy Test");
        }




    }


    public static void searchTest (String keyboard) throws InterruptedException
    {
        try{
            driver.findElement(By.xpath(searchBoxXPath));
            searchBoxPres = true;

        }
        catch (NoSuchElementException e)
        {
            searchBoxPres = false;
            System.out.println("Search Box element not found");
        }
        try{
            driver.findElement(By.xpath(searchBtnXPath));
            searchBtnPres = true;

        }
        catch (NoSuchElementException e)
        {
            searchBtnPres = false;
            System.out.println("Search Button element not found");
        }

        if
        (
                searchBoxPres == true &
                        searchBtnPres == true
        )
        {
            computerSearchInput = driver.findElement(By.id("searchbox"));
            computerSearchSubmit = driver.findElement(By.id("searchsubmit"));

            Thread.sleep(1000);
            computerSearchInput.click();
            Thread.sleep(1000);
            computerSearchInput.clear();
            Thread.sleep(1000);
            computerSearchInput.sendKeys(keyboard);
            Thread.sleep(1000);
            computerSearchSubmit.click();

            searchResult = driver.findElement(By.xpath("//table//tbody//a[text()=\""+keyboard+"\"]"));
            if (searchResult.getText().equals(keyboard))
            {
                System.out.println("Search Result shown correctly");
            }
            else
            {
                System.out.println("Search result not shown correctly");
            }
        }
        else
        {
            System.out.println("One or more element not found cannot perform Search Computer Test");
        }



    }

    public static void searchEmptyTest (String keyboard) throws InterruptedException
    {
        copyCrt = true;
        try{
            driver.findElement(By.xpath(searchBoxXPath));
            searchBoxPres = true;

        }
        catch (NoSuchElementException e)
        {
            searchBoxPres = false;
            System.out.println("Search Box element not found");
        }
        try{
            driver.findElement(By.xpath(searchBtnXPath));
            searchBtnPres = true;

        }
        catch (NoSuchElementException e)
        {
            searchBtnPres = false;
            System.out.println("Search Button element not found");
        }

        if
        (
                searchBoxPres == true &
                        searchBtnPres == true
        )
        {
            computerSearchInput = driver.findElement(By.id("searchbox"));
            computerSearchSubmit = driver.findElement(By.id("searchsubmit"));

            Thread.sleep(1000);
            computerSearchInput.click();
            Thread.sleep(1000);
            computerSearchInput.sendKeys(keyboard);
            Thread.sleep(1000);
            computerSearchSubmit.click();

            try
            {
                driver.findElement(By.xpath(emptyResultXPath));
                emptyResultPres = true;

            }
            catch (NoSuchElementException e)
            {
                emptyResultPres = false;
                System.out.println("Empty Result element not found");
            }

            try
            {
                driver.findElement(By.xpath(emptyStateXPath));
                emptyStatePres = true;

            }
            catch (NoSuchElementException e)
            {
                emptyStatePres = false;
                System.out.println("Empty State element not found");
            }
            if
            (
                emptyResultPres == true &
                emptyStatePres == true
            )
            {
                emptyResult = driver.findElement(By.xpath(emptyResultXPath));
                emptyState = driver.findElement(By.xpath(emptyStateXPath));

                if (emptyResult.getText().equals("No computers found"))
                {

                }
                else
                {
                    copyCrt = false;
                    System.out.println("Empty Search result not shown correctly");
                }
                if (emptyState.getText().equals("Nothing to display"))
                {

                }
                else
                {
                    copyCrt = false;
                    System.out.println("Empty state result not shown correctly");
                }


                if (copyCrt == true) {
                    System.out.println("Empty computer result shown correctly");
                } else {
                    System.out.println("Empty computer result not shown correctly");
                }

            }
            else
            {
                System.out.println("One or more element not found cannot perform Empty Search Computer Test");
            }

        }
        else
        {
            System.out.println("One or more element not found cannot perform Empty Search Computer Test");
        }



    }

    public static void openEditPageTest (String keyboard) throws InterruptedException
    {
        try{
            driver.findElement(By.xpath("//table//tbody//a[text()=\""+keyboard+"\"]"));
            testPres = true;

        }
        catch (NoSuchElementException e)
        {
            testPres = false;
            System.out.println("Search Result element not found");
        }
        if
        (
                testPres == true
        )
        {
            searchResult = driver.findElement(By.xpath("//table//tbody//a[text()=\""+keyboard+"\"]"));
            if (searchResult.getText().equals(keyboard))
            {
                Thread.sleep(1000);
                searchResult.click();
            }
            else
            {
                System.out.println("Search Result element not found");
            }

        }
        else
        {
            System.out.println("Search Result element not found cannot perform open Edit Page Test");
        }
    }

    public static void addButtonTest () throws InterruptedException
    {
        try{
            driver.findElement(By.xpath(addButtonXPath));
            addPres = true;

        }
        catch (NoSuchElementException e)
        {
            addPres = false;
            System.out.println("Add Button element not found");
        }

        if (addPres == true)
        {

            Thread.sleep(1000);
            addBtn = driver.findElement(By.xpath(addButtonXPath));

            addBtn.click();
            System.out.println("Add new computer Button works");
        }
        else
        {

        }
    }

    public static void checkCreateNotif (String comName)
    {


        try{
            driver.findElement(By.xpath(createDoneXPath));
            createDonePres = true;

        }
        catch (NoSuchElementException e)
        {
            createDonePres = false;
            System.out.println("Add new computer notification element not found");
        }
        if
        (
                createDonePres == true

        )
        {
            createDone = driver.findElement(By.xpath(createDoneXPath));

            if(createDone.getText().equals("Done! Computer "+comName+" has been created"))
            {
                System.out.println("Add new computer notification is correct");
            }
            else
            {
                copyCrt = false;
                System.out.println("Add new computer notification is not correct");
            }




        }
        else
        {
            System.out.println("One or more element not found cannot perform Check Create notification Test ");
        }
    }

    public static void checkUpdateNotif (String comName)
    {


        try{
            driver.findElement(By.xpath(createDoneXPath));
            createDonePres = true;

        }
        catch (NoSuchElementException e)
        {
            createDonePres = false;
            System.out.println("Edit computer notification element not found");
        }
        if
        (
                createDonePres == true

        )
        {
            createDone = driver.findElement(By.xpath(createDoneXPath));

            if(createDone.getText().equals("Done! Computer "+comName+" has been updated"))
            {
                System.out.println("Edit computer notification is correct");
            }
            else
            {
                copyCrt = false;
                System.out.println("Edit computer notification is not correct");
            }




        }
        else
        {
            System.out.println("One or more element not found cannot perform Check Edit notification Test ");
        }
    }

    public static void checkDeleteNotif ()
    {


        try{
            driver.findElement(By.xpath(createDoneXPath));
            createDonePres = true;

        }
        catch (NoSuchElementException e)
        {
            createDonePres = false;
            System.out.println("Delete computer notification element not found");
        }
        if
        (
                createDonePres == true

        )
        {
            createDone = driver.findElement(By.xpath(createDoneXPath));

            if(createDone.getText().equals("Done! Computer has been deleted"))
            {
                System.out.println("Delete computer notification is correct");
            }
            else
            {
                copyCrt = false;
                System.out.println("Delete computer notification is not correct");
            }




        }
        else
        {
            System.out.println("One or more element not found cannot perform Check Delete notification Test ");
        }
    }


}
