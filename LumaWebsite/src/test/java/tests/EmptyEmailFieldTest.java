package tests;

import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class EmptyEmailFieldTest extends BaseTest {
    @Test

    public void emptyEmailTest(){
        LoginMethods emptyEmail= new LoginMethods(driver);
        VerificationPage verification= new VerificationPage(driver);

        PropertyManager pm= new PropertyManager();
        emptyEmail.emptyEmailField(pm.getProperty("password"));

        try {
            verification.verifyEmptyEmail("This is a required field.");
            System.out.println("successful");
        }
        catch (Exception e){
            Assert.fail("not successful");
        }
    }

}
