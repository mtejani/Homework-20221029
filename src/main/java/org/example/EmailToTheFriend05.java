package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class EmailToTheFriend05
{
    protected static WebDriver driver; //to assign a chrome driver

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe"); //to locate chrome webdriver path.
        driver = new ChromeDriver(); //to assign a chromedriver to a driver
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());


        driver.manage().window().maximize(); //in case Chrome window open in minimize mode, this command would maximize it.
        driver.get("https://demo.nopcommerce.com/"); //to open given url
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a")).click(); // in order to locate a Macbook product page
        driver.findElement(By.xpath("//ul[@class='sublist']/li[2]/a")).click(); // to locate a Macbook Pro  page
        driver.findElement(By.xpath("//div[@data-productid='4']/div[2]/h2/a")).click(); // to share the details with friend
        driver.findElement(By.xpath("//div[@class='email-a-friend']/button")).click(); // to action share
        driver.findElement(By.id("FriendEmail")).sendKeys("Friend"+timeStamp+"@testmail.com"); //friend' email ID
        driver.findElement(By.id("YourEmailAddress")).sendKeys("YourEMail"+timeStamp+"@testmail.com"); // own email address
        driver.findElement(By.id("PersonalMessage")).sendKeys("I thought this might be the machine that you are looking for a while"); //share comment for friend
        driver.findElement(By.name("send-email")).click(); // email friend direct from webpage
        String Msg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']/ul/li")).getText(); //to catch a result of action
        driver.close(); //after action close web browser

        System.out.println("Try to share Apple MacBook Pro 13-inc"); // to display outcome of the action

        System.out.println("Message appear after clicking Sent email button:" +Msg); //display outcome with timestamp
        System.out.println("Test completed on :"+timeStamp); // to display time of test completed


    }
}
