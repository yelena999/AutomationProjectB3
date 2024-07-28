package io.loop.test.base;

import io.loop.test.utilities.ConfigurationReader;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setUpMethode() {
        driver = WebDriverUtil.getDriver(ConfigurationReader.getProperties("browser"));
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDownMethode() {
       // driver.close();
    }
    }
