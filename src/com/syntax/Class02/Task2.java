package com.syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        /** HW2
         * navigate to fb.com
         * click on create new account
         * fill up all the textboxes
         * click on sign up button
         * close the pop up
         * close the browser
         */
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Justin");
        driver.findElement(By.name("lastname")).sendKeys("Beber");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email__")).sendKeys("justinb@yahoo.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("12454$KAs");
        Thread.sleep(3000);
        driver.findElement(By.name("birthday_month")).sendKeys("Augest");
        driver.findElement(By.name("birthday_day")).sendKeys("5");
        driver.findElement(By.name("birthday_year")).sendKeys("1991");
        Thread.sleep(3000);
        driver.findElement(By.name("sex")).click();
       // driver.findElement(By.name("sex")).sendKeys("Female");
        //driver.findElement(By.className("_58mt")).sendKeys("custom");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);
    }
}
