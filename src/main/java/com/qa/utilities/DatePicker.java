package com.qa.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {

  /*  public void selectCalendarDate(String expectedDateString, WebDriver driver, WebElement calendarElement){
        calendarElement.click();
        Boolean flag = true;
        while(flag){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            WebElement element = driver.findElement(By.className("monthTitle"));
            JavascriptExecutor executor = ((JavascriptExecutor) driver);
            executor.executeScript("document.get")
            driver.findElement(By.className("monthTitle")).click();
            String actual_year_month = element.getText();
            String expected_year_month = expectedDateString.split(",")[0];
            String expected_day = expectedDateString.split(",")[1].trim();
            if(!(actual_year_month).equals(expected_year_month.toLowerCase())){
                driver.findElement(By.xpath("//td[@class='next']|(//li[@id='rb-next-middle'])[2]")).click();
            } else {
                driver.findElement(By.xpath("//td[contains(@class,'day') and not(@class='empty day') and text()='"+expected_day+"']")).click();
                flag=false;
            }
        }
    }*/

}
