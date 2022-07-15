package com.syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Task2 {
    /**
     * Task2 Go to facebook sign up page
     * Fill out the whole form
     * Click signup
     */
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement CreateNewAcc =driver.findElement(By.xpath("//a[text()='Create new account']"));
        CreateNewAcc.click();
        Thread.sleep(2000);
        WebElement firstName =driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Abdulsamad");
        WebElement lastName =driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Momand");
        WebElement mobileNumber =driver.findElement(By.xpath("//input[@name='reg_email__']"));
        mobileNumber.sendKeys("512-518-8483");
        WebElement newPassword =driver.findElement(By.xpath("//input[@id='password_step_input']"));
        newPassword.sendKeys("Texas@1234");
        WebElement monthBirth =driver.findElement(By.xpath("//select[@id='month']"));
        Select select=new Select(monthBirth);
        List<WebElement> monthOption= select.getOptions();
        int monthSize =monthOption.size();
        System.out.println(monthSize);
        select.selectByVisibleText("Mar");

        WebElement dayBirth =driver.findElement(By.xpath("//select[@id='day']"));
        Select select1=new Select(dayBirth);
        List<WebElement> dayOption=select1.getOptions();
        int daySize =dayOption.size();
        System.out.println(daySize);
        select1.selectByValue("25");

        WebElement yearBirth =driver.findElement(By.xpath("//select[@id='year']"));
        Select select2=new Select(yearBirth);
        List<WebElement> yearOption= select2.getOptions();
        int yearSize =yearOption.size();
        System.out.println(yearSize);
        select2.selectByValue("1990");

        WebElement radioButton =driver.findElement(By.xpath("//label[text()='Male']"));
        radioButton.click();
        WebElement signUpButton =driver.findElement(By.xpath("//button[@name='websubmit']"));
        signUpButton.click();

    }
}
