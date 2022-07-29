package com.syntax.ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDownsReview {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        Thread.sleep(2000);
        // select the birth day from the dropdown on the webpage
        WebElement dayDD =driver.findElement(By.xpath("//select[@id='day']"));
        // select class to deal with droopdown
        Select select=new Select(dayDD);
        List<WebElement> availableDays =select.getOptions();
        int size = availableDays.size();
//        for(WebElement day:availableDays){
//            System.out.println(day.getText());
//        }
// select all options one by one by a different of tow seconds
//        for(int i=0; i<size; i++){
//            System.out.println(availableDays.get(i).getText());
//            select.selectByIndex(i);
//            Thread.sleep(2000);
//        }
        // select by index
        select.selectByIndex(2);

        // select by value teh date 24
        select.selectByValue("24");

        Thread.sleep(2000);
        // Select the option 7 by visible text
        select.selectByVisibleText("7");
        Thread.sleep(2000);

    }
}
