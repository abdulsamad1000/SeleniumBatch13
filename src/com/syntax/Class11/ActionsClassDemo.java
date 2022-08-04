package com.syntax.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

    public static String url = "http://www.amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement accounAndLists = driver.findElement(By.id("nav-link-accountList"));
        // create actions class object
        Actions actions = new Actions(driver);
        // perform necessary action from actions class
        actions.moveToElement(accounAndLists).perform();


    }
}
