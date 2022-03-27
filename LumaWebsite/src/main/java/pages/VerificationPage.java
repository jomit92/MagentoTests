package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class VerificationPage extends BasePage {
    public VerificationPage(WebDriver driver) {
        super(driver);
    }
    public void verifyEmptyEmail(String expectedText){
        By emptyMail= By.id("email-error");

        String emptyMailField= readText(emptyMail);
        Assert.assertEquals(emptyMailField,expectedText);
    }

    public void verifyEmptyPassword(String expectedText){
        By emptyPassword=By.id("pass-error");

        String emptyPasswordField= readText(emptyPassword);
        Assert.assertEquals(emptyPasswordField,expectedText);
    }
    public void verifyCorrectSignIn(String expectedText){
        By welcome= By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[1]/div/ul/li[1]/span");

        String correctSigIn=readText(welcome);
        Assert.assertEquals(correctSigIn,expectedText);
    }
    public void verifyIncorrectSignIn(String expectedText){
        By error= By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div");

        String errorSigIn= readText(error);
        Assert.assertEquals(errorSigIn,expectedText);
    }
    public void verifyLogout(String expectedText){
        By signIn= By.className("not-logged-in");

        String text= readText(signIn);
        Assert.assertEquals( text,expectedText);
    }
    public void verifySearchField(String expectedText){
        By jacket= By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span");

        String text= readText(jacket);
        Assert.assertEquals(text,expectedText);
    }
    public void verifyCurrency(String expectedText){
        By euro= By.className("price");

        String text= readText(euro);
        Assert.assertEquals(text, expectedText);
    }
}

