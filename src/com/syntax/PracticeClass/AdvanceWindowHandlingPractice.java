package com.syntax.PracticeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvanceWindowHandlingPractice {
    static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();

        WebElement instagramButton = driver.findElement(By.xpath("//a[text()=' Follow On Instagram ']"));
        WebElement facebookButton = driver.findElement(By.xpath("//a[text()=' Like us On Facebook ']"));
        WebElement instagramAndFacebookButton = driver.findElement(By.xpath("//a[text()='Follow Instagram & Facebook']"));
        instagramButton.click();
        facebookButton.click();
        instagramAndFacebookButton.click();
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String handle = iterator.next();
            if (!mainPageHandle.equals(handle)) {
                driver.switchTo().window(handle);
                String title = driver.getTitle();
                System.out.println(title);
            }
        }
    }
}
