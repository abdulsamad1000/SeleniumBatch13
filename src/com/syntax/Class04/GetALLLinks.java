package com.syntax.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetALLLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of Links" + allLinks.size());
        for (WebElement link : allLinks) {
            String linkText= link.getText();
            String fullLink=link.getAttribute("href");
            String LinkText = link.getText();
            if (!LinkText.isEmpty()) {
                System.out.println(linkText+" "+fullLink);
            }
        }
    }
}
