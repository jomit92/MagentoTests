package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage{
    public LogoutPage(WebDriver driver) {
        super(driver);
    }
    By signInButtonRight = By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[1]/div/ul/li[2]/a");
    By emailField= By.id("email");
    By passwordField= By.id("pass");
    By signInButton=By.id("send2");
    By action= By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[1]/div/ul/li[2]/span/button");
    By signOutButton= By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a");

    public void clickSignInButton(){click(signInButtonRight);}
    public void enterEmail(String mail){
        writeText(emailField, mail);
    }
    public void enterPassword(String pass){
        writeText(passwordField,pass);
    }
    public void clickSignIn(){
        click(signInButton);
    }
    public void clickActionButton() {click(action);}
    public void clickSignOutButton(){click(signOutButton);}



}
