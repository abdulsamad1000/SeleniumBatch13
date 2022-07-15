package com.syntax.Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelAlerts {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement simpleAlertButton=driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(3000);
        Alert SimpleAlert=driver.switchTo().alert();
        SimpleAlert.accept();

        WebElement confrimAlertButton=driver.findElement(By.id("confirm"));
        confrimAlertButton.click();
        Thread.sleep(3000);

        Alert confirmAlert =driver.switchTo().alert();
        String confirmAlertText= confirmAlert.getText();
        System.out.println(confirmAlertText);
        confirmAlert.dismiss();
        WebElement promptAlertButton=driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Thread.sleep(3000);
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Dont replace my chromdriverr");
        promptAlert.accept();
    }
}
