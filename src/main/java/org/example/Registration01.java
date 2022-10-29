package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class Registration01
{
    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());


        driver.manage().window(); //maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Mukesh");
        driver.findElement(By.id("LastName")).sendKeys("Tejani");
        driver.findElement(By.id("Email")).sendKeys("Muk" + timeStamp+"esh" + "@mukesh.com");
        driver.findElement(By.id("Password")).sendKeys("Mux1@1");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Mux1@1");
        driver.findElement(By.id("register-button")).click();
        String regMsg = driver.findElement(By.className(("result"))).getText();
        driver.close();
        System.out.println(regMsg);
        System.out.println("Date and time at time of test completed:"+timeStamp);
    }
}
