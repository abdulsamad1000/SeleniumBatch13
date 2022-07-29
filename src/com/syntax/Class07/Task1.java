package com.syntax.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task1 {
    /**
     * Task1
     * Go to https://demoqa.com/browser-windows
     * click on New Tab and print the text from new tab in the console
     * click on New Window and print the text from new window in the console
     * click on New Window Message and print the text from new window in the console
     * Verify (compare) the titles for each page
     * Print out the title of the all pages
     */
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       String HandleMainPage =driver.getWindowHandle();
       WebElement NewTabHandle =driver.findElement(By.xpath("//button[@id='tabButton']"));
       NewTabHandle.click();
       WebElement NewWindowHandle =driver.findElement(By.xpath("//button[@id='windowButton']"));
       NewWindowHandle.click();
       WebElement NewWindowMessageHandle =driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
       NewWindowMessageHandle.click();
       Set<String> allWindowHandles= driver.getWindowHandles();
       Iterator<String> iterator=allWindowHandles.iterator();
       while (iterator.hasNext()){
           String Handle =iterator.next();
           if (Handle.equals(HandleMainPage)){
               driver.switchTo().window(Handle);
               String title=driver.getTitle();
               if (title.isEmpty()){
                   System.out.println("The title is not present in the webpage");
               }else {
                   System.out.println("The title is present in the webpage");
               }
           }
       }
    }
}
