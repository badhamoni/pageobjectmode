package com.qa.pages;

//this class consists of webelements and page actions of Login page


import com.qa.actionwords.CustomActions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static com.qa.testbase.TestBase.driver;

public class LoginPage extends CustomActions {

    private By emailField = By.id("ap_email");
    By continueButton = By.id("continue");
    By passwordField = By.id("ap_password");
    By signInBtn = By.id("signInSubmit");
    public By getEmailField() {
        return emailField;
    }
    public By getContinueButton() {
        return continueButton;
    }

    public By getPasswordField() {
        return passwordField;
    }

    public By getSignInBtn() {
        return signInBtn;
    }

    public BooksPage performLogin(String username, String password){
        enterText(getEmailField(), username);
        click(getContinueButton());
        enterText(getPasswordField(), password);
        click(getSignInBtn());
        return new BooksPage();
    }

}
