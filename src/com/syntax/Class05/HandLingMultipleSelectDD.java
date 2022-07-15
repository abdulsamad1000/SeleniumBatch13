package com.syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.xml.crypto.Data;
import java.util.List;

public class HandLingMultipleSelectDD {

    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement statesDD = driver.findElement(By.id("multi-select"));
        Select select = new Select(statesDD);
        boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple);


        List<WebElement> options = select.getOptions();
        if (isMultiple) {
            for (WebElement option : options) {
                String optionText = option.getText();
                select.selectByVisibleText(optionText);
            }
        }
        select.deselectByIndex(5);
        select.deselectAll();
    }
}
