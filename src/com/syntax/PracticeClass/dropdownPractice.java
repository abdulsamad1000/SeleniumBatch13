package com.syntax.PracticeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdownPractice {
    public static String url = ("https://www.amazon.com");

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement catagoryDD= driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(catagoryDD);
        List<WebElement> Options=select.getOptions();
        for (WebElement Option:Options){
            String OptionText =Option.getText();
            System.out.println(OptionText);
        }
        //NOTE
        //select.selectByValue("search-alias=appliances");

    }
}

