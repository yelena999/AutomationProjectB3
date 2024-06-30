package io.loop.test.day4;

import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T00_css_isDisplayed {
    public static void main(String[] args) {


    /*
    https://the-internet.herokuapp.com/forgot_password
     */

                WebDriver driver = WebDriverUtil.getDriver("chrome");
                driver.manage().window().maximize();
                driver.get("https://the-internet.herokuapp.com/forgot_password");



        }
    }
