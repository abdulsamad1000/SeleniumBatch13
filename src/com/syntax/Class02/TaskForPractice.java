package com.syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskForPractice {
    public static void main(String[] args) {
        /**
         * task
         * navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
         * login
         * Get title and verify
         * logout
         * close the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("username")).sendKeys("Tester");
        driver.findElement(By.id("password")).sendKeys("test");
        driver.findElement(By.linkText("login")).click();
        String title=driver.getTitle();
        String expectedTitle="Web Orders Login";
        if(title.equals(expectedTitle)){
            System.out.println("The title is correct");
        }else {
            System.out.println("The title is Not correct");
        }
        driver.quit();

    }
}
