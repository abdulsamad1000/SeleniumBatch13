package com.syntax.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) {
        /**
         *  Go to aa.com/homePage.do
         * select depart date
         * select return date
         * select destination
         * click on search
         * quit the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.aa.com/homePage");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement HomePageButton = driver.findElement(By.xpath("//a[text()='Back to Home']"));
        HomePageButton.click();
        WebElement FromDestanation = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
        FromDestanation.click();
        FromDestanation.clear();
        FromDestanation.sendKeys("Austin Bergstrom International Airport");
        WebElement ToFinalDestanation = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
        ToFinalDestanation.click();
        ToFinalDestanation.sendKeys("Canada Montreal International Airport");
        WebElement NoOfPassanger = driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
        Select select = new Select(NoOfPassanger);
        select.selectByValue("3");
        WebElement DepartureDateButtton = driver.findElement(By.id("aa-leavingOn"));
        DepartureDateButtton.click();
        DepartureDateButtton.sendKeys("01/15/2023");
        WebElement ReturnDateButton = driver.findElement(By.id("aa-returningFrom"));
        ReturnDateButton.click();
        ReturnDateButton.sendKeys("11/25/2023");
        WebElement SearchButton = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
        SearchButton.click();
        // driver.quit();
    }
}
