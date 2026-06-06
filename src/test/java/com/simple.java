package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import util.DriverConnectJunit;

import java.time.Duration;
import java.util.List;

public class simple 
{
    public static void main(String[] args) 
    {
        WebDriver driver = DriverConnectJunit.connect("https://aviraltrendzpvtltd.com/internship-in-it-company/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

         WebElement title =driver.findElement(By.xpath("//select[@name='title']"));
         Select titles = new Select(title);
         titles.selectByVisibleText("Dr");
         driver.findElement(By.name("your-name")).sendKeys("Raj");
         driver.findElement(By.name("phone")).sendKeys("4562561235");
         driver.findElement(By.name("email")).sendKeys("raj@gmail.com");
         WebElement country = driver.findElement(By.name("location"));
         Select countries = new Select(country);
         countries.selectByVisibleText("India");

       // List<WebElement> checkbox = driver.findElements(By.xpath("//span[@class='wpcf7-list-item first']//span[@class='checkbox-sign']"));
       // List<WebElement> checkbox = driver.findElements(By.xpath("//input[@ type='checkbox' and @name='scopes-of-interests[]']"));
        WebElement checkbox = driver.findElement(By.xpath("//span[@class='checkbox-sign']"));
        checkbox.click();

       /* for(WebElement cb: checkbox)
        {
            System.out.println(cb.getSize()+cb.getText());
        }*/

    }
}
