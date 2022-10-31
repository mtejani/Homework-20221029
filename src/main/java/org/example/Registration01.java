package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class Registration01
{
    protected static WebDriver driver; //to assign a chrome driver

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe"); //to locate chrome webdriver path.
        driver = new ChromeDriver(); //to assign a chromedriver to a driver
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date()); //to acquire a current time stamp.


        driver.manage().window().maximize(); //in case Chrome window open in minimize mode, this command would maximize it.
        driver.get("https://demo.nopcommerce.com/"); //to open given url
        driver.findElement(By.className("ico-register")).click(); // in order to locate a registration page
        driver.findElement(By.id("FirstName")).sendKeys("Max"); //to add first name
        driver.findElement(By.id("LastName")).sendKeys("Maker"); // to add surname
        driver.findElement(By.id("Email")).sendKeys("Max" + timeStamp+"maker" + "@maker.co.uk"); //to fill email address
        driver.findElement(By.id("Password")).sendKeys("Max@1"); // set a password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Max1@1"); //reconfirm a password
        driver.findElement(By.id("register-button")).click(); // to register
        String regMsg = driver.findElement(By.className(("result"))).getText(); // to find registration confirmation message.
        driver.close(); // after task closing Chrome window.
        System.out.println(regMsg); // printing out the status of registration.
        System.out.println("Date and time at time of test completed:"+timeStamp); //to confirm the status completed time stamp.
    }
}
