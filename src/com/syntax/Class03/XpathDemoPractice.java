package com.syntax.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

public class XpathDemoPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
       // driver.findElement(By.xpath("//input[@autofocus='1']")).sendKeys("Syntax");
       // driver.findElement(By.xpath("//input[contains(@data-testid,'royal')]")).sendKeys("Syntaxtechnology");
        //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Untiedstates");
       // driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        //driver.findElement(By.xpath("//div[contains(text(),'Thanks')]"));
        Thread.sleep(2000);
        String url= driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        String expectedtitle=("Facebook - log in or sign up");
        if (title.equals(expectedtitle)){
            System.out.println("the title is correct");
        }else {
            System.out.println("the title is not correct");
        }

    }
}
