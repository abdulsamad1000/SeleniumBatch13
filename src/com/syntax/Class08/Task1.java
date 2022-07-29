package com.syntax.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
    /** Tak1
     * go to https://the-internet.herokuapp.com/dynamic_controls
     * click on checkbox and click on remove
     * verify the text
     * click on enable verify the textbox is enabled
     * enter text and click disable
     * verify the textbox is disabled
     */
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement selectCheckBox =driver.findElement(By.xpath("//input[@type='checkbox']"));
        selectCheckBox.click();
        WebElement removeButton= driver.findElement(By.xpath("//button[text()='Remove']"));
        removeButton.click();

        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Remove']")));

        WebElement text =driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(text.getText());
        Thread.sleep(3000);
        WebElement enableButton =driver.findElement(By.xpath("//*[text()='Enable']"));
        enableButton.click();






    }
}
