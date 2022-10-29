package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class EmailToTheFriend05
{
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());


        driver.manage().window(); //maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a")).click();
        driver.findElement(By.xpath("//ul[@class='sublist']/li[2]/a")).click();
        driver.findElement(By.xpath("//div[@data-productid='4']/div[2]/h2/a")).click();
        driver.findElement(By.xpath("//div[@class='email-a-friend']/button")).click();
        driver.findElement(By.id("FriendEmail")).sendKeys("Friend"+timeStamp+"@testmail.com");
        driver.findElement(By.id("YourEmailAddress")).sendKeys("YourEMail"+timeStamp+"@testmail.com");
        driver.findElement(By.id("PersonalMessage")).sendKeys("I thought this might be the machine that you are looking for a while");
        driver.findElement(By.name("send-email")).click();
        String Msg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']/ul/li")).getText();
        driver.close();

        System.out.println("Try to share Apple MacBook Pro 13-inc");

        System.out.println("Message appear after clicking Sent email button:" +Msg);
        System.out.println("Test completed on :"+timeStamp);


    }
}
