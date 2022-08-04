package com.syntax.PracticeClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RightClickAndDoubleActionDemo1 {
    public static String url = "https://demo.guru99.com/test/simple_context_menu.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        // if we see our page is loading a little bite late in this case we will set up an Implicit waite to see our elements
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement rightClickbutton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickbutton).perform();
        WebElement EditButton = driver.findElement(By.xpath("//span[text()='Edit']"));
        EditButton.click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement doubleclickbutton = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
        actions.doubleClick(doubleclickbutton).perform();
        System.out.println(alert.getText());
        alert.accept();
    }
}
