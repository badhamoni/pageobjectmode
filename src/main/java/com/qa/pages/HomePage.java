package com.qa.pages;

//this class consists of webelements and page actions of Home page


import com.qa.actionwords.CustomActions;
import org.openqa.selenium.By;

public class HomePage extends CustomActions {
    private By searchBox = By.id("twotabsearchtextbox");
    private By searchBtn = By.id("nav-search-submit-button");
    private By signInIcon = By.xpath("//span[text()='Hello, sign in']");

    public By getsearchBox() {
        return searchBox;
    }

    public By getsearchBtn() {
        return searchBtn;
    }

    public By getSignInIcon() {
        return signInIcon;
    }

    public void searchForBook(){
        enterText(getsearchBox(), "Books");
        click((getsearchBtn()));
    }

    public LoginPage clickOnSignIn(){
        click(getSignInIcon());
        return new LoginPage();
    }
}
