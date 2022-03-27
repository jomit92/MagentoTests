package tests;

import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class IncorrectSignInTest extends BaseTest{

    @Test
    public void incorrectSignIn(){
        LoginMethods signIn= new LoginMethods(driver);
        VerificationPage verification = new VerificationPage(driver);
        PropertyManager pm= new PropertyManager();

        signIn.incorrectSignIn(pm.getProperty("email2"), pm.getProperty("password2"));

        try {
            verification.verifyIncorrectSignIn("The account sign-in was incorrect or your account " +
                    "is disabled temporarily. Please wait and try again later.");
            System.out.println("successful");
        }
        catch (Exception e){
            Assert.fail("not successful");
        }
    }

}
