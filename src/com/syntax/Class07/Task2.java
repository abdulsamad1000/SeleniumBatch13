package com.syntax.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task2 {
    /**Task2
     * navigate to http://www.uitestpractice.com/Students/Contact
     * click on the link
     * get text
     * print out in the console
     */
    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement LinkButtonHandle =driver.findElement(By.xpath("//a[text()='This is a Ajax link']"));
        LinkButtonHandle.click();
        String getAllText =driver.findElement(By.xpath("//div[@class='ContactUs']")).getText();
        System.out.println(getAllText);

    }
}
