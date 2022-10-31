package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class Products02
{
    protected static WebDriver driver; //to assign a chrome driver

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe"); //to locate chrome webdriver path.
        driver = new ChromeDriver(); //to assign a chromedriver to a driver
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date()); //to acquire a current time stamp.


        driver.manage().window().maximize(); //in case Chrome window open in minimize mode, this command would maximize it.
        driver.get("https://demo.nopcommerce.com/"); //to open given url
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a")).click(); // in order to enter desktop category first to go at computers page.
        driver.findElement(By.xpath("//ul[@class='sublist']/li[1]/a ")).click(); // in order to locate specific items in the desktop category page.

        String Mesg1 = driver.findElement(By.xpath(("//div[@class=\"item-grid\"]/div[1]//h2/a"))).getText(); // to read item name and assign number to print later
        String Mesg2 = driver.findElement(By.xpath(("//div[@class=\"item-grid\"]/div[2]//h2/a"))).getText(); // to read item name and assign number to print later
        String Mesg3 = driver.findElement(By.xpath(("//div[@class=\"item-grid\"]/div[3]//h2/a"))).getText(); // to read item name and assign number to print later

        driver.close(); // after task closing Chrome window.
        System.out.println("Item no.1:"+Mesg1); // to print item name that has assigned the number
        System.out.println("Item no.2:"+Mesg2); // to print item name that has assigned the number
        System.out.println("Item no.3:"+Mesg3); // to print item name that has assigned the number
        System.out.println("Test time:"+timeStamp); //to confirm the status completed time stamp.

    }


}
