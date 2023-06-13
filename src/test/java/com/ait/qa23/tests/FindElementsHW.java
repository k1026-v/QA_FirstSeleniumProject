package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementsHW {
    WebDriver driver;

    @BeforeMethod
    public void setUp (){

        driver= new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void findElements(){
        driver.findElement(By.cssSelector("#newsletter-subscribe-button"));

        driver.findElement(By.cssSelector(".top-menu"));

        driver.findElement(By.cssSelector("[value='Search store']"));

        driver.findElement(By.cssSelector("[autocomplete]"));

        driver.findElement(By.cssSelector(".header"));

        driver.findElement(By.cssSelector("[class='header-links-wrapper']"));

        driver.findElement(By.cssSelector("[class^='ajax']"));

        driver.findElement(By.cssSelector("[id*='flyout']"));

        driver.findElement(By.cssSelector("[id='bar-notification']"));





    }

    @Test
    public void findElementByXpath (){

        driver.findElement(By.xpath("//*[@ id='newsletter-subscribe-button']"));

        driver.findElement(By.xpath("//*[@ class='top-menu']"));

        driver.findElement(By.xpath("//*[@ value='Search store']"));

        driver.findElement(By.xpath("//*[@ autocomplete]"));

        driver.findElement(By.xpath("//*[@ class='header']"));

        //driver.findElement(By.xpath("//*[@ class='header-links-wrapper')]"));

        driver.findElement(By.xpath("//*[contains(., 'ajax')]"));

        driver.findElement(By.xpath("//*[contains(., 'flyout')]"));

        //driver.findElement(By.xpath("//*[@ id='bar-notification')]"));



        //driver.findElement(By.xpath("//*[contains(.,'Your email address:')]"));


    }

    @AfterMethod
    public void tearDown (){
        driver.quit();
    }
}
