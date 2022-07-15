package com.syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Month;
import java.util.List;
import java.util.Set;

public class HW1 {
    /**
     * HW 1: Facebook dropdown verification
     * Open chrome browser
     * Go to "https://www.facebook.com"
     * click on create new account
     * Verify:
     * month dd has 12 month options
     * day dd has 31 day options
     * year dd has 115 year options
     * Select your date of birth
     * Quit browser
     */
    public static String url="https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement CreateNewAcc =driver.findElement(By.xpath("//a[text()='Create new account']"));
        CreateNewAcc.click();
        Thread.sleep(3000);
        WebElement Month =driver.findElement(By.id("month"));
        Select select=new Select(Month);
        List<WebElement> MonthOp=select.getOptions();
        int MonthSize =MonthOp.size();
        System.out.println("The Month Dropdown Size is =" +MonthSize);

        WebElement Day =driver.findElement(By.id("day"));
        Select select1=new Select(Day);
        List<WebElement> DayOp=select1.getOptions();
        int DaySize =DayOp.size();
        System.out.println("The Day Dropdown Size is =" +DaySize);

        WebElement year =driver.findElement(By.id("year"));
        Select select2=new Select(year);
        List<WebElement> yearOp=select2.getOptions();
        int yearSize =yearOp.size();
        System.out.println("The year Dropdown Size is =" +yearSize);

        WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
        Select select3= new Select(month);
        List<WebElement> monthOption= select3.getOptions();
        int monthSize=monthOption.size();
        System.out.println(monthSize);
        select3.selectByVisibleText("Feb");

        WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
        Select select4=new Select(day);
        List<WebElement> dayOption=select4.getOptions();
        int daySize =dayOption.size();
        System.out.println(daySize);
        select4.selectByValue("14");

        WebElement year1=driver.findElement(By.xpath("//select[@id='year']"));
        Select select5=new Select(year1);
        List<WebElement> yearOption=select5.getOptions();
        int yearSize1=yearOption.size();
        System.out.println(yearSize1);
        select5.selectByValue("1994");

    }
    }

