package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FirstSeleniumTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
       driver = new ChromeDriver();

       driver.get("https://telranedu.web.app/login");
       driver.manage().window().maximize();
    }

    @Test
    public void findElementByTagName() {
        System.out.println("Site opened!");
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

        WebElement element1 = driver.findElement(By.className("navbar-component_nav__1X_4m"));
        System.out.println(element1.getText());

        WebElement element2 = driver.findElement(By.name("email"));
        System.out.println(element2.getText());



    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
        //driver.close();
    }
}
