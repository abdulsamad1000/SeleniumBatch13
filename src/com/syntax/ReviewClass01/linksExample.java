package com.syntax.ReviewClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class linksExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // help me out to get all the links for syntax
        driver.get("https://syntaxprojects.com/index.php");
        // get all the links
        List<WebElement>links=driver.findElements(By.tagName("a"));
        for(WebElement link :links){
            String text = link.getText();
            System.out.println(text);
        }

        }
    }

