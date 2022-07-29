package com.syntax.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTask {
    /**
     * Task
     * Navigage to: http://syntaxprojects.com/dynamic-elements-loading.php
     * click on start button
     * get the next
     * print out in console
     */
    public static String url = "http://syntaxprojects.com/dynamic-elements-loading.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement startButton =driver.findElement(By.xpath("//button[@id='startButton']"));
        startButton.click();

        // We Create an object of webdriver waite
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));

        WebElement Welcomemessage=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println(Welcomemessage.getText());

    }
}
