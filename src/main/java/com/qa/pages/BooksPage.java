package com.qa.pages;

import com.qa.actionwords.CustomActions;
public class BooksPage extends CustomActions {

    public String fetchTitle(){
        return getPageTitle();
    }
}
