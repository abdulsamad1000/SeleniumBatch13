package com.syntax.PracticeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWinddowHandlingPractic {
    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle =driver.getWindowHandle();
        System.out.println(mainPageHandle);
        WebElement helpButton =driver.findElement(By.xpath("//a[text()='Help']"));
        helpButton.click();
        Set<String> allWindowHandles =driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> iterator=allWindowHandles.iterator();
        mainPageHandle=iterator.next();
        String childHandle= iterator.next();
        System.out.println(childHandle);
        Thread.sleep(3000);
        driver.switchTo().window(childHandle);
        driver.close();
        driver.switchTo().window(mainPageHandle);
        helpButton.click();
        driver.quit();

        }
    }

