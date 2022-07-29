package com.syntax.ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkboxesReview {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        //get all the check boxes in a list
        List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@name='color']"));
        // loop throw the all boxes
        for(WebElement checkbox:checkboxes){
            String color =checkbox.getAttribute("value");
            if (color.equalsIgnoreCase("purple")){
                checkbox.click();
            }
        }
    }
}
