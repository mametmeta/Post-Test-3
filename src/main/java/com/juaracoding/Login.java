package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Open Browser");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://shop.demoqa.com/my-account/");
        driver.findElement(By.id("username")).sendKeys("melindathea92");
        driver.findElement(By.id("password")).sendKeys("Lupal@g1908");
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[2]/div/div/div/div/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[4]/div/div[1]/div/div/div/div[2]/div[2]/div[3]/div/h3/a")).click();
        driver.findElement(By.xpath("//*[@id=\"pa_color\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"pa_color\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"pa_size\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"pa_size\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"product-1184\"]/div[1]/div[2]/form/div/div[2]/button")).click();


        }
    }
