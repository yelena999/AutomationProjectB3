package io.loop.test.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.AssertJUnit.assertEquals;

public class Practice7_Task3 extends TestBase {
    @Test
    public void multipleWindowsTest() {
        driver.get("https://loopcamp.vercel.app/");
        WebElement multipleWindows = driver.findElement((By.xpath("//*[contains(text(), 'Multiple Windows')]")));
        multipleWindows.click();

        WebElement poweredBy = driver .findElement(By.xpath("//*[contains(text(), 'Powered By')]"));
        String actualPoweredBy = poweredBy.getText();
        Assert.assertEquals(actualPoweredBy.trim(), "Powered by LOOPCAMP");

        assertEquals(driver.getTitle(), "Windows", "Results are not matching");
        WebElement ClickHere = driver.findElement(By.xpath("//*[contains(text(), 'Click Here')]"));
        ClickHere.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }
        System.out.println("driver.getTitle() = " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "New Window");

    }
    }
