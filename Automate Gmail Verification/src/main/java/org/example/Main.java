package org.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win32\\chromedriver.exe");

        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.google.com");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("identifierId")).sendKeys("chamodikadevindi@gmail.com");
        driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Chamo555$");
        driver.findElement(By.xpath("//*[@id=\'passwordNext\']/div/button/span")).click();
}}