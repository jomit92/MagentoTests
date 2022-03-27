package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    By signIn = By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[1]/div/ul/li[2]/a");
    By emailField= By.id("email");
    By passwordField= By.id("pass");
    By signInButton=By.id("send2");
    By searchField= By.id("search");


    public void clickSignInButton(){click(signIn);}
    public void enterEmail(String mail){
        writeText(emailField, mail);
    }
    public void enterPassword(String pass){
        writeText(passwordField,pass);
    }
    public void clickSignIn(){
        click(signInButton);
    }
    public void writeSearchField(String text){writeText(searchField,text);}


    public void searchPressEnter() {
        waitForElementToAppear(searchField);
        this.driver.findElement(searchField).sendKeys(Keys.ENTER);
    }
}
