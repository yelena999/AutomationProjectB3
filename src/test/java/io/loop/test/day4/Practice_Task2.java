package io.loop.test.day4;

import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Task2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");



    }
}
