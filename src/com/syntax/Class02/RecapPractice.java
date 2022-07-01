package com.syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.xml.crypto.Data;

public class RecapPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.fb.com");
        driver.findElement(By.id("email")).sendKeys("Syntax@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("syntax@1234");
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);
       // driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();
    }
}
