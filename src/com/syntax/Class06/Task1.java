package com.syntax.Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    // * Task Navigate to https://syntaxprojects.com/bootstrap-iframe.php
     //* verify the header text Sorry, We Couldn't Find Anything For "Asksn" is displayed verify enroll today button is enabled
    public static String url="https://syntaxprojects.com/bootstrap-iframe.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame("Frame One");
        WebElement Displyed =driver.findElement(By.className("//h1[@class='heading-13']"));Displyed.isDisplayed();
        boolean IsDisplaying =Displyed.isDisplayed();
        System.out.println(" Soryy we could not find anything for asksn this text should be displayed "+IsDisplaying);
        driver.switchTo().defaultContent().switchTo().frame("Frame Two");
        WebElement  CheckEbalebutton =driver.findElement(By.xpath("//div[@class='text-block-2']"));
        CheckEbalebutton.isEnabled();
        boolean Check=CheckEbalebutton.isEnabled();
        System.out.println("check the enroll today is enabled "+Check);

        }
    }

