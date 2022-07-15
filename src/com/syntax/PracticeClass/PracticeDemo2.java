package com.syntax.PracticeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PracticeDemo2 {
   public static String url=("https:/syntaxprojects.com/basic-select-dropdown-demo.php");
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get(url);
        WebElement daysDD=driver.findElement(By.id("select-demo"));
        Select select=new Select(daysDD);
//        select.selectByIndex(3);
//        Thread.sleep(3000);
//        select.selectByVisibleText("Thursday");Thread.sleep(3000);
//        select.selectByValue("Friday");

        List<WebElement> allOption=select.getOptions();
        int size =allOption.size();
        System.out.println(size);
        for (int i=1; i<size; i++){
            String Option =allOption.get(i).getText();
            System.out.println(Option);
            select.selectByIndex(i);
            Thread.sleep(3000);
        }


    }
}
