package com.syntax.Tests;

import com.syntax.TestBase.BaseClass;
import com.syntax.pages.LoginPage;

public class LoginPageTest {

    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php");
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("Admin");
        loginPage.password.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();

        BaseClass.tearDown();
    }

}
