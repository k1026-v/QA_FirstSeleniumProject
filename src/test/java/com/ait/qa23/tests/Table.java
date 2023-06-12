package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Table {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
    }

    @Test
    public void tableTest (){
        List<WebElement> elements = driver.findElements(By.cssSelector("table"));
        System.out.println(elements.size());

        WebElement element = driver.findElement(By.cssSelector("tr:nth-child(7) td:nth-child(3)"));
        System.out.println(element.getText());
    }


}
