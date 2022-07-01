package com.syntax.PracticeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToBrowser {
    public static void main(String[] args) {
        /**
         * Task for practice
         * 1. launch the browser
         * 2. navigate to htttps://www.facebook.com
         * 3. maximize the window
         * 4. get the tittel and compair if it is correct tittle then print the title in the conlsol
         * 5. close the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        //driver.manage().window().maximize();
        String title= driver.getTitle();
        String Expectedtitle="Facebook - log in or sign up";
        // Our actual title is log in - sign up
        if(title.equals(Expectedtitle)){
            System.out.println("The title is correct");
        }else {
            System.out.println("The title is not correct");
        }
        driver.quit();

    }
}
