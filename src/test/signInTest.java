package test;
import pages.*;

public class signInTest {

    public static void AmazonSignInPageTest() throws InterruptedException {
        amazonSignInPage.openAmazonSignInpage();
        amazonSignInPage.failedSignIn("cobacumi11@gmail.com","Test_1235");
        amazonSignInPage.openAmazonSignInpage();
        amazonSignInPage.signIn("cobacumi11@gmail.com","Test_1234");

    }
}
