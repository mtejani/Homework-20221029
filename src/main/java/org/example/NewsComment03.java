package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class NewsComment03
{
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());


        driver.manage().window(); //maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a")).click();
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("News you like");
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("News you like and this is worth sharing to you");
        driver.findElement(By.xpath("//div[@class='fieldset new-comment']/form/div[2]/button")).click();
        String result = driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println(result);
        System.out.println(timeStamp);
    }

}
