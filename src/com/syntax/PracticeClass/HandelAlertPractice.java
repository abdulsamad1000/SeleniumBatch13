package com.syntax.PracticeClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelAlertPractice {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement simpleAlertButton =driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(3000);
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();
        WebElement confirmAlertButton =driver.findElement(By.id("confirm"));
        Thread.sleep(3000);
        Alert confirmAlert =driver.switchTo().alert();
        String confirmAlertButtonText=confirmAlertButton.getText();
        System.out.println(confirmAlertButtonText);
        confirmAlert.dismiss();
        WebElement promptAlertButton =driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Thread.sleep(3000);
        Alert promptAlert =driver.switchTo().alert();
        promptAlert.sendKeys("do not replace my chromedriver");

    }
}
