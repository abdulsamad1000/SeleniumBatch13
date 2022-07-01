package com.syntax.PracticeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
    public static void main(String[] args) {
        /**
         * 1. launch the browser
         * 2. navigate to google website
         * 3. print out the tittle url in the console
         * 4. close the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        // note: inside the pranthesis we first specifiy the arguments or prameters first write the webdriver we use
        // like chrome,firfox, Edge or anything. the second arguments or parameter would be the path of my drivers
        WebDriver driver=new ChromeDriver();
        // here we create the object of this webdriver chrome ==== what this object do it launch the browser.
        driver.get("https://www.google.com");
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        driver.quit();

    }
}
