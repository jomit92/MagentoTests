package methods;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginMethods extends LoginPage {
    public LoginMethods(WebDriver driver) {
        super(driver);
    }
    public void emptyEmailField(String pass){
        clickSignInButton();
        enterPassword(pass);
        clickSignIn();
    }
    public void emptyPasswordField(String mail){
        clickSignInButton();
        enterEmail(mail);
        clickSignIn();
    }
    public void correctSigIn(String mail,String pass){
        clickSignInButton();
        enterEmail(mail);
        enterPassword(pass);
        clickSignIn();
    }
    public void incorrectSignIn(String email, String password){
        clickSignInButton();
        enterEmail(email);
        enterPassword(password);
        clickSignIn();
    }
}
