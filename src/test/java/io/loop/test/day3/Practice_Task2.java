package io.loop.test.day3;


import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice_Task2 {
    public static void main(String[] args) {

     WebDriver driver = WebDriverUtil.getDriver("chrome");
     driver.manage().window().maximize();
     driver.get("http://etsy.com");

        WebElement searchToEtsy = driver.findElement(By.id("global-enchancements-search-query"));
        searchToEtsy.click();
        searchToEtsy.sendKeys("wooden spoon");
        searchToEtsy.submit();

        String expectedTitle = "Wooden Spoon | Etsy";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Actual title is: " + actualTitle + "matches expected title: " + expectedTitle + "=> TEST PASS");
        }
        else {
            System.err.println("Actual title: " + actualTitle + "does not match expected title: " + expectedTitle + "=> TEST FAIL");
        }

        driver.quit();
        


    }
}
