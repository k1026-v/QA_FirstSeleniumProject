package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver();

        driver.get("https://ilcarro.web.app/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    public void findElementByCssTesT() {
        driver.findElement(By.cssSelector("#city"));
        driver.findElement(By.cssSelector(".header"));
        driver.findElement(By.cssSelector("[type='submit']"));

        driver.findElement(By.cssSelector("[href*='car']"));
        driver.findElement(By.cssSelector("[href^='/let']"));
        driver.findElement(By.cssSelector("[href$='work']"));

    }

    @Test
    public void findElementByXpathTest(){
        driver.findElement(By.xpath("//*[@id='city']"));
        driver.findElement(By.xpath("//*[@class='header']"));

        driver.findElement(By.xpath("//*[contains(.,'Find your car now!')]"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
        //driver.close();
    }
}
