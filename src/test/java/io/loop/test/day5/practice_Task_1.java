package io.loop.test.day5;

import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;


public class practice_Task_1  {

    WebDriver driver;
    WebElement dropDownTitle;
    String actualResult;
    String expectedResult;

    @BeforeMethod
            public void setUpMethod() {
        driver = WebDriverUtil.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    public void tearDownMethode(){
        driver.close();

   }

    @Test(priority = 1)
    public void dropDownTest() {

        Select selectAnOptionOfDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        String actualResult = selectAnOptionOfDropDown.getFirstSelectedOption().getText();
        String expectedResult = "Please select an option";
        selectAnOptionOfDropDown.getFirstSelectedOption().isSelected();
        Assert.assertEquals(actualResult, expectedResult, "Actual" + actualResult + "Do not match expected: " + expectedResult + "TEST FAILD");
    }

    @Test(priority = 2)
    public void dropDownTest1() {
        Select selectAnOptionOfDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        selectAnOptionOfDropDown.selectByValue("1");
        String actualResult = selectAnOptionOfDropDown.getFirstSelectedOption().getText();
        String expectedResult = "Option 1";
        Assert.assertEquals(actualResult, expectedResult, "Actual" + actualResult + "Do not match expected: " + expectedResult + "TEST FAILD");
    }

    @Test(priority = 3)
    public void dropDawnTest2() {
        Select selectAnOptionOfDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        selectAnOptionOfDropDown.selectByValue("2");
        String actualResult = selectAnOptionOfDropDown.getFirstSelectedOption().getText();
        String expectedResult = "Option 2";
        Assert.assertEquals(actualResult, expectedResult, "Actual" + actualResult + "Do not match expected: " + expectedResult + "TEST FAILD");
    }

    @Test(priority = 4)
    public void validateName() {
        WebElement dropDownTitle = driver.findElement(By.xpath("//*[@id='content']/div/h3"));
        String expectedName = "Dropdown List";
        String actualName = dropDownTitle.getText();
        Assert.assertEquals(actualName, expectedName, "Actual" + actualName + "Do not match expected: " + expectedName + "TEST FAILD");
    }


}
