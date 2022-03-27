package methods;

import org.openqa.selenium.WebDriver;
import pages.CurrencySwitcherPage;

public class CurrencyMethod extends CurrencySwitcherPage {
    public CurrencyMethod(WebDriver driver) {
        super(driver);
    }
    public void currencyMethod(){
        clickBackpack();
        clickCurrencyButton();
        clickVallute();
    }
}
