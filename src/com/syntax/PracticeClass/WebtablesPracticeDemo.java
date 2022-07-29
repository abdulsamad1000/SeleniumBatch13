package com.syntax.PracticeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class WebtablesPracticeDemo {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
      List<WebElement> rowAllData= driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(rowAllData.size());
        Iterator<WebElement> iterator= rowAllData.iterator();
        while (iterator.hasNext()){
            WebElement row =iterator.next();
            String rowText =row.getText();
            System.out.println(rowText);

        }
        System.out.println("***************************************************************************************");
        List<WebElement> colunmsAndData=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        System.out.println(colunmsAndData.size());
        Iterator<WebElement> iterator1=colunmsAndData.iterator();
        while (iterator1.hasNext()){
            WebElement colunm =iterator1.next();
            String colunmText =colunm.getText();
            System.out.println(colunmText);
        }

        System.out.println("************************************************************************************************");
        List<WebElement> firstCol=driver.findElements(By.xpath("table[@id='task-table']/tbody/tr/td[2]"));
        System.out.println(firstCol.size());
        for (WebElement firstCol1:firstCol){
            String col1Text=firstCol1.getText();
            System.out.println(col1Text);
        }
    }
}
