package e2eTest;
import test.*;

public class endToEndTest
{
    public static void main(String[] args) throws InterruptedException {
//        computerListPage.searchTest("test");
        copyTest.computerListAndAddComputerCopyTest();
        createTest.createTestPositive("TestQA123789");
        editTest.openEditPagePositive("TestQA123789");
        copyTest.updateComputerCopyTest();
        editTest.editPageValidationTest();
        editTest.openEditPagePositive("TestQA123789");
        editTest.editComputerPositive("987321AQtseT");
        editTest.openEditPagePositive("987321AQtseT");
        deleteTest.deleteTestPositive();



    }
}
