package tests;

import methods.LogoutMethod;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LogoutTest extends BaseTest{

    @Test
    public void logoutTest(){
        LogoutMethod logout= new LogoutMethod(driver);
        VerificationPage verification = new VerificationPage(driver);
        PropertyManager pm = new PropertyManager();

        logout.logoutMethod(pm.getProperty("email"),pm.getProperty("password"));

        try {
            verification.verifyLogout("Dobro došli!");
            System.out.println("successful");
        }
        catch (Exception e){
            Assert.fail("not successful");
        }
    }
}
