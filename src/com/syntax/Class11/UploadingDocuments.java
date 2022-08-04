package com.syntax.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingDocuments {
    public static String url = "https://the-internet.herokuapp.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement fileuploadingButton = driver.findElement(By.linkText("File Upload"));
        fileuploadingButton.click();
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        // if file name or folder name contains space, try to have them as separate strings and concatenate
        chooseFile.sendKeys("C:\\Users\\samad\\OneDrive\\Pictures\\Screenshots\\000.png");
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();
    }
}
