package AssingmentJunitmodule7;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverConnectJunit;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
@RunWith(Parameterized.class)
public class A003GmailLoginTest
{
    String userEmail;
    String userPass;


    public A003GmailLoginTest(String userEmail, String userPass)
    {
        this.userEmail = userEmail;
        this.userPass = userPass;
    }

    static WebDriver driver;


    @BeforeClass
    public static void setUp()
    {
        driver = DriverConnectJunit.connect("https://accounts.google.com/signin");
    }
    @Test
    public void login()
    {
        WebElement email = driver.findElement(By.id("identifierId"));
        driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
        WebElement pass = driver.findElement(By.id("password"));
        email.clear();
        email.sendKeys(userEmail);
        pass.clear();
        pass.sendKeys(userPass);

        driver.findElement(By.name("login")).click();
        driver.navigate().back();
    }
    @Parameterized.Parameters
    public static List<Object[]> setData()
    {
        Object obj[][] =new Object[2][2];

        obj[0][0] = "test@gmail.com";
        obj[0][1] = "test";

        return Arrays.asList(obj);
    }

}
