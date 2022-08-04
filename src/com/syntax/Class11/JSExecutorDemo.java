package com.syntax.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        // login actions
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].style.backgroundColor='yellow'",username);
        javascriptExecutor.executeScript("arguments[0].style.backgroundColor='pink'",password);
        WebElement loginbutton = driver.findElement(By.id("btnLogin"));
        javascriptExecutor.executeScript("arguments[0].click()",loginbutton);






    }
}
