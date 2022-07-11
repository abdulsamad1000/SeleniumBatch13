package com.syntax.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * HW1
         * Open chrome browser
         * Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
         * Enter valid username and password (username - Admin, password - Hum@nhrm123)
         * Click on login button
         * Then verify Syntax Logo is displayed.
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.cssSelector("input[type*='password']"));
        password.sendKeys("Hum@nhrm123");
        WebElement Login =driver.findElement(By.xpath("//input[@value='LOGIN']"));
        Login.click();
        WebElement syntaxLogo=driver.findElement(By.cssSelector("img[alt $=RM]"));
        boolean syntaxLogoDisplayed=syntaxLogo.isDisplayed();
        if(syntaxLogoDisplayed){
            System.out.println("The log is Displayed");
        }else {
            System.out.println("The log is not Displayed");
        }

    }
}
