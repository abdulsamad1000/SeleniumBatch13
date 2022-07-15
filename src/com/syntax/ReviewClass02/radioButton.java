package com.syntax.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement Option3 =driver.findElement(By.xpath("//input[@value='Option 3']"));
        // check if the Option 3 is selected
        boolean state= Option3.isSelected();
        System.out.println("the state of the radio button is "+ state);
        //check if the radio button is displayed
        boolean displayed=Option3.isDisplayed();
        System.out.println("is the radio button is displayed "+ displayed);
        // check if the radio buttton is enable or
        boolean enabled=Option3.isEnabled();
        System.out.println("is the radio button enable "+ enabled);
        //selecte the radio button
        Option3.isSelected();
        //check if it is selected
        state=Option3.isSelected();
        System.out.println("the state of the radio button is "+ state);

    }
}
