package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class HomePageCategories04
{
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());

        driver.manage().window(); //maximize();
        driver.get("https://demo.nopcommerce.com/");
        String read1 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[1]/a")).getText();
        String read2 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[2]/a")).getText();
        String read3 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[3]/a")).getText();
        String read4 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[4]/a")).getText();
        String read5 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[5]/a")).getText();
        String read6 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[6]/a")).getText();
        String read7 = driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[7]/a")).getText();

        driver.close();

        System.out.println("Category of Item available at NopCommerce");
        System.out.println();
        System.out.println("Category 01: "+read1);
        System.out.println("Category 02: "+read2);
        System.out.println("Category 03: "+read3);
        System.out.println("Category 04: "+read4);
        System.out.println("Category 05: "+read5);
        System.out.println("Category 07: "+read7);
        System.out.println();

        System.out.println("Date and time at time of test completed:"+timeStamp);

    }
}
