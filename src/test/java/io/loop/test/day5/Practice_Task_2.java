package io.loop.test.day5;

import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Practice_Task_2 {

    WebDriver driver;



    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://www.etsy.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
    @Test
    public void validateEstimateArrival() {

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBox.sendKeys("rings" + Keys.ENTER);

        Select arrivalDateDropdown = new Select(driver.findElement(By.xpath("//span[contains(text(),'Any Time]")));
        String actualDate = arrivalDateDropdown.getFirstSelectedOption().getText();
        String expectedDate = "Any time";
        arrivalDateDropdown.getFirstSelectedOption().isSelected();
        Assert.assertEquals(actualDate, expectedDate, "Actual: " + actualDate + " Does not match expected: " + expectedDate + "TEST FAILED");


        arrivalDateDropdown.selectByValue("4");
        String expectedOption = "By Jul 30";
        arrivalDateDropdown.getFirstSelectedOption().isSelected();
        Assert.assertEquals(actualDate, expectedDate,"Actual: " + actualDate + " Does not match expected: " + expectedOption + "TEST FAILED");

        WebElement dateArrival = driver.findElement(By.xpath("//span[contains(text(),'By Jul 30')]"));
        String actualArrival = dateArrival.getText();
        Assert.assertEquals(actualDate, expectedDate,"Actual: " + actualDate + " Does not match expected: " + expectedDate + "TEST FAILED");



    }


    }






