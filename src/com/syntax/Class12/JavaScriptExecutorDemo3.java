package com.syntax.Class12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class JavaScriptExecutorDemo3 {
    public static String url = "http://www.google.com";

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
        // Opens a tab with specific url
        javascriptExecutor.executeScript("window.open('http://www.amazon.com')");
        // window.open() opens a blank tab

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("Hello Tech World");

    }
}
