package methods;

import org.openqa.selenium.WebDriver;
import pages.LogoutPage;

public class LogoutMethod extends LogoutPage {
    public LogoutMethod(WebDriver driver) {
        super(driver);
    }
    public void logoutMethod(String mail,String pass){
        clickSignInButton();
        enterEmail(mail);
        enterPassword(pass);
        clickSignIn();
        clickActionButton();
        clickSignOutButton();
    }
}
