package methods;

import org.openqa.selenium.WebDriver;
import pages.SearchPage;

public class SearchMethods extends SearchPage {
    public SearchMethods(WebDriver driver) {
        super(driver);
    }
    public void searchMethod(String mail, String pass,String jacket){
        clickSignInButton();
        enterEmail(mail);
        enterPassword(pass);
        clickSignIn();
        writeSearchField(jacket);
        searchPressEnter();
    }
}
