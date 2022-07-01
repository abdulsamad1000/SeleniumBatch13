package com.syntax.PracticeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchMethodP {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 1. launch the browser
         * 2. navigate to https://www.amazon.com website
         * 3. print out the tittle
         * 4. print out the url in the console
         * 5. maximiz the window
         * 6. full screen the window
         * 7.close the window
         */

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        //driver.manage().window().maximize();
        Thread.sleep(3000); // line 26 Note: by this Thread Method we can give a time for our browser how millis second
        // the browser should be open
        driver.manage().window().fullscreen();
        driver.navigate().refresh();
        //driver.quit();




    }
}
