package com.syntax.PracticeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodP {
    // Note: this is all our Automation Test Scripts
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close();
        // drive.close(); it will close Tab == tab mean like google page amazon page or broswers
        driver.quit();
        // driver.quit(); this method close all the Tab == which mean if we have more browsers open the we can use .quit(); method



    }
}
