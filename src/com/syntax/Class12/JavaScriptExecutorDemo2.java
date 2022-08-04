package com.syntax.Class12;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class JavaScriptExecutorDemo2 {
    public static String url = "http://www.amazon.com";

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(3000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,500)");
        javascriptExecutor.executeScript("window.scrollBy(0,-500)");
        WebElement backToTopButton = driver.findElement(By.className("navFooterBackToTopText"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",backToTopButton);
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        File srcFile =takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("screenshots/Amazon/webPage.png"));
    }
}
