package com.syntax.PracticeClass;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshotPractice {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username")); // gettin webelement in return
        username.sendKeys("Tester"); // performing action on the specific element
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        // NOTE: TakesScreenshot it is an interface
        // The Syntax of TakeScreenshot interface as below
        // TakeScreenshot takescreenshot = (TaskScreenshot)driver;


        // Note and Steps how to take a screenshot from your test script in selenium
        // firs we need to create the object of Screenshot interface
        // Question: can we create the Object of the interface?
        // Answer: we can not create the Object of the interface
        // NOTE: We can only create the Object of the class not interface
        // Note: Question: what is the main Object in web page which perform an action
        // Answer: the manin Object that perform an action in the webpage that is driver

        // downcasting to driver in order to intract with web page
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        // this line the screenshot is taken
         File srcFile =takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("ThisIsThePracticeDemo/adminPage.png"));
    }
}


