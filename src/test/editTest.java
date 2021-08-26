package test;


import pages.*;

public class editTest
{

    public static void openEditPagePositive (String compName) throws InterruptedException {
        computerListPage.searchTest(compName);
        computerListPage.openEditPageTest(compName);
    }

    public static void editPageValidationTest () throws InterruptedException {
        updateComputerPage.updCompCheckValidation();
        updateComputerPage.updCompCancelTest();
    }

    public static void editComputerPositive (String uCompName) throws  InterruptedException {
        updateComputerPage.updCompTest(uCompName);
        computerListPage.checkUpdateNotif(uCompName);
    }

    public static void checkEmptyResult (String randomName) throws InterruptedException {
        computerListPage.searchEmptyTest(randomName);
    }
}

