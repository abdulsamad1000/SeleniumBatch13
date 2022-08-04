package com.syntax.pages;

import com.syntax.Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.PreparedStatement;

public class LoginPage extends CommonMethods{

        public WebElement username = driver.findElement(By.id("txtUsername"));
        public WebElement password = driver.findElement(By.id("txtPassword"));
        public WebElement loginButton = driver.findElement(By.id("btnLogin"));

    }


