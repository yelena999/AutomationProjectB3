package io.loop.test.day7;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice7_Task1 extends TestBase {
    /* go to https://loopcamp.vercel.app/nested-frames.html
    validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"
     */
     WebDriver driver;
     @Test
    public void left()  {
         driver.get("https://loopcamp.vercel.app/nested-frames.html");
         driver.switchTo().frame("frame-top");
         driver.switchTo().frame("frame-left");

         WebElement left = driver.findElement(By.xpath("//*[contains(text(),'lEFT')]"));
         String actualLeft = left.getText();
         Assert.assertEquals(actualLeft.trim(), "LEFT");

         driver.switchTo().defaultContent();
         driver.switchTo().frame("frame-top");
         driver.switchTo().frame("frame-middle");
         WebElement middle = driver.findElement(By.xpath("//*[contains(text(),'MIDDLE')]"));
         String actualMiddle = middle.getText();
         Assert.assertEquals(actualMiddle.trim(), "MIDDLE");

         driver.switchTo().defaultContent();
         driver.switchTo().frame("frame-top");
         driver.switchTo().frame("frame-right");
         WebElement right = driver.findElement(By.xpath("//*[contains(text(),'RIGHT')]"));
         String actualRight = right.getText();
         Assert.assertEquals(actualRight.trim(), "RIGHT");

         driver.switchTo().defaultContent();
         driver.switchTo().frame("frame-bottom");
         WebElement bottom = driver.findElement(By.xpath("//*[contains(text(),'BOTTOM')]"));
         String actualBottom = bottom.getText();
         Assert.assertEquals(actualBottom.trim(), "BOTTOM");


     }

    }
