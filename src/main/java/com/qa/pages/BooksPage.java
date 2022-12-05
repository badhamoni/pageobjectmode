package com.qa.pages;

//this class consists of webelements and page actions fo books page

import com.qa.actionwords.CustomActions;
public class BooksPage extends CustomActions {

    public String fetchTitle(){
        return getPageTitle();
    }
}
