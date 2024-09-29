package AssingmentJunitmodule7;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.DriverConnectJunit;

public class A002FbLoginwithJunit {
   @Test
    public void fblogin()
    {
        WebDriver driver = DriverConnectJunit.connect("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("nikunjmajmudar@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("fb1245@456");
        driver.findElement(By.name("login")).click();
    }
}
