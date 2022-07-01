package com.syntax.PracticeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) {
        /**
         * 1. launch the browser
         * 2. navigate to facebook website
         * 3. print out the tittle and url in the console
         * 4. close the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com");
       String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.quit();

    }
}
