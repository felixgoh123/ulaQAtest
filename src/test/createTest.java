package test;
import pages.*;

public class createTest
{

    public static void createTestPositive(String compName) throws InterruptedException {
        addComputerPage.addNewCompCheckValidation();
        addComputerPage.addNewCompCancelTest();
        computerListPage.addButtonTest();
        addComputerPage.addNewCompTest(compName);
        computerListPage.checkCreateNotif(compName);

    }

}
