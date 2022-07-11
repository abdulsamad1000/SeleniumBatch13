package com.syntax.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw {
    /**
     * HW
     * Navigate to http://syntaxprojects.com
     * Click on start practicing
     * click on simple form demo
     * enter any text on first text box
     * click on show message
     * quit the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        WebElement startpractising=driver.findElement(By.xpath("//a[contains(text(),'Start Practising')]"));
        startpractising.click();
        Thread.sleep(3000);
       WebElement SimpleFormDemo= driver.findElement(By.xpath("//a[@class='list-group-item']"));
       SimpleFormDemo.click();
        Thread.sleep(3000);
       WebElement EnteranyTextBox= driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
       EnteranyTextBox.sendKeys("Hello Selenium");
       Thread.sleep(3000);
       WebElement ShowMessage=driver.findElement(By.xpath("//button[@onclick='showInput();']"));
       ShowMessage.click();
       Thread.sleep(3000);
       //driver.quit();

    }
}
