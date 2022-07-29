package com.syntax.ReviewClass03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsReview {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        // click on alert
        WebElement alert1 =driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        // handel the alert
        Alert alerttext=driver.switchTo().alert();
        Thread.sleep(3000);
        alerttext.accept();
    }
}
