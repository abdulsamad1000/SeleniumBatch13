package com.syntax.PracticeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingDocumentsDemo1 {
    public static String url = "https://the-internet.herokuapp.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement fileUploading = driver.findElement(By.xpath("//a[text()='File Upload']"));
        fileUploading.click();
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\samad\\OneDrive\\Pictures\\Screenshots\\LL.png");
        WebElement UploadingButton = driver.findElement(By.id("file-submit"));
        UploadingButton.click();




    }
}
