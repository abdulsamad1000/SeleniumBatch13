package com.syntax.PracticeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo1 {
    public static String url = "https://jqueryui.com/droppable";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        //actions.dragAndDrop(draggable,droppable).perform();

        // this is anther way of dragging an elements and dropped on other
        actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
        driver.navigate().refresh();

    }
}
