package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class HomePageCategories04
{
    protected static WebDriver driver; //to assign a chrome driver

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe"); //to locate chrome webdriver path.
        driver = new ChromeDriver(); //to assign a chromedriver to a driver
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date()); //to acquire a current time stamp.

        driver.manage().window().maximize(); //in case Chrome window open in minimize mode, this command would maximize it.
        driver.get("https://demo.nopcommerce.com/"); //to open given url
        String read1 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[1]/a")).getText(); // in read product category and assign item number.
        String read2 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[2]/a")).getText(); // in read product category and assign item number.
        String read3 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[3]/a")).getText(); // in read product category and assign item number.
        String read4 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[4]/a")).getText(); // in read product category and assign item number.
        String read5 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[5]/a")).getText(); // in read product category and assign item number.
        String read6 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[6]/a")).getText(); // in read product category and assign item number.
        String read7 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[7]/a")).getText(); // in read product category and assign item number.

        driver.close(); // after task closing Chrome window.

        System.out.println("Category of Item available at NopCommerce"); // printing out the status of testing.
        System.out.println(); //to leave some gap for better display
        System.out.println("Category 01: "+read1); // to display product category
        System.out.println("Category 02: "+read2); // to display product category
        System.out.println("Category 03: "+read3); // to display product category
        System.out.println("Category 04: "+read4); // to display product category
        System.out.println("Category 05: "+read5); // to display product category
        System.out.println("Category 07: "+read7); // to display product category
        System.out.println(); //to leave some gap for better display

        System.out.println("Date and time at time of test completed:"+timeStamp); //to confirm the status completed time stamp.

    }
}
