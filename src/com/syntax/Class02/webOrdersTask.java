package com.syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrdersTask {
    public static void main(String[] args) {
        /**
         * Task
         * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
         * Login
         * Get title and verify
         * logout
         * close the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("login")).sendKeys("samad@addd.com");
        driver.findElement(By.id("password")).sendKeys("abdul1223");
        driver.findElement(By.className("button")).click();

        String title=driver.getTitle();
        String expectedTitle= "web Orders";
        if (title.equals(expectedTitle)){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is not correct");
        }
    driver.findElement(By.linkText("logout")).click();
        driver.quit();

    }
}
