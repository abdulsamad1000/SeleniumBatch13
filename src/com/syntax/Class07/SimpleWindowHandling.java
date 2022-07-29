package com.syntax.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {
    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandel= driver.getWindowHandle(); //get window handle for the main page
        System.out.println(mainPageHandel);
        WebElement helpLink =driver.findElement(By.linkText("Help"));
        helpLink.click();
        Set<String> allWindowsHandles= driver.getWindowHandles(); // store all the handles inside the set
        System.out.println(allWindowsHandles.size());
        Iterator<String> it =allWindowsHandles.iterator(); // have an iteratro in order to iterate through th handles
        mainPageHandel =it.next(); // take first step and assign the main page handle
        String childHandle = it.next(); // take the second step and have a child handle
        System.out.println(childHandle);
        Thread.sleep(3000);
        driver.switchTo().window(childHandle);
        driver.close();
        driver.switchTo().window(mainPageHandel);
        helpLink.click();
        driver.quit();
    }
}
