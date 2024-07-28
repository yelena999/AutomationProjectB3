package io.loop.test.day6;

import io.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import static org.testng.Assert.*;

public class Practice6_Task1 extends TestBase {
    Alert alert;

    @Test(priority = 1)
    public void handleFirstAlert() {
        driver.get("https://demoqa.com/alerts");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickAlert = driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickAlert.click();
        alert = driver.switchTo().alert();
        alert.accept();
    }
    @Test(priority = 2)
    public void handleSecondAlert() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement timeAlertButton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        timeAlertButton.click();
        Thread.sleep(5000);
        alert = driver.switchTo().alert();
        alert.accept();
    }
    @Test(priority = 3)
    public void handleThirdAlert()  {
        driver.get("https://demoqa.com/alerts");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement confirmBox = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        confirmBox.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement successMessage = driver.findElement(By.xpath("//span[@id='confirmResult']"));
        String expectedMessage = "You selected Ok";
        String actualMessage = successMessage.getText();
        assertEquals(actualMessage, expectedMessage, "Actual does not match the expected");
    }
    @Test(priority = 4)
    public void handleFourthAlert() {
        driver.get("https://demoqa.com/alerts");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement promptBox= driver.findElement(By.xpath("//button[@id='promtButton']"));
        promptBox.click();
        Alert alert = driver.switchTo().alert();

        alert.sendKeys("Loop Academy");
        alert.accept();
        WebElement successMessage = driver.findElement(By.id("promptResult"));
        String actual = successMessage.getText();
        String expected = "You entered Loop Academy";
        assertEquals(actual, expected, "Actual does not match the expected");
    }
}


