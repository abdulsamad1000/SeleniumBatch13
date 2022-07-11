package com.syntax.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) {
        /**
         * HRMS Application Negative Login:
         * Open chrome browser
         * Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
         * Enter valid username
         * Leave password field empty
         * Click on login button
         * Verify error message with text "Password cannot be empty" is displayed.
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName =driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("Admin");
        WebElement Login =driver.findElement(By.cssSelector("input#btnLogin"));
        Login.click();
        WebElement messageError=driver.findElement(By.xpath("//span[text()='Password']"));
        String actualmessageError= messageError.getText();
        if(actualmessageError.equals(messageError)){
            System.out.println("The password can not be Empty");
        }else {
            System.out.println("Error message should be displayed");
        }
    }
}
