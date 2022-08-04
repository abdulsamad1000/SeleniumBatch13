package com.syntax.Class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

    public class Task1 {
    /**
     * Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
     * click on leave
     * click on leave list
     * choose from "From calendar"
     * choose from "To calendar"
     * click only on cancelled and rejected checkboxes
     * uncheck Pending Approval
     * select IT support from DD
     * click search
     * quit the browser   // Hum@nhrm123  // Admin
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebElement enterUsername = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        enterUsername.sendKeys("Admin");
        WebElement enterPassword = driver.findElement(By.id("txtPassword"));
        enterPassword.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();

        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();
        WebElement leaveListButton = driver.findElement(By.xpath("//a[text()='Leave List']"));
        leaveListButton.click();
        WebElement FromToCalender = driver.findElement(By.id("calFromDate"));
        FromToCalender.click();
        WebElement SelectAmonth =driver.findElement(By.className("ui-datepicker-month"));
        Select select = new Select(SelectAmonth);
        select.selectByVisibleText("May");
        WebElement SelectAyear = driver.findElement(By.className("ui-datepicker-year"));
        Select select1 = new Select(SelectAyear);
        select1.selectByValue("2023");
        List<WebElement> ChoosAday = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
        for (WebElement Choose: ChoosAday){
            if(Choose.getText().equals("10")){
                Choose.click();
                break;
            }
        }
        WebElement ToCalender = driver.findElement(By.id("calToDate"));
        ToCalender.click();
        WebElement SelectAmonth1 = driver.findElement(By.className("ui-datepicker-month"));
        Select select2 = new Select(SelectAmonth1);
        select2.selectByVisibleText("Aug");
        WebElement SelectAyear1 = driver.findElement(By.className("ui-datepicker-year"));
        Select select3 = new Select(SelectAyear1);
        select3.selectByValue("2024");
        List<WebElement> ChooseAday1 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
        for(WebElement Choose1:ChooseAday1){
            if(Choose1.getText().equals("15")){
                Choose1.click();
                break;
            }
        }

        WebElement ClickCancelButton = driver.findElement(By.id("leaveList_chkSearchFilter_0"));
        ClickCancelButton.click();
        WebElement ClickRejectedButton = driver.findElement(By.id("leaveList_chkSearchFilter_-1"));
        ClickRejectedButton.click();
        WebElement UncheckedPendingApprovalButton = driver.findElement(By.id("leaveList_chkSearchFilter_1"));
        UncheckedPendingApprovalButton.click();
        WebElement EmployeeButton = driver.findElement(By.xpath("//input[@name='leaveList[txtEmployee][empName]']"));
        EmployeeButton.click();
        EmployeeButton.sendKeys("Abdulsamad");

        WebElement SubUnitButton = driver.findElement(By.xpath("//label[@for='leaveList_calFromDate']"));
        SubUnitButton.click();
        WebElement SubUnitSearchDropDown = driver.findElement(By.id("leaveList_cmbSubunit"));
        Select select4 = new Select(SubUnitSearchDropDown);
        select4.selectByVisibleText("IT Support");
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        File srcFile =takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("screenshots/syntaxtechs/humanresurc/webPage.png"));
        // driver.quit();
    }

}
