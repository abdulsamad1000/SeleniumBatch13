package com.syntax.PracticeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetLinksFromEbay {
    public static void main(String[] args) {
        // how to get all the ebay links
        // how all the links store in our HTML it is call <a ------->atag or anchor tag
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Numbers of Links" + allLinks.size());
        for (WebElement links : allLinks) {
            String linksText = links.getText();
         String fulllink= links.getAttribute("href");
            if (!linksText.isEmpty()) {
                System.out.println(linksText+" "+fulllink);
            }
        }
    }
}
