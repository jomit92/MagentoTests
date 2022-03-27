package tests;

import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class CorrectSignInTest extends BaseTest{

    @Test

    public void signInTest(){
        LoginMethods signIn=  new LoginMethods(driver);
        VerificationPage verification= new VerificationPage(driver);
        PropertyManager pm= new PropertyManager();

        signIn.correctSigIn(pm.getProperty("email"), pm.getProperty("password"));

        try {
            verification.verifyCorrectSignIn("Welcome, Veronica Costello!");
            System.out.println("successful");
        }
        catch (Exception e){
            Assert.fail("not successful");
        }
    }

}
