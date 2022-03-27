package tests;

import methods.SearchMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class SearchTest extends BaseTest {

    @Test
    public void searchTest(){
        SearchMethods search= new SearchMethods(driver);
        VerificationPage verification= new VerificationPage(driver);
        PropertyManager pm= new PropertyManager();

        search.searchMethod(pm.getProperty("email"),pm.getProperty("password"), pm.getProperty("searchText") );

        try {
            verification.verifySearchField("Search results for: 'jacket'");
            System.out.println("successful");
        }
        catch (Exception e){
            Assert.fail("not successful");
        }
    }

}
