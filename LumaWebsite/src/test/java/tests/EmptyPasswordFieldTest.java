package tests;

import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

import java.util.Properties;

public class EmptyPasswordFieldTest extends BaseTest{

    @Test
    public void emptyPasswordTest(){
        LoginMethods emptyPassword= new LoginMethods(driver);
        VerificationPage verification= new VerificationPage(driver);

        PropertyManager pm = new PropertyManager();
        emptyPassword.emptyPasswordField(pm.getProperty("email"));

        try {
            verification.verifyEmptyPassword("This is a required field.");
            System.out.println("Successful");
        }
        catch (Exception e){
            Assert.fail("not successful");

        }
    }


}
