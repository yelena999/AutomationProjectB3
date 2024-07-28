package io.loop.test.day6;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

    public class Practice6_Task2 extends TestBase {

        String expected;
        String actual;

        @Test
        public void iFrameFirstTest() {
            driver.get("http://demoqa.com/nestedframes");

            driver.switchTo().frame("frame1");
            driver.switchTo().frame(0);
            WebElement childFrame = driver.findElement(By.xpath("//p[.='Child Iframe']"));

           actual = childFrame.getText();
           expected = "Child Iframe";
           Assert.assertTrue(actual.equals(expected));

            driver.switchTo().parentFrame();
            WebElement parentFrame = driver.findElement(By.xpath("//body[.='Parent frame']"));
            Assert.assertEquals(parentFrame.getText(), "Parent frame");
        }
                @Test
                public void nestedFrame() {
                driver.get("http://demoqa.com/nestedframes");
                List<WebElement> iFrames = driver.findElements(By.xpath("//iframe"));
                System.out.println("The amount of Iframes is: " + iFrames.size());
            }



        }





