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

@RunWith(Parameterized.class)
public class A004FbloginWithParameter {
    String userEmail;
    String userPass;

    public A004FbloginWithParameter(String userEmail, String userPass)
    {
        super();
        this.userEmail = userEmail;
        this.userPass = userPass;
    }
    static WebDriver driver;

    @BeforeClass
    public static void setUp()
    {

        driver = DriverConnectJunit.connect("https://www.fb.com");
    }

    @Test
    public void login()
    {
        WebElement email = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("pass"));
        email.clear();
        email.sendKeys(userEmail);
        pass.clear();
        pass.sendKeys(userPass);

        driver.findElement(By.name("login")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.navigate().back();

    }
    @Parameterized.Parameters
    public static List<Object[]> setData()
    {
        Object obj[][] =new Object[2][2];

        obj[0][0] = "testfb@gmail.com";
        obj[0][1] = "test";

        obj[1][0] = "techfb@gmail.com";
        obj[1][1] = "tech";

        return Arrays.asList(obj);
    }

}
