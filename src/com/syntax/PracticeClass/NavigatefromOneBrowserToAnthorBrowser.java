package com.syntax.PracticeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatefromOneBrowserToAnthorBrowser {
    public static void main(String[] args) {
        /**
         * Task
         * 1. launch the browser
         * 2. Navigate the amazon broswer https://www.amazon.com
         * 3. Navigagte to the next browser https://www.facebook.com
         * 4. navigate back to the amazon browser
         * 5. print the url in the consol
         * 6. print the title
         * 7. close the current tab or browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.fb.com");
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().forward();
        driver.navigate().back();
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title =driver.getTitle();
        System.out.println(title);
        //driver.close();// this .close(); method will just close the current tab or broswer
        driver.quit(); // this .quit(); method will just close all the tabs




    }
}
