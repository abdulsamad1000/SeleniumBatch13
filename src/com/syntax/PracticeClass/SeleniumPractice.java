package com.syntax.PracticeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("Sysntax");
        driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("synta78459");
        driver.findElement(By.xpath("//button[text()='Log In']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
        Thread.sleep(3000);
        WebElement forgotpassword=driver.findElement(By.xpath("//div[text()='Thanks for stopping by!']"));
        forgotpassword.click();
    }
}
