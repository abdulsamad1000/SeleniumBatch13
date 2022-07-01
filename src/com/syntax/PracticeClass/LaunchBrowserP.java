package com.syntax.PracticeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserP {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // Line 9 note: inside the pranthesis we first specifiy the arguments or prameters first write the webdriver we use
        // like chrome,firfox, Edge or anything. the second arguments or parameter would be the path of my drivers
        WebDriver driver=new ChromeDriver();
        // Line 12 Note: here we create the object of this webdriver chrome ==== what this object do it launch the browser.

       driver.get("https://www.google.com");
       // Line 15 Note: .get(); this is method we can navigagate to google

       String url= driver.getCurrentUrl();
        // Line 18 Note: getCurrentUrl(); this is the built in method by this method we can get the full URL of anything
        // but will get in in string datetype
        System.out.println(url); // we just print out

        String title=driver.getTitle();
        //line 23 Note: by .getTitle(); method we can get our applicaton tittle we can use getTtile
        System.out.println(title); // we just print out
        driver.quit();
        // Line26 Note: this .quit();  method will close our current browser or application

    }
}
