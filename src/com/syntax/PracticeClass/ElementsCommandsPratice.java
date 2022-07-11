package com.syntax.PracticeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsCommandsPratice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement isAgeRadiobutton=driver.findElement(By.cssSelector("input[value='0 - 5']"));
        boolean isAgeRadiobuttonEnabled= isAgeRadiobutton.isEnabled();
        System.out.println(isAgeRadiobuttonEnabled);

        boolean isAgeRadiobuttonDisplayed=isAgeRadiobutton.isDisplayed();
        System.out.println(isAgeRadiobuttonDisplayed);

        boolean isAgeRadiobuttonSelected=isAgeRadiobutton.isSelected();
        System.out.println("befor clicking "+isAgeRadiobuttonSelected);
        isAgeRadiobutton.click();
        isAgeRadiobuttonSelected= isAgeRadiobutton.isSelected();
        System.out.println("after clicking "+isAgeRadiobuttonSelected);
        driver.quit();

    }
}
