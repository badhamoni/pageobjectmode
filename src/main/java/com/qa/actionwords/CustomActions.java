package com.qa.actionwords;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import static com.qa.testbase.TestBase.driver;

public class CustomActions {
    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void click(WebElement element){
        element.click();
    }
    public void enterText(By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }
    public String getPageTitle(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.getTitle();
    }

    public void SelectText(By locator, String value){
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(value);
    }

    public String getValue(By locator){
        return driver.findElement(locator).getText();
    }

    public void acceptAlert(){
        Alert al = driver.switchTo().alert();
        al.accept();
    }

    public void dismissAlert(){
        Alert al = driver.switchTo().alert();
        al.dismiss();
    }

    public String fetchTextFromAlert(){
        Alert al = driver.switchTo().alert();
        return al.getText();
    }
}
