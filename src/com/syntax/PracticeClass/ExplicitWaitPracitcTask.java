package com.syntax.PracticeClass;

import javafx.beans.property.SetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPracitcTask {
    /**
     * Task
     * Navigage to: http://syntaxprojects.com/dynamic-elements-loading.php
     * click on start button
     * get the next
     * print out in console
     */
   // public static String url="http://syntaxprojects.com/dynamic-elements-loading.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-elements-loading.php");

        WebElement startButton =driver.findElement(By.xpath("//*[@id='startButton']"));
        startButton.click();
        // We Create an object of webdriver waite
        WebDriverWait wait= new WebDriverWait(driver,20);
        // this line we will wait until that elements visible for as
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Welcome Syntax Technologies']")));

        WebElement welcomMessage =driver.findElement(By.xpath("//*[text()='Welcome Syntax Technologies']"));
        System.out.println(welcomMessage.getText());

    }
}
