package io.loop.test.day6;

import io.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class Practice6_Task1 extends TestBase {
    Alert alert;

    @Test
    public void handleFirstAlert()  {
        driver.get("https://demoqa.com/alerts");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement clickAlert = driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickAlert.click();








    }


}
