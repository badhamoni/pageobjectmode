package com.qa.testcases;

import com.qa.pages.BooksPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

   @Test
    public void performLogin() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.searchForBook();
        LoginPage loginPage = homePage.clickOnSignIn();
        Thread.sleep(2000);
        BooksPage booksPage = loginPage.performLogin(prop.getProperty("username"), prop.getProperty("password"));
        String actualTitle = booksPage.fetchTitle();
        Assert.assertEquals(actualTitle, "Amazon.in : Books", "Not as expected, the page title is not matching with the actual");
    }
}
