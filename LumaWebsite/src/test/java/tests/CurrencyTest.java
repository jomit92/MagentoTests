package tests;


import methods.CurrencyMethod;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;

public class CurrencyTest extends BaseTest {
    @Test

    public void currencyTest(){
        CurrencyMethod currencyTest= new CurrencyMethod(driver);
        VerificationPage verification = new VerificationPage(driver);

        currencyTest.currencyMethod();
        try {
            verification.verifyCurrency("€16.96");
            System.out.println("successful");
        }
        catch (Exception e){
            Assert.fail("not successful");
        }
    }
}
