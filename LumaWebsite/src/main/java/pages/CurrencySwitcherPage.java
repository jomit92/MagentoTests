package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CurrencySwitcherPage extends BasePage{
    public CurrencySwitcherPage(WebDriver driver) {
        super(driver);}
    By backpackButton = By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/strong/a");
    By currencyButton= By.id("switcher-currency-trigger");
    By vallute= By.xpath("//*[@id=\"switcher-currency\"]/div/ul/li/a");

    public void clickBackpack(){
        click(backpackButton);
    }
    public void clickCurrencyButton(){
        click(currencyButton);
    }
    public void clickVallute(){
        click(vallute);
    }
}
