package com.syntax.PracticeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracticeDemo1 {
    public static String url="https://www.syntaxprojects.com/basic-checkbox-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        List<WebElement> optionCheckBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
       int size= optionCheckBoxes.size();
        System.out.println(size);

        for (WebElement option:optionCheckBoxes){
            String checkboxValue = option.getAttribute("value");
            if(checkboxValue.equals("Option-2") || checkboxValue.equals("Option-3") || checkboxValue.equals("Option-4")){
                option.click();

            }

        }


    }
}
