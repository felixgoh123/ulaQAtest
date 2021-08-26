package test;

import pages.*;

public class deleteTest {

    public static void deleteTestPositive() throws InterruptedException {
        updateComputerPage.delCompTest();
        computerListPage.checkDeleteNotif();
    }

}
