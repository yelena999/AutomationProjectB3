package io.loop.test.day5;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class practice_Task_3 {
    WebDriver  driver;
    String actual;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://beta.docuport.app/received-docs");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
    @Test
    public void login(){
        WebElement userNameBox = driver.findElement(By.xpath("//input[@id='input-14']"));
        userNameBox.sendKeys(DocuportConstants.USERNAME_ADVISOR);

        WebElement passwordBox = driver.findElement(By.xpath("//input[@id='input-15']"));
        passwordBox.sendKeys(DocuportConstants.PASSWORD_ADVISOR);

        WebElement loginButton = driver.findElement(By.xpath("//span[@class='v-btn__content']"));
        loginButton.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement receivedDocs = driver.findElement(By.xpath("//*[@href='/received-docs']"));
        receivedDocs.click();

        WebElement searchDocs = driver.findElement(By.xpath("//span[text()='Search']"));
        searchDocs.click();

        WebElement status = driver.findElement(By.xpath("//label[.='Status']/.."));
        status.click();

        WebElement inProgress = driver.findElement(By.xpath("//div[text()='In progress']"));
        inProgress.click();

    }
}

