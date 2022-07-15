package com.syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task3 {
    /**
     * Go to ebay.com
     * get all the categories and print them in the console
     * select Computers/Tables & Networking
     * click on search
     * verify the header
     */
    public static String url = "https://www.ebay.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement allCatagories= driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select select=new Select(allCatagories);
        List<WebElement> allCatagoriesOption= select.getOptions();
        int allCatagoiesSize =allCatagoriesOption.size();
        System.out.println(allCatagoiesSize);
        for (WebElement allCatagoriesOptions:allCatagoriesOption){
            String allCatagoriesText= allCatagories.getText();
            System.out.println(allCatagoriesText);
        }
        WebElement AllCat =driver.findElement(By.xpath("//select[@id='gh-cat']"));
        AllCat.click();
        Thread.sleep(5000);
        String title= driver.getTitle();
        if (title.startsWith("Computers/Tables & Networking")){
            System.out.println("The title is correct");
        }

    }
}
