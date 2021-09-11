package test;
import pages.*;


public class signUpTest {

    public static void AmazonSignUpPageTest() throws InterruptedException
    {
        amazonSignUpPage.openAmazonSignUppage();
        amazonSignUpPage.failSignUp();
        amazonSignUpPage.openAmazonSignUppage();
        amazonSignUpPage.signUp();
    }
}
