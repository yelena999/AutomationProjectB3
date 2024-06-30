package io.loop.test.day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice_Task1 {
    public static void main(String[] args) {
        //open Chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        WebElement gmailElement = driver.findElement(By.linkText("Gmail"));
        gmailElement.click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)) {

            System.out.println("=>TEST PASSED: actual title: " + actualTitle + "Contains expected title: " + expectedTitle);

        }else{
                System.out.println("=>TEST FAIL: " + actualTitle + "Doesn't contain expected title: " + expectedTitle);
            }

            driver.navigate().back();

            String expectedGoogleTitle = "Google";
            String actualGoogleTitle = driver.getTitle();

            if (actualGoogleTitle.equals(expectedGoogleTitle)){
                System.out.println("=>TEST PASSED: actual title: " + actualGoogleTitle + "MATCHES expected title: " + expectedGoogleTitle);
            }
            else {
                System.out.println(("=>TEST FAIL: actual title: " + actualGoogleTitle + "Doesn't match expected title: " + expectedGoogleTitle));
            }
        }

    }

