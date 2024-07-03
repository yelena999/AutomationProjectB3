package io.loop.test.day3;

import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice_Task1 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://google.com");

        WebElement goToGmail = driver.findElement(By.linkText("Gmail"));
        goToGmail.click();
        String expectedGmail = "Gmail";
        String actualGmail = driver.getTitle();

        if (actualGmail.contains(expectedGmail)) {
            System.out.println(("Expected title: " + expectedGmail + "matches actual title:" + actualGmail + "=> TEST PASSED"));
        } else {
            System.err.println("Expected title:" + expectedGmail + "does not match actual title:" + actualGmail + "=> TEST FAILED");
        }
        driver.navigate().back();
        String actualGoogle = driver.getTitle();
        String expectedGoogle = "Google";
        if (actualGoogle.contains(expectedGoogle)) {
            System.out.println("Expected title: " + expectedGoogle + "matches actual title:" + actualGoogle + "=> TEST PASSED");
        } else {
            System.err.println("Expected title: " + expectedGoogle + "does not match actual title:" + actualGoogle + "=> TEST FAILED");
        }

        driver.quit();
    }
}

