package com.syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.crypto.Data;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
//        HW1
//        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
//        fill out the form
//        click on register
//        close the browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.name("customer.firstName")).sendKeys("Abdul");
        driver.findElement(By.name("customer.lastName")).sendKeys("Momand");
        driver.findElement(By.id("customer.address.street")).sendKeys("8950 N Lamar Blvd");
        driver.findElement(By.name("customer.address.city")).sendKeys("Austin");
        driver.findElement(By.name("customer.address.state")).sendKeys("Texas");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("78758");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("512-785-4554");
        driver.findElement(By.id("customer.ssn")).sendKeys("454-66-8950");
        driver.findElement(By.id("customer.username")).sendKeys("abdul.momand123");
        driver.findElement(By.id("customer.password")).sendKeys("abdul@5654");
        driver.findElement(By.id("repeatedPassword")).sendKeys("abdul@5654");
        Thread.sleep(5000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(5000);

    }
}
