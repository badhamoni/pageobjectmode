package com.qa.testcases;

import com.qa.pages.HomePage;
import com.qa.testbase.TestBase;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    @Test
    public void performSearchTest() {
        HomePage homePage = new HomePage();
        homePage.searchForBook();
    }

}
